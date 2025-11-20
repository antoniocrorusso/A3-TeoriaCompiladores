// Generated from com/mycompany/compilador/Marte.g4 by ANTLR 4.13.1
package com.mycompany.compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MarteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MarteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MarteParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MarteParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MarteParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MarteParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MarteParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MarteParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#ifStmtNoElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtNoElse(MarteParser.IfStmtNoElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#ifStmtWithElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtWithElse(MarteParser.IfStmtWithElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MarteParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(MarteParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(MarteParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#forStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStep(MarteParser.ForStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(MarteParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#scanfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanfStmt(MarteParser.ScanfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#printfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfStmt(MarteParser.PrintfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MarteParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MarteParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MarteParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(MarteParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(MarteParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(MarteParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(MarteParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(MarteParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MarteParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MarteParser.LiteralContext ctx);
}