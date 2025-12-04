from llvmlite import ir
from antlr4 import TerminalNode
from antlr.JamScriptVisitor import JamScriptVisitor
from antlr.JamScriptParser import JamScriptParser
from semantica.symbols import VarSymbol, StructSymbol, FuncSymbol
from semantica.symbolTable import SymbolTableManager


class CodeGenError(Exception):
    pass


class LLVMCodeGen(JamScriptVisitor):
    def __init__(self, symbol_manager: SymbolTableManager):
        super().__init__()
        self.stmgr = symbol_manager
        self.module = ir.Module(name="jamscript_module")
        
        # Tipos LLVM
        self.i32 = ir.IntType(32)
        self.i1 = ir.IntType(1)
        self.flt = ir.DoubleType()
        self.void = ir.VoidType()
        self.char = ir.IntType(8)
        self.char_ptr = self.char.as_pointer()
        
        # Estado atual
        self.builder = None
        self.func = None
        self.llvm_scopes = []
        self.struct_types = {}
        self._str_consts = {}
        
        # Controle de break/continue em loops
        self.break_stack = []  # Stack de labels para break
        
        self._declare_printf()

    # ========== Helpers Básicos ==========
    def _declare_printf(self):
        printf_ty = ir.FunctionType(self.i32, [self.char_ptr], var_arg=True)
        self.printf = ir.Function(self.module, printf_ty, name="printf")

    def _new_scope(self):
        self.llvm_scopes.append({})

    def _pop_scope(self):
        self.llvm_scopes.pop()

    def _define_llvm_var(self, name, ptr):
        self.llvm_scopes[-1][name] = ptr

    def _resolve_llvm_var(self, name):
        for scope in reversed(self.llvm_scopes):
            if name in scope:
                return scope[name]
        return None

    def _alloca_in_entry(self, func, name, llvm_type):
        """Aloca variável no entry block da função."""
        entry_block = func.blocks[0]
        saved_builder = self.builder.block
        
        tmp_builder = ir.IRBuilder(entry_block)
        tmp_builder.position_at_start(entry_block)
        ptr = tmp_builder.alloca(llvm_type, name=name)
        
        self.builder.position_at_end(saved_builder)
        return ptr

    def _get_str_const(self, s: str):
        if s in self._str_consts:
            return self._str_consts[s]

        name = f".str.{len(self._str_consts)}"
        data = bytearray(s.encode("utf8")) + b'\x00'
        arr_ty = ir.ArrayType(self.char, len(data))
        gvar = ir.GlobalVariable(self.module, arr_ty, name=name)
        gvar.global_constant = True
        gvar.initializer = ir.Constant(arr_ty, data)
        self._str_consts[s] = gvar
        return gvar


    # ========== Tipos ==========
    def _llvm_type_for_name(self, tname):
        """Converte nome de tipo JamScript para tipo LLVM."""
        type_map = {
            "int": self.i32,
            "float": self.flt,
            "bool": self.i1,
            "string": self.char_ptr,
            "void": self.void
        }
        
        if tname in type_map:
            return type_map[tname]
        
        if tname in self.struct_types:
            return self.struct_types[tname]
        
        sym = self.stmgr.resolve(tname)
        if isinstance(sym, StructSymbol):
            return self._ensure_struct_type(sym)
        
        raise CodeGenError(f"Tipo desconhecido: {tname}")

    def _ensure_struct_type(self, sym: StructSymbol):
        if sym.name in self.struct_types:
            return self.struct_types[sym.name]

        struct_ty = ir.IdentifiedStructType(self.module.context, sym.name)
        self.struct_types[sym.name] = struct_ty

        field_types = []
        for fname, ftype in sym.fields.items():
            if isinstance(ftype, str):
                field_types.append(self._llvm_type_for_name(ftype))
            else:
                field_types.append(self._ensure_struct_type(ftype))

        struct_ty.set_body(*field_types)

        # --- ESSENCIAL ---
        struct_ty._field_names = list(sym.fields.keys())

        return struct_ty


    def _promote_for_numeric_op(self, left_val, left_type, right_val, right_type):
        """Promove int->float se necessário."""
        if left_type == 'int' and right_type == 'float':
            return self.builder.sitofp(left_val, self.flt), right_val, 'float'
        elif left_type == 'float' and right_type == 'int':
            return left_val, self.builder.sitofp(right_val, self.flt), 'float'
        return left_val, right_val, left_type

    # ========== Program & Structs ==========
    def visitProgram(self, ctx: JamScriptParser.ProgramContext):
        self._new_scope()
        
        # Criar structs
        for name, sym in self.stmgr.global_scope.symbols.items():
            if isinstance(sym, StructSymbol):
                self._ensure_struct_type(sym)
        
        # Declarar funções
        for name, sym in self.stmgr.global_scope.symbols.items():
            if isinstance(sym, FuncSymbol):
                self._declare_function_proto(sym)
        
        # Gerar corpos
        for child in ctx.getChildren():
            if not isinstance(child, TerminalNode):
                self.visit(child)
        
        self._pop_scope()

    def _declare_function_proto(self, func_sym: FuncSymbol):
        """Declara protótipo de função."""
        # Se já existe no módulo, retorna
        if func_sym.name in self.module.globals:
            return self.module.globals[func_sym.name]

        # Tipo de retorno
        if isinstance(func_sym.type, str):
            sym = self.stmgr.resolve(func_sym.type)
            if isinstance(sym, StructSymbol):
                ret_ty = self._ensure_struct_type(sym)  # struct retorna por valor
            else:
                ret_ty = self._llvm_type_for_name(func_sym.type)
        else:
            # já é StructSymbol
            ret_ty = self._ensure_struct_type(func_sym.type)  # struct retorna por valor

        # Parâmetros
        param_types = []
        for pname, ptype in func_sym.params:

            # Caso 1 — ptype é string
            if isinstance(ptype, str):
                sym = self.stmgr.resolve(ptype)

                # Struct? → passa como ponteiro
                if isinstance(sym, StructSymbol):
                    llvm_struct = self._ensure_struct_type(sym)
                    param_types.append(llvm_struct.as_pointer())
                    continue

                # Primitivo
                param_types.append(self._llvm_type_for_name(ptype))
                continue

            # Caso 2 — ptype já é StructSymbol
            if isinstance(ptype, StructSymbol):
                llvm_struct = self._ensure_struct_type(ptype)
                param_types.append(llvm_struct.as_pointer())
                continue

            raise CodeGenError(f"Tipo inesperado em parâmetro: {ptype}")

        # Criar e registrar função
        fn_ty = ir.FunctionType(ret_ty, param_types)
        return ir.Function(self.module, fn_ty, name=func_sym.name)

    def visitStructDecl(self, ctx: JamScriptParser.StructDeclContext):
        """Structs já foram criados em visitProgram."""
        return None

    # ========== Functions ==========
    def visitFuncDecl(self, ctx: JamScriptParser.FuncDeclContext):
        fname = ctx.ID().getText()
        fn = self.module.globals.get(fname)
        
        if fn and len(fn.blocks) > 0:
            return None
        
        # Nomear argumentos
        func_sym = self.stmgr.resolve(fname)
        for i, (pname, _) in enumerate(func_sym.params):
            fn.args[i].name = pname
        
        # Criar apenas entry block
        entry_block = fn.append_basic_block("entry")
        
        self.builder = ir.IRBuilder(entry_block)
        self.func = fn
        self._new_scope()
        
        # Alocar parâmetros
        for arg in fn.args:
            alloca = self._alloca_in_entry(fn, arg.name, arg.type)
            self.builder.store(arg, alloca)
            self._define_llvm_var(arg.name, alloca)
        
        # Gerar corpo
        self.visit(ctx.block())
        
        # Garantir retorno
        if not self.builder.block.is_terminated:
            if isinstance(fn.function_type.return_type, ir.VoidType):
                self.builder.ret_void()
            else:
                self.builder.ret(ir.Constant(fn.function_type.return_type, 0))
        
        self._pop_scope()
        self.builder = None
        self.func = None

    def visitMainBlock(self, ctx):
        """Gera função main()."""
        main_fn = ir.Function(self.module, ir.FunctionType(self.i32, []), name="main")
        
        entry = main_fn.append_basic_block("entry")
        
        self.builder = ir.IRBuilder(entry)
        self.func = main_fn
        self._new_scope()
        
        self.visit(ctx.block())
        
        if not self.builder.block.is_terminated:
            self.builder.ret(self.i32(0))
        
        self._pop_scope()

    # ========== Blocks & Declarations ==========
    def visitBlock(self, ctx: JamScriptParser.BlockContext):
        self._new_scope()
        for d in ctx.decl():
            self.visit(d)
        for s in ctx.stmt():
            self.visit(s)
        self._pop_scope()

    def visitVarDecl(self, ctx: JamScriptParser.VarDeclContext):
        name = ctx.ID().getText()
        llvm_ty = self._llvm_type_for_name(ctx.type_().getText())
        
        if not self.func:
            raise CodeGenError("Declaração de variável fora de função")
        
        ptr = self._alloca_in_entry(self.func, name, llvm_ty)
        self._define_llvm_var(name, ptr)
        
        # Inicializar
        if ctx.expr():
            val, vtype = self.visit(ctx.expr())
            if vtype == 'int' and llvm_ty == self.flt:
                val = self.builder.sitofp(val, self.flt)
            self.builder.store(val, ptr)
        else:
            # Valor padrão
            if llvm_ty == self.i32:
                self.builder.store(ir.Constant(self.i32, 0), ptr)
            elif llvm_ty == self.flt:
                self.builder.store(ir.Constant(self.flt, 0.0), ptr)
            elif llvm_ty == self.i1:
                self.builder.store(ir.Constant(self.i1, False), ptr)
            elif llvm_ty.is_pointer and llvm_ty.pointee == self.str_type:
                # String vazia padrão
                empty_str = ir.Constant(ir.ArrayType(self.i8, 1), [ir.Constant(self.i8, 0)])
                global_str = ir.GlobalVariable(self.module, ir.ArrayType(self.i8, 1), 
                                             name=f"_empty_str_{self._get_unique_id()}")
                global_str.initializer = empty_str
                global_str.global_constant = True
                empty_ptr = self.builder.gep(global_str, [ir.Constant(self.i32, 0), ir.Constant(self.i32, 0)])
                self.builder.store(empty_ptr, ptr)
            elif isinstance(llvm_ty, ir.PointerType) and isinstance(llvm_ty.pointee, ir.LiteralStructType):
                # Struct: inicializar com zeros
                zero_init = ir.Constant.literal_struct([ir.Constant(field_type, 0) for field_type in llvm_ty.pointee.elements])
                self.builder.store(zero_init, ptr)

    def visitSimpleStmt(self, ctx: JamScriptParser.SimpleStmtContext):
        """Gera código para statements simples (inc, dec, atribuição, break)."""
        if ctx.BREAK():
            if not self.break_stack:
                raise CodeGenError("break statement fora de um loop")
            self.builder.branch(self.break_stack[-1])
            return None
        else:
            # Outros statements (inc, dec, assignment)
            return self.visitChildren(ctx)
    def visitAssignStmt(self, ctx: JamScriptParser.AssignStmtContext):
        ptr, llvm_ty = self._resolve_lhs_ptr(ctx.leftHandSide())
        val, vtype = self.visit(ctx.expr())
        
        # Check if target is float and value is int (needs promotion)
        if vtype == 'int':
            if hasattr(llvm_ty, 'is_pointer') and llvm_ty.is_pointer and llvm_ty.pointee == self.flt:
                val = self.builder.sitofp(val, self.flt)
            elif llvm_ty == self.flt:
                val = self.builder.sitofp(val, self.flt)
        elif vtype == 'struct':
            # val is struct value, store directly
            pass
        elif vtype == 'struct_ptr':
            # val is struct pointer, load the value
            val = self.builder.load(val)
        
        self.builder.store(val, ptr)

    def _resolve_lhs_ptr(self, lhs_ctx):
        ids = [t.getText() for t in lhs_ctx.ID()]

        if len(ids) == 1:
            name = ids[0]
            ptr = self._resolve_llvm_var(name)
            if not ptr:
                raise CodeGenError(f"Variável não encontrada: {name}")
            # caso ptr seja alloca de pointer-to-struct (p.ex. parâmetro alocado), detecte e retorne ponteiro apropriado
            pointee = ptr.type.pointee
            # se pointee é PointerType e seu pointee tem _field_names => ptr guarda um pointer -> load para obter pointer->struct
            if isinstance(pointee, ir.PointerType) and hasattr(pointee.pointee, "_field_names"):
                loaded = self.builder.load(ptr)   # loaded é %P* (ponteiro para struct)
                return loaded, loaded.type.pointee
            # caso normal: ptr é alloca de struct ou alloca de primitivo
            return ptr, pointee

        # acesso a campo encadeado (ids[0].id1.id2...)
        base = ids[0]
        ptr = self._resolve_llvm_var(base)
        if not ptr:
            raise CodeGenError(f"Variável base não encontrada: {base}")

        cur_ptr = ptr
        cur_ty = cur_ptr.type.pointee

        # se cur_ty for pointer-to-struct (ex.: alloca que guarda %P*), carregue para obter %P*
        if isinstance(cur_ty, ir.PointerType) and hasattr(cur_ty.pointee, "_field_names"):
            cur_ptr = self.builder.load(cur_ptr)   # agora cur_ptr é %P* (ponteiro para struct)
            cur_ty = cur_ptr.type.pointee

        # agora percorre campos
        for fld in ids[1:]:
            if not hasattr(cur_ty, "_field_names"):
                raise CodeGenError(f"Tentativa de acessar campo '{fld}' de tipo não-struct")
            names = cur_ty._field_names
            if fld not in names:
                raise CodeGenError(f"Struct não tem campo '{fld}'")
            idx = names.index(fld)
            # GEP sobre ponteiro para struct
            cur_ptr = self.builder.gep(cur_ptr, [ir.Constant(self.i32, 0), ir.Constant(self.i32, idx)])
            cur_ty = cur_ty.elements[idx]
            # se o campo for pointer-to-struct e ainda haverá mais campos, precisamos carregar no próximo loop
            if isinstance(cur_ty, ir.PointerType) and hasattr(cur_ty.pointee, "_field_names"):
                # na próxima iteração, o carregamento será feito no começo do loop
                pass

        return cur_ptr, cur_ty

        
        # Acesso a campo
        ptr = self._resolve_llvm_var(ids[0])
        if not ptr:
            raise CodeGenError(f"Variável base não encontrada: {ids[0]}")
        
        cur_ty = ptr.type.pointee
        for fld in ids[1:]:
            if not hasattr(cur_ty, "_field_names"):
                raise CodeGenError(f"Tentativa de acessar campo '{fld}' de tipo não-struct")
            
            idx = cur_ty._field_names.index(fld)
            ptr = self.builder.gep(ptr, [ir.Constant(self.i32, 0), ir.Constant(self.i32, idx)])
            cur_ty = cur_ty.elements[idx]
        
        return ptr, cur_ty

    def visitPrintStmt(self, ctx: JamScriptParser.PrintStmtContext):
        fmt_parts = []
        args = []
        
        if ctx.argList():
            for e in ctx.argList().expr():
                val, vtype = self.visit(e)
                
                if vtype == 'int':
                    fmt_parts.append("%d")
                    args.append(val)
                elif vtype == 'float':
                    fmt_parts.append("%f")
                    args.append(val)
                elif vtype == 'string':
                    fmt_parts.append("%s")
                    args.append(val)
                elif vtype == 'bool':
                    fmt_parts.append("%d")
                    args.append(self.builder.zext(val, self.i32))
        
        fmt = " ".join(fmt_parts) + "\\n"
        g = self._get_str_const(fmt)
        fmt_ptr = self.builder.bitcast(g, self.char_ptr)
        self.builder.call(self.printf, [fmt_ptr] + args)

    def visitInputStmt(self, ctx: JamScriptParser.InputStmtContext):
        """Placeholder: define 0 para variáveis."""
        if ctx.idList():
            for idt in ctx.idList().ID():
                ptr = self._resolve_llvm_var(idt.getText())
                if ptr and ptr.type.pointee == self.i32:
                    self.builder.store(ir.Constant(self.i32, 0), ptr)

    # ========== Control Flow ==========
    def visitIfStmt(self, ctx: JamScriptParser.IfStmtContext):
        cond_val, cond_type = self.visit(ctx.expr())
        
        if cond_type == 'int':
            cond_bool = self.builder.icmp_signed('!=', cond_val, ir.Constant(self.i32, 0))
        else:
            cond_bool = cond_val
        
        then_bb = self.func.append_basic_block('if.then')
        else_bb = self.func.append_basic_block('if.else') if ctx.block(1) else None
        cont_bb = self.func.append_basic_block('if.end')
        
        self.builder.cbranch(cond_bool, then_bb, else_bb or cont_bb)
        
        # Then
        self.builder.position_at_end(then_bb)
        self.visit(ctx.block(0))
        if not self.builder.block.is_terminated:
            self.builder.branch(cont_bb)
        
        # Else
        if else_bb:
            self.builder.position_at_end(else_bb)
            self.visit(ctx.block(1))
            if not self.builder.block.is_terminated:
                self.builder.branch(cont_bb)
        
        self.builder.position_at_end(cont_bb)

    def visitWhileStmt(self, ctx: JamScriptParser.WhileStmtContext):
        cond_bb = self.func.append_basic_block('while.cond')
        body_bb = self.func.append_basic_block('while.body')
        end_bb = self.func.append_basic_block('while.end')
        
        self.builder.branch(cond_bb)
        self.builder.position_at_end(cond_bb)
        
        cval, ctype = self.visit(ctx.expr())
        cond_bool = self.builder.icmp_signed('!=', cval, ir.Constant(self.i32, 0)) if ctype == 'int' else cval
        self.builder.cbranch(cond_bool, body_bb, end_bb)
        
        self.builder.position_at_end(body_bb)
        self.break_stack.append(end_bb)  # Adicionar suporte a break
        self.visit(ctx.block())
        self.break_stack.pop()
        if not self.builder.block.is_terminated:
            self.builder.branch(cond_bb)
        
        self.builder.position_at_end(end_bb)

    def visitForStmt(self, ctx: JamScriptParser.ForStmtContext):
        self._new_scope()
        self.visit(ctx.forInit())
        
        cond_bb = self.func.append_basic_block('for.cond')
        body_bb = self.func.append_basic_block('for.body')
        update_bb = self.func.append_basic_block('for.update')
        end_bb = self.func.append_basic_block('for.end')
        
        self.builder.branch(cond_bb)
        self.builder.position_at_end(cond_bb)
        
        cval, ctype = self.visit(ctx.expr())
        cond_bool = self.builder.icmp_signed('!=', cval, ir.Constant(self.i32, 0)) if ctype == 'int' else cval
        self.builder.cbranch(cond_bool, body_bb, end_bb)
        
        self.builder.position_at_end(body_bb)
        self.break_stack.append(end_bb)  # Adicionar suporte a break
        self.visit(ctx.block())
        self.break_stack.pop()
        if not self.builder.block.is_terminated:
            self.builder.branch(update_bb)
        
        self.builder.position_at_end(update_bb)
        self.visit(ctx.forUpdate())
        if not self.builder.block.is_terminated:
            self.builder.branch(cond_bb)
        
        self.builder.position_at_end(end_bb)
        self._pop_scope()

    def visitForInit(self, ctx: JamScriptParser.ForInitContext):
        if ctx.assignNoSemi():
            return self.visit(ctx.assignNoSemi())
        
        name = ctx.ID().getText()
        llvm_ty = self._llvm_type_for_name(ctx.type_().getText())
        ptr = self._alloca_in_entry(self.func, name, llvm_ty)
        self._define_llvm_var(name, ptr)
        
        if ctx.expr():
            val, _ = self.visit(ctx.expr())
            self.builder.store(val, ptr)
        else:
            self.builder.store(ir.Constant(llvm_ty, 0), ptr)

    def visitForUpdate(self, ctx: JamScriptParser.ForUpdateContext):
        return self.visit(ctx.incExpr() or ctx.assignNoSemi())

    def visitAssignNoSemi(self, ctx: JamScriptParser.AssignNoSemiContext):
        ptr, _ = self._resolve_lhs_ptr(ctx.leftHandSide())
        val, _ = self.visit(ctx.expr())
        self.builder.store(val, ptr)

    def visitIncExpr(self, ctx: JamScriptParser.IncExprContext):
        name = ctx.ID().getText()
        ptr = self._resolve_llvm_var(name)
        if not ptr:
            raise CodeGenError(f"Variável não encontrada: {name}")
        
        cur = self.builder.load(ptr)
        new = self.builder.add(cur, ir.Constant(self.i32, 1)) if '++' in ctx.getText() else self.builder.sub(cur, ir.Constant(self.i32, 1))
        self.builder.store(new, ptr)
        return new, 'int'

    def visitReturnStmt(self, ctx: JamScriptParser.ReturnStmtContext):
        if ctx.expr():
            val, vtype = self.visit(ctx.expr())
            
            # Handle struct returns - if returning a struct variable, load its value
            if hasattr(self.func.function_type.return_type, '_field_names'):
                if vtype == 'struct_ptr':
                    val = self.builder.load(val)
                # vtype == 'struct' means val is already a struct value
            
            if isinstance(self.func.function_type.return_type, ir.DoubleType) and vtype == 'int':
                val = self.builder.sitofp(val, self.flt)
            self.builder.ret(val)
        else:
            self.builder.ret_void()

    # ========== Expressions ==========
    def visitExpr(self, ctx):
        return self.visit(ctx.orExpr())

    def visitOrExpr(self, ctx: JamScriptParser.OrExprContext):
        left, ltype = self.visit(ctx.andExpr(0))
        for i in range(1, len(ctx.andExpr())):
            right, rtype = self.visit(ctx.andExpr(i))
            left = self.builder.or_(left, right)
            ltype = 'bool'
        return left, ltype

    def visitAndExpr(self, ctx: JamScriptParser.AndExprContext):
        left, ltype = self.visit(ctx.eqExpr(0))
        for i in range(1, len(ctx.eqExpr())):
            right, rtype = self.visit(ctx.eqExpr(i))
            left = self.builder.and_(left, right)
            ltype = 'bool'
        return left, ltype

    def visitEqExpr(self, ctx: JamScriptParser.EqExprContext):
        left, ltype = self.visit(ctx.relExpr(0))
        for i in range(1, len(ctx.relExpr())):
            right, rtype = self.visit(ctx.relExpr(i))
            left, right, rtype = self._promote_for_numeric_op(left, ltype, right, rtype)
            
            if rtype == 'float':
                left = self.builder.fcmp_ordered('==', left, right)
            else:
                left = self.builder.icmp_signed('==', left, right)
            ltype = 'bool'
        return left, ltype

    def visitRelExpr(self, ctx: JamScriptParser.RelExprContext):
        left, ltype = self.visit(ctx.addExpr(0))
        for i in range(1, len(ctx.addExpr())):
            right, rtype = self.visit(ctx.addExpr(i))
            left, right, rtype = self._promote_for_numeric_op(left, ltype, right, rtype)
            
            op = '>' if '>' in ctx.getText() else '<'
            if rtype == 'float':
                left = self.builder.fcmp_ordered(op, left, right)
            else:
                left = self.builder.icmp_signed(op, left, right)
            ltype = 'bool'
        return left, ltype

    def visitAddExpr(self, ctx: JamScriptParser.AddExprContext):
        left, ltype = self.visit(ctx.mulExpr(0))
        for i in range(1, len(ctx.mulExpr())):
            right, rtype = self.visit(ctx.mulExpr(i))
            left, right, rtype = self._promote_for_numeric_op(left, ltype, right, rtype)
            
            is_add = '+' in ctx.getText()
            if rtype == 'float':
                left = self.builder.fadd(left, right) if is_add else self.builder.fsub(left, right)
            else:
                left = self.builder.add(left, right) if is_add else self.builder.sub(left, right)
            ltype = rtype
        return left, ltype

    def visitMulExpr(self, ctx: JamScriptParser.MulExprContext):
        left, ltype = self.visit(ctx.unaryExpr(0))
        for i in range(1, len(ctx.unaryExpr())):
            right, rtype = self.visit(ctx.unaryExpr(i))
            left, right, rtype = self._promote_for_numeric_op(left, ltype, right, rtype)
            
            is_mul = '*' in ctx.getText()
            if rtype == 'float':
                left = self.builder.fmul(left, right) if is_mul else self.builder.fdiv(left, right)
            else:
                left = self.builder.mul(left, right) if is_mul else self.builder.sdiv(left, right)
            ltype = rtype
        return left, ltype

    def visitUnaryExpr(self, ctx: JamScriptParser.UnaryExprContext):
        if ctx.unaryExpr():
            op = ctx.getChild(0).getText()
            val, vtype = self.visit(ctx.unaryExpr())
            
            if op == '-':
                return (self.builder.neg(val), 'int') if vtype == 'int' else (self.builder.fneg(val), 'float')
            elif op == '!':
                return self.builder.not_(val), 'bool'
            return val, vtype
        
        return self.visit(ctx.postfixExpr())

    def visitPostfixExpr(self, ctx: JamScriptParser.PostfixExprContext):
        return self.visit(ctx.primary())

    def visitPrimary(self, ctx: JamScriptParser.PrimaryContext):
        if ctx.NUMBER():
            return ir.Constant(self.i32, int(ctx.NUMBER().getText())), 'int'
        if ctx.FLOAT():
            return ir.Constant(self.flt, float(ctx.FLOAT().getText())), 'float'
        if ctx.STRING():
            txt = ctx.STRING().getText()[1:-1]
            g = self._get_str_const(txt)
            return self.builder.bitcast(g, self.char_ptr), 'string'
        if ctx.BOOL():
            return ir.Constant(self.i1, 1 if ctx.BOOL().getText() == 'true' else 0), 'bool'
        if ctx.leftHandSide():
            ptr, llvm_t = self._resolve_lhs_ptr(ctx.leftHandSide())

            # se for struct → retorna ponteiro direto para ser usado conforme contexto
            if isinstance(llvm_t, ir.IdentifiedStructType):
                return ptr, 'struct_ptr'

            # caso contrário, primitivo → load
            val = self.builder.load(ptr)
            type_map = {self.i32: 'int', self.flt: 'float', self.i1: 'bool'}
            return val, type_map.get(llvm_t, 'ptr')

        if ctx.functionCall():
            return self.visit(ctx.functionCall())
        if ctx.expr():
            return self.visit(ctx.expr())

    def visitFunctionCall(self, ctx: JamScriptParser.FunctionCallContext):
        fname = ctx.ID().getText()
        f = self.module.globals.get(fname)
        if not f:
            raise CodeGenError(f"Função não definida: {fname}")

        args = []
        if ctx.argList():
            for e in ctx.argList().expr():
                # sempre deixe o visitor decidir o valor e o tipo
                val, vtype = self.visit(e)

                # se for struct_ptr: val é ponteiro para struct, usar direto
                if vtype == 'struct_ptr':
                    args.append(val)
                elif vtype == 'struct':
                    # Alocar temporário e armazenar o struct value
                    temp_ptr = self.builder.alloca(val.type)
                    self.builder.store(val, temp_ptr)
                    args.append(temp_ptr)
                elif vtype == 'ptr':
                    # Já é ponteiro, usar direto
                    args.append(val)
                else:
                    # primitivo: valor imediato
                    args.append(val)

        ret = self.builder.call(f, args)

        rty = f.function_type.return_type

        if isinstance(rty, ir.IntType) and rty.width == 32:
            return ret, 'int'
        if isinstance(rty, ir.DoubleType):
            return ret, 'float'
        if isinstance(rty, ir.VoidType):
            return None, 'void'
        if hasattr(rty, '_field_names'):  # Direct struct type
            return ret, 'struct'

        return ret, 'ptr'

    # ========== Output ==========
    def write_ir(self, filename="output.ll"):
        with open(filename, "w", encoding="utf-8") as f:
            f.write(str(self.module))

    def get_ir(self):
        return str(self.module)