// Generated from c:/studia_pw/kompilatory/LangX/block/LangX.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WRITE=3, READ=4, IF=5, THEN=6, ENDIF=7, STRING=8, ID=9, 
		INT=10, NEWLINE=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WRITE", "READ", "IF", "THEN", "ENDIF", "STRING", "ID", 
			"INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'write'", "'read'", "'if'", "'then'", "'endif'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WRITE", "READ", "IF", "THEN", "ENDIF", "STRING", "ID", 
			"INT", "NEWLINE", "WS"
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


	public LangXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LangX.g4"; }

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
		case 11:
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
		"\u0004\u0000\fV\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007:\b\u0007\n\u0007\f\u0007"+
		"=\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bB\b\b\u000b\b\f\bC\u0001"+
		"\t\u0004\tG\b\t\u000b\t\f\tH\u0001\n\u0003\nL\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bQ\b\u000b\u000b\u000b\f\u000bR\u0001\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001"+
		"\u0000\u0003\u0002\u0000\"\"\\\\\u0002\u0000AZaz\u0002\u0000\t\t  Z\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019"+
		"\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005\u001e"+
		"\u0001\u0000\u0000\u0000\u0007$\u0001\u0000\u0000\u0000\t)\u0001\u0000"+
		"\u0000\u0000\u000b,\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000"+
		"\u000f7\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013F"+
		"\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017P\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005=\u0000\u0000\u001a\u0002\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005=\u0000\u0000\u001c\u001d\u0005=\u0000\u0000\u001d"+
		"\u0004\u0001\u0000\u0000\u0000\u001e\u001f\u0005w\u0000\u0000\u001f \u0005"+
		"r\u0000\u0000 !\u0005i\u0000\u0000!\"\u0005t\u0000\u0000\"#\u0005e\u0000"+
		"\u0000#\u0006\u0001\u0000\u0000\u0000$%\u0005r\u0000\u0000%&\u0005e\u0000"+
		"\u0000&\'\u0005a\u0000\u0000\'(\u0005d\u0000\u0000(\b\u0001\u0000\u0000"+
		"\u0000)*\u0005i\u0000\u0000*+\u0005f\u0000\u0000+\n\u0001\u0000\u0000"+
		"\u0000,-\u0005t\u0000\u0000-.\u0005h\u0000\u0000./\u0005e\u0000\u0000"+
		"/0\u0005n\u0000\u00000\f\u0001\u0000\u0000\u000012\u0005e\u0000\u0000"+
		"23\u0005n\u0000\u000034\u0005d\u0000\u000045\u0005i\u0000\u000056\u0005"+
		"f\u0000\u00006\u000e\u0001\u0000\u0000\u00007;\u0005\"\u0000\u00008:\b"+
		"\u0000\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>?\u0005\"\u0000\u0000?\u0010\u0001\u0000"+
		"\u0000\u0000@B\u0007\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\u0012\u0001\u0000\u0000\u0000EG\u000209\u0000FE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000I\u0014\u0001\u0000\u0000\u0000JL\u0005\r\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005"+
		"\n\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OQ\u0007\u0002\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0006\u000b"+
		"\u0000\u0000U\u0018\u0001\u0000\u0000\u0000\u0006\u0000;CHKR\u0001\u0001"+
		"\u000b\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}