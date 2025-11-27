# TF JAMSCRIPT (PARTE 2)
# ANA VALÉRIA SILVA COELHO
# JOÃO VICTOR CRUZ SILVA
# MIGUEL ANJO MACIEL MEDEIROS

from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from antlr.JamScriptParser import JamScriptParser
from antlr.JamScriptVisitor import JamScriptVisitor

from semantica.symbols import VarSymbol, StructSymbol, FuncSymbol
from semantica.symbolTable import SymbolTableManager

class SemanticError(Exception):
    pass

class SemanticAnalyzer(JamScriptVisitor):
    def __init__(self):
        super().__init__()
        self.stmgr = SymbolTableManager()
        self.errors = []
        self.current_function = None        
        self.current_function_return = None
        self.main_count = 0

    # ---------- Helpers ----------
    def error(self, ctx, msg):
        line = None
        col = None
        # try to extract line/col if ctx has payload
        try:
            token = ctx.start
            line = token.line
            col = token.column
            self.errors.append(f"[SEM] {msg} (linha {line}:{col})")
        except Exception:
            self.errors.append(f"[SEM] {msg}")

    def resolve_type_name(self, type_name):
        """ Given a type name string (like 'int' or a struct name), returns:
            - 'int','float','bool','string','void' (strings) for primitives
            - StructSymbol instance for structs (resolved in global scope)
            - None if unknown
        """
        prims = {'int','float','bool','string','void'}
        if type_name in prims:
            return type_name
        sym = self.stmgr.resolve(type_name)
        if isinstance(sym, StructSymbol):
            return sym
        return None

    def type_to_str(self, t):
        if t is None:
            return "??"
        if isinstance(t, str):
            return t
        if isinstance(t, StructSymbol):
            return f"struct {t.name}"
        return str(t)

    def is_numeric(self, t):
        return t in ('int','float')

    def can_assign(self, target_type, value_type):
        """Check assignment compatibility (allow int -> float promotion)."""
        if target_type is None or value_type is None:
            return False
        if isinstance(target_type, StructSymbol) or isinstance(value_type, StructSymbol):
            return target_type == value_type
        if target_type == value_type:
            return True
        # allow int -> float promotion
        if target_type == 'float' and value_type == 'int':
            return True
        return False

    # ---------- Program ----------
    def visitProgram(self, ctx:JamScriptParser.ProgramContext):
        # program: PROGRAM ID SEMI structDecl* funcDecl* mainBlock EOF
        # first visit structs and functions (they are in the tree)
        # But order in tree is already structs then funcs then main
        # We'll just walk children (visitor will call respective visit methods).
        # Start from global scope already initialized in SymbolTableManager
        for child in ctx.getChildren():
            # iterate; letting visitor dispatch handle details
            self.visit(child)
        # after visiting, check errors
        if self.main_count == 0:
            self.errors.append("[SEM] Programa deve conter exatamente um main (nenhum encontrado).")
        elif self.main_count > 1:
            self.errors.append("[SEM] Programa deve conter exatamente um main (mais de um encontrado).")

        if self.errors:
            raise SemanticError("\n".join(self.errors))
        return None

    # ---------- Structs ----------
    def visitStructDecl(self, ctx:JamScriptParser.StructDeclContext):
        # structDecl: STRUCT ID LBRACE structField* RBRACE
        name = ctx.ID().getText()
        # define struct at global scope (spec requires structs global)
        # ensure define at global scope (move to global)
        # We'll temporarily go to global scope to define struct
        # but SymbolTableManager defines in current scope; to be strict, require current is global
        if self.stmgr.current_scope.name != "global":
            self.error(ctx, f"Struct '{name}' deve ser declarado no escopo global.")
            # still try to define in current scope
        # check if already defined
        existing = self.stmgr.resolve(name)
        if existing is not None and isinstance(existing, StructSymbol) and existing.name == name:
            self.error(ctx, f"Redeclaração de struct '{name}'.")
            return None

        struct_sym = StructSymbol(name)
        try:
            self.stmgr.define(struct_sym)
        except Exception as e:
            # redeclaration error thrown by symbol table
            self.error(ctx, str(e))
            return None

        # add fields
        for field_ctx in ctx.structField():
            fname = field_ctx.ID().getText()
            ftype_name = field_ctx.type_().getText()
            ftype = self.resolve_type_name(ftype_name)
            if ftype is None:
                # if not resolved, maybe forward-reference to struct not yet defined -> error
                self.error(field_ctx, f"Tipo '{ftype_name}' do campo '{fname}' do struct '{name}' não está definido.")
            else:
                # store the type representation (string or StructSymbol)
                try:
                    struct_sym.add_field(fname, ftype)
                except Exception as e:
                    self.error(field_ctx, str(e))
        return None

    # ---------- Functions ----------
    def visitFuncDecl(self, ctx:JamScriptParser.FuncDeclContext):
        # funcDecl: FUNCTION ID LPAREN paramList? RPAREN COLON type_ block
        fname = ctx.ID().getText()
        ret_type_name = ctx.type_().getText()
        ret_type = self.resolve_type_name(ret_type_name)
        if ret_type is None:
            self.error(ctx, f"Tipo de retorno '{ret_type_name}' da função '{fname}' não definido.")
            # set to unknown string to allow further checks
            ret_type = ret_type_name

        # define function in current scope (must be global)
        if self.stmgr.current_scope.name != "global":
            self.error(ctx, f"Função '{fname}' deve ser declarada no escopo global.")
        # ensure no name conflict
        existing = self.stmgr.resolve(fname)
        if existing is not None:
            self.error(ctx, f"Redeclaração ou conflito de nome para função '{fname}'.")
            # still continue but avoid overwriting
            return None

        func_sym = FuncSymbol(fname, ret_type)
        try:
            self.stmgr.define(func_sym)
        except Exception as e:
            self.error(ctx, str(e))
            return None

        # Enter function scope
        self.stmgr.push_scope(f"function_{fname}")
        # save current function context
        prev_func = self.current_function
        prev_ret = self.current_function_return
        self.current_function = func_sym
        self.current_function_return = ret_type

        # parameters
        if ctx.paramList():
            for param in ctx.paramList().param():
                pname = param.ID().getText()
                ptype_name = param.type_().getText()
                ptype = self.resolve_type_name(ptype_name)
                if ptype is None:
                    self.error(param, f"Tipo '{ptype_name}' do parâmetro '{pname}' na função '{fname}' não definido.")
                    ptype = ptype_name
                # add param to func symbol
                func_sym.add_param(pname, ptype)
                # define param as variable in function scope (params are mutable variables)
                try:
                    self.stmgr.define(VarSymbol(pname, ptype, is_const=False))
                except Exception as e:
                    self.error(param, str(e))

        # visit block (function body)
        self.visit(ctx.block())

        # crude check: if return type is not void, check we had at least one return in body
        # NOTE: full path-sensitive check is complex; we perform a simple presence check
        if self.current_function_return != 'void':
            # scan block for return nodes (simple approach)
            has_return = self._contains_return(ctx.block())
            if not has_return:
                self.error(ctx, f"Função '{fname}' com tipo de retorno '{self.type_to_str(self.current_function_return)}' não possui 'return' em seu corpo.")
        # exit function scope
        self.stmgr.pop_scope()
        self.current_function = prev_func
        self.current_function_return = prev_ret
        return None

    def _contains_return(self, node):
        # If this node is a TerminalNode (token), ignore
        from antlr4 import TerminalNode
        if isinstance(node, TerminalNode):
            return False

        # Check if this node *is* a returnStmt
        if isinstance(node, JamScriptParser.ReturnStmtContext):
            return True

        # Otherwise, check children (only if they have getChildren)
        if hasattr(node, "getChildren"):
            for child in node.getChildren():
                if self._contains_return(child):
                    return True

        return False

    # ---------- Main block ----------
    def visitMainBlock(self, ctx:JamScriptParser.MainBlockContext):
        # mainBlock: MAIN block
        self.main_count += 1
        # enforce only one main at final check
        # visit the block (which will handle scope)
        self.visit(ctx.block())
        return None

    # ---------- Block (scope) ----------
    def visitBlock(self, ctx:JamScriptParser.BlockContext):
        # block: LBRACE decl* stmt* RBRACE
        # create new scope
        self.stmgr.push_scope("block")
        # decl* come before stmt* per grammar; visit decls then stmts
        for decl in ctx.decl():
            self.visit(decl)
        for stmt in ctx.stmt():
            self.visit(stmt)
        self.stmgr.pop_scope()
        return None

    # ---------- Declarations ----------
    def visitDecl(self, ctx:JamScriptParser.DeclContext):
        # decl : varDecl
        return self.visit(ctx.varDecl())

    def visitVarDecl(self, ctx:JamScriptParser.VarDeclContext):
        # varDecl:
        #   LET ID COLON type_ (EQ expr)? SEMI
        # | CONST ID COLON type_ EQ expr SEMI
        is_const = False
        if ctx.LET():
            is_const = False
            idtok = ctx.ID()
            typename = ctx.type_().getText()
            typ = self.resolve_type_name(typename)
            if typ is None:
                self.error(ctx, f"Tipo '{typename}' não definido para variável '{idtok.getText()}'")
                typ = typename
            name = idtok.getText()
            sym = VarSymbol(name, typ, is_const=False)
            try:
                self.stmgr.define(sym)
            except Exception as e:
                self.error(ctx, str(e))
            # if initializer exists, check compatibility
            if ctx.expr():
                val_type = self.visit(ctx.expr())
                if not self.can_assign(typ, val_type):
                    self.error(ctx, f"Incompatibilidade de tipos na inicialização da variável '{name}': {self.type_to_str(typ)} <- {self.type_to_str(val_type)}")
        elif ctx.CONST():
            is_const = True
            idtok = ctx.ID()
            typename = ctx.type_().getText()
            typ = self.resolve_type_name(typename)
            if typ is None:
                self.error(ctx, f"Tipo '{typename}' não definido para constante '{idtok.getText()}'")
                typ = typename
            name = idtok.getText()
            if ctx.expr() is None:
                self.error(ctx, f"Constante '{name}' deve ser inicializada.")
            sym = VarSymbol(name, typ, is_const=True)
            try:
                self.stmgr.define(sym)
            except Exception as e:
                self.error(ctx, str(e))
            # check initializer compatibility
            if ctx.expr():
                val_type = self.visit(ctx.expr())
                if not self.can_assign(typ, val_type):
                    self.error(ctx, f"Incompatibilidade de tipos na inicialização da constante '{name}': {self.type_to_str(typ)} <- {self.type_to_str(val_type)}")
        return None

    # ---------- Statements ----------
    def visitSimpleStmt(self, ctx:JamScriptParser.SimpleStmtContext):
        # simpleStmt
        # : assignStmt
        # | callStmt SEMI
        # | returnStmt SEMI
        # | varDecl
        # | BREAK SEMI
        if ctx.assignStmt():
            return self.visit(ctx.assignStmt())
        if ctx.callStmt():
            # calls might be print/input/function calls
            return self.visit(ctx.callStmt())
        if ctx.returnStmt():
            return self.visit(ctx.returnStmt())
        if ctx.varDecl():
            return self.visit(ctx.varDecl())
        # break -> nothing to check here
        return None

    def visitAssignStmt(self, ctx:JamScriptParser.AssignStmtContext):
        # assignStmt : leftHandSide EQ expr SEMI
        lhs_ctx = ctx.leftHandSide()
        rhs_ctx = ctx.expr()
        # resolve LHS
        lhs_type, lhs_symbol, lhs_is_field = self._resolve_lhs(lhs_ctx)
        if lhs_symbol is None:
            self.error(lhs_ctx, f"Variável ou campo não declarado em atribuição: '{lhs_ctx.getText()}'")
            return None
        # check const
        if hasattr(lhs_symbol, 'is_const') and lhs_symbol.is_const:
            self.error(lhs_ctx, f"Atribuição a constante '{lhs_symbol.name}' não permitida.")
            return None
        # evaluate rhs
        val_type = self.visit(rhs_ctx)
        if not self.can_assign(lhs_type, val_type):
            self.error(ctx, f"Incompatibilidade de tipos na atribuição: {self.type_to_str(lhs_type)} <- {self.type_to_str(val_type)}")
        return None

    def _resolve_lhs(self, lhs_ctx):
        # returns (type, symbol, is_field)
        # leftHandSide : ID | ID DOT ID
        if lhs_ctx.getChildCount() == 1:
            name = lhs_ctx.ID(0).getText()
            sym = self.stmgr.resolve(name)
            if sym is None:
                return None, None, False
            if isinstance(sym, VarSymbol):
                return sym.type, sym, False
            # Cannot assign to function or struct
            return None, sym, False
        else:
            # field access
            base = lhs_ctx.ID(0).getText()
            field = lhs_ctx.ID(1).getText()
            base_sym = self.stmgr.resolve(base)
            if base_sym is None:
                return None, None, True
            # base_sym.type may be string primitive or StructSymbol
            btype = base_sym.type
            if isinstance(btype, StructSymbol):
                struct_sym = btype
            else:
                # if btype is a string naming a struct, resolve
                if isinstance(btype, str):
                    struct_res = self.stmgr.resolve(btype)
                    if isinstance(struct_res, StructSymbol):
                        struct_sym = struct_res
                    else:
                        struct_sym = None
                else:
                    struct_sym = None
            if struct_sym is None:
                return None, None, True
            # check field exists
            if field not in struct_sym.fields:
                return None, None, True
            field_type = struct_sym.fields[field]
            # create a synthetic symbol for the field (not stored in table)
            fake_sym = VarSymbol(f"{base}.{field}", field_type, is_const=False)
            return field_type, fake_sym, True

    def visitCallStmt(self, ctx:JamScriptParser.CallStmtContext):
        # callStmt: printStmt | inputStmt | functionCall
        if ctx.printStmt():
            return self.visit(ctx.printStmt())
        if ctx.inputStmt():
            return self.visit(ctx.inputStmt())
        if ctx.functionCall():
            return self.visit(ctx.functionCall())
        return None

    def visitPrintStmt(self, ctx:JamScriptParser.PrintStmtContext):
        # print accepts any number of args of any type
        return None

    def visitInputStmt(self, ctx:JamScriptParser.InputStmtContext):
        # input ( idList? )
        if ctx.idList():
            for idt in ctx.idList().ID():
                name = idt.getText()
                sym = self.stmgr.resolve(name)
                if sym is None:
                    self.error(idt, f"Variável '{name}' passada para input não declarada.")
                else:
                    # must be mutable and of acceptable type
                    if getattr(sym, 'is_const', False):
                        self.error(idt, f"Variável '{name}' passada para input é constante.")
                    stype = sym.type
                    if isinstance(stype, StructSymbol):
                        self.error(idt, f"Variável '{name}' passada para input tem tipo struct; apenas int/float/string são permitidos.")
                    elif stype not in ('int','float','string'):
                        self.error(idt, f"Variável '{name}' passada para input tem tipo inválido: {self.type_to_str(stype)}")
        return None

    def visitIfStmt(self, ctx:JamScriptParser.IfStmtContext):
        # IF LPAREN expr RPAREN block (ELSE block)?
        cond_type = self.visit(ctx.expr())
        if cond_type != 'bool':
            self.error(ctx.expr(), f"Expressão de condição do if deve ser bool, encontrado {self.type_to_str(cond_type)}")
        # visit blocks (visitor will)
        self.visit(ctx.block(0))
        if ctx.block(1):
            self.visit(ctx.block(1))
        return None

    def visitWhileStmt(self, ctx:JamScriptParser.WhileStmtContext):
        cond_type = self.visit(ctx.expr())
        if cond_type != 'bool':
            self.error(ctx.expr(), f"Expressão de condição do while deve ser bool, encontrado {self.type_to_str(cond_type)}")
        self.visit(ctx.block())
        return None

    def visitForInit(self, ctx: JamScriptParser.ForInitContext):

        # 1) Caso seja assignNoSemi: leftHandSide = expr
        if ctx.assignNoSemi():
            return self.visit(ctx.assignNoSemi())

        # 2) Caso seja LET ou CONST
        if ctx.LET() or ctx.CONST():
            is_const = ctx.CONST() is not None

            # Agora de forma correta: ctx.ID() é UM TerminalNodeImpl
            id_node = ctx.ID()
            if id_node is None:
                self.error(ctx, "Inicialização do for sem identificador.")
                return None

            name = id_node.getText()

            # Tipo declarado
            type_node = ctx.type_()
            if type_node is None:
                self.error(ctx, f"Tipo não informado na inicialização do for para '{name}'.")
                return None

            type_name = type_node.getText()
            declared_type = self.resolve_type_name(type_name)
            if declared_type is None:
                self.error(ctx, f"Tipo '{type_name}' não declarado.")
                declared_type = type_name

            # Registrar variável no escopo atual
            try:
                self.stmgr.define(VarSymbol(name, declared_type, is_const=is_const))
            except Exception as e:
                self.error(ctx, str(e))

            # Verificar inicialização com '=' caso exista expr
            if ctx.expr():
                val_type = self.visit(ctx.expr())
                if not self.can_assign(declared_type, val_type):
                    self.error(
                        ctx,
                        f"Tipo incompatível na inicialização do for: "
                        f"{self.type_to_str(declared_type)} <- {self.type_to_str(val_type)}"
                    )

        return None


    def visitForStmt(self, ctx: JamScriptParser.ForStmtContext):
        # escopo do for
        self.stmgr.push_scope("for")

        # 1) inicialização
        if ctx.forInit():
            self.visit(ctx.forInit())

        # 2) condição (expr?) — apenas UM expr
        cond_expr = ctx.expr()
        if cond_expr is not None:
            cond_type = self.visit(cond_expr)
            if cond_type not in ("int", "bool"):  # sua regra de condição, ajuste se necessário
                self.error(ctx, f"Condição do for deve ser bool ou int, recebeu {self.type_to_str(cond_type)}")

        # 3) update (forUpdate?)
        if ctx.forUpdate():
            self.visit(ctx.forUpdate())

        # 4) bloco interno
        self.visit(ctx.block())

        self.stmgr.pop_scope()
        return None

    def visitForUpdate(self, ctx: JamScriptParser.ForUpdateContext):
        if ctx.incExpr():
            return self.visit(ctx.incExpr())
        if ctx.assignNoSemi():
            return self.visit(ctx.assignNoSemi())
        return None


    def visitAssignNoSemi(self, ctx:JamScriptParser.AssignNoSemiContext):
        # used by forInit/forUpdate; leftHandSide EQ expr
        lhs_type, lhs_sym, _ = self._resolve_lhs(ctx.leftHandSide())
        if lhs_sym is None:
            self.error(ctx, "Atribuição para variável não declarada.")
            return None
        if getattr(lhs_sym, 'is_const', False):
            self.error(ctx, "Atribuição a constante não permitida.")
            return None
        val_type = self.visit(ctx.expr())
        if not self.can_assign(lhs_type, val_type):
            self.error(ctx, "Incompatibilidade de tipos na atribuição.")
        return None

    def visitIncExpr(self, ctx: JamScriptParser.IncExprContext):
        # ctx.ID() pode ser None ou 1 TerminalNodeImpl
        id_node = ctx.ID()
        if id_node:
            name = id_node.getText()
            symbol = self.stmgr.resolve(name)
            if symbol is None:
                self.error(ctx, f"Variável '{name}' não declarada no incremento.")
                return None

            # Tipo deve ser int
            if symbol.type != "int":
                self.error(ctx, f"Operador ++/-- só permitido para int, recebeu {self.type_to_str(symbol.type)}")

            return "int"

        # Caso prefixo ++ID ou --ID
        # ainda assim há ctx.ID() → um único TerminalNode
        return "int"

    def visitReturnStmt(self, ctx:JamScriptParser.ReturnStmtContext):
        # return expr?
        if self.current_function is None:
            self.error(ctx, "Return fora de função.")
            return None
        if ctx.expr():
            expr_type = self.visit(ctx.expr())
            # compare with current_function_return
            if not self.can_assign(self.current_function_return, expr_type):
                self.error(ctx, f"Tipo do return incompatível: função espera {self.type_to_str(self.current_function_return)}, return fornece {self.type_to_str(expr_type)}")
        else:
            # no expr
            if self.current_function_return != 'void':
                self.error(ctx, f"Função espera retorno do tipo {self.type_to_str(self.current_function_return)} mas 'return' sem expressão encontrado.")
        return None

    # ---------- Expressions ----------
    # We implement visit methods that return a "type" (string primitive or StructSymbol)
    def visitExpr(self, ctx:JamScriptParser.ExprContext):
        return self.visit(ctx.orExpr())

    def visitOrExpr(self, ctx:JamScriptParser.OrExprContext):
        # andExpr ( OR andExpr )*
        left = self.visit(ctx.andExpr(0))
        for i in range(1, len(ctx.andExpr())):
            right = self.visit(ctx.andExpr(i))
            # both bool
            if left != 'bool' or right != 'bool':
                self.error(ctx, f"Operador '||' exige operandos booleanos: {self.type_to_str(left)} || {self.type_to_str(right)}")
            left = 'bool'
        return left

    def visitAndExpr(self, ctx:JamScriptParser.AndExprContext):
        left = self.visit(ctx.eqExpr(0))
        for i in range(1, len(ctx.eqExpr())):
            right = self.visit(ctx.eqExpr(i))
            if left != 'bool' or right != 'bool':
                self.error(ctx, f"Operador '&&' exige operandos booleanos: {self.type_to_str(left)} && {self.type_to_str(right)}")
            left = 'bool'
        return left

    def visitEqExpr(self, ctx:JamScriptParser.EqExprContext):
        # relExpr ( (== | !=) relExpr )*
        left = self.visit(ctx.relExpr(0))
        for i in range(1, len(ctx.relExpr())):
            right = self.visit(ctx.relExpr(i))
            # allow int<->float; else types must match
            if (isinstance(left, StructSymbol) or isinstance(right, StructSymbol)):
                if left != right:
                    self.error(ctx, f"Operador de igualdade exige operandos do mesmo tipo (structs): {self.type_to_str(left)} / {self.type_to_str(right)}")
                left = 'bool'
                continue
            if left == right:
                left = 'bool'
            elif left in ('int','float') and right in ('int','float'):
                left = 'bool'
            else:
                self.error(ctx, f"Operador de igualdade entre tipos incompatíveis: {self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
                left = 'bool'
        return left

    def visitRelExpr(self, ctx:JamScriptParser.RelExprContext):
        # addExpr ( (GT | LT) addExpr )*
        left = self.visit(ctx.addExpr(0))
        for i in range(1, len(ctx.addExpr())):
            right = self.visit(ctx.addExpr(i))
            # allowed: int/float combinations; strings (lexicographic); not bool
            if left == 'bool' or right == 'bool':
                self.error(ctx, f"Operador relacional não aplicável a bool: {self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
            elif (self.is_numeric(left) and self.is_numeric(right)):
                # OK (result bool)
                left = 'bool'
            elif isinstance(left, StructSymbol) or isinstance(right, StructSymbol):
                self.error(ctx, f"Operador relacional não aplicável a structs: {self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
                left = 'bool'
            elif left == 'string' and right == 'string':
                left = 'bool'
            else:
                self.error(ctx, f"Operador relacional between incompatible types: {self.type_to_str(left)} and {self.type_to_str(right)}")
                left = 'bool'
        return left

    def visitAddExpr(self, ctx:JamScriptParser.AddExprContext):
        # mulExpr ( (+|-) mulExpr )*
        left = self.visit(ctx.mulExpr(0))
        for i in range(1, len(ctx.mulExpr())):
            right = self.visit(ctx.mulExpr(i))
            if self.is_numeric(left) and self.is_numeric(right):
                # promotion int->float
                if left == 'float' or right == 'float':
                    left = 'float'
                else:
                    left = 'int'
            else:
                self.error(ctx, f"Operador aritmético '+'/'-' exige operandos numéricos: {self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
                left = 'int'
        return left

    def visitMulExpr(self, ctx:JamScriptParser.MulExprContext):
        left = self.visit(ctx.unaryExpr(0))
        for i in range(1, len(ctx.unaryExpr())):
            right = self.visit(ctx.unaryExpr(i))
            if self.is_numeric(left) and self.is_numeric(right):
                if left == 'float' or right == 'float':
                    left = 'float'
                else:
                    left = 'int'
            else:
                self.error(ctx, f"Operador '*'/'/' exige operandos numéricos: {self.type_to_str(left)} {ctx.getText()} {self.type_to_str(right)}")
                left = 'int'
        return left

    def visitUnaryExpr(self, ctx:JamScriptParser.UnaryExprContext):
        # ('!' | '-' | '++' | '--') unaryExpr | postfixExpr
        if ctx.getChildCount() == 2 and ctx.unaryExpr():
            op = ctx.getChild(0).getText()
            val = self.visit(ctx.unaryExpr())
            if op == '!':
                if val != 'bool':
                    self.error(ctx, f"Operador '!' exige bool, encontrado {self.type_to_str(val)}")
                return 'bool'
            if op == '-':
                if not self.is_numeric(val):
                    self.error(ctx, f"Operador '-' unário exige tipo numérico, encontrado {self.type_to_str(val)}")
                return val
            if op in ('++','--'):
                # prefix increment: operand must be identifier (handled in incExpr normally), but here for unary we accept result int
                if val != 'int':
                    self.error(ctx, f"Operador '++/--' exige int, encontrado {self.type_to_str(val)}")
                return 'int'
        else:
            return self.visit(ctx.postfixExpr())

    def visitPostfixExpr(self, ctx:JamScriptParser.PostfixExprContext):
        # primary ('++'|'--')?
        base = self.visit(ctx.primary())
        if ctx.getChildCount() == 2:
            # postfix inc/dec used: ensure base is int and is variable
            if base != 'int':
                self.error(ctx, "Operador '++/--' pós-fix exige operando do tipo int.")
            # Note: detection of lvalue (variable vs literal) is done at incExpr/assign sites
            return 'int'
        return base

    def visitPrimary(self, ctx:JamScriptParser.PrimaryContext):
        # NUMBER | FLOAT | STRING | BOOL | leftHandSide | functionCall | LPAREN expr RPAREN
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
            if lhs_sym is None:
                self.error(ctx.leftHandSide(), f"Identificador não declarado: {ctx.leftHandSide().getText()}")
                return None
            return lhs_type
        if ctx.functionCall():
            return self.visit(ctx.functionCall())
        if ctx.expr():
            return self.visit(ctx.expr())
        return None

    def visitFunctionCall(self, ctx:JamScriptParser.FunctionCallContext):
        # functionCall: ID LPAREN argList? RPAREN
        fname = ctx.ID().getText()
        sym = self.stmgr.resolve(fname)
        if sym is None or not isinstance(sym, FuncSymbol):
            self.error(ctx, f"Chamada para função não declarada: '{fname}'")
            return None
        # check args count & types
        args = []
        if ctx.argList():
            for e in ctx.argList().expr():
                args.append(self.visit(e))
        # compare with function params
        params = sym.params
        if len(args) != len(params):
            self.error(ctx, f"Chamada para '{fname}' com número incorreto de argumentos: espera {len(params)}, recebeu {len(args)}")
        else:
            for i,(pname, ptype) in enumerate(params):
                argt = args[i]
                if not self.can_assign(ptype, argt):
                    self.error(ctx, f"Chamada para '{fname}': tipo do argumento {i+1} ('{self.type_to_str(argt)}') incompatível com parâmetro '{pname}': espera {self.type_to_str(ptype)}")
        return sym.type

    def visitArgList(self, ctx:JamScriptParser.ArgListContext):
        # not used directly; functionCall handles
        return None

    # ---------- Default visitor fallback ----------
    def visitChildren(self, node):
        # default: visit children until one returns a non-None value and then return last?
        result = None
        for c in node.getChildren():
            r = None
            # skip tokens
            if isinstance(c, TerminalNode):
                continue
            r = self.visit(c)
            if r is not None:
                result = r
        return result
