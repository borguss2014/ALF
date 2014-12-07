// Generated from Arrow.g4 by ANTLR 4.4
package ro.antlr.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArrowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArrowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArrowParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull ArrowParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrowParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ArrowParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ArrowParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrowParser#variabledata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledata(@NotNull ArrowParser.VariabledataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrowParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ArrowParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrowParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull ArrowParser.DeclarationContext ctx);
}