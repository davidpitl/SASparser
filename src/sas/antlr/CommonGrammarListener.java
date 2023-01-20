// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/CommonGrammar.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommonGrammarParser}.
 */
public interface CommonGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CommonGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CommonGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CommonGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CommonGrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(CommonGrammarParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(CommonGrammarParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(CommonGrammarParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(CommonGrammarParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(CommonGrammarParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(CommonGrammarParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(CommonGrammarParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(CommonGrammarParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CommonGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CommonGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(CommonGrammarParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(CommonGrammarParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CommonGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CommonGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(CommonGrammarParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(CommonGrammarParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CommonGrammarParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CommonGrammarParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(CommonGrammarParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(CommonGrammarParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(CommonGrammarParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(CommonGrammarParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonGrammarParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(CommonGrammarParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonGrammarParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(CommonGrammarParser.File_specificationContext ctx);
}