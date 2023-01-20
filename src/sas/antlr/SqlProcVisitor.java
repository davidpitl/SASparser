// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/SqlProc.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlProcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlProcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#sql_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_main(SqlProcParser.Sql_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SqlProcParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SqlProcParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#groupby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_clause(SqlProcParser.Groupby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(SqlProcParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(SqlProcParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SqlProcParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SqlProcParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(SqlProcParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(SqlProcParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#constraint_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_specification(SqlProcParser.Constraint_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(SqlProcParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlProcParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SqlProcParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqlProcParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(SqlProcParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlProcParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqlProcParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlProcParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(SqlProcParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(SqlProcParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(SqlProcParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(SqlProcParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(SqlProcParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SqlProcParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(SqlProcParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SqlProcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(SqlProcParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SqlProcParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlProcParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(SqlProcParser.FilenameContext ctx);
}