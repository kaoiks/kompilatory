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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CALL=9, 
		FUNCTION=10, TIMES=11, PRINT=12, READ=13, ID=14, INT=15, REAL=16, ADD=17, 
		MULT=18, STRING=19, DEDUCT=20, DIV=21, IF=22, LOOP=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "CALL", 
			"FUNCTION", "TIMES", "PRINT", "READ", "ID", "INT", "REAL", "ADD", "MULT", 
			"STRING", "EscapeSequence", "UnicodeEscape", "HEX_DIGIT", "DEDUCT", "DIV", 
			"IF", "LOOP", "WS"
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

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0004\rr\b\r\u000b\r\f\rs\u0001\u000e\u0004\u000ew\b\u000e\u000b\u000e"+
		"\f\u000ex\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0086\b\u0012\n\u0012\f\u0012\u0089\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0090\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004"+
		"\u001a\u00b0\b\u001a\u000b\u001a\f\u001a\u00b1\u0001\u001a\u0001\u001a"+
		"\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0000)\u0000"+
		"+\u0000-\u0014/\u00151\u00163\u00175\u0018\u0001\u0000\u0005\u0002\u0000"+
		"AZaz\u0002\u0000\"\"\\\\\b\u0000\"\"\'\'\\\\bbffnnrrtt\u0003\u000009A"+
		"Faf\u0003\u0000\t\n\r\r  \u00b7\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000"+
		"/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001"+
		"\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000"+
		"\u0000\u00039\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007"+
		"=\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bC\u0001\u0000"+
		"\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000"+
		"\u0011J\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000\u0015Z"+
		"\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000\u0000\u0019h\u0001\u0000"+
		"\u0000\u0000\u001bq\u0001\u0000\u0000\u0000\u001dv\u0001\u0000\u0000\u0000"+
		"\u001fz\u0001\u0000\u0000\u0000!~\u0001\u0000\u0000\u0000#\u0080\u0001"+
		"\u0000\u0000\u0000%\u0082\u0001\u0000\u0000\u0000\'\u008f\u0001\u0000"+
		"\u0000\u0000)\u0091\u0001\u0000\u0000\u0000+\u0099\u0001\u0000\u0000\u0000"+
		"-\u009b\u0001\u0000\u0000\u0000/\u009d\u0001\u0000\u0000\u00001\u009f"+
		"\u0001\u0000\u0000\u00003\u00a6\u0001\u0000\u0000\u00005\u00af\u0001\u0000"+
		"\u0000\u000078\u0005=\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005"+
		";\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005{\u0000\u0000<\u0006"+
		"\u0001\u0000\u0000\u0000=>\u0005}\u0000\u0000>\b\u0001\u0000\u0000\u0000"+
		"?@\u0005(\u0000\u0000@A\u0005)\u0000\u0000AB\u0005;\u0000\u0000B\n\u0001"+
		"\u0000\u0000\u0000CD\u0005(\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005"+
		")\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005=\u0000\u0000HI\u0005"+
		"=\u0000\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005w\u0000\u0000KL\u0005"+
		"y\u0000\u0000LM\u0005w\u0000\u0000MN\u0005o\u0000\u0000NO\u0005\u0142"+
		"\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005j\u0000\u0000Q\u0012\u0001\u0000"+
		"\u0000\u0000RS\u0005f\u0000\u0000ST\u0005u\u0000\u0000TU\u0005n\u0000"+
		"\u0000UV\u0005k\u0000\u0000VW\u0005c\u0000\u0000WX\u0005j\u0000\u0000"+
		"XY\u0005a\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005r\u0000\u0000"+
		"[\\\u0005a\u0000\u0000\\]\u0005z\u0000\u0000]^\u0005y\u0000\u0000^\u0016"+
		"\u0001\u0000\u0000\u0000_`\u0005w\u0000\u0000`a\u0005y\u0000\u0000ab\u0005"+
		"\u015b\u0000\u0000bc\u0005w\u0000\u0000cd\u0005i\u0000\u0000de\u0005e"+
		"\u0000\u0000ef\u0005t\u0000\u0000fg\u0005l\u0000\u0000g\u0018\u0001\u0000"+
		"\u0000\u0000hi\u0005w\u0000\u0000ij\u0005c\u0000\u0000jk\u0005z\u0000"+
		"\u0000kl\u0005y\u0000\u0000lm\u0005t\u0000\u0000mn\u0005a\u0000\u0000"+
		"no\u0005j\u0000\u0000o\u001a\u0001\u0000\u0000\u0000pr\u0007\u0000\u0000"+
		"\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\u001c\u0001\u0000\u0000\u0000"+
		"uw\u000209\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x"+
		"v\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u001e\u0001\u0000"+
		"\u0000\u0000z{\u0003\u001d\u000e\u0000{|\u0005.\u0000\u0000|}\u0003\u001d"+
		"\u000e\u0000} \u0001\u0000\u0000\u0000~\u007f\u0005+\u0000\u0000\u007f"+
		"\"\u0001\u0000\u0000\u0000\u0080\u0081\u0005*\u0000\u0000\u0081$\u0001"+
		"\u0000\u0000\u0000\u0082\u0087\u0005\"\u0000\u0000\u0083\u0086\u0003\'"+
		"\u0013\u0000\u0084\u0086\b\u0001\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\"\u0000\u0000\u008b&\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\\\u0000\u0000\u008d\u0090\u0007\u0002\u0000\u0000\u008e"+
		"\u0090\u0003)\u0014\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090(\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\\\u0000\u0000\u0092\u0093\u0005u\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0003+\u0015\u0000\u0095\u0096\u0003+\u0015\u0000"+
		"\u0096\u0097\u0003+\u0015\u0000\u0097\u0098\u0003+\u0015\u0000\u0098*"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0003\u0000\u0000\u009a,\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005-\u0000\u0000\u009c.\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005/\u0000\u0000\u009e0\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005j\u0000\u0000\u00a0\u00a1\u0005e\u0000\u0000\u00a1\u00a2\u0005"+
		"\u017c\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u00a4\u0005l\u0000"+
		"\u0000\u00a4\u00a5\u0005i\u0000\u0000\u00a52\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005p\u0000\u0000\u00a7\u00a8\u0005o\u0000\u0000\u00a8\u00a9\u0005"+
		"w\u0000\u0000\u00a9\u00aa\u0005t\u0000\u0000\u00aa\u00ab\u0005\u00f3\u0000"+
		"\u0000\u00ab\u00ac\u0005r\u0000\u0000\u00ac\u00ad\u0005z\u0000\u0000\u00ad"+
		"4\u0001\u0000\u0000\u0000\u00ae\u00b0\u0007\u0004\u0000\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0006\u001a\u0000\u0000\u00b46\u0001"+
		"\u0000\u0000\u0000\u0007\u0000sx\u0085\u0087\u008f\u00b1\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}