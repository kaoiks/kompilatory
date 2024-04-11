// Generated from c:/studia_pw/kompilatory/PolskiJS/src/PolskiJS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolskiJSParser}.
 */
public interface PolskiJSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PolskiJSParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PolskiJSParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PolskiJSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PolskiJSParser.StatementContext ctx);
}