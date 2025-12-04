# TF JAMSCRIPT (PARTE 2)
# ANA VALÉRIA SILVA COELHO
# JOÃO VICTOR CRUZ SILVA
# MIGUEL ANJO MACIEL MEDEIROS

from antlr4 import TerminalNode
from antlr.JamScriptParser import JamScriptParser
from antlr.JamScriptVisitor import JamScriptVisitor
from semantica.symbols import VarSymbol, StructSymbol, FuncSymbol
from semantica.symbolTable import SymbolTableManager


class SemanticError(Exception):
    pass


class SemanticAnalyzer(JamScriptVisitor):
    PRIMITIVES = {'int', 'float', 'bool', 'string', 'void'}
    
    def __init__(self):
        super().__init__()
        self.stmgr = SymbolTableManager()
        self.errors = []
        self.current_function = None
        self.current_function_return = None
        self.main_count = 0
        # Stack para controlar se comandos já foram encontrados em cada bloco
        self.block_has_commands_stack = []
        # Stack para controlar se estamos dentro de loops (para validação de break)
        self.in_loop_stack = []

    # ========== Helpers ==========
    def error(self, ctx, msg):
        try:
            line, col = ctx.start.line, ctx.start.column
            self.errors.append(f"[SEM] {msg} (linha {line}:{col})")
        except:
            self.errors.append(f"[SEM] {msg}")

    def resolve_type_name(self, type_name):
        if type_name in self.PRIMITIVES:
            return type_name
        sym = self.stmgr.resolve(type_name)
        return sym if isinstance(sym, StructSymbol) else None

    def type_to_str(self, t):
        if isinstance(t, StructSymbol):
            return f"struct {t.name}"
        return str(t) if t else "??"

    def is_numeric(self, t):
        return t in ('int', 'float')

    def can_assign(self, target, value):
        if target is None or value is None:
            return False
        if isinstance(target, StructSymbol) or isinstance(value, StructSymbol):
            return target == value
        return target == value or (target == 'float' and value == 'int')

    def safe_define(self, ctx, symbol):
        try:
            self.stmgr.define(symbol)
        except Exception as e:
            self.error(ctx, str(e))

    def check_type_defined(self, ctx, type_name, context=""):
        typ = self.resolve_type_name(type_name)
        if typ is None:
            self.error(ctx, f"Tipo '{type_name}' não definido{context}")
        return typ or type_name
    
    def check_declaration_order(self, ctx, var_name):
        """Verifica se a declaração está acontecendo após comandos no bloco atual"""
        if (self.block_has_commands_stack and 
            len(self.block_has_commands_stack) > 0 and 
            self.block_has_commands_stack[-1]):
            self.error(ctx, f"Declaração da variável '{var_name}' após comandos no bloco. "
                           f"Todas as declarações devem aparecer antes dos comandos.")
    
    def check_break_context(self, ctx):
        """Verifica se break está sendo usado dentro de um loop"""
        if not self.in_loop_stack or not any(self.in_loop_stack):
            self.error(ctx, "'break' só pode ser usado dentro de loops (while ou for).")

    # ========== Program ==========
    def visitProgram(self, ctx: JamScriptParser.ProgramContext):
        for child in ctx.getChildren():
            self.visit(child)
        
        if self.main_count == 0:
            self.errors.append("[SEM] Programa deve conter exatamente um main (nenhum encontrado).")
        elif self.main_count > 1:
            self.errors.append("[SEM] Programa deve conter exatamente um main (mais de um encontrado).")
        
        if self.errors:
            raise SemanticError("\n".join(self.errors))

    # ========== Structs ==========
    def visitStructDecl(self, ctx: JamScriptParser.StructDeclContext):
        name = ctx.ID().getText()
        
        if self.stmgr.current_scope.name != "global":
            self.error(ctx, f"Struct '{name}' deve ser declarado no escopo global.")
        
        if self.stmgr.resolve(name):
            self.error(ctx, f"Redeclaração de struct '{name}'.")
            return
        
        struct_sym = StructSymbol(name)
        self.safe_define(ctx, struct_sym)
        
        for field_ctx in ctx.structField():
            fname = field_ctx.ID().getText()
            ftype = self.check_type_defined(field_ctx, field_ctx.type_().getText(), 
                                           f" do campo '{fname}' do struct '{name}'")
            try:
                struct_sym.add_field(fname, ftype)
            except Exception as e:
                self.error(field_ctx, str(e))

    # ========== Functions ==========
    def visitFuncDecl(self, ctx: JamScriptParser.FuncDeclContext):
        fname = ctx.ID().getText()
        ret_type = self.check_type_defined(ctx, ctx.type_().getText(), 
                                          f" de retorno da função '{fname}'")
        
        if self.stmgr.current_scope.name != "global":
            self.error(ctx, f"Função '{fname}' deve ser declarada no escopo global.")
        
        if self.stmgr.resolve(fname):
            self.error(ctx, f"Redeclaração ou conflito de nome para função '{fname}'.")
            return
        
        func_sym = FuncSymbol(fname, ret_type)
        self.safe_define(ctx, func_sym)
        
        self.stmgr.push_scope(f"function_{fname}")
        prev_func, prev_ret = self.current_function, self.current_function_return
        self.current_function, self.current_function_return = func_sym, ret_type
        
        # Parâmetros
        if ctx.paramList():
            for param in ctx.paramList().param():
                pname = param.ID().getText()
                ptype = self.check_type_defined(param, param.type_().getText(), 
                                               f" do parâmetro '{pname}' na função '{fname}'")
                func_sym.add_param(pname, ptype)
                self.safe_define(param, VarSymbol(pname, ptype, is_const=False))
        
        # Função tem seu próprio controle de declarações/comandos
        self.visit(ctx.block())
        
        # Verifica return em funções não-void
        if ret_type != 'void' and not self._contains_return(ctx.block()):
            self.error(ctx, f"Função '{fname}' com tipo de retorno '{self.type_to_str(ret_type)}' não possui 'return' em seu corpo.")
        
        self.stmgr.pop_scope()
        self.current_function, self.current_function_return = prev_func, prev_ret

    def _contains_return(self, node):
        if isinstance(node, TerminalNode):
            return False
        if isinstance(node, JamScriptParser.ReturnStmtContext):
            return True
        if hasattr(node, "getChildren"):
            return any(self._contains_return(child) for child in node.getChildren())
        return False

    # ========== Main & Blocks ==========
    def visitMainBlock(self, ctx: JamScriptParser.MainBlockContext):
        self.main_count += 1
        # Main também precisa do controle de declarações/comandos
        self.visit(ctx.block())

    def visitBlock(self, ctx: JamScriptParser.BlockContext):
        self.stmgr.push_scope("block")
        # Inicia um novo controle para este bloco (ainda não encontrou comandos)
        self.block_has_commands_stack.append(False)
        
        # Primeiro processa todas as declarações
        for decl in ctx.decl():
            self.visit(decl)
        
        # Marca que agora vamos processar comandos
        if len(self.block_has_commands_stack) > 0:
            self.block_has_commands_stack[-1] = True
            
        # Processa todos os comandos
        for stmt in ctx.stmt():
            self.visit(stmt)
            
        # Remove o controle deste bloco
        if self.block_has_commands_stack:
            self.block_has_commands_stack.pop()
        self.stmgr.pop_scope()

    # ========== Declarations ==========
    def visitVarDecl(self, ctx: JamScriptParser.VarDeclContext):
        is_const = ctx.CONST() is not None
        name = ctx.ID().getText()
        
        # Verifica se a declaração está sendo feita após comandos
        self.check_declaration_order(ctx, name)
        
        typ = self.check_type_defined(ctx, ctx.type_().getText(), 
                                      f" para {'constante' if is_const else 'variável'} '{name}'")
        
        if is_const and ctx.expr() is None:
            self.error(ctx, f"Constante '{name}' deve ser inicializada.")
        
        sym = VarSymbol(name, typ, is_const=is_const)
        self.safe_define(ctx, sym)
        
        if ctx.expr():
            val_type = self.visit(ctx.expr())
            if not self.can_assign(typ, val_type):
                kind = "constante" if is_const else "variável"
                self.error(ctx, f"Incompatibilidade de tipos na inicialização da {kind} '{name}': "
                               f"{self.type_to_str(typ)} <- {self.type_to_str(val_type)}")

    # ========== Statements ==========
    def visitSimpleStmt(self, ctx: JamScriptParser.SimpleStmtContext):
        # Verifica se é um break
        if ctx.BREAK():
            self.check_break_context(ctx)
        else:
            # Processa normalmente outros tipos de simpleStmt
            return self.visitChildren(ctx)

    def visitAssignStmt(self, ctx: JamScriptParser.AssignStmtContext):
        lhs_type, lhs_sym, _ = self._resolve_lhs(ctx.leftHandSide())
        
        if lhs_sym is None:
            self.error(ctx.leftHandSide(), f"Variável ou campo não declarado em atribuição: '{ctx.leftHandSide().getText()}'")
            return
        
        if getattr(lhs_sym, 'is_const', False):
            self.error(ctx.leftHandSide(), f"Atribuição a constante '{lhs_sym.name}' não permitida.")
            return
        
        val_type = self.visit(ctx.expr())
        if not self.can_assign(lhs_type, val_type):
            self.error(ctx, f"Incompatibilidade de tipos na atribuição: "
                           f"{self.type_to_str(lhs_type)} <- {self.type_to_str(val_type)}")

    def _resolve_lhs(self, lhs_ctx):
        if lhs_ctx.getChildCount() == 1:
            name = lhs_ctx.ID(0).getText()
            sym = self.stmgr.resolve(name)
            if sym is None or not isinstance(sym, VarSymbol):
                return None, None, False
            return sym.type, sym, False
        
        # Acesso a campo
        base_name = lhs_ctx.ID(0).getText()
        field_name = lhs_ctx.ID(1).getText()
        base_sym = self.stmgr.resolve(base_name)
        
        if not base_sym:
            return None, None, True
        
        struct_sym = base_sym.type if isinstance(base_sym.type, StructSymbol) else self.stmgr.resolve(base_sym.type)
        
        if not isinstance(struct_sym, StructSymbol) or field_name not in struct_sym.fields:
            return None, None, True
        
        field_type = struct_sym.fields[field_name]
        fake_sym = VarSymbol(f"{base_name}.{field_name}", field_type, is_const=False)
        return field_type, fake_sym, True

    def visitInputStmt(self, ctx: JamScriptParser.InputStmtContext):
        if ctx.idList():
            for idt in ctx.idList().ID():
                name = idt.getText()
                sym = self.stmgr.resolve(name)
                
                if not sym:
                    self.error(idt, f"Variável '{name}' passada para input não declarada.")
                    continue
                
                if getattr(sym, 'is_const', False):
                    self.error(idt, f"Variável '{name}' passada para input é constante.")
                
                if isinstance(sym.type, StructSymbol):
                    self.error(idt, f"Variável '{name}' passada para input tem tipo struct; apenas int/float/string são permitidos.")
                elif sym.type not in ('int', 'float', 'string'):
                    self.error(idt, f"Variável '{name}' passada para input tem tipo inválido: {self.type_to_str(sym.type)}")

    def visitIfStmt(self, ctx: JamScriptParser.IfStmtContext):
        cond_type = self.visit(ctx.expr())
        if cond_type != 'bool':
            self.error(ctx.expr(), f"Expressão de condição do if deve ser bool, encontrado {self.type_to_str(cond_type)}")
        
        self.visit(ctx.block(0))
        if ctx.block(1):
            self.visit(ctx.block(1))

    def visitWhileStmt(self, ctx: JamScriptParser.WhileStmtContext):
        cond_type = self.visit(ctx.expr())
        if cond_type != 'bool':
            self.error(ctx.expr(), f"Expressão de condição do while deve ser bool, encontrado {self.type_to_str(cond_type)}")
        
        # Entrar em contexto de loop
        self.in_loop_stack.append(True)
        self.visit(ctx.block())
        # Sair do contexto de loop
        if self.in_loop_stack:
            self.in_loop_stack.pop()

    def visitForStmt(self, ctx: JamScriptParser.ForStmtContext):
        self.stmgr.push_scope("for")
        
        self.visit(ctx.forInit())
        
        cond_type = self.visit(ctx.expr())
        if cond_type not in ("bool", "int"):
            self.error(ctx, f"Condição do for deve ser bool ou int, recebeu {self.type_to_str(cond_type)}")
        
        self.visit(ctx.forUpdate())
        
        # Entrar em contexto de loop
        self.in_loop_stack.append(True)
        self.visit(ctx.block())
        # Sair do contexto de loop
        if self.in_loop_stack:
            self.in_loop_stack.pop()
        
        self.stmgr.pop_scope()

    def visitForInit(self, ctx: JamScriptParser.ForInitContext):
        if ctx.assignNoSemi():
            return self.visit(ctx.assignNoSemi())
        
        is_const = ctx.CONST() is not None
        name = ctx.ID().getText()
        typ = self.check_type_defined(ctx, ctx.type_().getText())
        
        self.safe_define(ctx, VarSymbol(name, typ, is_const=is_const))
        
        if ctx.expr():
            val_type = self.visit(ctx.expr())
            if not self.can_assign(typ, val_type):
                self.error(ctx, f"Tipo incompatível na inicialização do for: "
                               f"{self.type_to_str(typ)} <- {self.type_to_str(val_type)}")

    def visitAssignNoSemi(self, ctx: JamScriptParser.AssignNoSemiContext):
        lhs_type, lhs_sym, _ = self._resolve_lhs(ctx.leftHandSide())
        
        if not lhs_sym:
            self.error(ctx, "Atribuição para variável não declarada.")
            return
        
        if getattr(lhs_sym, 'is_const', False):
            self.error(ctx, "Atribuição a constante não permitida.")
            return
        
        val_type = self.visit(ctx.expr())
        if not self.can_assign(lhs_type, val_type):
            self.error(ctx, "Incompatibilidade de tipos na atribuição.")

    def visitIncExpr(self, ctx: JamScriptParser.IncExprContext):
        id_node = ctx.ID()
        if id_node:
            name = id_node.getText()
            sym = self.stmgr.resolve(name)
            
            if not sym:
                self.error(ctx, f"Variável '{name}' não declarada no incremento.")
                return None
            
            if sym.type != "int":
                self.error(ctx, f"Operador ++/-- só permitido para int, recebeu {self.type_to_str(sym.type)}")
                return None
                
            if getattr(sym, 'is_const', False):
                self.error(ctx, f"Operador ++/-- não pode ser aplicado à constante '{name}'.")
                return None
        
        return "int"

    def visitReturnStmt(self, ctx: JamScriptParser.ReturnStmtContext):
        if not self.current_function:
            self.error(ctx, "Return fora de função.")
            return
        
        if ctx.expr():
            expr_type = self.visit(ctx.expr())
            if not self.can_assign(self.current_function_return, expr_type):
                self.error(ctx, f"Tipo do return incompatível: função espera {self.type_to_str(self.current_function_return)}, "
                               f"return fornece {self.type_to_str(expr_type)}")
        elif self.current_function_return != 'void':
            self.error(ctx, f"Função espera retorno do tipo {self.type_to_str(self.current_function_return)} "
                           f"mas 'return' sem expressão encontrado.")

    # ========== Expressions ==========
    def visitExpr(self, ctx: JamScriptParser.ExprContext):
        return self.visit(ctx.orExpr())

    def visitOrExpr(self, ctx: JamScriptParser.OrExprContext):
        left = self.visit(ctx.andExpr(0))
        for i in range(1, len(ctx.andExpr())):
            right = self.visit(ctx.andExpr(i))
            if left != 'bool' or right != 'bool':
                self.error(ctx, f"Operador '||' exige operandos booleanos: {self.type_to_str(left)} || {self.type_to_str(right)}")
            left = 'bool'
        return left

    def visitAndExpr(self, ctx: JamScriptParser.AndExprContext):
        left = self.visit(ctx.eqExpr(0))
        for i in range(1, len(ctx.eqExpr())):
            right = self.visit(ctx.eqExpr(i))
            if left != 'bool' or right != 'bool':
                self.error(ctx, f"Operador '&&' exige operandos booleanos: {self.type_to_str(left)} && {self.type_to_str(right)}")
            left = 'bool'
        return left

    def visitEqExpr(self, ctx: JamScriptParser.EqExprContext):
        left = self.visit(ctx.relExpr(0))
        for i in range(1, len(ctx.relExpr())):
            right = self.visit(ctx.relExpr(i))
            
            if isinstance(left, StructSymbol) or isinstance(right, StructSymbol):
                if left != right:
                    self.error(ctx, f"Operador de igualdade exige operandos do mesmo tipo (structs): "
                                   f"{self.type_to_str(left)} / {self.type_to_str(right)}")
            elif left != right and not (self.is_numeric(left) and self.is_numeric(right)):
                self.error(ctx, f"Operador de igualdade entre tipos incompatíveis: "
                               f"{self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
            left = 'bool'
        return left

    def visitRelExpr(self, ctx: JamScriptParser.RelExprContext):
        left = self.visit(ctx.addExpr(0))
        for i in range(1, len(ctx.addExpr())):
            right = self.visit(ctx.addExpr(i))
            
            if left == 'bool' or right == 'bool':
                self.error(ctx, f"Operador relacional não aplicável a bool: {self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
            elif isinstance(left, StructSymbol) or isinstance(right, StructSymbol):
                self.error(ctx, f"Operador relacional não aplicável a structs: {self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
            elif not (self.is_numeric(left) and self.is_numeric(right)) and not (left == 'string' and right == 'string'):
                self.error(ctx, f"Operador relacional entre tipos incompatíveis: {self.type_to_str(left)} e {self.type_to_str(right)}")
            left = 'bool'
        return left

    def visitAddExpr(self, ctx: JamScriptParser.AddExprContext):
        left = self.visit(ctx.mulExpr(0))
        for i in range(1, len(ctx.mulExpr())):
            right = self.visit(ctx.mulExpr(i))
            if self.is_numeric(left) and self.is_numeric(right):
                left = 'float' if (left == 'float' or right == 'float') else 'int'
            else:
                self.error(ctx, f"Operador aritmético '+'/'-' exige operandos numéricos: "
                               f"{self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
                left = 'int'
        return left

    def visitMulExpr(self, ctx: JamScriptParser.MulExprContext):
        left = self.visit(ctx.unaryExpr(0))
        for i in range(1, len(ctx.unaryExpr())):
            right = self.visit(ctx.unaryExpr(i))
            if self.is_numeric(left) and self.is_numeric(right):
                left = 'float' if (left == 'float' or right == 'float') else 'int'
            else:
                self.error(ctx, f"Operador '*'/'/' exige operandos numéricos: "
                               f"{self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
                left = 'int'
        return left

    def visitUnaryExpr(self, ctx: JamScriptParser.UnaryExprContext):
        if ctx.getChildCount() == 2 and ctx.unaryExpr():
            op = ctx.getChild(0).getText()
            val = self.visit(ctx.unaryExpr())
            
            if op == '!':
                if val != 'bool':
                    self.error(ctx, f"Operador '!' exige bool, encontrado {self.type_to_str(val)}")
                return 'bool'
            elif op == '-':
                if not self.is_numeric(val):
                    self.error(ctx, f"Operador '-' unário exige tipo numérico, encontrado {self.type_to_str(val)}")
                return val
            elif op in ('++', '--'):
                if val != 'int':
                    self.error(ctx, f"Operador '++/--' exige int, encontrado {self.type_to_str(val)}")
                return 'int'
        
        return self.visit(ctx.postfixExpr())

    def visitPostfixExpr(self, ctx: JamScriptParser.PostfixExprContext):
        base = self.visit(ctx.primary())
        if ctx.getChildCount() == 2:
            if base != 'int':
                self.error(ctx, "Operador '++/--' pós-fix exige operando do tipo int.")
            return 'int'
        return base

    def visitPrimary(self, ctx: JamScriptParser.PrimaryContext):
        if ctx.NUMBER():
            return 'int'
        if ctx.FLOAT():
            return 'float'
        if ctx.STRING():
            return 'string'
        if ctx.BOOL():
            return 'bool'
        if ctx.leftHandSide():
            lhs_type, lhs_sym, _ = self._resolve_lhs(ctx.leftHandSide())
            if not lhs_sym:
                self.error(ctx.leftHandSide(), f"Identificador não declarado: {ctx.leftHandSide().getText()}")
                return None
            return lhs_type
        if ctx.functionCall():
            return self.visit(ctx.functionCall())
        if ctx.expr():
            return self.visit(ctx.expr())

    def visitFunctionCall(self, ctx: JamScriptParser.FunctionCallContext):
        fname = ctx.ID().getText()
        sym = self.stmgr.resolve(fname)
        
        if not sym or not isinstance(sym, FuncSymbol):
            self.error(ctx, f"Chamada para função não declarada: '{fname}'")
            return None
        
        args = [self.visit(e) for e in ctx.argList().expr()] if ctx.argList() else []
        
        if len(args) != len(sym.params):
            self.error(ctx, f"Chamada para '{fname}' com número incorreto de argumentos: "
                           f"espera {len(sym.params)}, recebeu {len(args)}")
        else:
            for i, (pname, ptype) in enumerate(sym.params):
                if not self.can_assign(ptype, args[i]):
                    self.error(ctx, f"Chamada para '{fname}': tipo do argumento {i+1} ('{self.type_to_str(args[i])}') "
                                   f"incompatível com parâmetro '{pname}': espera {self.type_to_str(ptype)}")
        
        return sym.type

    def visitChildren(self, node):
        result = None
        for c in node.getChildren():
            if isinstance(c, TerminalNode):
                continue
            r = self.visit(c)
            if r is not None:
                result = r
        return result