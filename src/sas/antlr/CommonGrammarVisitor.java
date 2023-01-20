// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/CommonGrammar.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommonGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommonGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CommonGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CommonGrammarParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(CommonGrammarParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(CommonGrammarParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(CommonGrammarParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(CommonGrammarParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CommonGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(CommonGrammarParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CommonGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(CommonGrammarParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CommonGrammarParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(CommonGrammarParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(CommonGrammarParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommonGrammarParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(CommonGrammarParser.File_specificationContext ctx);
}