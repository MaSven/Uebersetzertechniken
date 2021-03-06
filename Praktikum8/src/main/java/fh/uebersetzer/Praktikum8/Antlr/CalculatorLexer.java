// Generated from fh/uebersetzer/Praktikum8/Antlr/Calculator.g4 by ANTLR 4.5.3
package fh.uebersetzer.Praktikum8.Antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, POW=4, CLEAR=5, DOUBLE=6, INT=7, NEWLINE=8, MUL=9, 
		DIV=10, ADD=11, SUB=12, SMALLAS=13, BIGGERAS=14, ID=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "POW", "CLEAR", "DOUBLE", "INT", "NEWLINE", "MUL", 
		"DIV", "ADD", "SUB", "SMALLAS", "BIGGERAS", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'^'", "'#'", null, null, null, "'*'", "'/'", 
		"'+'", "'-'", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "POW", "CLEAR", "DOUBLE", "INT", "NEWLINE", "MUL", 
		"DIV", "ADD", "SUB", "SMALLAS", "BIGGERAS", "ID", "WS"
	};
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7/\n\7\r\7\16\7\60\3\7\3\7\6\7\65"+
		"\n\7\r\7\16\7\66\3\b\6\b:\n\b\r\b\16\b;\3\t\5\t?\n\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20P\n\20\r\20\16\20"+
		"Q\3\21\6\21U\n\21\r\21\16\21V\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\5\3\2\62"+
		";\3\2c|\3\2\13\13_\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r."+
		"\3\2\2\2\179\3\2\2\2\21>\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31"+
		"H\3\2\2\2\33J\3\2\2\2\35L\3\2\2\2\37O\3\2\2\2!T\3\2\2\2#$\7?\2\2$\4\3"+
		"\2\2\2%&\7*\2\2&\6\3\2\2\2\'(\7+\2\2(\b\3\2\2\2)*\7`\2\2*\n\3\2\2\2+,"+
		"\7%\2\2,\f\3\2\2\2-/\5\17\b\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\3\2\2\2\62\64\7\60\2\2\63\65\5\17\b\2\64\63\3\2\2\2\65"+
		"\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\16\3\2\2\28:\t\2\2\298\3\2"+
		"\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\20\3\2\2\2=?\7\17\2\2>=\3\2\2\2>?"+
		"\3\2\2\2?@\3\2\2\2@A\7\f\2\2A\22\3\2\2\2BC\7,\2\2C\24\3\2\2\2DE\7\61\2"+
		"\2E\26\3\2\2\2FG\7-\2\2G\30\3\2\2\2HI\7/\2\2I\32\3\2\2\2JK\7>\2\2K\34"+
		"\3\2\2\2LM\7@\2\2M\36\3\2\2\2NP\t\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2R \3\2\2\2SU\t\4\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2"+
		"WX\3\2\2\2XY\b\21\2\2Y\"\3\2\2\2\t\2\60\66;>QV\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}