// Generated from /Users/dev/Documents/pw_kompilatory/kompilatory/PolskiJS/src/PolskiJS.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link PolskiJSParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(PolskiJSParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link PolskiJSParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(PolskiJSParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link PolskiJSParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PolskiJSParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link PolskiJSParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PolskiJSParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link PolskiJSParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(PolskiJSParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link PolskiJSParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(PolskiJSParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link PolskiJSParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(PolskiJSParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link PolskiJSParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(PolskiJSParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(PolskiJSParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(PolskiJSParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(PolskiJSParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(PolskiJSParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(PolskiJSParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(PolskiJSParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(PolskiJSParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(PolskiJSParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(PolskiJSParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link PolskiJSParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(PolskiJSParser.ParContext ctx);
}