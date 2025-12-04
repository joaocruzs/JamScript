// Generated from d:/Importante/Estudo/UFPI/2025.2/Compiladores/TRABALHO FINAL/JamScript/antlr/JamScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JamScriptParser}.
 */
public interface JamScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JamScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JamScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(JamScriptParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(JamScriptParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(JamScriptParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(JamScriptParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(JamScriptParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(JamScriptParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(JamScriptParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(JamScriptParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(JamScriptParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(JamScriptParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(JamScriptParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(JamScriptParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(JamScriptParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(JamScriptParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(JamScriptParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(JamScriptParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JamScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JamScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(JamScriptParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(JamScriptParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(JamScriptParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(JamScriptParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(JamScriptParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(JamScriptParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JamScriptParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JamScriptParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(JamScriptParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(JamScriptParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(JamScriptParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(JamScriptParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(JamScriptParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(JamScriptParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(JamScriptParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(JamScriptParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JamScriptParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JamScriptParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(JamScriptParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(JamScriptParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(JamScriptParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(JamScriptParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JamScriptParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JamScriptParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JamScriptParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JamScriptParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#assignNoSemi}.
	 * @param ctx the parse tree
	 */
	void enterAssignNoSemi(JamScriptParser.AssignNoSemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#assignNoSemi}.
	 * @param ctx the parse tree
	 */
	void exitAssignNoSemi(JamScriptParser.AssignNoSemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#incExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncExpr(JamScriptParser.IncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#incExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncExpr(JamScriptParser.IncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(JamScriptParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(JamScriptParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JamScriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JamScriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(JamScriptParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(JamScriptParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(JamScriptParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(JamScriptParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(JamScriptParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(JamScriptParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(JamScriptParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(JamScriptParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(JamScriptParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(JamScriptParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(JamScriptParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(JamScriptParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(JamScriptParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(JamScriptParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(JamScriptParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(JamScriptParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JamScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JamScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JamScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JamScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(JamScriptParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(JamScriptParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JamScriptParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(JamScriptParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JamScriptParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(JamScriptParser.Type_Context ctx);
}