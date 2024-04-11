// Generated from c:/studia_pw/kompilatory/PolskiJS/src/PolskiJS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PolskiJSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PRINT=5, TOINT=6, TOREAL=7, ID=8, INT=9, 
		REAL=10, ADD=11, MULT=12, NEWLINE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "PRINT", "TOINT", "TOREAL", "ID", "INT", 
			"REAL", "ADD", "MULT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "'wy\\u015Bwietl'", "'(int)'", "'(real)'", 
			null, null, null, "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PRINT", "TOINT", "TOREAL", "ID", "INT", 
			"REAL", "ADD", "MULT", "NEWLINE", "WS"
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


	public PolskiJSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PolskiJS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000eY\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007=\b"+
		"\u0007\u000b\u0007\f\u0007>\u0001\b\u0004\bB\b\b\u000b\b\f\bC\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0003\fO\b\f\u0001\f\u0001\f\u0001\r\u0004\rT\b\r\u000b\r\f\rU\u0001"+
		"\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0002\u0002\u0000AZaz\u0002\u0000"+
		"\t\t  \\\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001"+
		"\u001d\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005"+
		"!\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000"+
		"\u0000\u0000\u000b.\u0001\u0000\u0000\u0000\r4\u0001\u0000\u0000\u0000"+
		"\u000f<\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013E"+
		"\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017K\u0001\u0000"+
		"\u0000\u0000\u0019N\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005=\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f"+
		" \u0005;\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005(\u0000\u0000"+
		"\"\u0006\u0001\u0000\u0000\u0000#$\u0005)\u0000\u0000$\b\u0001\u0000\u0000"+
		"\u0000%&\u0005w\u0000\u0000&\'\u0005y\u0000\u0000\'(\u0005\u015b\u0000"+
		"\u0000()\u0005w\u0000\u0000)*\u0005i\u0000\u0000*+\u0005e\u0000\u0000"+
		"+,\u0005t\u0000\u0000,-\u0005l\u0000\u0000-\n\u0001\u0000\u0000\u0000"+
		"./\u0005(\u0000\u0000/0\u0005i\u0000\u000001\u0005n\u0000\u000012\u0005"+
		"t\u0000\u000023\u0005)\u0000\u00003\f\u0001\u0000\u0000\u000045\u0005"+
		"(\u0000\u000056\u0005r\u0000\u000067\u0005e\u0000\u000078\u0005a\u0000"+
		"\u000089\u0005l\u0000\u00009:\u0005)\u0000\u0000:\u000e\u0001\u0000\u0000"+
		"\u0000;=\u0007\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0010"+
		"\u0001\u0000\u0000\u0000@B\u000209\u0000A@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\u0012\u0001\u0000\u0000\u0000EF\u0003\u0011\b\u0000FG\u0005.\u0000\u0000"+
		"GH\u0003\u0011\b\u0000H\u0014\u0001\u0000\u0000\u0000IJ\u0005+\u0000\u0000"+
		"J\u0016\u0001\u0000\u0000\u0000KL\u0005*\u0000\u0000L\u0018\u0001\u0000"+
		"\u0000\u0000MO\u0005\r\u0000\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\n\u0000\u0000Q\u001a\u0001"+
		"\u0000\u0000\u0000RT\u0007\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WX\u0006\r\u0000\u0000X\u001c\u0001\u0000"+
		"\u0000\u0000\u0005\u0000>CNU\u0001\u0001\r\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}