// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/DatalinesStmt.g4 by ANTLR 4.10.1
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
public class DatalinesStmtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ABEND=18, END=19, LENGTH=20, QKUPCASE=21, SYSEVALF=22, ABORT=23, EVAL=24, 
		LET=25, QSCAN=26, SYSEXEC=27, ACT=28, FILE=29, LIST=30, QSUBSTR=31, SYSFUNC=32, 
		ACTIVATE=33, GLOBAL=34, LISTM=35, QSYSFUNC=36, SYSGET=37, BQUOTE=38, GO=39, 
		LOCAL=40, QUOTE=41, SYSRPUT=42, BY=43, GOTO=44, MACRO=45, QUPCASE=46, 
		THEN=47, CLEAR=48, IF=49, MEND=50, RESOLVE=51, TO=52, CLOSE=53, INC=54, 
		PAUSE=55, RETURN=56, TSO=57, CMS=58, INCLUDE=59, NRSTR=60, RUN=61, UNQUOTE=62, 
		COMANDR=63, INDEX=64, ON=65, SAVE=66, UNSTR=67, COPY=68, INFILE=69, OPEN=70, 
		SCAN=71, UNTIL=72, DEACT=73, INPUT=74, PUT=75, STOP=76, UPCASE=77, DEL=78, 
		KCMPRES=79, NRBQUOTE=80, STR=81, WHILE=82, DELETE=83, KINDEX=84, NRQUOTE=85, 
		SYSCALL=86, WINDOW=87, DISPLAY=88, KLEFT=89, METASYM=90, SUBSTR=91, DMIDSPLY=92, 
		KLENGTH=93, QKCMPRES=94, SUPERQ=95, DMISPLIT=96, KSCAN=97, QKLEFT=98, 
		SYMDEL=99, DO=100, KSUBSTR=101, QKSCAN=102, SYMEXIST=103, EDIT=104, KTRIM=105, 
		QKSUBSTR=106, SYMGLOBL=107, ELSE=108, KUPCASE=109, QKTRIM=110, SYMLOCAL=111, 
		Tk_NULL=112, CANCEL=113, NOLIST=114, ARRAY=115, ARRAY_NUMERIC_ELEMENTS=116, 
		ARRAY_CHARACTER_ELEMENTS=117, ARRAY_ALL_ELEMENTS=118, GROUPFORMAT=119, 
		NOTSORTED=120, DESCENDING=121, CALL=122, DEBUG=123, NESTING=124, STACK=125, 
		READ=126, PW=127, SOURCE=128, VIEW=129, PGM=130, ENCRYPT=131, NOSAVE=132, 
		DATALINES=133, CARDS=134, LINES=135, DATALINES4=136, CARDS4=137, LINES4=138, 
		END_DATALINES4=139, ALTER=140, DISK=141, DUMMY=142, GTERM=143, PIPE=144, 
		PLOTTER=145, PRINTER=146, TAPE=147, TEMP=148, TERMINAL=149, UPRINTER=150, 
		DSD=151, EXPANDTABS=152, NOEXPANDTABS=153, FLOWOVER=154, MISSOVER=155, 
		PAD=156, NOPAD=157, SCANOVER=158, SHAREBUFFERS=159, STOPOVER=160, TRUNCOVER=161, 
		V_INFILE_=162, INPUT_ODS=163, DATE=164, DATETIME=165, DDMMYY=166, INFORMAT_COMMA=167, 
		INFORMAT_CHAR=168, DROP=169, PROC=170, ANOVA=171, MEANS=172, REG=173, 
		CORR=174, SGPLOT=175, PRINT=176, DATA=177, SQL=178, VAR=179, OUTPUT=180, 
		OUT=181, CLASS=182, ID=183, TYPES=184, WAYS=185, WEIGHT=186, FREQ=187, 
		DATAFILE=188, TABLE=189, REPLACE=190, DBMS=191, IMPORT=192, LIBNAME=193, 
		FILENAME=194, ENCODING=195, KEEP=196, COMPRESS=197, YES=198, DEFAULT=199, 
		Informat=200, DOLLAR=201, EQ=202, NE=203, GT=204, LT=205, GE=206, LE=207, 
		IN=208, EQC=209, NEC=210, GTC=211, LTC=212, GEC=213, LEC=214, INColon=215, 
		AND=216, OR=217, NOT=218, MIN=219, MAX=220, DateLiteral=221, TimeLiteral=222, 
		DateTimeLiteral=223, BitLiteral=224, NameLiteral=225, HexLiteral=226, 
		STRINGLITERAL=227, INT=228, FloatingPointLiteral=229, Identifier=230, 
		ALL=231, DOT=232, AT=233, EQUAL=234, COMMA=235, LBracket=236, RBracket=237, 
		WS=238, COMMENT=239, LINE_COMMENT=240;
	public static final int
		RULE_datalines_main = 0, RULE_datalines_stmt = 1, RULE_datalines4_stmt = 2, 
		RULE_expression = 3, RULE_expressionList = 4, RULE_of_var_list = 5, RULE_identifiers_list = 6, 
		RULE_in_var_list = 7, RULE_colonInts = 8, RULE_literal = 9, RULE_variables = 10, 
		RULE_variable = 11, RULE_request = 12, RULE_list = 13, RULE_filename = 14, 
		RULE_tablename = 15, RULE_file_specification = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"datalines_main", "datalines_stmt", "datalines4_stmt", "expression", 
			"expressionList", "of_var_list", "identifiers_list", "in_var_list", "colonInts", 
			"literal", "variables", "variable", "request", "list", "filename", "tablename", 
			"file_specification"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'**'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'||'", "'!!'", "'of'", "':'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "';;;;'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'$'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'><'", "'<>'", null, null, 
			null, null, null, null, null, null, null, null, null, "'.'", "'@'", "'='", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ABEND", "END", "LENGTH", "QKUPCASE", 
			"SYSEVALF", "ABORT", "EVAL", "LET", "QSCAN", "SYSEXEC", "ACT", "FILE", 
			"LIST", "QSUBSTR", "SYSFUNC", "ACTIVATE", "GLOBAL", "LISTM", "QSYSFUNC", 
			"SYSGET", "BQUOTE", "GO", "LOCAL", "QUOTE", "SYSRPUT", "BY", "GOTO", 
			"MACRO", "QUPCASE", "THEN", "CLEAR", "IF", "MEND", "RESOLVE", "TO", "CLOSE", 
			"INC", "PAUSE", "RETURN", "TSO", "CMS", "INCLUDE", "NRSTR", "RUN", "UNQUOTE", 
			"COMANDR", "INDEX", "ON", "SAVE", "UNSTR", "COPY", "INFILE", "OPEN", 
			"SCAN", "UNTIL", "DEACT", "INPUT", "PUT", "STOP", "UPCASE", "DEL", "KCMPRES", 
			"NRBQUOTE", "STR", "WHILE", "DELETE", "KINDEX", "NRQUOTE", "SYSCALL", 
			"WINDOW", "DISPLAY", "KLEFT", "METASYM", "SUBSTR", "DMIDSPLY", "KLENGTH", 
			"QKCMPRES", "SUPERQ", "DMISPLIT", "KSCAN", "QKLEFT", "SYMDEL", "DO", 
			"KSUBSTR", "QKSCAN", "SYMEXIST", "EDIT", "KTRIM", "QKSUBSTR", "SYMGLOBL", 
			"ELSE", "KUPCASE", "QKTRIM", "SYMLOCAL", "Tk_NULL", "CANCEL", "NOLIST", 
			"ARRAY", "ARRAY_NUMERIC_ELEMENTS", "ARRAY_CHARACTER_ELEMENTS", "ARRAY_ALL_ELEMENTS", 
			"GROUPFORMAT", "NOTSORTED", "DESCENDING", "CALL", "DEBUG", "NESTING", 
			"STACK", "READ", "PW", "SOURCE", "VIEW", "PGM", "ENCRYPT", "NOSAVE", 
			"DATALINES", "CARDS", "LINES", "DATALINES4", "CARDS4", "LINES4", "END_DATALINES4", 
			"ALTER", "DISK", "DUMMY", "GTERM", "PIPE", "PLOTTER", "PRINTER", "TAPE", 
			"TEMP", "TERMINAL", "UPRINTER", "DSD", "EXPANDTABS", "NOEXPANDTABS", 
			"FLOWOVER", "MISSOVER", "PAD", "NOPAD", "SCANOVER", "SHAREBUFFERS", "STOPOVER", 
			"TRUNCOVER", "V_INFILE_", "INPUT_ODS", "DATE", "DATETIME", "DDMMYY", 
			"INFORMAT_COMMA", "INFORMAT_CHAR", "DROP", "PROC", "ANOVA", "MEANS", 
			"REG", "CORR", "SGPLOT", "PRINT", "DATA", "SQL", "VAR", "OUTPUT", "OUT", 
			"CLASS", "ID", "TYPES", "WAYS", "WEIGHT", "FREQ", "DATAFILE", "TABLE", 
			"REPLACE", "DBMS", "IMPORT", "LIBNAME", "FILENAME", "ENCODING", "KEEP", 
			"COMPRESS", "YES", "DEFAULT", "Informat", "DOLLAR", "EQ", "NE", "GT", 
			"LT", "GE", "LE", "IN", "EQC", "NEC", "GTC", "LTC", "GEC", "LEC", "INColon", 
			"AND", "OR", "NOT", "MIN", "MAX", "DateLiteral", "TimeLiteral", "DateTimeLiteral", 
			"BitLiteral", "NameLiteral", "HexLiteral", "STRINGLITERAL", "INT", "FloatingPointLiteral", 
			"Identifier", "ALL", "DOT", "AT", "EQUAL", "COMMA", "LBracket", "RBracket", 
			"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "DatalinesStmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatalinesStmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Datalines_mainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DatalinesStmtParser.EOF, 0); }
		public List<Datalines_stmtContext> datalines_stmt() {
			return getRuleContexts(Datalines_stmtContext.class);
		}
		public Datalines_stmtContext datalines_stmt(int i) {
			return getRuleContext(Datalines_stmtContext.class,i);
		}
		public List<Datalines4_stmtContext> datalines4_stmt() {
			return getRuleContexts(Datalines4_stmtContext.class);
		}
		public Datalines4_stmtContext datalines4_stmt(int i) {
			return getRuleContext(Datalines4_stmtContext.class,i);
		}
		public Datalines_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datalines_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterDatalines_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitDatalines_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitDatalines_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datalines_mainContext datalines_main() throws RecognitionException {
		Datalines_mainContext _localctx = new Datalines_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_datalines_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (DATALINES - 133)) | (1L << (CARDS - 133)) | (1L << (DATALINES4 - 133)) | (1L << (CARDS4 - 133)))) != 0)) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATALINES:
				case CARDS:
					{
					setState(34);
					datalines_stmt();
					}
					break;
				case DATALINES4:
				case CARDS4:
					{
					setState(35);
					datalines4_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(EOF);
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

	public static class Datalines_stmtContext extends ParserRuleContext {
		public TerminalNode DATALINES() { return getToken(DatalinesStmtParser.DATALINES, 0); }
		public TerminalNode CARDS() { return getToken(DatalinesStmtParser.CARDS, 0); }
		public Datalines_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datalines_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterDatalines_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitDatalines_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitDatalines_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datalines_stmtContext datalines_stmt() throws RecognitionException {
		Datalines_stmtContext _localctx = new Datalines_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_datalines_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !(_la==DATALINES || _la==CARDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			match(T__0);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(45);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(51);
			match(T__0);
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

	public static class Datalines4_stmtContext extends ParserRuleContext {
		public TerminalNode END_DATALINES4() { return getToken(DatalinesStmtParser.END_DATALINES4, 0); }
		public TerminalNode DATALINES4() { return getToken(DatalinesStmtParser.DATALINES4, 0); }
		public TerminalNode CARDS4() { return getToken(DatalinesStmtParser.CARDS4, 0); }
		public Datalines4_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datalines4_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterDatalines4_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitDatalines4_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitDatalines4_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datalines4_stmtContext datalines4_stmt() throws RecognitionException {
		Datalines4_stmtContext _localctx = new Datalines4_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datalines4_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==DATALINES4 || _la==CARDS4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(54);
			match(T__0);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(55);
					matchWildcard();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(61);
			match(END_DATALINES4);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DatalinesStmtParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(DatalinesStmtParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(DatalinesStmtParser.MAX, 0); }
		public TerminalNode EQ() { return getToken(DatalinesStmtParser.EQ, 0); }
		public TerminalNode NE() { return getToken(DatalinesStmtParser.NE, 0); }
		public TerminalNode GT() { return getToken(DatalinesStmtParser.GT, 0); }
		public TerminalNode LT() { return getToken(DatalinesStmtParser.LT, 0); }
		public TerminalNode GE() { return getToken(DatalinesStmtParser.GE, 0); }
		public TerminalNode LE() { return getToken(DatalinesStmtParser.LE, 0); }
		public TerminalNode EQC() { return getToken(DatalinesStmtParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(DatalinesStmtParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(DatalinesStmtParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(DatalinesStmtParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(DatalinesStmtParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(DatalinesStmtParser.LEC, 0); }
		public TerminalNode AND() { return getToken(DatalinesStmtParser.AND, 0); }
		public TerminalNode OR() { return getToken(DatalinesStmtParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(DatalinesStmtParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(DatalinesStmtParser.IN, 0); }
		public TerminalNode INColon() { return getToken(DatalinesStmtParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
				setState(64);
				literal();
				}
				break;
			case Identifier:
				{
				setState(65);
				match(Identifier);
				}
				break;
			case T__1:
				{
				setState(66);
				match(T__1);
				setState(67);
				expression(0);
				setState(68);
				match(T__2);
				}
				break;
			case T__8:
			case T__9:
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(72);
				match(NOT);
				setState(73);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(77);
						match(T__7);
						setState(78);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(80);
						match(MIN);
						setState(81);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(83);
						match(MAX);
						setState(84);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(86);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(89);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95);
						_la = _input.LA(1);
						if ( !(((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (EQ - 202)) | (1L << (NE - 202)) | (1L << (GT - 202)) | (1L << (LT - 202)) | (1L << (GE - 202)) | (1L << (LE - 202)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						_la = _input.LA(1);
						if ( !(((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (EQC - 209)) | (1L << (NEC - 209)) | (1L << (GTC - 209)) | (1L << (LTC - 209)) | (1L << (GEC - 209)) | (1L << (LEC - 209)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(101);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(104);
						match(EQUAL);
						setState(105);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(107);
						match(T__1);
						setState(109);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__15))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (NOT - 218)) | (1L << (DateLiteral - 218)) | (1L << (TimeLiteral - 218)) | (1L << (DateTimeLiteral - 218)) | (1L << (BitLiteral - 218)) | (1L << (NameLiteral - 218)) | (1L << (HexLiteral - 218)) | (1L << (STRINGLITERAL - 218)) | (1L << (INT - 218)) | (1L << (FloatingPointLiteral - 218)) | (1L << (Identifier - 218)) | (1L << (DOT - 218)))) != 0)) {
							{
							setState(108);
							expressionList(0);
							}
						}

						setState(111);
						match(T__2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(113);
						match(T__3);
						setState(114);
						expression(0);
						setState(115);
						match(T__4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(118);
						match(T__5);
						setState(119);
						expression(0);
						setState(120);
						match(T__6);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(DatalinesStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DatalinesStmtParser.COMMA, i);
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
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitExpressionList(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__8:
			case T__9:
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
				setState(131);
				expression(0);
				}
				break;
			case T__15:
				{
				setState(132);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(COMMA);
					setState(138);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__8:
					case T__9:
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
						setState(136);
						expression(0);
						}
						break;
					case T__15:
						{
						setState(137);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(145);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(146);
						match(COMMA);
						}
						}
						setState(149); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(151);
					expressionList(2);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(DatalinesStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DatalinesStmtParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DatalinesStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DatalinesStmtParser.COMMA, i);
		}
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__15);
				{
				setState(158);
				match(Identifier);
				setState(159);
				match(T__9);
				setState(160);
				match(Identifier);
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(162);
							match(COMMA);
							setState(163);
							match(T__15);
							}
						}

						{
						setState(166);
						match(Identifier);
						setState(167);
						match(T__9);
						setState(168);
						match(Identifier);
						}
						}
						} 
					}
					setState(173);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__15);
				setState(175);
				match(Identifier);
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(176);
						match(Identifier);
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__15);
				setState(183);
				match(Identifier);
				setState(184);
				match(T__5);
				setState(185);
				match(T__10);
				setState(186);
				match(T__6);
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
		public List<TerminalNode> Identifier() { return getTokens(DatalinesStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DatalinesStmtParser.Identifier, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(189);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(190);
					match(Identifier);
					setState(191);
					match(T__9);
					setState(192);
					match(Identifier);
					}
					break;
				}
				}
				setState(195); 
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
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(DatalinesStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DatalinesStmtParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_in_var_list);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(Identifier);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__1);
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(199);
					literal();
					}
					break;
				case 2:
					{
					setState(200);
					colonInts();
					}
					break;
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203);
					match(COMMA);
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(204);
						literal();
						}
						break;
					case 2:
						{
						setState(205);
						colonInts();
						}
						break;
					}
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(T__2);
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
		public List<TerminalNode> INT() { return getTokens(DatalinesStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DatalinesStmtParser.INT, i);
		}
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(INT);
			setState(218);
			match(T__16);
			setState(219);
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
		public TerminalNode INT() { return getToken(DatalinesStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(DatalinesStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(DatalinesStmtParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(DatalinesStmtParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(DatalinesStmtParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(DatalinesStmtParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(DatalinesStmtParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(DatalinesStmtParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(DatalinesStmtParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(DatalinesStmtParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (DateLiteral - 221)) | (1L << (TimeLiteral - 221)) | (1L << (DateTimeLiteral - 221)) | (1L << (BitLiteral - 221)) | (1L << (NameLiteral - 221)) | (1L << (HexLiteral - 221)) | (1L << (STRINGLITERAL - 221)) | (1L << (INT - 221)) | (1L << (FloatingPointLiteral - 221)) | (1L << (DOT - 221)))) != 0)) ) {
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
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(DatalinesStmtParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(DatalinesStmtParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(DatalinesStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DatalinesStmtParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitVariables(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(224);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(225);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(226);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(227);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						match(DOT);
						setState(232);
						variables(7);
						}
						break;
					case 2:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234);
						match(T__9);
						setState(235);
						variables(6);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		public TerminalNode STRINGLITERAL() { return getToken(DatalinesStmtParser.STRINGLITERAL, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		public TerminalNode STRINGLITERAL() { return getToken(DatalinesStmtParser.STRINGLITERAL, 0); }
		public TablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterTablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitTablename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitTablename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablenameContext tablename() throws RecognitionException {
		TablenameContext _localctx = new TablenameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		public TerminalNode STRINGLITERAL() { return getToken(DatalinesStmtParser.STRINGLITERAL, 0); }
		public TerminalNode Identifier() { return getToken(DatalinesStmtParser.Identifier, 0); }
		public TerminalNode CARDS() { return getToken(DatalinesStmtParser.CARDS, 0); }
		public TerminalNode CARDS4() { return getToken(DatalinesStmtParser.CARDS4, 0); }
		public TerminalNode DATALINES() { return getToken(DatalinesStmtParser.DATALINES, 0); }
		public TerminalNode DATALINES4() { return getToken(DatalinesStmtParser.DATALINES4, 0); }
		public File_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).enterFile_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalinesStmtListener ) ((DatalinesStmtListener)listener).exitFile_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalinesStmtVisitor ) return ((DatalinesStmtVisitor<? extends T>)visitor).visitFile_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_specificationContext file_specification() throws RecognitionException {
		File_specificationContext _localctx = new File_specificationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_file_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (DATALINES - 133)) | (1L << (CARDS - 133)) | (1L << (DATALINES4 - 133)) | (1L << (CARDS4 - 133)))) != 0) || _la==STRINGLITERAL || _la==Identifier) ) {
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 10:
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
		"\u0004\u0001\u00f0\u00fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0005\u0000%\b"+
		"\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00029\b"+
		"\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003K\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003~\b\u0003\n\u0003\f\u0003\u0081\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0086\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u008b\b\u0004\u0005\u0004\u008d\b\u0004\n\u0004"+
		"\f\u0004\u0090\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0094\b\u0004"+
		"\u000b\u0004\f\u0004\u0095\u0001\u0004\u0005\u0004\u0099\b\u0004\n\u0004"+
		"\f\u0004\u009c\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a5\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00aa\b\u0005\n\u0005\f\u0005\u00ad"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b2\b\u0005"+
		"\n\u0005\f\u0005\u00b5\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00bc\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006\u00c2\b\u0006\u000b\u0006\f\u0006\u00c3"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ca\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cf\b\u0007\u0005\u0007"+
		"\u00d1\b\u0007\n\u0007\f\u0007\u00d4\t\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00d8\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e5\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ed\b\n\n\n\f\n\u00f0\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u00020:\u0003\u0006"+
		"\b\u0014\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \u0000\f\u0001\u0000\u0085\u0086\u0001\u0000"+
		"\u0001\u0001\u0001\u0000\u0088\u0089\u0001\u0000\t\n\u0001\u0000\u000b"+
		"\r\u0001\u0000\u000e\u000f\u0001\u0000\u00ca\u00cf\u0001\u0000\u00d1\u00d6"+
		"\u0001\u0000\u00d8\u00d9\u0002\u0000\u00d0\u00d0\u00d7\u00d7\u0002\u0000"+
		"\u00dd\u00e5\u00e8\u00e8\u0004\u0000\u0085\u0086\u0088\u0089\u00e3\u00e3"+
		"\u00e6\u00e6\u0118\u0000&\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000"+
		"\u0000\u00045\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\b"+
		"\u0082\u0001\u0000\u0000\u0000\n\u00bb\u0001\u0000\u0000\u0000\f\u00c1"+
		"\u0001\u0000\u0000\u0000\u000e\u00d7\u0001\u0000\u0000\u0000\u0010\u00d9"+
		"\u0001\u0000\u0000\u0000\u0012\u00dd\u0001\u0000\u0000\u0000\u0014\u00e4"+
		"\u0001\u0000\u0000\u0000\u0016\u00f1\u0001\u0000\u0000\u0000\u0018\u00f3"+
		"\u0001\u0000\u0000\u0000\u001a\u00f5\u0001\u0000\u0000\u0000\u001c\u00f7"+
		"\u0001\u0000\u0000\u0000\u001e\u00f9\u0001\u0000\u0000\u0000 \u00fb\u0001"+
		"\u0000\u0000\u0000\"%\u0003\u0002\u0001\u0000#%\u0003\u0004\u0002\u0000"+
		"$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005\u0000\u0000\u0001*\u0001"+
		"\u0001\u0000\u0000\u0000+,\u0007\u0000\u0000\u0000,0\u0005\u0001\u0000"+
		"\u0000-/\b\u0001\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000013\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u00004\u0003"+
		"\u0001\u0000\u0000\u000056\u0007\u0002\u0000\u00006:\u0005\u0001\u0000"+
		"\u000079\t\u0000\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u008b\u0000\u0000>\u0005"+
		"\u0001\u0000\u0000\u0000?@\u0006\u0003\uffff\uffff\u0000@K\u0003\u0012"+
		"\t\u0000AK\u0005\u00e6\u0000\u0000BC\u0005\u0002\u0000\u0000CD\u0003\u0006"+
		"\u0003\u0000DE\u0005\u0003\u0000\u0000EK\u0001\u0000\u0000\u0000FG\u0007"+
		"\u0003\u0000\u0000GK\u0003\u0006\u0003\fHI\u0005\u00da\u0000\u0000IK\u0003"+
		"\u0006\u0003\u000bJ?\u0001\u0000\u0000\u0000JA\u0001\u0000\u0000\u0000"+
		"JB\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000K\u007f\u0001\u0000\u0000\u0000LM\n\r\u0000\u0000MN\u0005\b\u0000"+
		"\u0000N~\u0003\u0006\u0003\rOP\n\n\u0000\u0000PQ\u0005\u00db\u0000\u0000"+
		"Q~\u0003\u0006\u0003\u000bRS\n\t\u0000\u0000ST\u0005\u00dc\u0000\u0000"+
		"T~\u0003\u0006\u0003\nUV\n\b\u0000\u0000VW\u0007\u0004\u0000\u0000W~\u0003"+
		"\u0006\u0003\tXY\n\u0007\u0000\u0000YZ\u0007\u0003\u0000\u0000Z~\u0003"+
		"\u0006\u0003\b[\\\n\u0006\u0000\u0000\\]\u0007\u0005\u0000\u0000]~\u0003"+
		"\u0006\u0003\u0007^_\n\u0005\u0000\u0000_`\u0007\u0006\u0000\u0000`~\u0003"+
		"\u0006\u0003\u0006ab\n\u0004\u0000\u0000bc\u0007\u0007\u0000\u0000c~\u0003"+
		"\u0006\u0003\u0005de\n\u0002\u0000\u0000ef\u0007\b\u0000\u0000f~\u0003"+
		"\u0006\u0003\u0003gh\n\u0001\u0000\u0000hi\u0005\u00ea\u0000\u0000i~\u0003"+
		"\u0006\u0003\u0001jk\n\u0010\u0000\u0000km\u0005\u0002\u0000\u0000ln\u0003"+
		"\b\u0004\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000o~\u0005\u0003\u0000\u0000pq\n\u000f\u0000\u0000qr\u0005"+
		"\u0004\u0000\u0000rs\u0003\u0006\u0003\u0000st\u0005\u0005\u0000\u0000"+
		"t~\u0001\u0000\u0000\u0000uv\n\u000e\u0000\u0000vw\u0005\u0006\u0000\u0000"+
		"wx\u0003\u0006\u0003\u0000xy\u0005\u0007\u0000\u0000y~\u0001\u0000\u0000"+
		"\u0000z{\n\u0003\u0000\u0000{|\u0007\t\u0000\u0000|~\u0003\u000e\u0007"+
		"\u0000}L\u0001\u0000\u0000\u0000}O\u0001\u0000\u0000\u0000}R\u0001\u0000"+
		"\u0000\u0000}U\u0001\u0000\u0000\u0000}X\u0001\u0000\u0000\u0000}[\u0001"+
		"\u0000\u0000\u0000}^\u0001\u0000\u0000\u0000}a\u0001\u0000\u0000\u0000"+
		"}d\u0001\u0000\u0000\u0000}g\u0001\u0000\u0000\u0000}j\u0001\u0000\u0000"+
		"\u0000}p\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000}z\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0007\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0006\u0004\uffff\uffff"+
		"\u0000\u0083\u0086\u0003\u0006\u0003\u0000\u0084\u0086\u0003\n\u0005\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u008e\u0001\u0000\u0000\u0000\u0087\u008a\u0005\u00eb\u0000\u0000"+
		"\u0088\u008b\u0003\u0006\u0003\u0000\u0089\u008b\u0003\n\u0005\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008d"+
		"\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u009a\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0093\n\u0001\u0000\u0000\u0092\u0094"+
		"\u0005\u00eb\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0003\b\u0004\u0002\u0098\u0091\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\t\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u0010\u0000\u0000\u009e\u009f\u0005\u00e6"+
		"\u0000\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u00a1\u0005\u00e6\u0000"+
		"\u0000\u00a1\u00ab\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u00eb\u0000"+
		"\u0000\u00a3\u00a5\u0005\u0010\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u00e6\u0000\u0000\u00a7\u00a8\u0005\n\u0000\u0000"+
		"\u00a8\u00aa\u0005\u00e6\u0000\u0000\u00a9\u00a4\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0010\u0000\u0000"+
		"\u00af\u00b3\u0005\u00e6\u0000\u0000\u00b0\u00b2\u0005\u00e6\u0000\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00bc\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0010\u0000\u0000\u00b7\u00b8\u0005\u00e6\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9\u00ba\u0005\u000b\u0000\u0000"+
		"\u00ba\u00bc\u0005\u0007\u0000\u0000\u00bb\u009d\u0001\u0000\u0000\u0000"+
		"\u00bb\u00ae\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000"+
		"\u00bc\u000b\u0001\u0000\u0000\u0000\u00bd\u00c2\u0005\u00e6\u0000\u0000"+
		"\u00be\u00bf\u0005\u00e6\u0000\u0000\u00bf\u00c0\u0005\n\u0000\u0000\u00c0"+
		"\u00c2\u0005\u00e6\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1"+
		"\u00be\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\r\u0001\u0000\u0000\u0000\u00c5\u00d8\u0005\u00e6\u0000\u0000\u00c6\u00c9"+
		"\u0005\u0002\u0000\u0000\u00c7\u00ca\u0003\u0012\t\u0000\u00c8\u00ca\u0003"+
		"\u0010\b\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00d2\u0001\u0000\u0000\u0000\u00cb\u00ce\u0005\u00eb"+
		"\u0000\u0000\u00cc\u00cf\u0003\u0012\t\u0000\u00cd\u00cf\u0003\u0010\b"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000"+
		"\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00c6\u0001\u0000\u0000\u0000\u00d8\u000f\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005\u00e4\u0000\u0000\u00da\u00db\u0005\u0011\u0000"+
		"\u0000\u00db\u00dc\u0005\u00e4\u0000\u0000\u00dc\u0011\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0007\n\u0000\u0000\u00de\u0013\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0006\n\uffff\uffff\u0000\u00e0\u00e5\u0005\u00e6\u0000\u0000"+
		"\u00e1\u00e5\u0005\u00a4\u0000\u0000\u00e2\u00e5\u0005\u008c\u0000\u0000"+
		"\u00e3\u00e5\u0005\u00a9\u0000\u0000\u00e4\u00df\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00ee\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\n\u0006\u0000\u0000\u00e7\u00e8\u0005\u00e8\u0000\u0000\u00e8"+
		"\u00ed\u0003\u0014\n\u0007\u00e9\u00ea\n\u0005\u0000\u0000\u00ea\u00eb"+
		"\u0005\n\u0000\u0000\u00eb\u00ed\u0003\u0014\n\u0006\u00ec\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u0015\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u00e6\u0000\u0000\u00f2\u0017\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0005\u00e6\u0000\u0000\u00f4\u0019\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u00e6\u0000\u0000\u00f6\u001b\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005\u00e3\u0000\u0000\u00f8\u001d\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u00e3\u0000\u0000\u00fa\u001f\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0007\u000b\u0000\u0000\u00fc!\u0001\u0000"+
		"\u0000\u0000\u001a$&0:Jm}\u007f\u0085\u008a\u008e\u0095\u009a\u00a4\u00ab"+
		"\u00b3\u00bb\u00c1\u00c3\u00c9\u00ce\u00d2\u00d7\u00e4\u00ec\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}