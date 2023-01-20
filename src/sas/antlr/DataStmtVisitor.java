// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/DataStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DataStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DataStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#data_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_stmt(DataStmtParser.Data_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#data_form1_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_form1_stmt(DataStmtParser.Data_form1_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#data_form2_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_form2_stmt(DataStmtParser.Data_form2_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#data_form3_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_form3_stmt(DataStmtParser.Data_form3_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#data_form4_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_form4_stmt(DataStmtParser.Data_form4_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#data_form5_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_form5_stmt(DataStmtParser.Data_form5_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#dataset_name_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_name_opt(DataStmtParser.Dataset_name_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#datastmt_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatastmt_cmd(DataStmtParser.Datastmt_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#view_dsname_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_dsname_opt(DataStmtParser.View_dsname_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(DataStmtParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#program_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_name(DataStmtParser.Program_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#passwd_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswd_opt(DataStmtParser.Passwd_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#source_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_opt(DataStmtParser.Source_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#dataset_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_name(DataStmtParser.Dataset_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DataStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DataStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(DataStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(DataStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(DataStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(DataStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DataStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(DataStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DataStmtParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(DataStmtParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(DataStmtParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(DataStmtParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(DataStmtParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStmtParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(DataStmtParser.File_specificationContext ctx);
}