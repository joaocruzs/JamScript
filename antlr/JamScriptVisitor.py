# Generated from JamScript.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .JamScriptParser import JamScriptParser
else:
    from JamScriptParser import JamScriptParser

# This class defines a complete generic visitor for a parse tree produced by JamScriptParser.

class JamScriptVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JamScriptParser#program.
    def visitProgram(self, ctx:JamScriptParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#decl.
    def visitDecl(self, ctx:JamScriptParser.DeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#structDecl.
    def visitStructDecl(self, ctx:JamScriptParser.StructDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#structField.
    def visitStructField(self, ctx:JamScriptParser.StructFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#varDecl.
    def visitVarDecl(self, ctx:JamScriptParser.VarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#funcDecl.
    def visitFuncDecl(self, ctx:JamScriptParser.FuncDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#paramList.
    def visitParamList(self, ctx:JamScriptParser.ParamListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#param.
    def visitParam(self, ctx:JamScriptParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#mainBlock.
    def visitMainBlock(self, ctx:JamScriptParser.MainBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#block.
    def visitBlock(self, ctx:JamScriptParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#stmt.
    def visitStmt(self, ctx:JamScriptParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#simpleStmt.
    def visitSimpleStmt(self, ctx:JamScriptParser.SimpleStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#assignStmt.
    def visitAssignStmt(self, ctx:JamScriptParser.AssignStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#leftHandSide.
    def visitLeftHandSide(self, ctx:JamScriptParser.LeftHandSideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#callStmt.
    def visitCallStmt(self, ctx:JamScriptParser.CallStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#printStmt.
    def visitPrintStmt(self, ctx:JamScriptParser.PrintStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#inputStmt.
    def visitInputStmt(self, ctx:JamScriptParser.InputStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#idList.
    def visitIdList(self, ctx:JamScriptParser.IdListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#ifStmt.
    def visitIfStmt(self, ctx:JamScriptParser.IfStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#whileStmt.
    def visitWhileStmt(self, ctx:JamScriptParser.WhileStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#forStmt.
    def visitForStmt(self, ctx:JamScriptParser.ForStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#forInit.
    def visitForInit(self, ctx:JamScriptParser.ForInitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#forUpdate.
    def visitForUpdate(self, ctx:JamScriptParser.ForUpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#assignNoSemi.
    def visitAssignNoSemi(self, ctx:JamScriptParser.AssignNoSemiContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#incExpr.
    def visitIncExpr(self, ctx:JamScriptParser.IncExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#returnStmt.
    def visitReturnStmt(self, ctx:JamScriptParser.ReturnStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#expr.
    def visitExpr(self, ctx:JamScriptParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#orExpr.
    def visitOrExpr(self, ctx:JamScriptParser.OrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#andExpr.
    def visitAndExpr(self, ctx:JamScriptParser.AndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#eqExpr.
    def visitEqExpr(self, ctx:JamScriptParser.EqExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#relExpr.
    def visitRelExpr(self, ctx:JamScriptParser.RelExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#addExpr.
    def visitAddExpr(self, ctx:JamScriptParser.AddExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#mulExpr.
    def visitMulExpr(self, ctx:JamScriptParser.MulExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#unaryExpr.
    def visitUnaryExpr(self, ctx:JamScriptParser.UnaryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#postfixExpr.
    def visitPostfixExpr(self, ctx:JamScriptParser.PostfixExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#primary.
    def visitPrimary(self, ctx:JamScriptParser.PrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#functionCall.
    def visitFunctionCall(self, ctx:JamScriptParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#argList.
    def visitArgList(self, ctx:JamScriptParser.ArgListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JamScriptParser#type_.
    def visitType_(self, ctx:JamScriptParser.Type_Context):
        return self.visitChildren(ctx)



del JamScriptParser