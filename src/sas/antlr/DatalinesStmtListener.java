// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/DatalinesStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalinesStmtParser}.
 */
public interface DatalinesStmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#datalines_main}.
	 * @param ctx the parse tree
	 */
	void enterDatalines_main(DatalinesStmtParser.Datalines_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#datalines_main}.
	 * @param ctx the parse tree
	 */
	void exitDatalines_main(DatalinesStmtParser.Datalines_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#datalines_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDatalines_stmt(DatalinesStmtParser.Datalines_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#datalines_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDatalines_stmt(DatalinesStmtParser.Datalines_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#datalines4_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDatalines4_stmt(DatalinesStmtParser.Datalines4_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#datalines4_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDatalines4_stmt(DatalinesStmtParser.Datalines4_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DatalinesStmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DatalinesStmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DatalinesStmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DatalinesStmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(DatalinesStmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(DatalinesStmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(DatalinesStmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(DatalinesStmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(DatalinesStmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(DatalinesStmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(DatalinesStmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(DatalinesStmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DatalinesStmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DatalinesStmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(DatalinesStmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(DatalinesStmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DatalinesStmtParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DatalinesStmtParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(DatalinesStmtParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(DatalinesStmtParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(DatalinesStmtParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(DatalinesStmtParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(DatalinesStmtParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(DatalinesStmtParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(DatalinesStmtParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(DatalinesStmtParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalinesStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(DatalinesStmtParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalinesStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(DatalinesStmtParser.File_specificationContext ctx);
}