// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/SqlProc.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlProcParser}.
 */
public interface SqlProcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#sql_main}.
	 * @param ctx the parse tree
	 */
	void enterSql_main(SqlProcParser.Sql_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#sql_main}.
	 * @param ctx the parse tree
	 */
	void exitSql_main(SqlProcParser.Sql_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SqlProcParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SqlProcParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SqlProcParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SqlProcParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(SqlProcParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(SqlProcParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(SqlProcParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(SqlProcParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(SqlProcParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(SqlProcParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SqlProcParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SqlProcParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SqlProcParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SqlProcParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(SqlProcParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(SqlProcParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(SqlProcParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(SqlProcParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#constraint_specification}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_specification(SqlProcParser.Constraint_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#constraint_specification}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_specification(SqlProcParser.Constraint_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(SqlProcParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(SqlProcParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlProcParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlProcParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SqlProcParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SqlProcParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SqlProcParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SqlProcParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(SqlProcParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(SqlProcParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlProcParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlProcParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SqlProcParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SqlProcParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlProcParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlProcParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SqlProcParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SqlProcParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(SqlProcParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(SqlProcParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(SqlProcParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(SqlProcParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(SqlProcParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(SqlProcParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(SqlProcParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(SqlProcParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SqlProcParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SqlProcParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(SqlProcParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(SqlProcParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SqlProcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SqlProcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(SqlProcParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(SqlProcParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SqlProcParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SqlProcParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlProcParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(SqlProcParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlProcParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(SqlProcParser.FilenameContext ctx);
}