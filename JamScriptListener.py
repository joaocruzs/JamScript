# Generated from JamScript.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .JamScriptParser import JamScriptParser
else:
    from JamScriptParser import JamScriptParser

# This class defines a complete listener for a parse tree produced by JamScriptParser.
class JamScriptListener(ParseTreeListener):

    # Enter a parse tree produced by JamScriptParser#program.
    def enterProgram(self, ctx:JamScriptParser.ProgramContext):
        pass

    # Exit a parse tree produced by JamScriptParser#program.
    def exitProgram(self, ctx:JamScriptParser.ProgramContext):
        pass


    # Enter a parse tree produced by JamScriptParser#decl.
    def enterDecl(self, ctx:JamScriptParser.DeclContext):
        pass

    # Exit a parse tree produced by JamScriptParser#decl.
    def exitDecl(self, ctx:JamScriptParser.DeclContext):
        pass


    # Enter a parse tree produced by JamScriptParser#structDecl.
    def enterStructDecl(self, ctx:JamScriptParser.StructDeclContext):
        pass

    # Exit a parse tree produced by JamScriptParser#structDecl.
    def exitStructDecl(self, ctx:JamScriptParser.StructDeclContext):
        pass


    # Enter a parse tree produced by JamScriptParser#structField.
    def enterStructField(self, ctx:JamScriptParser.StructFieldContext):
        pass

    # Exit a parse tree produced by JamScriptParser#structField.
    def exitStructField(self, ctx:JamScriptParser.StructFieldContext):
        pass


    # Enter a parse tree produced by JamScriptParser#varDecl.
    def enterVarDecl(self, ctx:JamScriptParser.VarDeclContext):
        pass

    # Exit a parse tree produced by JamScriptParser#varDecl.
    def exitVarDecl(self, ctx:JamScriptParser.VarDeclContext):
        pass


    # Enter a parse tree produced by JamScriptParser#funcDecl.
    def enterFuncDecl(self, ctx:JamScriptParser.FuncDeclContext):
        pass

    # Exit a parse tree produced by JamScriptParser#funcDecl.
    def exitFuncDecl(self, ctx:JamScriptParser.FuncDeclContext):
        pass


    # Enter a parse tree produced by JamScriptParser#paramList.
    def enterParamList(self, ctx:JamScriptParser.ParamListContext):
        pass

    # Exit a parse tree produced by JamScriptParser#paramList.
    def exitParamList(self, ctx:JamScriptParser.ParamListContext):
        pass


    # Enter a parse tree produced by JamScriptParser#param.
    def enterParam(self, ctx:JamScriptParser.ParamContext):
        pass

    # Exit a parse tree produced by JamScriptParser#param.
    def exitParam(self, ctx:JamScriptParser.ParamContext):
        pass


    # Enter a parse tree produced by JamScriptParser#mainBlock.
    def enterMainBlock(self, ctx:JamScriptParser.MainBlockContext):
        pass

    # Exit a parse tree produced by JamScriptParser#mainBlock.
    def exitMainBlock(self, ctx:JamScriptParser.MainBlockContext):
        pass


    # Enter a parse tree produced by JamScriptParser#block.
    def enterBlock(self, ctx:JamScriptParser.BlockContext):
        pass

    # Exit a parse tree produced by JamScriptParser#block.
    def exitBlock(self, ctx:JamScriptParser.BlockContext):
        pass


    # Enter a parse tree produced by JamScriptParser#stmt.
    def enterStmt(self, ctx:JamScriptParser.StmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#stmt.
    def exitStmt(self, ctx:JamScriptParser.StmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#simpleStmt.
    def enterSimpleStmt(self, ctx:JamScriptParser.SimpleStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#simpleStmt.
    def exitSimpleStmt(self, ctx:JamScriptParser.SimpleStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#assignStmt.
    def enterAssignStmt(self, ctx:JamScriptParser.AssignStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#assignStmt.
    def exitAssignStmt(self, ctx:JamScriptParser.AssignStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#leftHandSide.
    def enterLeftHandSide(self, ctx:JamScriptParser.LeftHandSideContext):
        pass

    # Exit a parse tree produced by JamScriptParser#leftHandSide.
    def exitLeftHandSide(self, ctx:JamScriptParser.LeftHandSideContext):
        pass


    # Enter a parse tree produced by JamScriptParser#callStmt.
    def enterCallStmt(self, ctx:JamScriptParser.CallStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#callStmt.
    def exitCallStmt(self, ctx:JamScriptParser.CallStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#printStmt.
    def enterPrintStmt(self, ctx:JamScriptParser.PrintStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#printStmt.
    def exitPrintStmt(self, ctx:JamScriptParser.PrintStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#inputStmt.
    def enterInputStmt(self, ctx:JamScriptParser.InputStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#inputStmt.
    def exitInputStmt(self, ctx:JamScriptParser.InputStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#idList.
    def enterIdList(self, ctx:JamScriptParser.IdListContext):
        pass

    # Exit a parse tree produced by JamScriptParser#idList.
    def exitIdList(self, ctx:JamScriptParser.IdListContext):
        pass


    # Enter a parse tree produced by JamScriptParser#ifStmt.
    def enterIfStmt(self, ctx:JamScriptParser.IfStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#ifStmt.
    def exitIfStmt(self, ctx:JamScriptParser.IfStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#whileStmt.
    def enterWhileStmt(self, ctx:JamScriptParser.WhileStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#whileStmt.
    def exitWhileStmt(self, ctx:JamScriptParser.WhileStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#forStmt.
    def enterForStmt(self, ctx:JamScriptParser.ForStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#forStmt.
    def exitForStmt(self, ctx:JamScriptParser.ForStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#forInit.
    def enterForInit(self, ctx:JamScriptParser.ForInitContext):
        pass

    # Exit a parse tree produced by JamScriptParser#forInit.
    def exitForInit(self, ctx:JamScriptParser.ForInitContext):
        pass


    # Enter a parse tree produced by JamScriptParser#forUpdate.
    def enterForUpdate(self, ctx:JamScriptParser.ForUpdateContext):
        pass

    # Exit a parse tree produced by JamScriptParser#forUpdate.
    def exitForUpdate(self, ctx:JamScriptParser.ForUpdateContext):
        pass


    # Enter a parse tree produced by JamScriptParser#assignNoSemi.
    def enterAssignNoSemi(self, ctx:JamScriptParser.AssignNoSemiContext):
        pass

    # Exit a parse tree produced by JamScriptParser#assignNoSemi.
    def exitAssignNoSemi(self, ctx:JamScriptParser.AssignNoSemiContext):
        pass


    # Enter a parse tree produced by JamScriptParser#incExpr.
    def enterIncExpr(self, ctx:JamScriptParser.IncExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#incExpr.
    def exitIncExpr(self, ctx:JamScriptParser.IncExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#returnStmt.
    def enterReturnStmt(self, ctx:JamScriptParser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by JamScriptParser#returnStmt.
    def exitReturnStmt(self, ctx:JamScriptParser.ReturnStmtContext):
        pass


    # Enter a parse tree produced by JamScriptParser#expr.
    def enterExpr(self, ctx:JamScriptParser.ExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#expr.
    def exitExpr(self, ctx:JamScriptParser.ExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#orExpr.
    def enterOrExpr(self, ctx:JamScriptParser.OrExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#orExpr.
    def exitOrExpr(self, ctx:JamScriptParser.OrExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#andExpr.
    def enterAndExpr(self, ctx:JamScriptParser.AndExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#andExpr.
    def exitAndExpr(self, ctx:JamScriptParser.AndExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#eqExpr.
    def enterEqExpr(self, ctx:JamScriptParser.EqExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#eqExpr.
    def exitEqExpr(self, ctx:JamScriptParser.EqExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#relExpr.
    def enterRelExpr(self, ctx:JamScriptParser.RelExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#relExpr.
    def exitRelExpr(self, ctx:JamScriptParser.RelExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#addExpr.
    def enterAddExpr(self, ctx:JamScriptParser.AddExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#addExpr.
    def exitAddExpr(self, ctx:JamScriptParser.AddExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#mulExpr.
    def enterMulExpr(self, ctx:JamScriptParser.MulExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#mulExpr.
    def exitMulExpr(self, ctx:JamScriptParser.MulExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#unaryExpr.
    def enterUnaryExpr(self, ctx:JamScriptParser.UnaryExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#unaryExpr.
    def exitUnaryExpr(self, ctx:JamScriptParser.UnaryExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#postfixExpr.
    def enterPostfixExpr(self, ctx:JamScriptParser.PostfixExprContext):
        pass

    # Exit a parse tree produced by JamScriptParser#postfixExpr.
    def exitPostfixExpr(self, ctx:JamScriptParser.PostfixExprContext):
        pass


    # Enter a parse tree produced by JamScriptParser#primary.
    def enterPrimary(self, ctx:JamScriptParser.PrimaryContext):
        pass

    # Exit a parse tree produced by JamScriptParser#primary.
    def exitPrimary(self, ctx:JamScriptParser.PrimaryContext):
        pass


    # Enter a parse tree produced by JamScriptParser#functionCall.
    def enterFunctionCall(self, ctx:JamScriptParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by JamScriptParser#functionCall.
    def exitFunctionCall(self, ctx:JamScriptParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by JamScriptParser#argList.
    def enterArgList(self, ctx:JamScriptParser.ArgListContext):
        pass

    # Exit a parse tree produced by JamScriptParser#argList.
    def exitArgList(self, ctx:JamScriptParser.ArgListContext):
        pass


    # Enter a parse tree produced by JamScriptParser#type_.
    def enterType_(self, ctx:JamScriptParser.Type_Context):
        pass

    # Exit a parse tree produced by JamScriptParser#type_.
    def exitType_(self, ctx:JamScriptParser.Type_Context):
        pass



del JamScriptParser