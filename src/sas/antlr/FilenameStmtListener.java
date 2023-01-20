// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/FilenameStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FilenameStmtParser}.
 */
public interface FilenameStmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#filename_main}.
	 * @param ctx the parse tree
	 */
	void enterFilename_main(FilenameStmtParser.Filename_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#filename_main}.
	 * @param ctx the parse tree
	 */
	void exitFilename_main(FilenameStmtParser.Filename_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#filename_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFilename_stmt(FilenameStmtParser.Filename_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#filename_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFilename_stmt(FilenameStmtParser.Filename_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#filename_form1_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFilename_form1_stmt(FilenameStmtParser.Filename_form1_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#filename_form1_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFilename_form1_stmt(FilenameStmtParser.Filename_form1_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#filename_form2_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFilename_form2_stmt(FilenameStmtParser.Filename_form2_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#filename_form2_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFilename_form2_stmt(FilenameStmtParser.Filename_form2_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#filename_form3_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFilename_form3_stmt(FilenameStmtParser.Filename_form3_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#filename_form3_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFilename_form3_stmt(FilenameStmtParser.Filename_form3_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#filename_form4_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFilename_form4_stmt(FilenameStmtParser.Filename_form4_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#filename_form4_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFilename_form4_stmt(FilenameStmtParser.Filename_form4_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#fileref}.
	 * @param ctx the parse tree
	 */
	void enterFileref(FilenameStmtParser.FilerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#fileref}.
	 * @param ctx the parse tree
	 */
	void exitFileref(FilenameStmtParser.FilerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#device_type}.
	 * @param ctx the parse tree
	 */
	void enterDevice_type(FilenameStmtParser.Device_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#device_type}.
	 * @param ctx the parse tree
	 */
	void exitDevice_type(FilenameStmtParser.Device_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#external_file}.
	 * @param ctx the parse tree
	 */
	void enterExternal_file(FilenameStmtParser.External_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#external_file}.
	 * @param ctx the parse tree
	 */
	void exitExternal_file(FilenameStmtParser.External_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#encoding_value}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_value(FilenameStmtParser.Encoding_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#encoding_value}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_value(FilenameStmtParser.Encoding_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(FilenameStmtParser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(FilenameStmtParser.OptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#operating_environment_options}.
	 * @param ctx the parse tree
	 */
	void enterOperating_environment_options(FilenameStmtParser.Operating_environment_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#operating_environment_options}.
	 * @param ctx the parse tree
	 */
	void exitOperating_environment_options(FilenameStmtParser.Operating_environment_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FilenameStmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FilenameStmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FilenameStmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FilenameStmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(FilenameStmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(FilenameStmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(FilenameStmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(FilenameStmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(FilenameStmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(FilenameStmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(FilenameStmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(FilenameStmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FilenameStmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FilenameStmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(FilenameStmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(FilenameStmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FilenameStmtParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FilenameStmtParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(FilenameStmtParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(FilenameStmtParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FilenameStmtParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FilenameStmtParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(FilenameStmtParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(FilenameStmtParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(FilenameStmtParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(FilenameStmtParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilenameStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(FilenameStmtParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilenameStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(FilenameStmtParser.File_specificationContext ctx);
}