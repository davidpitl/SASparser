// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/ByStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ByStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ByStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#by_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_main(ByStmtParser.By_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#by_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_stmt(ByStmtParser.By_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ByStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ByStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(ByStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(ByStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(ByStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(ByStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ByStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(ByStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ByStmtParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(ByStmtParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ByStmtParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(ByStmtParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(ByStmtParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ByStmtParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(ByStmtParser.File_specificationContext ctx);
}