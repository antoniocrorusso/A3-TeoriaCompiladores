// Generated from com/mycompany/compilador/Marte.g4 by ANTLR 4.13.1
package com.mycompany.compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarteParser}.
 */
public interface MarteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarteParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MarteParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MarteParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MarteParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MarteParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MarteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MarteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MarteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MarteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MarteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MarteParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#ifStmtNoElse}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtNoElse(MarteParser.IfStmtNoElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#ifStmtNoElse}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtNoElse(MarteParser.IfStmtNoElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#ifStmtWithElse}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtWithElse(MarteParser.IfStmtWithElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#ifStmtWithElse}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtWithElse(MarteParser.IfStmtWithElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MarteParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MarteParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(MarteParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(MarteParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(MarteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(MarteParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#forStep}.
	 * @param ctx the parse tree
	 */
	void enterForStep(MarteParser.ForStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#forStep}.
	 * @param ctx the parse tree
	 */
	void exitForStep(MarteParser.ForStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(MarteParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(MarteParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#scanfStmt}.
	 * @param ctx the parse tree
	 */
	void enterScanfStmt(MarteParser.ScanfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#scanfStmt}.
	 * @param ctx the parse tree
	 */
	void exitScanfStmt(MarteParser.ScanfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#printfStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintfStmt(MarteParser.PrintfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#printfStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintfStmt(MarteParser.PrintfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MarteParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MarteParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MarteParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MarteParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MarteParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MarteParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(MarteParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(MarteParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(MarteParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(MarteParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(MarteParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(MarteParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(MarteParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(MarteParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(MarteParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(MarteParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MarteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MarteParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MarteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MarteParser.LiteralContext ctx);
}