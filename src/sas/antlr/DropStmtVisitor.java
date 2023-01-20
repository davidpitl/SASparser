// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/DropStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DropStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DropStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#drop_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_main(DropStmtParser.Drop_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(DropStmtParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DropStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DropStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(DropStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(DropStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(DropStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(DropStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DropStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(DropStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DropStmtParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(DropStmtParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(DropStmtParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(DropStmtParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(DropStmtParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DropStmtParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(DropStmtParser.File_specificationContext ctx);
}