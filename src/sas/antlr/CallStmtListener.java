// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/CallStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CallStmtParser}.
 */
public interface CallStmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#call_main}.
	 * @param ctx the parse tree
	 */
	void enterCall_main(CallStmtParser.Call_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#call_main}.
	 * @param ctx the parse tree
	 */
	void exitCall_main(CallStmtParser.Call_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(CallStmtParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(CallStmtParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CallStmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CallStmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CallStmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CallStmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(CallStmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(CallStmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(CallStmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(CallStmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(CallStmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(CallStmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(CallStmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(CallStmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CallStmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CallStmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(CallStmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(CallStmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CallStmtParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CallStmtParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(CallStmtParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(CallStmtParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CallStmtParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CallStmtParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(CallStmtParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(CallStmtParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(CallStmtParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(CallStmtParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(CallStmtParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(CallStmtParser.File_specificationContext ctx);
}