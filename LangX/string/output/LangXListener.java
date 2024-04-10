// Generated from LangX.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangXParser}.
 */
public interface LangXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangXParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangXParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LangXParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LangXParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(LangXParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(LangXParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LangXParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LangXParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LangXParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LangXParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingle(LangXParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingle(LangXParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LangXParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LangXParser.ValueContext ctx);
}