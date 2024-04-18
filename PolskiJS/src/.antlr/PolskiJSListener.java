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
	 * Enter a parse tree produced by {@link PolskiJSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PolskiJSParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PolskiJSParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(PolskiJSParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(PolskiJSParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLoop(PolskiJSParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLoop(PolskiJSParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PolskiJSParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PolskiJSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PolskiJSParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PolskiJSParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PolskiJSParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#functionargument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionargument(PolskiJSParser.FunctionargumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#functionargument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionargument(PolskiJSParser.FunctionargumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#functionargumentvalue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionargumentvalue(PolskiJSParser.FunctionargumentvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#functionargumentvalue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionargumentvalue(PolskiJSParser.FunctionargumentvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#functionblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionblock(PolskiJSParser.FunctionblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#functionblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionblock(PolskiJSParser.FunctionblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#loopscount}.
	 * @param ctx the parse tree
	 */
	void enterLoopscount(PolskiJSParser.LoopscountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#loopscount}.
	 * @param ctx the parse tree
	 */
	void exitLoopscount(PolskiJSParser.LoopscountContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#loopscountvalue}.
	 * @param ctx the parse tree
	 */
	void enterLoopscountvalue(PolskiJSParser.LoopscountvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#loopscountvalue}.
	 * @param ctx the parse tree
	 */
	void exitLoopscountvalue(PolskiJSParser.LoopscountvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(PolskiJSParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(PolskiJSParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isEqual}
	 * labeled alternative in {@link PolskiJSParser#compare_equality}.
	 * @param ctx the parse tree
	 */
	void enterIsEqual(PolskiJSParser.IsEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isEqual}
	 * labeled alternative in {@link PolskiJSParser#compare_equality}.
	 * @param ctx the parse tree
	 */
	void exitIsEqual(PolskiJSParser.IsEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolskiJSParser#assignment_value}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_value(PolskiJSParser.Assignment_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolskiJSParser#assignment_value}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_value(PolskiJSParser.Assignment_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleValue}
	 * labeled alternative in {@link PolskiJSParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void enterSingleValue(PolskiJSParser.SingleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleValue}
	 * labeled alternative in {@link PolskiJSParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void exitSingleValue(PolskiJSParser.SingleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link PolskiJSParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PolskiJSParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link PolskiJSParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PolskiJSParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link PolskiJSParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void enterMult(PolskiJSParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link PolskiJSParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void exitMult(PolskiJSParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link PolskiJSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInt(PolskiJSParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link PolskiJSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInt(PolskiJSParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link PolskiJSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterReal(PolskiJSParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link PolskiJSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitReal(PolskiJSParser.RealContext ctx);
}