// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/FilenameStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FilenameStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FilenameStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#filename_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename_main(FilenameStmtParser.Filename_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#filename_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename_stmt(FilenameStmtParser.Filename_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#filename_form1_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename_form1_stmt(FilenameStmtParser.Filename_form1_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#filename_form2_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename_form2_stmt(FilenameStmtParser.Filename_form2_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#filename_form3_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename_form3_stmt(FilenameStmtParser.Filename_form3_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#filename_form4_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename_form4_stmt(FilenameStmtParser.Filename_form4_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#fileref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileref(FilenameStmtParser.FilerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#device_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevice_type(FilenameStmtParser.Device_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#external_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_file(FilenameStmtParser.External_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#encoding_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding_value(FilenameStmtParser.Encoding_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptions(FilenameStmtParser.OptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#operating_environment_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperating_environment_options(FilenameStmtParser.Operating_environment_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FilenameStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(FilenameStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(FilenameStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(FilenameStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(FilenameStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(FilenameStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FilenameStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(FilenameStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FilenameStmtParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(FilenameStmtParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FilenameStmtParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(FilenameStmtParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(FilenameStmtParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilenameStmtParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(FilenameStmtParser.File_specificationContext ctx);
}