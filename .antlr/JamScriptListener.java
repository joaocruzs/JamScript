// Generated from d:/Importante/Estudo/UFPI/2025.2/Compiladores/trabalho final/JamScript/JamScript.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(JamScriptParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(JamScriptParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(JamScriptParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(JamScriptParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(JamScriptParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(JamScriptParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreIncExpr(JamScriptParser.PreIncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreIncExpr(JamScriptParser.PreIncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(JamScriptParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(JamScriptParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(JamScriptParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(JamScriptParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreDecExpr(JamScriptParser.PreDecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreDecExpr(JamScriptParser.PreDecExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(JamScriptParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(JamScriptParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(JamScriptParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(JamScriptParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(JamScriptParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(JamScriptParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOrIdExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFieldOrIdExpr(JamScriptParser.FieldOrIdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOrIdExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFieldOrIdExpr(JamScriptParser.FieldOrIdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostIncExpr(JamScriptParser.PostIncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostIncExpr(JamScriptParser.PostIncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(JamScriptParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(JamScriptParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(JamScriptParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(JamScriptParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostDecExpr(JamScriptParser.PostDecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostDecExpr(JamScriptParser.PostDecExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(JamScriptParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(JamScriptParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(JamScriptParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(JamScriptParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(JamScriptParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link JamScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(JamScriptParser.FuncCallExprContext ctx);
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