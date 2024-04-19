// Generated from c:/studia_pw/kompilatory/PolskiJS/src/PolskiJS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PolskiJSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CALL=9, 
		FUNCTION=10, TIMES=11, PRINT=12, READ=13, ID=14, INT=15, REAL=16, ADD=17, 
		MULT=18, STRING=19, DEDUCT=20, DIV=21, IF=22, LOOP=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_stat = 2, RULE_function = 3, RULE_functionargument = 4, 
		RULE_functionargumentvalue = 5, RULE_functionblock = 6, RULE_loopscount = 7, 
		RULE_loopscountvalue = 8, RULE_ifblock = 9, RULE_compare_equality = 10, 
		RULE_assignment_value = 11, RULE_arithmetic_operation = 12, RULE_value = 13, 
		RULE_stringvalue = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "stat", "function", "functionargument", "functionargumentvalue", 
			"functionblock", "loopscount", "loopscountvalue", "ifblock", "compare_equality", 
			"assignment_value", "arithmetic_operation", "value", "stringvalue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'{'", "'}'", "'();'", "'('", "')'", "'=='", "'wywo\\u0142aj'", 
			"'funkcja'", "'razy'", "'wy\\u015Bwietl'", "'wczytaj'", null, null, null, 
			"'+'", "'*'", null, "'-'", "'/'", "'je\\u017Celi'", "'powt\\u00F3rz'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "CALL", "FUNCTION", 
			"TIMES", "PRINT", "READ", "ID", "INT", "REAL", "ADD", "MULT", "STRING", 
			"DEDUCT", "DIV", "IF", "LOOP", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PolskiJS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolskiJSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12613120L) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
				case PRINT:
				case READ:
				case ID:
				case IF:
				case LOOP:
					{
					setState(32);
					stat();
					}
					break;
				case FUNCTION:
					{
					setState(33);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(PolskiJSParser.READ, 0); }
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends StatContext {
		public TerminalNode LOOP() { return getToken(PolskiJSParser.LOOP, 0); }
		public LoopscountContext loopscount() {
			return getRuleContext(LoopscountContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(PolskiJSParser.TIMES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends StatContext {
		public TerminalNode CALL() { return getToken(PolskiJSParser.CALL, 0); }
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public FunctionCallContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStringContext extends StatContext {
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public StringvalueContext stringvalue() {
			return getRuleContext(StringvalueContext.class,0);
		}
		public AssignStringContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends StatContext {
		public TerminalNode PRINT() { return getToken(PolskiJSParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public WriteContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends StatContext {
		public TerminalNode IF() { return getToken(PolskiJSParser.IF, 0); }
		public Compare_equalityContext compare_equality() {
			return getRuleContext(Compare_equalityContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteStringContext extends StatContext {
		public TerminalNode PRINT() { return getToken(PolskiJSParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(PolskiJSParser.STRING, 0); }
		public WriteStringContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public Assignment_valueContext assignment_value() {
			return getRuleContext(Assignment_valueContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(ID);
				setState(40);
				match(T__0);
				setState(41);
				assignment_value();
				setState(42);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new AssignStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(ID);
				setState(45);
				match(T__0);
				setState(46);
				stringvalue();
				setState(47);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(PRINT);
				{
				setState(50);
				match(ID);
				}
				setState(51);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(READ);
				setState(53);
				match(ID);
				setState(54);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(IF);
				setState(56);
				compare_equality();
				setState(57);
				match(T__2);
				setState(58);
				ifblock();
				setState(59);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(LOOP);
				setState(62);
				loopscount();
				setState(63);
				match(TIMES);
				setState(64);
				match(T__2);
				setState(65);
				block();
				setState(66);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				match(CALL);
				setState(69);
				match(ID);
				setState(70);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				match(PRINT);
				setState(72);
				match(STRING);
				setState(73);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PolskiJSParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public FunctionblockContext functionblock() {
			return getRuleContext(FunctionblockContext.class,0);
		}
		public List<FunctionargumentContext> functionargument() {
			return getRuleContexts(FunctionargumentContext.class);
		}
		public FunctionargumentContext functionargument(int i) {
			return getRuleContext(FunctionargumentContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(FUNCTION);
			setState(77);
			match(ID);
			setState(78);
			match(T__5);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(79);
				functionargument();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__6);
			setState(86);
			match(T__2);
			setState(87);
			functionblock();
			setState(88);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionargumentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public FunctionargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionargument; }
	}

	public final FunctionargumentContext functionargument() throws RecognitionException {
		FunctionargumentContext _localctx = new FunctionargumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionargument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionargumentvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionargumentvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionargumentvalue; }
	}

	public final FunctionargumentvalueContext functionargumentvalue() throws RecognitionException {
		FunctionargumentvalueContext _localctx = new FunctionargumentvalueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionargumentvalue);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(ID);
				}
				break;
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionblock; }
	}

	public final FunctionblockContext functionblock() throws RecognitionException {
		FunctionblockContext _localctx = new FunctionblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopscountContext extends ParserRuleContext {
		public LoopscountvalueContext loopscountvalue() {
			return getRuleContext(LoopscountvalueContext.class,0);
		}
		public LoopscountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopscount; }
	}

	public final LoopscountContext loopscount() throws RecognitionException {
		LoopscountContext _localctx = new LoopscountContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopscount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			loopscountvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopscountvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public TerminalNode INT() { return getToken(PolskiJSParser.INT, 0); }
		public LoopscountvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopscountvalue; }
	}

	public final LoopscountvalueContext loopscountvalue() throws RecognitionException {
		LoopscountvalueContext _localctx = new LoopscountvalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loopscountvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compare_equalityContext extends ParserRuleContext {
		public Compare_equalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_equality; }
	 
		public Compare_equalityContext() { }
		public void copyFrom(Compare_equalityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsEqualContext extends Compare_equalityContext {
		public TerminalNode ID() { return getToken(PolskiJSParser.ID, 0); }
		public TerminalNode INT() { return getToken(PolskiJSParser.INT, 0); }
		public IsEqualContext(Compare_equalityContext ctx) { copyFrom(ctx); }
	}

	public final Compare_equalityContext compare_equality() throws RecognitionException {
		Compare_equalityContext _localctx = new Compare_equalityContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compare_equality);
		try {
			_localctx = new IsEqualContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
			match(T__7);
			setState(106);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_valueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
		}
		public Assignment_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_value; }
	}

	public final Assignment_valueContext assignment_value() throws RecognitionException {
		Assignment_valueContext _localctx = new Assignment_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_value);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				arithmetic_operation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_operationContext extends ParserRuleContext {
		public Arithmetic_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operation; }
	 
		public Arithmetic_operationContext() { }
		public void copyFrom(Arithmetic_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Arithmetic_operationContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PolskiJSParser.ADD, 0); }
		public AddContext(Arithmetic_operationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeductContext extends Arithmetic_operationContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode DEDUCT() { return getToken(PolskiJSParser.DEDUCT, 0); }
		public DeductContext(Arithmetic_operationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends Arithmetic_operationContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode DIV() { return getToken(PolskiJSParser.DIV, 0); }
		public DivContext(Arithmetic_operationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends Arithmetic_operationContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode MULT() { return getToken(PolskiJSParser.MULT, 0); }
		public MultContext(Arithmetic_operationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleValueContext extends Arithmetic_operationContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SingleValueContext(Arithmetic_operationContext ctx) { copyFrom(ctx); }
	}

	public final Arithmetic_operationContext arithmetic_operation() throws RecognitionException {
		Arithmetic_operationContext _localctx = new Arithmetic_operationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arithmetic_operation);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SingleValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				value();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				value();
				setState(114);
				match(ADD);
				setState(115);
				value();
				}
				break;
			case 3:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				value();
				setState(118);
				match(MULT);
				setState(119);
				value();
				}
				break;
			case 4:
				_localctx = new DeductContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				value();
				setState(122);
				match(DEDUCT);
				setState(123);
				value();
				}
				break;
			case 5:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				value();
				setState(126);
				match(DIV);
				setState(127);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends ValueContext {
		public TerminalNode REAL() { return getToken(PolskiJSParser.REAL, 0); }
		public RealContext(ValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ValueContext {
		public TerminalNode INT() { return getToken(PolskiJSParser.INT, 0); }
		public IntContext(ValueContext ctx) { copyFrom(ctx); }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringvalueContext extends ParserRuleContext {
		public StringvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringvalue; }
	 
		public StringvalueContext() { }
		public void copyFrom(StringvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends StringvalueContext {
		public TerminalNode STRING() { return getToken(PolskiJSParser.STRING, 0); }
		public StringContext(StringvalueContext ctx) { copyFrom(ctx); }
	}

	public final StringvalueContext stringvalue() throws RecognitionException {
		StringvalueContext _localctx = new StringvalueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringvalue);
		try {
			_localctx = new StringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u008a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001#\b\u0001\n\u0001\f\u0001&\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003Q\b\u0003\n\u0003\f\u0003T\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005_\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0003\u000bo\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0082\b\f\u0001\r\u0001"+
		"\r\u0003\r\u0086\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u0000\u0001\u0001\u0000\u000e\u000f\u008b\u0000\u001e\u0001\u0000"+
		"\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000\u0000"+
		"\u0006L\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\n^\u0001\u0000"+
		"\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000"+
		"\u0010d\u0001\u0000\u0000\u0000\u0012f\u0001\u0000\u0000\u0000\u0014h"+
		"\u0001\u0000\u0000\u0000\u0016n\u0001\u0000\u0000\u0000\u0018\u0081\u0001"+
		"\u0000\u0000\u0000\u001a\u0085\u0001\u0000\u0000\u0000\u001c\u0087\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f\u0001\u0001"+
		"\u0000\u0000\u0000 #\u0003\u0004\u0002\u0000!#\u0003\u0006\u0003\u0000"+
		"\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0003\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\u000e\u0000\u0000"+
		"()\u0005\u0001\u0000\u0000)*\u0003\u0016\u000b\u0000*+\u0005\u0002\u0000"+
		"\u0000+K\u0001\u0000\u0000\u0000,-\u0005\u000e\u0000\u0000-.\u0005\u0001"+
		"\u0000\u0000./\u0003\u001c\u000e\u0000/0\u0005\u0002\u0000\u00000K\u0001"+
		"\u0000\u0000\u000012\u0005\f\u0000\u000023\u0005\u000e\u0000\u00003K\u0005"+
		"\u0002\u0000\u000045\u0005\r\u0000\u000056\u0005\u000e\u0000\u00006K\u0005"+
		"\u0002\u0000\u000078\u0005\u0016\u0000\u000089\u0003\u0014\n\u00009:\u0005"+
		"\u0003\u0000\u0000:;\u0003\u0012\t\u0000;<\u0005\u0004\u0000\u0000<K\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0017\u0000\u0000>?\u0003\u000e\u0007\u0000"+
		"?@\u0005\u000b\u0000\u0000@A\u0005\u0003\u0000\u0000AB\u0003\u0002\u0001"+
		"\u0000BC\u0005\u0004\u0000\u0000CK\u0001\u0000\u0000\u0000DE\u0005\t\u0000"+
		"\u0000EF\u0005\u000e\u0000\u0000FK\u0005\u0005\u0000\u0000GH\u0005\f\u0000"+
		"\u0000HI\u0005\u0013\u0000\u0000IK\u0005\u0002\u0000\u0000J\'\u0001\u0000"+
		"\u0000\u0000J,\u0001\u0000\u0000\u0000J1\u0001\u0000\u0000\u0000J4\u0001"+
		"\u0000\u0000\u0000J7\u0001\u0000\u0000\u0000J=\u0001\u0000\u0000\u0000"+
		"JD\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000K\u0005\u0001\u0000"+
		"\u0000\u0000LM\u0005\n\u0000\u0000MN\u0005\u000e\u0000\u0000NR\u0005\u0006"+
		"\u0000\u0000OQ\u0003\b\u0004\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000"+
		"VW\u0005\u0003\u0000\u0000WX\u0003\f\u0006\u0000XY\u0005\u0004\u0000\u0000"+
		"Y\u0007\u0001\u0000\u0000\u0000Z[\u0005\u000e\u0000\u0000[\t\u0001\u0000"+
		"\u0000\u0000\\_\u0005\u000e\u0000\u0000]_\u0003\u001a\r\u0000^\\\u0001"+
		"\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u000b\u0001\u0000\u0000"+
		"\u0000`a\u0003\u0002\u0001\u0000a\r\u0001\u0000\u0000\u0000bc\u0003\u0010"+
		"\b\u0000c\u000f\u0001\u0000\u0000\u0000de\u0007\u0000\u0000\u0000e\u0011"+
		"\u0001\u0000\u0000\u0000fg\u0003\u0002\u0001\u0000g\u0013\u0001\u0000"+
		"\u0000\u0000hi\u0005\u000e\u0000\u0000ij\u0005\b\u0000\u0000jk\u0005\u000f"+
		"\u0000\u0000k\u0015\u0001\u0000\u0000\u0000lo\u0003\u001a\r\u0000mo\u0003"+
		"\u0018\f\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0017"+
		"\u0001\u0000\u0000\u0000p\u0082\u0003\u001a\r\u0000qr\u0003\u001a\r\u0000"+
		"rs\u0005\u0011\u0000\u0000st\u0003\u001a\r\u0000t\u0082\u0001\u0000\u0000"+
		"\u0000uv\u0003\u001a\r\u0000vw\u0005\u0012\u0000\u0000wx\u0003\u001a\r"+
		"\u0000x\u0082\u0001\u0000\u0000\u0000yz\u0003\u001a\r\u0000z{\u0005\u0014"+
		"\u0000\u0000{|\u0003\u001a\r\u0000|\u0082\u0001\u0000\u0000\u0000}~\u0003"+
		"\u001a\r\u0000~\u007f\u0005\u0015\u0000\u0000\u007f\u0080\u0003\u001a"+
		"\r\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081p\u0001\u0000\u0000"+
		"\u0000\u0081q\u0001\u0000\u0000\u0000\u0081u\u0001\u0000\u0000\u0000\u0081"+
		"y\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0082\u0019\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0005\u000f\u0000\u0000\u0084\u0086\u0005"+
		"\u0010\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u001b\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u0013\u0000\u0000\u0088\u001d\u0001\u0000\u0000\u0000\b\"$JR^n\u0081"+
		"\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}