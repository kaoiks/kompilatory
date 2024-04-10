// Generated from PolskiJS.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INT=11, FLOAT=12, IDZMIENNEJ=13, WS=14;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_przypisanie = 2, RULE_wyrazenie = 3, 
		RULE_wejscieWyjscie = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "przypisanie", "wyrazenie", "wejscieWyjscie"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'czytaj'", 
			"'drukuj'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "INT", 
			"FLOAT", "IDZMIENNEJ", "WS"
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16000L) != 0) );
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
		public PrzypisanieContext przypisanie() {
			return getRuleContext(PrzypisanieContext.class,0);
		}
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WejscieWyjscieContext wejscieWyjscie() {
			return getRuleContext(WejscieWyjscieContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				przypisanie();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				wyrazenie(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				wejscieWyjscie();
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
	public static class PrzypisanieContext extends ParserRuleContext {
		public TerminalNode IDZMIENNEJ() { return getToken(PolskiJSParser.IDZMIENNEJ, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public PrzypisanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przypisanie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).enterPrzypisanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).exitPrzypisanie(this);
		}
	}

	public final PrzypisanieContext przypisanie() throws RecognitionException {
		PrzypisanieContext _localctx = new PrzypisanieContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_przypisanie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(IDZMIENNEJ);
			setState(21);
			match(T__0);
			setState(22);
			wyrazenie(0);
			setState(23);
			match(T__1);
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
	public static class WyrazenieContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PolskiJSParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PolskiJSParser.FLOAT, 0); }
		public TerminalNode IDZMIENNEJ() { return getToken(PolskiJSParser.IDZMIENNEJ, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).enterWyrazenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).exitWyrazenie(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		return wyrazenie(0);
	}

	private WyrazenieContext wyrazenie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, _parentState);
		WyrazenieContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(26);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(27);
				match(FLOAT);
				}
				break;
			case IDZMIENNEJ:
				{
				setState(28);
				match(IDZMIENNEJ);
				}
				break;
			case T__6:
				{
				setState(29);
				match(T__6);
				setState(30);
				wyrazenie(0);
				setState(31);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WyrazenieContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
					setState(35);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(36);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(37);
					wyrazenie(6);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WejscieWyjscieContext extends ParserRuleContext {
		public TerminalNode IDZMIENNEJ() { return getToken(PolskiJSParser.IDZMIENNEJ, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WejscieWyjscieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wejscieWyjscie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).enterWejscieWyjscie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolskiJSListener ) ((PolskiJSListener)listener).exitWejscieWyjscie(this);
		}
	}

	public final WejscieWyjscieContext wejscieWyjscie() throws RecognitionException {
		WejscieWyjscieContext _localctx = new WejscieWyjscieContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wejscieWyjscie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(43);
				match(T__8);
				setState(44);
				match(IDZMIENNEJ);
				}
				break;
			case T__9:
				{
				setState(45);
				match(T__9);
				setState(46);
				wyrazenie(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(49);
			match(T__1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\"\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\'\b\u0003\n\u0003\f\u0003"+
		"*\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"0\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0001\u0006\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0003\u00066\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004"+
		"\u0014\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b/\u0001"+
		"\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0013"+
		"\u0003\u0004\u0002\u0000\u0010\u0013\u0003\u0006\u0003\u0000\u0011\u0013"+
		"\u0003\b\u0004\u0000\u0012\u000f\u0001\u0000\u0000\u0000\u0012\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0003\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005\r\u0000\u0000\u0015\u0016\u0005\u0001"+
		"\u0000\u0000\u0016\u0017\u0003\u0006\u0003\u0000\u0017\u0018\u0005\u0002"+
		"\u0000\u0000\u0018\u0005\u0001\u0000\u0000\u0000\u0019\u001a\u0006\u0003"+
		"\uffff\uffff\u0000\u001a\"\u0005\u000b\u0000\u0000\u001b\"\u0005\f\u0000"+
		"\u0000\u001c\"\u0005\r\u0000\u0000\u001d\u001e\u0005\u0007\u0000\u0000"+
		"\u001e\u001f\u0003\u0006\u0003\u0000\u001f \u0005\b\u0000\u0000 \"\u0001"+
		"\u0000\u0000\u0000!\u0019\u0001\u0000\u0000\u0000!\u001b\u0001\u0000\u0000"+
		"\u0000!\u001c\u0001\u0000\u0000\u0000!\u001d\u0001\u0000\u0000\u0000\""+
		"(\u0001\u0000\u0000\u0000#$\n\u0005\u0000\u0000$%\u0007\u0000\u0000\u0000"+
		"%\'\u0003\u0006\u0003\u0006&#\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0007\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005\t\u0000\u0000,0\u0005"+
		"\r\u0000\u0000-.\u0005\n\u0000\u0000.0\u0003\u0006\u0003\u0000/+\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"12\u0005\u0002\u0000\u00002\t\u0001\u0000\u0000\u0000\u0005\r\u0012!("+
		"/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}