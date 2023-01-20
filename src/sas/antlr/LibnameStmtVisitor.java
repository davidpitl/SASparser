// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/LibnameStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LibnameStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LibnameStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#libname_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibname_main(LibnameStmtParser.Libname_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#libname_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibname_stmt(LibnameStmtParser.Libname_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#libname_form1_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibname_form1_stmt(LibnameStmtParser.Libname_form1_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#libname_form2_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibname_form2_stmt(LibnameStmtParser.Libname_form2_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#libname_form3_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibname_form3_stmt(LibnameStmtParser.Libname_form3_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#libname_form4_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibname_form4_stmt(LibnameStmtParser.Libname_form4_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#libref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibref(LibnameStmtParser.LibrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(LibnameStmtParser.EngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#libname_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibname_options(LibnameStmtParser.Libname_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#library_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_specification(LibnameStmtParser.Library_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#engine_host_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine_host_options(LibnameStmtParser.Engine_host_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LibnameStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(LibnameStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(LibnameStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(LibnameStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(LibnameStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(LibnameStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LibnameStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(LibnameStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LibnameStmtParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(LibnameStmtParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LibnameStmtParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(LibnameStmtParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(LibnameStmtParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibnameStmtParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(LibnameStmtParser.File_specificationContext ctx);
}