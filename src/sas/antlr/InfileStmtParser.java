// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/InfileStmt.g4 by ANTLR 4.10.1
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
public class InfileStmtParser extends Parser {
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
		FILENAME=194, ENCODING=195, KEEP=196, COMPRESS=197, YES=198, Informat=199, 
		DOLLAR=200, EQ=201, NE=202, GT=203, LT=204, GE=205, LE=206, IN=207, EQC=208, 
		NEC=209, GTC=210, LTC=211, GEC=212, LEC=213, INColon=214, AND=215, OR=216, 
		NOT=217, MIN=218, MAX=219, DateLiteral=220, TimeLiteral=221, DateTimeLiteral=222, 
		BitLiteral=223, NameLiteral=224, HexLiteral=225, STRINGLITERAL=226, INT=227, 
		FloatingPointLiteral=228, Identifier=229, ALL=230, DOT=231, AT=232, EQUAL=233, 
		COMMA=234, LBracket=235, RBracket=236, WS=237, COMMENT=238, LINE_COMMENT=239;
	public static final int
		RULE_infile_main = 0, RULE_infile_stmt = 1, RULE_device_type = 2, RULE_infile_options = 3, 
		RULE_expression = 4, RULE_expressionList = 5, RULE_of_var_list = 6, RULE_identifiers_list = 7, 
		RULE_in_var_list = 8, RULE_colonInts = 9, RULE_literal = 10, RULE_variables = 11, 
		RULE_variable = 12, RULE_request = 13, RULE_list = 14, RULE_filename = 15, 
		RULE_tablename = 16, RULE_file_specification = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"infile_main", "infile_stmt", "device_type", "infile_options", "expression", 
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
			"'$'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'><'", "'<>'", null, null, null, 
			null, null, null, null, null, null, null, null, "'.'", "'@'", "'='", 
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
			"COMPRESS", "YES", "Informat", "DOLLAR", "EQ", "NE", "GT", "LT", "GE", 
			"LE", "IN", "EQC", "NEC", "GTC", "LTC", "GEC", "LEC", "INColon", "AND", 
			"OR", "NOT", "MIN", "MAX", "DateLiteral", "TimeLiteral", "DateTimeLiteral", 
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
	public String getGrammarFileName() { return "InfileStmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InfileStmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Infile_mainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(InfileStmtParser.EOF, 0); }
		public List<Infile_stmtContext> infile_stmt() {
			return getRuleContexts(Infile_stmtContext.class);
		}
		public Infile_stmtContext infile_stmt(int i) {
			return getRuleContext(Infile_stmtContext.class,i);
		}
		public Infile_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infile_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterInfile_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitInfile_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitInfile_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infile_mainContext infile_main() throws RecognitionException {
		Infile_mainContext _localctx = new Infile_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_infile_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INFILE) {
				{
				{
				setState(36);
				infile_stmt();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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

	public static class Infile_stmtContext extends ParserRuleContext {
		public TerminalNode INFILE() { return getToken(InfileStmtParser.INFILE, 0); }
		public File_specificationContext file_specification() {
			return getRuleContext(File_specificationContext.class,0);
		}
		public Device_typeContext device_type() {
			return getRuleContext(Device_typeContext.class,0);
		}
		public List<Infile_optionsContext> infile_options() {
			return getRuleContexts(Infile_optionsContext.class);
		}
		public Infile_optionsContext infile_options(int i) {
			return getRuleContext(Infile_optionsContext.class,i);
		}
		public Infile_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infile_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterInfile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitInfile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitInfile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infile_stmtContext infile_stmt() throws RecognitionException {
		Infile_stmtContext _localctx = new Infile_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_infile_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(INFILE);
			setState(45);
			file_specification();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DISK - 141)) | (1L << (DUMMY - 141)) | (1L << (GTERM - 141)) | (1L << (PIPE - 141)) | (1L << (PLOTTER - 141)) | (1L << (PRINTER - 141)) | (1L << (TAPE - 141)) | (1L << (TEMP - 141)) | (1L << (TERMINAL - 141)) | (1L << (UPRINTER - 141)))) != 0)) {
				{
				setState(46);
				device_type();
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (DSD - 151)) | (1L << (EXPANDTABS - 151)) | (1L << (NOEXPANDTABS - 151)) | (1L << (FLOWOVER - 151)) | (1L << (MISSOVER - 151)) | (1L << (PAD - 151)) | (1L << (NOPAD - 151)) | (1L << (SCANOVER - 151)) | (1L << (SHAREBUFFERS - 151)) | (1L << (STOPOVER - 151)) | (1L << (TRUNCOVER - 151)) | (1L << (V_INFILE_ - 151)))) != 0) || _la==Identifier) {
				{
				{
				setState(49);
				infile_options();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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

	public static class Device_typeContext extends ParserRuleContext {
		public TerminalNode DISK() { return getToken(InfileStmtParser.DISK, 0); }
		public TerminalNode DUMMY() { return getToken(InfileStmtParser.DUMMY, 0); }
		public TerminalNode GTERM() { return getToken(InfileStmtParser.GTERM, 0); }
		public TerminalNode PIPE() { return getToken(InfileStmtParser.PIPE, 0); }
		public TerminalNode PLOTTER() { return getToken(InfileStmtParser.PLOTTER, 0); }
		public TerminalNode PRINTER() { return getToken(InfileStmtParser.PRINTER, 0); }
		public TerminalNode TAPE() { return getToken(InfileStmtParser.TAPE, 0); }
		public TerminalNode TEMP() { return getToken(InfileStmtParser.TEMP, 0); }
		public TerminalNode TERMINAL() { return getToken(InfileStmtParser.TERMINAL, 0); }
		public TerminalNode UPRINTER() { return getToken(InfileStmtParser.UPRINTER, 0); }
		public Device_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_device_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterDevice_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitDevice_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitDevice_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Device_typeContext device_type() throws RecognitionException {
		Device_typeContext _localctx = new Device_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_device_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DISK - 141)) | (1L << (DUMMY - 141)) | (1L << (GTERM - 141)) | (1L << (PIPE - 141)) | (1L << (PLOTTER - 141)) | (1L << (PRINTER - 141)) | (1L << (TAPE - 141)) | (1L << (TEMP - 141)) | (1L << (TERMINAL - 141)) | (1L << (UPRINTER - 141)))) != 0)) ) {
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

	public static class Infile_optionsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(InfileStmtParser.Identifier, 0); }
		public TerminalNode EQUAL() { return getToken(InfileStmtParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DSD() { return getToken(InfileStmtParser.DSD, 0); }
		public TerminalNode EXPANDTABS() { return getToken(InfileStmtParser.EXPANDTABS, 0); }
		public TerminalNode NOEXPANDTABS() { return getToken(InfileStmtParser.NOEXPANDTABS, 0); }
		public TerminalNode FLOWOVER() { return getToken(InfileStmtParser.FLOWOVER, 0); }
		public TerminalNode MISSOVER() { return getToken(InfileStmtParser.MISSOVER, 0); }
		public TerminalNode PAD() { return getToken(InfileStmtParser.PAD, 0); }
		public TerminalNode NOPAD() { return getToken(InfileStmtParser.NOPAD, 0); }
		public TerminalNode SCANOVER() { return getToken(InfileStmtParser.SCANOVER, 0); }
		public TerminalNode SHAREBUFFERS() { return getToken(InfileStmtParser.SHAREBUFFERS, 0); }
		public TerminalNode STOPOVER() { return getToken(InfileStmtParser.STOPOVER, 0); }
		public TerminalNode TRUNCOVER() { return getToken(InfileStmtParser.TRUNCOVER, 0); }
		public TerminalNode V_INFILE_() { return getToken(InfileStmtParser.V_INFILE_, 0); }
		public Infile_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infile_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterInfile_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitInfile_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitInfile_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infile_optionsContext infile_options() throws RecognitionException {
		Infile_optionsContext _localctx = new Infile_optionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_infile_options);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(Identifier);
				setState(60);
				match(EQUAL);
				setState(61);
				expression(0);
				}
				break;
			case DSD:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(DSD);
				}
				break;
			case EXPANDTABS:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(EXPANDTABS);
				}
				break;
			case NOEXPANDTABS:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(NOEXPANDTABS);
				}
				break;
			case FLOWOVER:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(FLOWOVER);
				}
				break;
			case MISSOVER:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				match(MISSOVER);
				}
				break;
			case PAD:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(PAD);
				}
				break;
			case NOPAD:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				match(NOPAD);
				}
				break;
			case SCANOVER:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				match(SCANOVER);
				}
				break;
			case SHAREBUFFERS:
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				match(SHAREBUFFERS);
				}
				break;
			case STOPOVER:
				enterOuterAlt(_localctx, 11);
				{
				setState(71);
				match(STOPOVER);
				}
				break;
			case TRUNCOVER:
				enterOuterAlt(_localctx, 12);
				{
				setState(72);
				match(TRUNCOVER);
				}
				break;
			case V_INFILE_:
				enterOuterAlt(_localctx, 13);
				{
				setState(73);
				match(V_INFILE_);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(InfileStmtParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(InfileStmtParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(InfileStmtParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(InfileStmtParser.MAX, 0); }
		public TerminalNode EQ() { return getToken(InfileStmtParser.EQ, 0); }
		public TerminalNode NE() { return getToken(InfileStmtParser.NE, 0); }
		public TerminalNode GT() { return getToken(InfileStmtParser.GT, 0); }
		public TerminalNode LT() { return getToken(InfileStmtParser.LT, 0); }
		public TerminalNode GE() { return getToken(InfileStmtParser.GE, 0); }
		public TerminalNode LE() { return getToken(InfileStmtParser.LE, 0); }
		public TerminalNode EQC() { return getToken(InfileStmtParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(InfileStmtParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(InfileStmtParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(InfileStmtParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(InfileStmtParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(InfileStmtParser.LEC, 0); }
		public TerminalNode AND() { return getToken(InfileStmtParser.AND, 0); }
		public TerminalNode OR() { return getToken(InfileStmtParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(InfileStmtParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(InfileStmtParser.IN, 0); }
		public TerminalNode INColon() { return getToken(InfileStmtParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
				setState(77);
				literal();
				}
				break;
			case Identifier:
				{
				setState(78);
				match(Identifier);
				}
				break;
			case T__1:
				{
				setState(79);
				match(T__1);
				setState(80);
				expression(0);
				setState(81);
				match(T__2);
				}
				break;
			case T__8:
			case T__9:
				{
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(84);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(85);
				match(NOT);
				setState(86);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(90);
						match(T__7);
						setState(91);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(93);
						match(MIN);
						setState(94);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(96);
						match(MAX);
						setState(97);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(99);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(102);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(105);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(108);
						_la = _input.LA(1);
						if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (EQ - 201)) | (1L << (NE - 201)) | (1L << (GT - 201)) | (1L << (LT - 201)) | (1L << (GE - 201)) | (1L << (LE - 201)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						_la = _input.LA(1);
						if ( !(((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (EQC - 208)) | (1L << (NEC - 208)) | (1L << (GTC - 208)) | (1L << (LTC - 208)) | (1L << (GEC - 208)) | (1L << (LEC - 208)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(117);
						match(EQUAL);
						setState(118);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(120);
						match(T__1);
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__15))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NOT - 217)) | (1L << (DateLiteral - 217)) | (1L << (TimeLiteral - 217)) | (1L << (DateTimeLiteral - 217)) | (1L << (BitLiteral - 217)) | (1L << (NameLiteral - 217)) | (1L << (HexLiteral - 217)) | (1L << (STRINGLITERAL - 217)) | (1L << (INT - 217)) | (1L << (FloatingPointLiteral - 217)) | (1L << (Identifier - 217)) | (1L << (DOT - 217)))) != 0)) {
							{
							setState(121);
							expressionList(0);
							}
						}

						setState(124);
						match(T__2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(126);
						match(T__3);
						setState(127);
						expression(0);
						setState(128);
						match(T__4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(131);
						match(T__5);
						setState(132);
						expression(0);
						setState(133);
						match(T__6);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(136);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(142);
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
		public List<TerminalNode> COMMA() { return getTokens(InfileStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InfileStmtParser.COMMA, i);
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
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitExpressionList(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
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
				setState(144);
				expression(0);
				}
				break;
			case T__15:
				{
				setState(145);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					match(COMMA);
					setState(151);
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
						setState(149);
						expression(0);
						}
						break;
					case T__15:
						{
						setState(150);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
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
					setState(158);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(159);
						match(COMMA);
						}
						}
						setState(162); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(164);
					expressionList(2);
					}
					} 
				}
				setState(169);
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
		public List<TerminalNode> Identifier() { return getTokens(InfileStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(InfileStmtParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InfileStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InfileStmtParser.COMMA, i);
		}
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__15);
				{
				setState(171);
				match(Identifier);
				setState(172);
				match(T__9);
				setState(173);
				match(Identifier);
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(175);
							match(COMMA);
							setState(176);
							match(T__15);
							}
						}

						{
						setState(179);
						match(Identifier);
						setState(180);
						match(T__9);
						setState(181);
						match(Identifier);
						}
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__15);
				setState(188);
				match(Identifier);
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189);
						match(Identifier);
						}
						} 
					}
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(T__15);
				setState(196);
				match(Identifier);
				setState(197);
				match(T__5);
				setState(198);
				match(T__10);
				setState(199);
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
		public List<TerminalNode> Identifier() { return getTokens(InfileStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(InfileStmtParser.Identifier, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(202);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(203);
					match(Identifier);
					setState(204);
					match(T__9);
					setState(205);
					match(Identifier);
					}
					break;
				}
				}
				setState(208); 
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
		public TerminalNode Identifier() { return getToken(InfileStmtParser.Identifier, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(InfileStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InfileStmtParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_in_var_list);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(Identifier);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__1);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(212);
					literal();
					}
					break;
				case 2:
					{
					setState(213);
					colonInts();
					}
					break;
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(216);
					match(COMMA);
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(217);
						literal();
						}
						break;
					case 2:
						{
						setState(218);
						colonInts();
						}
						break;
					}
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
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
		public List<TerminalNode> INT() { return getTokens(InfileStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InfileStmtParser.INT, i);
		}
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(INT);
			setState(231);
			match(T__16);
			setState(232);
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
		public TerminalNode INT() { return getToken(InfileStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(InfileStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(InfileStmtParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(InfileStmtParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(InfileStmtParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(InfileStmtParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(InfileStmtParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(InfileStmtParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(InfileStmtParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(InfileStmtParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (DateLiteral - 220)) | (1L << (TimeLiteral - 220)) | (1L << (DateTimeLiteral - 220)) | (1L << (BitLiteral - 220)) | (1L << (NameLiteral - 220)) | (1L << (HexLiteral - 220)) | (1L << (STRINGLITERAL - 220)) | (1L << (INT - 220)) | (1L << (FloatingPointLiteral - 220)) | (1L << (DOT - 220)))) != 0)) ) {
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
		public TerminalNode Identifier() { return getToken(InfileStmtParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(InfileStmtParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(InfileStmtParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(InfileStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(InfileStmtParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitVariables(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(237);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(238);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(239);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(240);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(243);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(244);
						match(DOT);
						setState(245);
						variables(7);
						}
						break;
					case 2:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(246);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(247);
						match(T__9);
						setState(248);
						variables(6);
						}
						break;
					}
					} 
				}
				setState(253);
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
		public TerminalNode Identifier() { return getToken(InfileStmtParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		public TerminalNode Identifier() { return getToken(InfileStmtParser.Identifier, 0); }
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		public TerminalNode Identifier() { return getToken(InfileStmtParser.Identifier, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		public TerminalNode STRINGLITERAL() { return getToken(InfileStmtParser.STRINGLITERAL, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		public TerminalNode STRINGLITERAL() { return getToken(InfileStmtParser.STRINGLITERAL, 0); }
		public TablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterTablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitTablename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitTablename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablenameContext tablename() throws RecognitionException {
		TablenameContext _localctx = new TablenameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		public TerminalNode STRINGLITERAL() { return getToken(InfileStmtParser.STRINGLITERAL, 0); }
		public TerminalNode Identifier() { return getToken(InfileStmtParser.Identifier, 0); }
		public TerminalNode CARDS() { return getToken(InfileStmtParser.CARDS, 0); }
		public TerminalNode CARDS4() { return getToken(InfileStmtParser.CARDS4, 0); }
		public TerminalNode DATALINES() { return getToken(InfileStmtParser.DATALINES, 0); }
		public TerminalNode DATALINES4() { return getToken(InfileStmtParser.DATALINES4, 0); }
		public File_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).enterFile_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfileStmtListener ) ((InfileStmtListener)listener).exitFile_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfileStmtVisitor ) return ((InfileStmtVisitor<? extends T>)visitor).visitFile_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_specificationContext file_specification() throws RecognitionException {
		File_specificationContext _localctx = new File_specificationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_file_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 5:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 11:
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
		"\u0004\u0001\u00ef\u010b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005"+
		"\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001\u0005"+
		"\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003K\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004X\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004{\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008b\b\u0004\n\u0004\f\u0004"+
		"\u008e\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0093\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0098\b\u0005\u0005"+
		"\u0005\u009a\b\u0005\n\u0005\f\u0005\u009d\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u0005\u00a1\b\u0005\u000b\u0005\f\u0005\u00a2\u0001\u0005\u0005"+
		"\u0005\u00a6\b\u0005\n\u0005\f\u0005\u00a9\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00b2\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b7\b"+
		"\u0006\n\u0006\f\u0006\u00ba\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00bf\b\u0006\n\u0006\f\u0006\u00c2\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c9\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00cf\b\u0007\u000b"+
		"\u0007\f\u0007\u00d0\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d7\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00dc\b\b\u0005\b\u00de\b\b\n\b\f\b\u00e1"+
		"\t\b\u0001\b\u0001\b\u0003\b\u00e5\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00f2\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00fa\b\u000b\n\u000b\f\u000b"+
		"\u00fd\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0000\u0003\b\n\u0016\u0012\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\n\u0001"+
		"\u0000\u008d\u0096\u0001\u0000\t\n\u0001\u0000\u000b\r\u0001\u0000\u000e"+
		"\u000f\u0001\u0000\u00c9\u00ce\u0001\u0000\u00d0\u00d5\u0001\u0000\u00d7"+
		"\u00d8\u0002\u0000\u00cf\u00cf\u00d6\u00d6\u0002\u0000\u00dc\u00e4\u00e7"+
		"\u00e7\u0004\u0000\u0085\u0086\u0088\u0089\u00e2\u00e2\u00e5\u00e5\u012f"+
		"\u0000\'\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004"+
		"9\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bW\u0001\u0000"+
		"\u0000\u0000\n\u008f\u0001\u0000\u0000\u0000\f\u00c8\u0001\u0000\u0000"+
		"\u0000\u000e\u00ce\u0001\u0000\u0000\u0000\u0010\u00e4\u0001\u0000\u0000"+
		"\u0000\u0012\u00e6\u0001\u0000\u0000\u0000\u0014\u00ea\u0001\u0000\u0000"+
		"\u0000\u0016\u00f1\u0001\u0000\u0000\u0000\u0018\u00fe\u0001\u0000\u0000"+
		"\u0000\u001a\u0100\u0001\u0000\u0000\u0000\u001c\u0102\u0001\u0000\u0000"+
		"\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u0106\u0001\u0000\u0000\u0000"+
		"\"\u0108\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		"*+\u0005\u0000\u0000\u0001+\u0001\u0001\u0000\u0000\u0000,-\u0005E\u0000"+
		"\u0000-/\u0003\"\u0011\u0000.0\u0003\u0004\u0002\u0000/.\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000004\u0001\u0000\u0000\u000013\u0003\u0006"+
		"\u0003\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000078\u0005\u0001\u0000\u00008\u0003\u0001\u0000"+
		"\u0000\u00009:\u0007\u0000\u0000\u0000:\u0005\u0001\u0000\u0000\u0000"+
		";<\u0005\u00e5\u0000\u0000<=\u0005\u00e9\u0000\u0000=K\u0003\b\u0004\u0000"+
		">K\u0005\u0097\u0000\u0000?K\u0005\u0098\u0000\u0000@K\u0005\u0099\u0000"+
		"\u0000AK\u0005\u009a\u0000\u0000BK\u0005\u009b\u0000\u0000CK\u0005\u009c"+
		"\u0000\u0000DK\u0005\u009d\u0000\u0000EK\u0005\u009e\u0000\u0000FK\u0005"+
		"\u009f\u0000\u0000GK\u0005\u00a0\u0000\u0000HK\u0005\u00a1\u0000\u0000"+
		"IK\u0005\u00a2\u0000\u0000J;\u0001\u0000\u0000\u0000J>\u0001\u0000\u0000"+
		"\u0000J?\u0001\u0000\u0000\u0000J@\u0001\u0000\u0000\u0000JA\u0001\u0000"+
		"\u0000\u0000JB\u0001\u0000\u0000\u0000JC\u0001\u0000\u0000\u0000JD\u0001"+
		"\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000"+
		"JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0006\u0004\uffff\uffff\u0000"+
		"MX\u0003\u0014\n\u0000NX\u0005\u00e5\u0000\u0000OP\u0005\u0002\u0000\u0000"+
		"PQ\u0003\b\u0004\u0000QR\u0005\u0003\u0000\u0000RX\u0001\u0000\u0000\u0000"+
		"ST\u0007\u0001\u0000\u0000TX\u0003\b\u0004\fUV\u0005\u00d9\u0000\u0000"+
		"VX\u0003\b\u0004\u000bWL\u0001\u0000\u0000\u0000WN\u0001\u0000\u0000\u0000"+
		"WO\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000X\u008c\u0001\u0000\u0000\u0000YZ\n\r\u0000\u0000Z[\u0005\b\u0000"+
		"\u0000[\u008b\u0003\b\u0004\r\\]\n\n\u0000\u0000]^\u0005\u00da\u0000\u0000"+
		"^\u008b\u0003\b\u0004\u000b_`\n\t\u0000\u0000`a\u0005\u00db\u0000\u0000"+
		"a\u008b\u0003\b\u0004\nbc\n\b\u0000\u0000cd\u0007\u0002\u0000\u0000d\u008b"+
		"\u0003\b\u0004\tef\n\u0007\u0000\u0000fg\u0007\u0001\u0000\u0000g\u008b"+
		"\u0003\b\u0004\bhi\n\u0006\u0000\u0000ij\u0007\u0003\u0000\u0000j\u008b"+
		"\u0003\b\u0004\u0007kl\n\u0005\u0000\u0000lm\u0007\u0004\u0000\u0000m"+
		"\u008b\u0003\b\u0004\u0006no\n\u0004\u0000\u0000op\u0007\u0005\u0000\u0000"+
		"p\u008b\u0003\b\u0004\u0005qr\n\u0002\u0000\u0000rs\u0007\u0006\u0000"+
		"\u0000s\u008b\u0003\b\u0004\u0003tu\n\u0001\u0000\u0000uv\u0005\u00e9"+
		"\u0000\u0000v\u008b\u0003\b\u0004\u0001wx\n\u0010\u0000\u0000xz\u0005"+
		"\u0002\u0000\u0000y{\u0003\n\u0005\u0000zy\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u008b\u0005\u0003\u0000"+
		"\u0000}~\n\u000f\u0000\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0080"+
		"\u0003\b\u0004\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081\u008b\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\n\u000e\u0000\u0000\u0083\u0084\u0005\u0006"+
		"\u0000\u0000\u0084\u0085\u0003\b\u0004\u0000\u0085\u0086\u0005\u0007\u0000"+
		"\u0000\u0086\u008b\u0001\u0000\u0000\u0000\u0087\u0088\n\u0003\u0000\u0000"+
		"\u0088\u0089\u0007\u0007\u0000\u0000\u0089\u008b\u0003\u0010\b\u0000\u008a"+
		"Y\u0001\u0000\u0000\u0000\u008a\\\u0001\u0000\u0000\u0000\u008a_\u0001"+
		"\u0000\u0000\u0000\u008ab\u0001\u0000\u0000\u0000\u008ae\u0001\u0000\u0000"+
		"\u0000\u008ah\u0001\u0000\u0000\u0000\u008ak\u0001\u0000\u0000\u0000\u008a"+
		"n\u0001\u0000\u0000\u0000\u008aq\u0001\u0000\u0000\u0000\u008at\u0001"+
		"\u0000\u0000\u0000\u008aw\u0001\u0000\u0000\u0000\u008a}\u0001\u0000\u0000"+
		"\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\t\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0006\u0005\uffff\uffff"+
		"\u0000\u0090\u0093\u0003\b\u0004\u0000\u0091\u0093\u0003\f\u0006\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u009b\u0001\u0000\u0000\u0000\u0094\u0097\u0005\u00ea\u0000\u0000"+
		"\u0095\u0098\u0003\b\u0004\u0000\u0096\u0098\u0003\f\u0006\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u00a7\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\n\u0001\u0000\u0000\u009f\u00a1"+
		"\u0005\u00ea\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0003\n\u0005\u0002\u00a5\u009e\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u000b\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\u0010\u0000\u0000\u00ab\u00ac\u0005"+
		"\u00e5\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae\u0005\u00e5"+
		"\u0000\u0000\u00ae\u00b8\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u00ea"+
		"\u0000\u0000\u00b0\u00b2\u0005\u0010\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u00e5\u0000\u0000\u00b4\u00b5\u0005\n\u0000"+
		"\u0000\u00b5\u00b7\u0005\u00e5\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0010\u0000"+
		"\u0000\u00bc\u00c0\u0005\u00e5\u0000\u0000\u00bd\u00bf\u0005\u00e5\u0000"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c9\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0010\u0000\u0000\u00c4\u00c5\u0005\u00e5\u0000"+
		"\u0000\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6\u00c7\u0005\u000b\u0000"+
		"\u0000\u00c7\u00c9\u0005\u0007\u0000\u0000\u00c8\u00aa\u0001\u0000\u0000"+
		"\u0000\u00c8\u00bb\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca\u00cf\u0005\u00e5\u0000\u0000"+
		"\u00cb\u00cc\u0005\u00e5\u0000\u0000\u00cc\u00cd\u0005\n\u0000\u0000\u00cd"+
		"\u00cf\u0005\u00e5\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u000f\u0001\u0000\u0000\u0000\u00d2\u00e5\u0005\u00e5\u0000\u0000\u00d3"+
		"\u00d6\u0005\u0002\u0000\u0000\u00d4\u00d7\u0003\u0014\n\u0000\u00d5\u00d7"+
		"\u0003\u0012\t\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00df\u0001\u0000\u0000\u0000\u00d8\u00db\u0005"+
		"\u00ea\u0000\u0000\u00d9\u00dc\u0003\u0014\n\u0000\u00da\u00dc\u0003\u0012"+
		"\t\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0003\u0000"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00d3\u0001\u0000\u0000\u0000\u00e5\u0011\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\u00e3\u0000\u0000\u00e7\u00e8\u0005\u0011\u0000"+
		"\u0000\u00e8\u00e9\u0005\u00e3\u0000\u0000\u00e9\u0013\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0007\b\u0000\u0000\u00eb\u0015\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0006\u000b\uffff\uffff\u0000\u00ed\u00f2\u0005\u00e5\u0000"+
		"\u0000\u00ee\u00f2\u0005\u00a4\u0000\u0000\u00ef\u00f2\u0005\u008c\u0000"+
		"\u0000\u00f0\u00f2\u0005\u00a9\u0000\u0000\u00f1\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00fb\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\n\u0006\u0000\u0000\u00f4\u00f5\u0005\u00e7\u0000\u0000"+
		"\u00f5\u00fa\u0003\u0016\u000b\u0007\u00f6\u00f7\n\u0005\u0000\u0000\u00f7"+
		"\u00f8\u0005\n\u0000\u0000\u00f8\u00fa\u0003\u0016\u000b\u0006\u00f9\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00fa\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc\u0017\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u00e5\u0000\u0000\u00ff\u0019"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u00e5\u0000\u0000\u0101\u001b"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u00e5\u0000\u0000\u0103\u001d"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u00e2\u0000\u0000\u0105\u001f"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u00e2\u0000\u0000\u0107!\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0007\t\u0000\u0000\u0109#\u0001\u0000"+
		"\u0000\u0000\u001a\'/4JWz\u008a\u008c\u0092\u0097\u009b\u00a2\u00a7\u00b1"+
		"\u00b8\u00c0\u00c8\u00ce\u00d0\u00d6\u00db\u00df\u00e4\u00f1\u00f9\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}