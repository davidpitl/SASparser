// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/LibnameStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LibnameStmtParser}.
 */
public interface LibnameStmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#libname_main}.
	 * @param ctx the parse tree
	 */
	void enterLibname_main(LibnameStmtParser.Libname_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#libname_main}.
	 * @param ctx the parse tree
	 */
	void exitLibname_main(LibnameStmtParser.Libname_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#libname_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLibname_stmt(LibnameStmtParser.Libname_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#libname_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLibname_stmt(LibnameStmtParser.Libname_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#libname_form1_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLibname_form1_stmt(LibnameStmtParser.Libname_form1_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#libname_form1_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLibname_form1_stmt(LibnameStmtParser.Libname_form1_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#libname_form2_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLibname_form2_stmt(LibnameStmtParser.Libname_form2_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#libname_form2_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLibname_form2_stmt(LibnameStmtParser.Libname_form2_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#libname_form3_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLibname_form3_stmt(LibnameStmtParser.Libname_form3_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#libname_form3_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLibname_form3_stmt(LibnameStmtParser.Libname_form3_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#libname_form4_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLibname_form4_stmt(LibnameStmtParser.Libname_form4_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#libname_form4_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLibname_form4_stmt(LibnameStmtParser.Libname_form4_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#libref}.
	 * @param ctx the parse tree
	 */
	void enterLibref(LibnameStmtParser.LibrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#libref}.
	 * @param ctx the parse tree
	 */
	void exitLibref(LibnameStmtParser.LibrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(LibnameStmtParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(LibnameStmtParser.EngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#libname_options}.
	 * @param ctx the parse tree
	 */
	void enterLibname_options(LibnameStmtParser.Libname_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#libname_options}.
	 * @param ctx the parse tree
	 */
	void exitLibname_options(LibnameStmtParser.Libname_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#library_specification}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_specification(LibnameStmtParser.Library_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#library_specification}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_specification(LibnameStmtParser.Library_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#engine_host_options}.
	 * @param ctx the parse tree
	 */
	void enterEngine_host_options(LibnameStmtParser.Engine_host_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#engine_host_options}.
	 * @param ctx the parse tree
	 */
	void exitEngine_host_options(LibnameStmtParser.Engine_host_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LibnameStmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LibnameStmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(LibnameStmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(LibnameStmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(LibnameStmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(LibnameStmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(LibnameStmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(LibnameStmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(LibnameStmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(LibnameStmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(LibnameStmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(LibnameStmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LibnameStmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LibnameStmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(LibnameStmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(LibnameStmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LibnameStmtParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LibnameStmtParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(LibnameStmtParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(LibnameStmtParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LibnameStmtParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LibnameStmtParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(LibnameStmtParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(LibnameStmtParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(LibnameStmtParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(LibnameStmtParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibnameStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(LibnameStmtParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibnameStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(LibnameStmtParser.File_specificationContext ctx);
}