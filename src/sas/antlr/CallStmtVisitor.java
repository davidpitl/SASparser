// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/CallStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CallStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CallStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#call_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_main(CallStmtParser.Call_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(CallStmtParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CallStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CallStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(CallStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(CallStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(CallStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(CallStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CallStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(CallStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CallStmtParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(CallStmtParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CallStmtParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(CallStmtParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(CallStmtParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallStmtParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(CallStmtParser.File_specificationContext ctx);
}