// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/LengthStmt.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LengthStmtParser}.
 */
public interface LengthStmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#length_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLength_stmt(LengthStmtParser.Length_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#length_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLength_stmt(LengthStmtParser.Length_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LengthStmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LengthStmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(LengthStmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(LengthStmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(LengthStmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(LengthStmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(LengthStmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(LengthStmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(LengthStmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(LengthStmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(LengthStmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(LengthStmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LengthStmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LengthStmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(LengthStmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(LengthStmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LengthStmtParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LengthStmtParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(LengthStmtParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(LengthStmtParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LengthStmtParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LengthStmtParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(LengthStmtParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(LengthStmtParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(LengthStmtParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(LengthStmtParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LengthStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(LengthStmtParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LengthStmtParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(LengthStmtParser.File_specificationContext ctx);
}