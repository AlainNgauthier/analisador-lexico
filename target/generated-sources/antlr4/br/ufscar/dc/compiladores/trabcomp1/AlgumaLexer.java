// Generated from br/ufscar/dc/compiladores/trabcomp1/AlgumaLexer.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trabcomp1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, IDENT=2, NUM_INT=3, NUM_REAL=4, DELIM=5, OPERADORES=6, 
		WS=7, COMENTARIO=8, COMENTARIO_ERRO=9, CADEIA=10, CADEIA_ERRO=11, ERRO_SIMBOLO=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "IDENT", "NUM_INT", "NUM_REAL", "DELIM", "OPERADORES", 
			"WS", "COMENTARIO", "COMENTARIO_ERRO", "CADEIA", "CADEIA_ERRO", "ERRO_SIMBOLO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "IDENT", "NUM_INT", "NUM_REAL", "DELIM", "OPERADORES", 
			"WS", "COMENTARIO", "COMENTARIO_ERRO", "CADEIA", "CADEIA_ERRO", "ERRO_SIMBOLO"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0166\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0111\n\2\3\3\3\3\7\3\u0115\n\3\f\3\16\3"+
		"\u0118\13\3\3\4\6\4\u011b\n\4\r\4\16\4\u011c\3\5\6\5\u0120\n\5\r\5\16"+
		"\5\u0121\3\5\3\5\6\5\u0126\n\5\r\5\16\5\u0127\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0139\n\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\7\t\u0141\n\t\f\t\16\t\u0144\13\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u014c"+
		"\n\n\f\n\16\n\u014f\13\n\3\n\3\n\3\13\3\13\7\13\u0155\n\13\f\13\16\13"+
		"\u0158\13\13\3\13\3\13\3\f\3\f\7\f\u015e\n\f\f\f\16\f\u0161\13\f\3\f\3"+
		"\f\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\r\4\2C\\c|\6\2\62;C\\aac|\t\2*+..\60\60<<]]__aa\5\2--//??\6\2"+
		",,\61\61>>@@\4\2\'(``\5\2\13\f\17\17\"\"\4\2\f\f\177\177\3\2\177\177\4"+
		"\2\f\f$$\3\2$$\2\u0198\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\u0110\3\2\2\2\5\u0112\3\2\2\2\7\u011a"+
		"\3\2\2\2\t\u011f\3\2\2\2\13\u0129\3\2\2\2\r\u0138\3\2\2\2\17\u013a\3\2"+
		"\2\2\21\u013e\3\2\2\2\23\u0149\3\2\2\2\25\u0152\3\2\2\2\27\u015b\3\2\2"+
		"\2\31\u0164\3\2\2\2\33\34\7c\2\2\34\35\7n\2\2\35\36\7i\2\2\36\37\7q\2"+
		"\2\37 \7t\2\2 !\7k\2\2!\"\7v\2\2\"#\7o\2\2#\u0111\7q\2\2$%\7f\2\2%&\7"+
		"g\2\2&\'\7e\2\2\'(\7n\2\2()\7c\2\2)*\7t\2\2*\u0111\7g\2\2+,\7h\2\2,-\7"+
		"k\2\2-.\7o\2\2./\7a\2\2/\60\7c\2\2\60\61\7n\2\2\61\62\7i\2\2\62\63\7q"+
		"\2\2\63\64\7t\2\2\64\65\7k\2\2\65\66\7v\2\2\66\67\7o\2\2\67\u0111\7q\2"+
		"\289\7n\2\29:\7k\2\2:;\7v\2\2;<\7g\2\2<=\7t\2\2=>\7c\2\2>\u0111\7n\2\2"+
		"?@\7k\2\2@A\7p\2\2AB\7v\2\2BC\7g\2\2CD\7k\2\2DE\7t\2\2E\u0111\7q\2\2F"+
		"G\7n\2\2GH\7g\2\2HI\7k\2\2I\u0111\7c\2\2JK\7g\2\2KL\7u\2\2LM\7e\2\2MN"+
		"\7t\2\2NO\7g\2\2OP\7x\2\2P\u0111\7c\2\2QR\7e\2\2RS\7q\2\2ST\7p\2\2TU\7"+
		"u\2\2UV\7v\2\2VW\7c\2\2WX\7p\2\2XY\7v\2\2Y\u0111\7g\2\2Z[\7n\2\2[\\\7"+
		"q\2\2\\]\7i\2\2]^\7k\2\2^_\7e\2\2_\u0111\7q\2\2`a\7h\2\2ab\7c\2\2bc\7"+
		"n\2\2cd\7u\2\2d\u0111\7q\2\2ef\7g\2\2fg\7p\2\2gh\7v\2\2hi\7c\2\2i\u0111"+
		"\7q\2\2jk\7g\2\2kl\7p\2\2lm\7s\2\2mn\7w\2\2no\7c\2\2op\7p\2\2pq\7v\2\2"+
		"q\u0111\7q\2\2rs\7p\2\2st\7c\2\2t\u0111\7q\2\2u\u0111\7g\2\2vw\7x\2\2"+
		"wx\7g\2\2xy\7t\2\2yz\7f\2\2z{\7c\2\2{|\7f\2\2|}\7g\2\2}~\7k\2\2~\177\7"+
		"t\2\2\177\u0111\7q\2\2\u0080\u0081\7u\2\2\u0081\u0111\7g\2\2\u0082\u0083"+
		"\7h\2\2\u0083\u0084\7c\2\2\u0084\u0085\7e\2\2\u0085\u0111\7c\2\2\u0086"+
		"\u0087\7h\2\2\u0087\u0088\7k\2\2\u0088\u0089\7o\2\2\u0089\u008a\7a\2\2"+
		"\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\u008d\7s\2\2\u008d\u008e"+
		"\7w\2\2\u008e\u008f\7c\2\2\u008f\u0090\7p\2\2\u0090\u0091\7v\2\2\u0091"+
		"\u0111\7q\2\2\u0092\u0093\7h\2\2\u0093\u0094\7k\2\2\u0094\u0095\7o\2\2"+
		"\u0095\u0096\7a\2\2\u0096\u0097\7u\2\2\u0097\u0111\7g\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7k\2\2\u009a\u009b\7r\2\2\u009b\u0111\7q\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f\u0111\7n\2\2"+
		"\u00a0\u00a1\7x\2\2\u00a1\u00a2\7c\2\2\u00a2\u0111\7t\2\2\u00a3\u00a4"+
		"\7h\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7a\2\2\u00a7"+
		"\u00a8\7r\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7t\2\2\u00aa\u0111\7c\2\2"+
		"\u00ab\u00ac\7h\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7o\2\2\u00ae\u00af"+
		"\7a\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7i\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7t\2\2"+
		"\u00b6\u0111\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u0111\7w\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"\u0111\7q\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2"+
		"\u00c1\u0111\7q\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7l\2\2\u00c5\u0111\7c\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\u0111\7c\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7v\2\2"+
		"\u00cc\u0111\7g\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7o\2\2\u00d0\u00d1\7a\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7c\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\u0111\7q\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7\u00d8\7i\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7u\2\2\u00da\u00db"+
		"\7v\2\2\u00db\u00dc\7t\2\2\u00dc\u0111\7q\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7t\2\2"+
		"\u00e2\u00e3\7p\2\2\u00e3\u0111\7g\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u0111\7q\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7o\2\2"+
		"\u00ed\u00ee\7a\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1"+
		"\7p\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7c\2\2\u00f3\u0111\7q\2\2\u00f4"+
		"\u00f5\7r\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7e\2\2"+
		"\u00f8\u00f9\7g\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc"+
		"\7o\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2\u00ff"+
		"\u0111\7q\2\2\u0100\u0101\7h\2\2\u0101\u0102\7k\2\2\u0102\u0103\7o\2\2"+
		"\u0103\u0104\7a\2\2\u0104\u0105\7r\2\2\u0105\u0106\7t\2\2\u0106\u0107"+
		"\7q\2\2\u0107\u0108\7e\2\2\u0108\u0109\7g\2\2\u0109\u010a\7f\2\2\u010a"+
		"\u010b\7k\2\2\u010b\u010c\7o\2\2\u010c\u010d\7g\2\2\u010d\u010e\7p\2\2"+
		"\u010e\u010f\7v\2\2\u010f\u0111\7q\2\2\u0110\33\3\2\2\2\u0110$\3\2\2\2"+
		"\u0110+\3\2\2\2\u01108\3\2\2\2\u0110?\3\2\2\2\u0110F\3\2\2\2\u0110J\3"+
		"\2\2\2\u0110Q\3\2\2\2\u0110Z\3\2\2\2\u0110`\3\2\2\2\u0110e\3\2\2\2\u0110"+
		"j\3\2\2\2\u0110r\3\2\2\2\u0110u\3\2\2\2\u0110v\3\2\2\2\u0110\u0080\3\2"+
		"\2\2\u0110\u0082\3\2\2\2\u0110\u0086\3\2\2\2\u0110\u0092\3\2\2\2\u0110"+
		"\u0098\3\2\2\2\u0110\u009c\3\2\2\2\u0110\u00a0\3\2\2\2\u0110\u00a3\3\2"+
		"\2\2\u0110\u00ab\3\2\2\2\u0110\u00b7\3\2\2\2\u0110\u00b9\3\2\2\2\u0110"+
		"\u00be\3\2\2\2\u0110\u00c2\3\2\2\2\u0110\u00c6\3\2\2\2\u0110\u00ca\3\2"+
		"\2\2\u0110\u00cd\3\2\2\2\u0110\u00d5\3\2\2\2\u0110\u00dd\3\2\2\2\u0110"+
		"\u00e4\3\2\2\2\u0110\u00ea\3\2\2\2\u0110\u00f4\3\2\2\2\u0110\u0100\3\2"+
		"\2\2\u0111\4\3\2\2\2\u0112\u0116\t\2\2\2\u0113\u0115\t\3\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\6\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\4\62;\2\u011a\u0119\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\b\3"+
		"\2\2\2\u011e\u0120\4\62;\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\7\60"+
		"\2\2\u0124\u0126\4\62;\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\n\3\2\2\2\u0129\u012a\t\4\2\2"+
		"\u012a\f\3\2\2\2\u012b\u0139\t\5\2\2\u012c\u012d\7>\2\2\u012d\u0139\7"+
		"?\2\2\u012e\u012f\7@\2\2\u012f\u0139\7?\2\2\u0130\u0131\7>\2\2\u0131\u0139"+
		"\7/\2\2\u0132\u0133\7>\2\2\u0133\u0139\7@\2\2\u0134\u0139\t\6\2\2\u0135"+
		"\u0136\7\60\2\2\u0136\u0139\7\60\2\2\u0137\u0139\t\7\2\2\u0138\u012b\3"+
		"\2\2\2\u0138\u012c\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u0130\3\2\2\2\u0138"+
		"\u0132\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\16\3\2\2\2\u013a\u013b\t\b\2\2\u013b\u013c\3\2\2\2\u013c\u013d"+
		"\b\b\2\2\u013d\20\3\2\2\2\u013e\u0142\7}\2\2\u013f\u0141\n\t\2\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\177\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\b\t\2\2\u0148\22\3\2\2\2\u0149\u014d\7}\2\2"+
		"\u014a\u014c\n\n\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0151\7\f\2\2\u0151\24\3\2\2\2\u0152\u0156\7$\2\2\u0153\u0155\n\13\2"+
		"\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7$\2\2\u015a"+
		"\26\3\2\2\2\u015b\u015f\7$\2\2\u015c\u015e\n\f\2\2\u015d\u015c\3\2\2\2"+
		"\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\f\2\2\u0163\30\3\2\2\2\u0164"+
		"\u0165\13\2\2\2\u0165\32\3\2\2\2\r\2\u0110\u0116\u011c\u0121\u0127\u0138"+
		"\u0142\u014d\u0156\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}