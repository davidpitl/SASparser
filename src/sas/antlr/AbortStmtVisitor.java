// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/AbortStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbortStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbortStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#abort_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_main(AbortStmtParser.Abort_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#abort_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_stmt(AbortStmtParser.Abort_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec(AbortStmtParser.File_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AbortStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AbortStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(AbortStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(AbortStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(AbortStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(AbortStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AbortStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(AbortStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AbortStmtParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(AbortStmtParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(AbortStmtParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(AbortStmtParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(AbortStmtParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbortStmtParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(AbortStmtParser.File_specificationContext ctx);
}