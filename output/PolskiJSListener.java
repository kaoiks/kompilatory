// Generated from PolskiJS.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(PolskiJSParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(PolskiJSParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(PolskiJSParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(PolskiJSParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PolskiJSParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PolskiJSParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link PolskiJSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PolskiJSParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link PolskiJSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PolskiJSParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single}
	 * labeled alternative in {@link PolskiJSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingle(PolskiJSParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single}
	 * labeled alternative in {@link PolskiJSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingle(PolskiJSParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PolskiJSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PolskiJSParser.ValueContext ctx);
}