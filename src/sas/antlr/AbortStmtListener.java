// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/AbortStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbortStmtParser}.
 */
public interface AbortStmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#abort_main}.
	 * @param ctx the parse tree
	 */
	void enterAbort_main(AbortStmtParser.Abort_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#abort_main}.
	 * @param ctx the parse tree
	 */
	void exitAbort_main(AbortStmtParser.Abort_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAbort_stmt(AbortStmtParser.Abort_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAbort_stmt(AbortStmtParser.Abort_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(AbortStmtParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(AbortStmtParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AbortStmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AbortStmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AbortStmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AbortStmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(AbortStmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(AbortStmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(AbortStmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(AbortStmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(AbortStmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(AbortStmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(AbortStmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(AbortStmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AbortStmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AbortStmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(AbortStmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(AbortStmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AbortStmtParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AbortStmtParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(AbortStmtParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(AbortStmtParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(AbortStmtParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(AbortStmtParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(AbortStmtParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(AbortStmtParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(AbortStmtParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(AbortStmtParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbortStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(AbortStmtParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbortStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(AbortStmtParser.File_specificationContext ctx);
}