// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/DropStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DropStmtParser}.
 */
public interface DropStmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#drop_main}.
	 * @param ctx the parse tree
	 */
	void enterDrop_main(DropStmtParser.Drop_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#drop_main}.
	 * @param ctx the parse tree
	 */
	void exitDrop_main(DropStmtParser.Drop_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(DropStmtParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(DropStmtParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DropStmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DropStmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DropStmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DropStmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(DropStmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(DropStmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(DropStmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(DropStmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(DropStmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(DropStmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(DropStmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(DropStmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DropStmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DropStmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(DropStmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(DropStmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DropStmtParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DropStmtParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(DropStmtParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(DropStmtParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(DropStmtParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(DropStmtParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(DropStmtParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(DropStmtParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(DropStmtParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(DropStmtParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DropStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(DropStmtParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DropStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(DropStmtParser.File_specificationContext ctx);
}