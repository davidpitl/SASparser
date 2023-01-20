// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/LengthStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LengthStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LengthStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#length_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength_stmt(LengthStmtParser.Length_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LengthStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(LengthStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(LengthStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(LengthStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(LengthStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(LengthStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LengthStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(LengthStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LengthStmtParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(LengthStmtParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LengthStmtParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(LengthStmtParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(LengthStmtParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LengthStmtParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(LengthStmtParser.File_specificationContext ctx);
}