// Generated from c:/studia_pw/kompilatory/PolskiJS.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PolskiJSParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PolskiJSParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void enterPrzypisanie(PolskiJSParser.PrzypisanieContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#przypisanie}.
	 * @param ctx the parse tree
	 */
	void exitPrzypisanie(PolskiJSParser.PrzypisanieContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenie(PolskiJSParser.WyrazenieContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenie(PolskiJSParser.WyrazenieContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#wejscieWyjscie}.
	 * @param ctx the parse tree
	 */
	void enterWejscieWyjscie(PolskiJSParser.WejscieWyjscieContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#wejscieWyjscie}.
	 * @param ctx the parse tree
	 */
	void exitWejscieWyjscie(PolskiJSParser.WejscieWyjscieContext ctx);
}