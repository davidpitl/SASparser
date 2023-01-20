// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/CommonGrammar.g4 by ANTLR 4.10.1
package sas.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ABEND=15, END=16, LENGTH=17, 
		QKUPCASE=18, SYSEVALF=19, ABORT=20, EVAL=21, LET=22, QSCAN=23, SYSEXEC=24, 
		ACT=25, FILE=26, LIST=27, QSUBSTR=28, SYSFUNC=29, ACTIVATE=30, GLOBAL=31, 
		LISTM=32, QSYSFUNC=33, SYSGET=34, BQUOTE=35, GO=36, LOCAL=37, QUOTE=38, 
		SYSRPUT=39, BY=40, GOTO=41, MACRO=42, QUPCASE=43, THEN=44, CLEAR=45, IF=46, 
		MEND=47, RESOLVE=48, TO=49, CLOSE=50, INC=51, PAUSE=52, RETURN=53, TSO=54, 
		CMS=55, INCLUDE=56, NRSTR=57, RUN=58, UNQUOTE=59, COMANDR=60, INDEX=61, 
		ON=62, SAVE=63, UNSTR=64, COPY=65, INFILE=66, OPEN=67, SCAN=68, UNTIL=69, 
		DEACT=70, INPUT=71, PUT=72, STOP=73, UPCASE=74, DEL=75, KCMPRES=76, NRBQUOTE=77, 
		STR=78, WHILE=79, DELETE=80, KINDEX=81, NRQUOTE=82, SYSCALL=83, WINDOW=84, 
		DISPLAY=85, KLEFT=86, METASYM=87, SUBSTR=88, DMIDSPLY=89, KLENGTH=90, 
		QKCMPRES=91, SUPERQ=92, DMISPLIT=93, KSCAN=94, QKLEFT=95, SYMDEL=96, DO=97, 
		KSUBSTR=98, QKSCAN=99, SYMEXIST=100, EDIT=101, KTRIM=102, QKSUBSTR=103, 
		SYMGLOBL=104, ELSE=105, KUPCASE=106, QKTRIM=107, SYMLOCAL=108, Tk_NULL=109, 
		CANCEL=110, NOLIST=111, ARRAY=112, ARRAY_NUMERIC_ELEMENTS=113, ARRAY_CHARACTER_ELEMENTS=114, 
		ARRAY_ALL_ELEMENTS=115, GROUPFORMAT=116, NOTSORTED=117, DESCENDING=118, 
		CALL=119, DEBUG=120, NESTING=121, STACK=122, READ=123, PW=124, SOURCE=125, 
		VIEW=126, PGM=127, ENCRYPT=128, NOSAVE=129, DATALINES=130, CARDS=131, 
		LINES=132, DATALINES4=133, CARDS4=134, LINES4=135, END_DATALINES4=136, 
		ALTER=137, DISK=138, DUMMY=139, GTERM=140, PIPE=141, PLOTTER=142, PRINTER=143, 
		TAPE=144, TEMP=145, TERMINAL=146, UPRINTER=147, DSD=148, EXPANDTABS=149, 
		NOEXPANDTABS=150, FLOWOVER=151, MISSOVER=152, PAD=153, NOPAD=154, SCANOVER=155, 
		SHAREBUFFERS=156, STOPOVER=157, TRUNCOVER=158, V_INFILE_=159, INPUT_ODS=160, 
		DATE=161, DATETIME=162, DDMMYY=163, INFORMAT_COMMA=164, INFORMAT_CHAR=165, 
		DROP=166, PROC=167, ANOVA=168, MEANS=169, REG=170, CORR=171, SGPLOT=172, 
		PRINT=173, DATA=174, SQL=175, VAR=176, OUTPUT=177, OUT=178, CLASS=179, 
		ID=180, TYPES=181, WAYS=182, WEIGHT=183, FREQ=184, DATAFILE=185, TABLE=186, 
		REPLACE=187, DBMS=188, IMPORT=189, LIBNAME=190, FILENAME=191, ENCODING=192, 
		KEEP=193, COMPRESS=194, YES=195, DEFAULT=196, Informat=197, DOLLAR=198, 
		EQ=199, NE=200, GT=201, LT=202, GE=203, LE=204, IN=205, EQC=206, NEC=207, 
		GTC=208, LTC=209, GEC=210, LEC=211, INColon=212, AND=213, OR=214, NOT=215, 
		MIN=216, MAX=217, DateLiteral=218, TimeLiteral=219, DateTimeLiteral=220, 
		BitLiteral=221, NameLiteral=222, HexLiteral=223, STRINGLITERAL=224, INT=225, 
		FloatingPointLiteral=226, Identifier=227, ALL=228, LLBracket=229, RRBracket=230, 
		DOT=231, AT=232, EQUAL=233, COMMA=234, LBracket=235, RBracket=236, WS=237, 
		COMMENT=238, LINE_COMMENT=239;
	public static final int
		RULE_expression = 0, RULE_expressionList = 1, RULE_of_var_list = 2, RULE_identifiers_list = 3, 
		RULE_in_var_list = 4, RULE_colonInts = 5, RULE_literal = 6, RULE_variables = 7, 
		RULE_variable = 8, RULE_request = 9, RULE_list = 10, RULE_filename = 11, 
		RULE_tablename = 12, RULE_file_specification = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "expressionList", "of_var_list", "identifiers_list", "in_var_list", 
			"colonInts", "literal", "variables", "variable", "request", "list", "filename", 
			"tablename", "file_specification"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'**'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'||'", "'!!'", "'of'", "':'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "';;;;'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'$'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'><'", "'<>'", null, null, null, null, null, 
			null, null, null, null, null, null, "'{'", "'}'", "'.'", "'@'", "'='", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ABEND", "END", "LENGTH", "QKUPCASE", "SYSEVALF", "ABORT", 
			"EVAL", "LET", "QSCAN", "SYSEXEC", "ACT", "FILE", "LIST", "QSUBSTR", 
			"SYSFUNC", "ACTIVATE", "GLOBAL", "LISTM", "QSYSFUNC", "SYSGET", "BQUOTE", 
			"GO", "LOCAL", "QUOTE", "SYSRPUT", "BY", "GOTO", "MACRO", "QUPCASE", 
			"THEN", "CLEAR", "IF", "MEND", "RESOLVE", "TO", "CLOSE", "INC", "PAUSE", 
			"RETURN", "TSO", "CMS", "INCLUDE", "NRSTR", "RUN", "UNQUOTE", "COMANDR", 
			"INDEX", "ON", "SAVE", "UNSTR", "COPY", "INFILE", "OPEN", "SCAN", "UNTIL", 
			"DEACT", "INPUT", "PUT", "STOP", "UPCASE", "DEL", "KCMPRES", "NRBQUOTE", 
			"STR", "WHILE", "DELETE", "KINDEX", "NRQUOTE", "SYSCALL", "WINDOW", "DISPLAY", 
			"KLEFT", "METASYM", "SUBSTR", "DMIDSPLY", "KLENGTH", "QKCMPRES", "SUPERQ", 
			"DMISPLIT", "KSCAN", "QKLEFT", "SYMDEL", "DO", "KSUBSTR", "QKSCAN", "SYMEXIST", 
			"EDIT", "KTRIM", "QKSUBSTR", "SYMGLOBL", "ELSE", "KUPCASE", "QKTRIM", 
			"SYMLOCAL", "Tk_NULL", "CANCEL", "NOLIST", "ARRAY", "ARRAY_NUMERIC_ELEMENTS", 
			"ARRAY_CHARACTER_ELEMENTS", "ARRAY_ALL_ELEMENTS", "GROUPFORMAT", "NOTSORTED", 
			"DESCENDING", "CALL", "DEBUG", "NESTING", "STACK", "READ", "PW", "SOURCE", 
			"VIEW", "PGM", "ENCRYPT", "NOSAVE", "DATALINES", "CARDS", "LINES", "DATALINES4", 
			"CARDS4", "LINES4", "END_DATALINES4", "ALTER", "DISK", "DUMMY", "GTERM", 
			"PIPE", "PLOTTER", "PRINTER", "TAPE", "TEMP", "TERMINAL", "UPRINTER", 
			"DSD", "EXPANDTABS", "NOEXPANDTABS", "FLOWOVER", "MISSOVER", "PAD", "NOPAD", 
			"SCANOVER", "SHAREBUFFERS", "STOPOVER", "TRUNCOVER", "V_INFILE_", "INPUT_ODS", 
			"DATE", "DATETIME", "DDMMYY", "INFORMAT_COMMA", "INFORMAT_CHAR", "DROP", 
			"PROC", "ANOVA", "MEANS", "REG", "CORR", "SGPLOT", "PRINT", "DATA", "SQL", 
			"VAR", "OUTPUT", "OUT", "CLASS", "ID", "TYPES", "WAYS", "WEIGHT", "FREQ", 
			"DATAFILE", "TABLE", "REPLACE", "DBMS", "IMPORT", "LIBNAME", "FILENAME", 
			"ENCODING", "KEEP", "COMPRESS", "YES", "DEFAULT", "Informat", "DOLLAR", 
			"EQ", "NE", "GT", "LT", "GE", "LE", "IN", "EQC", "NEC", "GTC", "LTC", 
			"GEC", "LEC", "INColon", "AND", "OR", "NOT", "MIN", "MAX", "DateLiteral", 
			"TimeLiteral", "DateTimeLiteral", "BitLiteral", "NameLiteral", "HexLiteral", 
			"STRINGLITERAL", "INT", "FloatingPointLiteral", "Identifier", "ALL", 
			"LLBracket", "RRBracket", "DOT", "AT", "EQUAL", "COMMA", "LBracket", 
			"RBracket", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "CommonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommonGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CommonGrammarParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CommonGrammarParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(CommonGrammarParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(CommonGrammarParser.MAX, 0); }
		public TerminalNode EQ() { return getToken(CommonGrammarParser.EQ, 0); }
		public TerminalNode NE() { return getToken(CommonGrammarParser.NE, 0); }
		public TerminalNode GT() { return getToken(CommonGrammarParser.GT, 0); }
		public TerminalNode LT() { return getToken(CommonGrammarParser.LT, 0); }
		public TerminalNode GE() { return getToken(CommonGrammarParser.GE, 0); }
		public TerminalNode LE() { return getToken(CommonGrammarParser.LE, 0); }
		public TerminalNode EQC() { return getToken(CommonGrammarParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(CommonGrammarParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(CommonGrammarParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(CommonGrammarParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(CommonGrammarParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(CommonGrammarParser.LEC, 0); }
		public TerminalNode AND() { return getToken(CommonGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(CommonGrammarParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(CommonGrammarParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode LLBracket() { return getToken(CommonGrammarParser.LLBracket, 0); }
		public TerminalNode RRBracket() { return getToken(CommonGrammarParser.RRBracket, 0); }
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(CommonGrammarParser.IN, 0); }
		public TerminalNode INColon() { return getToken(CommonGrammarParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DateLiteral:
			case TimeLiteral:
			case DateTimeLiteral:
			case BitLiteral:
			case NameLiteral:
			case HexLiteral:
			case STRINGLITERAL:
			case INT:
			case FloatingPointLiteral:
			case DOT:
				{
				setState(29);
				literal();
				}
				break;
			case Identifier:
				{
				setState(30);
				match(Identifier);
				}
				break;
			case T__0:
				{
				setState(31);
				match(T__0);
				setState(32);
				expression(0);
				setState(33);
				match(T__1);
				}
				break;
			case T__5:
			case T__6:
				{
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(37);
				match(NOT);
				setState(38);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(41);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(42);
						match(T__4);
						setState(43);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(44);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(45);
						match(MIN);
						setState(46);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(48);
						match(MAX);
						setState(49);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(50);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(51);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(54);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(57);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(60);
						_la = _input.LA(1);
						if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (EQ - 199)) | (1L << (NE - 199)) | (1L << (GT - 199)) | (1L << (LT - 199)) | (1L << (GE - 199)) | (1L << (LE - 199)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						_la = _input.LA(1);
						if ( !(((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (EQC - 206)) | (1L << (NEC - 206)) | (1L << (GTC - 206)) | (1L << (LTC - 206)) | (1L << (GEC - 206)) | (1L << (LEC - 206)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(66);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(69);
						match(EQUAL);
						setState(70);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(72);
						match(T__0);
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__12))) != 0) || ((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & ((1L << (NOT - 215)) | (1L << (DateLiteral - 215)) | (1L << (TimeLiteral - 215)) | (1L << (DateTimeLiteral - 215)) | (1L << (BitLiteral - 215)) | (1L << (NameLiteral - 215)) | (1L << (HexLiteral - 215)) | (1L << (STRINGLITERAL - 215)) | (1L << (INT - 215)) | (1L << (FloatingPointLiteral - 215)) | (1L << (Identifier - 215)) | (1L << (DOT - 215)))) != 0)) {
							{
							setState(73);
							expressionList(0);
							}
						}

						setState(76);
						match(T__1);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(78);
						match(LLBracket);
						setState(79);
						expression(0);
						setState(80);
						match(RRBracket);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(83);
						match(T__2);
						setState(84);
						expression(0);
						setState(85);
						match(T__3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(88);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(94);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Of_var_listContext> of_var_list() {
			return getRuleContexts(Of_var_listContext.class);
		}
		public Of_var_listContext of_var_list(int i) {
			return getRuleContext(Of_var_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommonGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommonGrammarParser.COMMA, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case NOT:
			case DateLiteral:
			case TimeLiteral:
			case DateTimeLiteral:
			case BitLiteral:
			case NameLiteral:
			case HexLiteral:
			case STRINGLITERAL:
			case INT:
			case FloatingPointLiteral:
			case Identifier:
			case DOT:
				{
				setState(96);
				expression(0);
				}
				break;
			case T__12:
				{
				setState(97);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(COMMA);
					setState(103);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__5:
					case T__6:
					case NOT:
					case DateLiteral:
					case TimeLiteral:
					case DateTimeLiteral:
					case BitLiteral:
					case NameLiteral:
					case HexLiteral:
					case STRINGLITERAL:
					case INT:
					case FloatingPointLiteral:
					case Identifier:
					case DOT:
						{
						setState(101);
						expression(0);
						}
						break;
					case T__12:
						{
						setState(102);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(111);
						match(COMMA);
						}
						}
						setState(114); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(116);
					expressionList(2);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Of_var_listContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(CommonGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CommonGrammarParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommonGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommonGrammarParser.COMMA, i);
		}
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__12);
				{
				setState(123);
				match(Identifier);
				setState(124);
				match(T__6);
				setState(125);
				match(Identifier);
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(127);
							match(COMMA);
							setState(128);
							match(T__12);
							}
						}

						{
						setState(131);
						match(Identifier);
						setState(132);
						match(T__6);
						setState(133);
						match(Identifier);
						}
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__12);
				setState(140);
				match(Identifier);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						match(Identifier);
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__12);
				setState(148);
				match(Identifier);
				setState(149);
				match(T__2);
				setState(150);
				match(T__7);
				setState(151);
				match(T__3);
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

	public static class Identifiers_listContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(CommonGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CommonGrammarParser.Identifier, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(154);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(155);
					match(Identifier);
					setState(156);
					match(T__6);
					setState(157);
					match(Identifier);
					}
					break;
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
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

	public static class In_var_listContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CommonGrammarParser.Identifier, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<ColonIntsContext> colonInts() {
			return getRuleContexts(ColonIntsContext.class);
		}
		public ColonIntsContext colonInts(int i) {
			return getRuleContext(ColonIntsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommonGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommonGrammarParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_in_var_list);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__0);
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(164);
					literal();
					}
					break;
				case 2:
					{
					setState(165);
					colonInts();
					}
					break;
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(168);
					match(COMMA);
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(169);
						literal();
						}
						break;
					case 2:
						{
						setState(170);
						colonInts();
						}
						break;
					}
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__1);
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

	public static class ColonIntsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(CommonGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CommonGrammarParser.INT, i);
		}
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(INT);
			setState(183);
			match(T__13);
			setState(184);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CommonGrammarParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(CommonGrammarParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(CommonGrammarParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(CommonGrammarParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(CommonGrammarParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(CommonGrammarParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(CommonGrammarParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(CommonGrammarParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(CommonGrammarParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(CommonGrammarParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (DateLiteral - 218)) | (1L << (TimeLiteral - 218)) | (1L << (DateTimeLiteral - 218)) | (1L << (BitLiteral - 218)) | (1L << (NameLiteral - 218)) | (1L << (HexLiteral - 218)) | (1L << (STRINGLITERAL - 218)) | (1L << (INT - 218)) | (1L << (FloatingPointLiteral - 218)) | (1L << (DOT - 218)))) != 0)) ) {
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CommonGrammarParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(CommonGrammarParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(CommonGrammarParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(CommonGrammarParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CommonGrammarParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		return variables(0);
	}

	private VariablesContext variables(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariablesContext _localctx = new VariablesContext(_ctx, _parentState);
		VariablesContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(189);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(190);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(191);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(192);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(195);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(196);
						match(DOT);
						setState(197);
						variables(7);
						}
						break;
					case 2:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(198);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(199);
						match(T__6);
						setState(200);
						variables(6);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CommonGrammarParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Identifier);
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

	public static class RequestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CommonGrammarParser.Identifier, 0); }
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Identifier);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CommonGrammarParser.Identifier, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Identifier);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(CommonGrammarParser.STRINGLITERAL, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(STRINGLITERAL);
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

	public static class TablenameContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(CommonGrammarParser.STRINGLITERAL, 0); }
		public TablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterTablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitTablename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitTablename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablenameContext tablename() throws RecognitionException {
		TablenameContext _localctx = new TablenameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(STRINGLITERAL);
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

	public static class File_specificationContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(CommonGrammarParser.STRINGLITERAL, 0); }
		public TerminalNode Identifier() { return getToken(CommonGrammarParser.Identifier, 0); }
		public TerminalNode CARDS() { return getToken(CommonGrammarParser.CARDS, 0); }
		public TerminalNode CARDS4() { return getToken(CommonGrammarParser.CARDS4, 0); }
		public TerminalNode DATALINES() { return getToken(CommonGrammarParser.DATALINES, 0); }
		public TerminalNode DATALINES4() { return getToken(CommonGrammarParser.DATALINES4, 0); }
		public File_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).enterFile_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonGrammarListener ) ((CommonGrammarListener)listener).exitFile_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonGrammarVisitor ) return ((CommonGrammarVisitor<? extends T>)visitor).visitFile_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_specificationContext file_specification() throws RecognitionException {
		File_specificationContext _localctx = new File_specificationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_file_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DATALINES - 130)) | (1L << (CARDS - 130)) | (1L << (DATALINES4 - 130)) | (1L << (CARDS4 - 130)))) != 0) || _la==STRINGLITERAL || _la==Identifier) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 1:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 7:
			return variables_sempred((VariablesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variables_sempred(VariablesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00ef\u00db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000K\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000[\b"+
		"\u0000\n\u0000\f\u0000^\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001c\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001h\b\u0001"+
		"\u0005\u0001j\b\u0001\n\u0001\f\u0001m\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001q\b\u0001\u000b\u0001\f\u0001r\u0001\u0001\u0005\u0001v\b"+
		"\u0001\n\u0001\f\u0001y\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0082\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0087\b\u0002\n\u0002\f\u0002"+
		"\u008a\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u008f\b"+
		"\u0002\n\u0002\f\u0002\u0092\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0099\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003\u009f\b\u0003\u000b\u0003\f\u0003"+
		"\u00a0\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a7"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004"+
		"\u0005\u0004\u00ae\b\u0004\n\u0004\f\u0004\u00b1\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00b5\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00c2\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ca\b\u0007\n"+
		"\u0007\f\u0007\u00cd\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000"+
		"\u0003\u0000\u0002\u000e\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u0000\t\u0001\u0000\u0006\u0007\u0001\u0000"+
		"\b\n\u0001\u0000\u000b\f\u0001\u0000\u00c7\u00cc\u0001\u0000\u00ce\u00d3"+
		"\u0001\u0000\u00d5\u00d6\u0002\u0000\u00cd\u00cd\u00d4\u00d4\u0002\u0000"+
		"\u00da\u00e2\u00e7\u00e7\u0004\u0000\u0082\u0083\u0085\u0086\u00e0\u00e0"+
		"\u00e3\u00e3\u00f4\u0000\'\u0001\u0000\u0000\u0000\u0002_\u0001\u0000"+
		"\u0000\u0000\u0004\u0098\u0001\u0000\u0000\u0000\u0006\u009e\u0001\u0000"+
		"\u0000\u0000\b\u00b4\u0001\u0000\u0000\u0000\n\u00b6\u0001\u0000\u0000"+
		"\u0000\f\u00ba\u0001\u0000\u0000\u0000\u000e\u00c1\u0001\u0000\u0000\u0000"+
		"\u0010\u00ce\u0001\u0000\u0000\u0000\u0012\u00d0\u0001\u0000\u0000\u0000"+
		"\u0014\u00d2\u0001\u0000\u0000\u0000\u0016\u00d4\u0001\u0000\u0000\u0000"+
		"\u0018\u00d6\u0001\u0000\u0000\u0000\u001a\u00d8\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0006\u0000\uffff\uffff\u0000\u001d(\u0003\f\u0006\u0000"+
		"\u001e(\u0005\u00e3\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0003"+
		"\u0000\u0000\u0000!\"\u0005\u0002\u0000\u0000\"(\u0001\u0000\u0000\u0000"+
		"#$\u0007\u0000\u0000\u0000$(\u0003\u0000\u0000\f%&\u0005\u00d7\u0000\u0000"+
		"&(\u0003\u0000\u0000\u000b\'\u001c\u0001\u0000\u0000\u0000\'\u001e\u0001"+
		"\u0000\u0000\u0000\'\u001f\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000(\\\u0001\u0000\u0000\u0000)*\n\r\u0000"+
		"\u0000*+\u0005\u0005\u0000\u0000+[\u0003\u0000\u0000\r,-\n\n\u0000\u0000"+
		"-.\u0005\u00d8\u0000\u0000.[\u0003\u0000\u0000\u000b/0\n\t\u0000\u0000"+
		"01\u0005\u00d9\u0000\u00001[\u0003\u0000\u0000\n23\n\b\u0000\u000034\u0007"+
		"\u0001\u0000\u00004[\u0003\u0000\u0000\t56\n\u0007\u0000\u000067\u0007"+
		"\u0000\u0000\u00007[\u0003\u0000\u0000\b89\n\u0006\u0000\u00009:\u0007"+
		"\u0002\u0000\u0000:[\u0003\u0000\u0000\u0007;<\n\u0005\u0000\u0000<=\u0007"+
		"\u0003\u0000\u0000=[\u0003\u0000\u0000\u0006>?\n\u0004\u0000\u0000?@\u0007"+
		"\u0004\u0000\u0000@[\u0003\u0000\u0000\u0005AB\n\u0002\u0000\u0000BC\u0007"+
		"\u0005\u0000\u0000C[\u0003\u0000\u0000\u0003DE\n\u0001\u0000\u0000EF\u0005"+
		"\u00e9\u0000\u0000F[\u0003\u0000\u0000\u0001GH\n\u0010\u0000\u0000HJ\u0005"+
		"\u0001\u0000\u0000IK\u0003\u0002\u0001\u0000JI\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L[\u0005\u0002\u0000"+
		"\u0000MN\n\u000f\u0000\u0000NO\u0005\u00e5\u0000\u0000OP\u0003\u0000\u0000"+
		"\u0000PQ\u0005\u00e6\u0000\u0000Q[\u0001\u0000\u0000\u0000RS\n\u000e\u0000"+
		"\u0000ST\u0005\u0003\u0000\u0000TU\u0003\u0000\u0000\u0000UV\u0005\u0004"+
		"\u0000\u0000V[\u0001\u0000\u0000\u0000WX\n\u0003\u0000\u0000XY\u0007\u0006"+
		"\u0000\u0000Y[\u0003\b\u0004\u0000Z)\u0001\u0000\u0000\u0000Z,\u0001\u0000"+
		"\u0000\u0000Z/\u0001\u0000\u0000\u0000Z2\u0001\u0000\u0000\u0000Z5\u0001"+
		"\u0000\u0000\u0000Z8\u0001\u0000\u0000\u0000Z;\u0001\u0000\u0000\u0000"+
		"Z>\u0001\u0000\u0000\u0000ZA\u0001\u0000\u0000\u0000ZD\u0001\u0000\u0000"+
		"\u0000ZG\u0001\u0000\u0000\u0000ZM\u0001\u0000\u0000\u0000ZR\u0001\u0000"+
		"\u0000\u0000ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0001\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_b\u0006\u0001\uffff\uffff\u0000`c\u0003"+
		"\u0000\u0000\u0000ac\u0003\u0004\u0002\u0000b`\u0001\u0000\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000ck\u0001\u0000\u0000\u0000dg\u0005\u00ea\u0000"+
		"\u0000eh\u0003\u0000\u0000\u0000fh\u0003\u0004\u0002\u0000ge\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000id\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lw\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000np\n\u0001\u0000\u0000oq\u0005\u00ea\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0003\u0002\u0001\u0002un\u0001"+
		"\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x\u0003\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z{\u0005\r\u0000\u0000{|\u0005\u00e3\u0000\u0000|}\u0005\u0007"+
		"\u0000\u0000}~\u0005\u00e3\u0000\u0000~\u0088\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005\u00ea\u0000\u0000\u0080\u0082\u0005\r\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u00e3\u0000\u0000\u0084"+
		"\u0085\u0005\u0007\u0000\u0000\u0085\u0087\u0005\u00e3\u0000\u0000\u0086"+
		"\u0081\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u0099\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\r\u0000\u0000\u008c\u0090\u0005\u00e3\u0000\u0000\u008d\u008f"+
		"\u0005\u00e3\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0099\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005\r\u0000\u0000\u0094\u0095\u0005"+
		"\u00e3\u0000\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097\u0005"+
		"\b\u0000\u0000\u0097\u0099\u0005\u0004\u0000\u0000\u0098z\u0001\u0000"+
		"\u0000\u0000\u0098\u008b\u0001\u0000\u0000\u0000\u0098\u0093\u0001\u0000"+
		"\u0000\u0000\u0099\u0005\u0001\u0000\u0000\u0000\u009a\u009f\u0005\u00e3"+
		"\u0000\u0000\u009b\u009c\u0005\u00e3\u0000\u0000\u009c\u009d\u0005\u0007"+
		"\u0000\u0000\u009d\u009f\u0005\u00e3\u0000\u0000\u009e\u009a\u0001\u0000"+
		"\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u0007\u0001\u0000\u0000\u0000\u00a2\u00b5\u0005\u00e3"+
		"\u0000\u0000\u00a3\u00a6\u0005\u0001\u0000\u0000\u00a4\u00a7\u0003\f\u0006"+
		"\u0000\u00a5\u00a7\u0003\n\u0005\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00af\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0005\u00ea\u0000\u0000\u00a9\u00ac\u0003\f\u0006\u0000\u00aa"+
		"\u00ac\u0003\n\u0005\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0002\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00a3\u0001\u0000\u0000\u0000\u00b5\t\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u00e1\u0000\u0000\u00b7\u00b8\u0005"+
		"\u000e\u0000\u0000\u00b8\u00b9\u0005\u00e1\u0000\u0000\u00b9\u000b\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0007\u0007\u0000\u0000\u00bb\r\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0006\u0007\uffff\uffff\u0000\u00bd\u00c2\u0005"+
		"\u00e3\u0000\u0000\u00be\u00c2\u0005\u00a1\u0000\u0000\u00bf\u00c2\u0005"+
		"\u0089\u0000\u0000\u00c0\u00c2\u0005\u00a6\u0000\u0000\u00c1\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\n\u0006\u0000\u0000\u00c4\u00c5\u0005\u00e7"+
		"\u0000\u0000\u00c5\u00ca\u0003\u000e\u0007\u0007\u00c6\u00c7\n\u0005\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0007\u0000\u0000\u00c8\u00ca\u0003\u000e\u0007"+
		"\u0006\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u000f\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u00e3\u0000"+
		"\u0000\u00cf\u0011\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u00e3\u0000"+
		"\u0000\u00d1\u0013\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u00e3\u0000"+
		"\u0000\u00d3\u0015\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u00e0\u0000"+
		"\u0000\u00d5\u0017\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u00e0\u0000"+
		"\u0000\u00d7\u0019\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\b\u0000\u0000"+
		"\u00d9\u001b\u0001\u0000\u0000\u0000\u0016\'JZ\\bgkrw\u0081\u0088\u0090"+
		"\u0098\u009e\u00a0\u00a6\u00ab\u00af\u00b4\u00c1\u00c9\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}