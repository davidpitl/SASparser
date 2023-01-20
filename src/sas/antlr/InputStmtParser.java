// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/InputStmt.g4 by ANTLR 4.10.1
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
public class InputStmtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ABEND=23, END=24, LENGTH=25, 
		QKUPCASE=26, SYSEVALF=27, ABORT=28, EVAL=29, LET=30, QSCAN=31, SYSEXEC=32, 
		ACT=33, FILE=34, LIST=35, QSUBSTR=36, SYSFUNC=37, ACTIVATE=38, GLOBAL=39, 
		LISTM=40, QSYSFUNC=41, SYSGET=42, BQUOTE=43, GO=44, LOCAL=45, QUOTE=46, 
		SYSRPUT=47, BY=48, GOTO=49, MACRO=50, QUPCASE=51, THEN=52, CLEAR=53, IF=54, 
		MEND=55, RESOLVE=56, TO=57, CLOSE=58, INC=59, PAUSE=60, RETURN=61, TSO=62, 
		CMS=63, INCLUDE=64, NRSTR=65, RUN=66, UNQUOTE=67, COMANDR=68, INDEX=69, 
		ON=70, SAVE=71, UNSTR=72, COPY=73, INFILE=74, OPEN=75, SCAN=76, UNTIL=77, 
		DEACT=78, INPUT=79, PUT=80, STOP=81, UPCASE=82, DEL=83, KCMPRES=84, NRBQUOTE=85, 
		STR=86, WHILE=87, DELETE=88, KINDEX=89, NRQUOTE=90, SYSCALL=91, WINDOW=92, 
		DISPLAY=93, KLEFT=94, METASYM=95, SUBSTR=96, DMIDSPLY=97, KLENGTH=98, 
		QKCMPRES=99, SUPERQ=100, DMISPLIT=101, KSCAN=102, QKLEFT=103, SYMDEL=104, 
		DO=105, KSUBSTR=106, QKSCAN=107, SYMEXIST=108, EDIT=109, KTRIM=110, QKSUBSTR=111, 
		SYMGLOBL=112, ELSE=113, KUPCASE=114, QKTRIM=115, SYMLOCAL=116, Tk_NULL=117, 
		CANCEL=118, NOLIST=119, ARRAY=120, ARRAY_NUMERIC_ELEMENTS=121, ARRAY_CHARACTER_ELEMENTS=122, 
		ARRAY_ALL_ELEMENTS=123, GROUPFORMAT=124, NOTSORTED=125, DESCENDING=126, 
		CALL=127, DEBUG=128, NESTING=129, STACK=130, READ=131, PW=132, SOURCE=133, 
		VIEW=134, PGM=135, ENCRYPT=136, NOSAVE=137, DATALINES=138, CARDS=139, 
		LINES=140, DATALINES4=141, CARDS4=142, LINES4=143, END_DATALINES4=144, 
		ALTER=145, DISK=146, DUMMY=147, GTERM=148, PIPE=149, PLOTTER=150, PRINTER=151, 
		TAPE=152, TEMP=153, TERMINAL=154, UPRINTER=155, DSD=156, EXPANDTABS=157, 
		NOEXPANDTABS=158, FLOWOVER=159, MISSOVER=160, PAD=161, NOPAD=162, SCANOVER=163, 
		SHAREBUFFERS=164, STOPOVER=165, TRUNCOVER=166, V_INFILE_=167, INPUT_ODS=168, 
		DATE=169, DATETIME=170, DDMMYY=171, INFORMAT_COMMA=172, INFORMAT_CHAR=173, 
		DROP=174, PROC=175, ANOVA=176, MEANS=177, REG=178, CORR=179, SGPLOT=180, 
		PRINT=181, DATA=182, SQL=183, VAR=184, OUTPUT=185, OUT=186, CLASS=187, 
		ID=188, TYPES=189, WAYS=190, WEIGHT=191, FREQ=192, DATAFILE=193, TABLE=194, 
		REPLACE=195, DBMS=196, IMPORT=197, LIBNAME=198, FILENAME=199, ENCODING=200, 
		KEEP=201, COMPRESS=202, YES=203, Informat=204, DOLLAR=205, EQ=206, NE=207, 
		GT=208, LT=209, GE=210, LE=211, IN=212, EQC=213, NEC=214, GTC=215, LTC=216, 
		GEC=217, LEC=218, INColon=219, AND=220, OR=221, NOT=222, MIN=223, MAX=224, 
		DateLiteral=225, TimeLiteral=226, DateTimeLiteral=227, BitLiteral=228, 
		NameLiteral=229, HexLiteral=230, STRINGLITERAL=231, INT=232, FloatingPointLiteral=233, 
		Identifier=234, ALL=235, DOT=236, AT=237, EQUAL=238, COMMA=239, LBracket=240, 
		RBracket=241, WS=242, COMMENT=243, LINE_COMMENT=244;
	public static final int
		RULE_input_main = 0, RULE_input_stmt = 1, RULE_put_stmt = 2, RULE_input_specification = 3, 
		RULE_put_specification = 4, RULE_pointer_control = 5, RULE_informat_list = 6, 
		RULE_input_variable_format = 7, RULE_input_variable = 8, RULE_put_variable_format = 9, 
		RULE_put_variable = 10, RULE_column_point_control = 11, RULE_line_point_control = 12, 
		RULE_format_modifier = 13, RULE_column_specifications = 14, RULE_expression = 15, 
		RULE_expressionList = 16, RULE_of_var_list = 17, RULE_identifiers_list = 18, 
		RULE_in_var_list = 19, RULE_colonInts = 20, RULE_literal = 21, RULE_variables = 22, 
		RULE_variable = 23, RULE_request = 24, RULE_list = 25, RULE_filename = 26, 
		RULE_tablename = 27, RULE_file_specification = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"input_main", "input_stmt", "put_stmt", "input_specification", "put_specification", 
			"pointer_control", "informat_list", "input_variable_format", "input_variable", 
			"put_variable_format", "put_variable", "column_point_control", "line_point_control", 
			"format_modifier", "column_specifications", "expression", "expressionList", 
			"of_var_list", "identifiers_list", "in_var_list", "colonInts", "literal", 
			"variables", "variable", "request", "list", "filename", "tablename", 
			"file_specification"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'-'", "'{'", "'*'", "'}'", "'+'", "'#'", 
			"'/'", "'?'", "'??'", "'&'", "':'", "'~'", "'['", "']'", "'**'", "'%'", 
			"'||'", "'!!'", "'of'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "';;;;'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'$'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'><'", "'<>'", null, null, null, null, null, null, null, null, 
			null, null, null, "'.'", "'@'", "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ABEND", 
			"END", "LENGTH", "QKUPCASE", "SYSEVALF", "ABORT", "EVAL", "LET", "QSCAN", 
			"SYSEXEC", "ACT", "FILE", "LIST", "QSUBSTR", "SYSFUNC", "ACTIVATE", "GLOBAL", 
			"LISTM", "QSYSFUNC", "SYSGET", "BQUOTE", "GO", "LOCAL", "QUOTE", "SYSRPUT", 
			"BY", "GOTO", "MACRO", "QUPCASE", "THEN", "CLEAR", "IF", "MEND", "RESOLVE", 
			"TO", "CLOSE", "INC", "PAUSE", "RETURN", "TSO", "CMS", "INCLUDE", "NRSTR", 
			"RUN", "UNQUOTE", "COMANDR", "INDEX", "ON", "SAVE", "UNSTR", "COPY", 
			"INFILE", "OPEN", "SCAN", "UNTIL", "DEACT", "INPUT", "PUT", "STOP", "UPCASE", 
			"DEL", "KCMPRES", "NRBQUOTE", "STR", "WHILE", "DELETE", "KINDEX", "NRQUOTE", 
			"SYSCALL", "WINDOW", "DISPLAY", "KLEFT", "METASYM", "SUBSTR", "DMIDSPLY", 
			"KLENGTH", "QKCMPRES", "SUPERQ", "DMISPLIT", "KSCAN", "QKLEFT", "SYMDEL", 
			"DO", "KSUBSTR", "QKSCAN", "SYMEXIST", "EDIT", "KTRIM", "QKSUBSTR", "SYMGLOBL", 
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
	public String getGrammarFileName() { return "InputStmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InputStmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Input_mainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(InputStmtParser.EOF, 0); }
		public List<Input_stmtContext> input_stmt() {
			return getRuleContexts(Input_stmtContext.class);
		}
		public Input_stmtContext input_stmt(int i) {
			return getRuleContext(Input_stmtContext.class,i);
		}
		public List<Put_stmtContext> put_stmt() {
			return getRuleContexts(Put_stmtContext.class);
		}
		public Put_stmtContext put_stmt(int i) {
			return getRuleContext(Put_stmtContext.class,i);
		}
		public Input_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_mainContext input_main() throws RecognitionException {
		Input_mainContext _localctx = new Input_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INPUT || _la==PUT) {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INPUT:
					{
					setState(58);
					input_stmt();
					}
					break;
				case PUT:
					{
					setState(59);
					put_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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

	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(InputStmtParser.INPUT, 0); }
		public List<Input_specificationContext> input_specification() {
			return getRuleContexts(Input_specificationContext.class);
		}
		public Input_specificationContext input_specification(int i) {
			return getRuleContext(Input_specificationContext.class,i);
		}
		public TerminalNode INPUT_ODS() { return getToken(InputStmtParser.INPUT_ODS, 0); }
		public List<TerminalNode> AT() { return getTokens(InputStmtParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(InputStmtParser.AT, i);
		}
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(INPUT);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					input_specification();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_ODS) {
				{
				setState(74);
				match(INPUT_ODS);
				}
			}

			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77);
				match(AT);
				}
				break;
			case 2:
				{
				setState(78);
				match(AT);
				setState(79);
				match(AT);
				}
				break;
			}
			setState(82);
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

	public static class Put_stmtContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(InputStmtParser.PUT, 0); }
		public List<Put_specificationContext> put_specification() {
			return getRuleContexts(Put_specificationContext.class);
		}
		public Put_specificationContext put_specification(int i) {
			return getRuleContext(Put_specificationContext.class,i);
		}
		public TerminalNode INPUT_ODS() { return getToken(InputStmtParser.INPUT_ODS, 0); }
		public List<TerminalNode> AT() { return getTokens(InputStmtParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(InputStmtParser.AT, i);
		}
		public Put_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPut_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPut_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPut_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Put_stmtContext put_stmt() throws RecognitionException {
		Put_stmtContext _localctx = new Put_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_put_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(PUT);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					put_specification();
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_ODS) {
				{
				setState(91);
				match(INPUT_ODS);
				}
			}

			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(94);
				match(AT);
				}
				break;
			case 2:
				{
				setState(95);
				match(AT);
				setState(96);
				match(AT);
				}
				break;
			}
			setState(99);
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

	public static class Input_specificationContext extends ParserRuleContext {
		public Pointer_controlContext pointer_control() {
			return getRuleContext(Pointer_controlContext.class,0);
		}
		public Input_variable_formatContext input_variable_format() {
			return getRuleContext(Input_variable_formatContext.class,0);
		}
		public Column_specificationsContext column_specifications() {
			return getRuleContext(Column_specificationsContext.class,0);
		}
		public Identifiers_listContext identifiers_list() {
			return getRuleContext(Identifiers_listContext.class,0);
		}
		public Informat_listContext informat_list() {
			return getRuleContext(Informat_listContext.class,0);
		}
		public Input_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_specificationContext input_specification() throws RecognitionException {
		Input_specificationContext _localctx = new Input_specificationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_specification);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				pointer_control();
				}
				break;
			case ALTER:
			case DATE:
			case DROP:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				input_variable_format();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				column_specifications();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__1);
				setState(105);
				identifiers_list();
				setState(106);
				match(T__2);
				setState(107);
				match(T__1);
				setState(108);
				informat_list();
				setState(109);
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

	public static class Put_specificationContext extends ParserRuleContext {
		public Pointer_controlContext pointer_control() {
			return getRuleContext(Pointer_controlContext.class,0);
		}
		public Put_variable_formatContext put_variable_format() {
			return getRuleContext(Put_variable_formatContext.class,0);
		}
		public Column_specificationsContext column_specifications() {
			return getRuleContext(Column_specificationsContext.class,0);
		}
		public Identifiers_listContext identifiers_list() {
			return getRuleContext(Identifiers_listContext.class,0);
		}
		public Informat_listContext informat_list() {
			return getRuleContext(Informat_listContext.class,0);
		}
		public Put_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPut_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPut_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPut_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Put_specificationContext put_specification() throws RecognitionException {
		Put_specificationContext _localctx = new Put_specificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_put_specification);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				pointer_control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				put_variable_format();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				column_specifications();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(T__1);
				setState(117);
				identifiers_list();
				setState(118);
				match(T__2);
				setState(119);
				match(T__1);
				setState(120);
				informat_list();
				setState(121);
				match(T__2);
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

	public static class Pointer_controlContext extends ParserRuleContext {
		public Line_point_controlContext line_point_control() {
			return getRuleContext(Line_point_controlContext.class,0);
		}
		public Column_point_controlContext column_point_control() {
			return getRuleContext(Column_point_controlContext.class,0);
		}
		public Pointer_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPointer_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPointer_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPointer_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_controlContext pointer_control() throws RecognitionException {
		Pointer_controlContext _localctx = new Pointer_controlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pointer_control);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				line_point_control();
				}
				break;
			case T__7:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				column_point_control();
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

	public static class Informat_listContext extends ParserRuleContext {
		public List<TerminalNode> Informat() { return getTokens(InputStmtParser.Informat); }
		public TerminalNode Informat(int i) {
			return getToken(InputStmtParser.Informat, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InputStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InputStmtParser.COMMA, i);
		}
		public List<Pointer_controlContext> pointer_control() {
			return getRuleContexts(Pointer_controlContext.class);
		}
		public Pointer_controlContext pointer_control(int i) {
			return getRuleContext(Pointer_controlContext.class,i);
		}
		public Informat_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informat_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInformat_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInformat_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInformat_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Informat_listContext informat_list() throws RecognitionException {
		Informat_listContext _localctx = new Informat_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_informat_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				match(Informat);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(130);
					match(COMMA);
					}
				}

				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==AT) {
					{
					setState(133);
					pointer_control();
					}
				}

				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Informat );
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

	public static class Input_variable_formatContext extends ParserRuleContext {
		public Input_variableContext input_variable() {
			return getRuleContext(Input_variableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(InputStmtParser.EQUAL, 0); }
		public Format_modifierContext format_modifier() {
			return getRuleContext(Format_modifierContext.class,0);
		}
		public TerminalNode Informat() { return getToken(InputStmtParser.Informat, 0); }
		public TerminalNode DOLLAR() { return getToken(InputStmtParser.DOLLAR, 0); }
		public Input_variable_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_variable_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_variable_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_variable_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_variable_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_variable_formatContext input_variable_format() throws RecognitionException {
		Input_variable_formatContext _localctx = new Input_variable_formatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_input_variable_format);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				input_variable();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(141);
					match(EQUAL);
					}
				}

				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
					{
					setState(144);
					format_modifier();
					}
				}

				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Informat) {
					{
					setState(147);
					match(Informat);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				input_variable();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(151);
					match(EQUAL);
					}
				}

				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
					{
					setState(154);
					format_modifier();
					}
				}

				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(157);
					match(DOLLAR);
					}
				}

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

	public static class Input_variableContext extends ParserRuleContext {
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public Input_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterInput_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitInput_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitInput_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_variableContext input_variable() throws RecognitionException {
		Input_variableContext _localctx = new Input_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_input_variable);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				variables(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				variables(0);
				setState(164);
				match(T__3);
				setState(165);
				variables(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				variables(0);
				setState(168);
				match(T__4);
				setState(169);
				match(T__5);
				setState(170);
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

	public static class Put_variable_formatContext extends ParserRuleContext {
		public Put_variableContext put_variable() {
			return getRuleContext(Put_variableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(InputStmtParser.EQUAL, 0); }
		public Format_modifierContext format_modifier() {
			return getRuleContext(Format_modifierContext.class,0);
		}
		public TerminalNode Informat() { return getToken(InputStmtParser.Informat, 0); }
		public TerminalNode DOLLAR() { return getToken(InputStmtParser.DOLLAR, 0); }
		public Put_variable_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_variable_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPut_variable_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPut_variable_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPut_variable_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Put_variable_formatContext put_variable_format() throws RecognitionException {
		Put_variable_formatContext _localctx = new Put_variable_formatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_put_variable_format);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				put_variable();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(175);
					match(EQUAL);
					}
				}

				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
					{
					setState(178);
					format_modifier();
					}
				}

				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Informat) {
					{
					setState(181);
					match(Informat);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				put_variable();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(185);
					match(EQUAL);
					}
				}

				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
					{
					setState(188);
					format_modifier();
					}
				}

				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(191);
					match(DOLLAR);
					}
				}

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

	public static class Put_variableContext extends ParserRuleContext {
		public TerminalNode V_INFILE_() { return getToken(InputStmtParser.V_INFILE_, 0); }
		public TerminalNode ARRAY_ALL_ELEMENTS() { return getToken(InputStmtParser.ARRAY_ALL_ELEMENTS, 0); }
		public Input_variableContext input_variable() {
			return getRuleContext(Input_variableContext.class,0);
		}
		public TerminalNode STRINGLITERAL() { return getToken(InputStmtParser.STRINGLITERAL, 0); }
		public TerminalNode INT() { return getToken(InputStmtParser.INT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Put_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterPut_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitPut_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitPut_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Put_variableContext put_variable() throws RecognitionException {
		Put_variableContext _localctx = new Put_variableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_put_variable);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(V_INFILE_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(ARRAY_ALL_ELEMENTS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				input_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(199);
					match(INT);
					setState(200);
					match(T__5);
					}
				}

				setState(203);
				match(STRINGLITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				literal();
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

	public static class Column_point_controlContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(InputStmtParser.AT, 0); }
		public TerminalNode INT() { return getToken(InputStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(InputStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_point_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_point_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterColumn_point_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitColumn_point_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitColumn_point_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_point_controlContext column_point_control() throws RecognitionException {
		Column_point_controlContext _localctx = new Column_point_controlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column_point_control);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(AT);
				setState(208);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(AT);
				setState(210);
				match(FloatingPointLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(AT);
				setState(212);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(AT);
				setState(214);
				match(T__1);
				setState(215);
				expression(0);
				setState(216);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(T__7);
				setState(219);
				match(INT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				match(T__7);
				setState(221);
				match(Identifier);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				match(T__7);
				setState(223);
				match(FloatingPointLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(224);
				match(T__7);
				setState(225);
				match(T__1);
				setState(226);
				expression(0);
				setState(227);
				match(T__2);
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

	public static class Line_point_controlContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(InputStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(InputStmtParser.FloatingPointLiteral, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Line_point_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_point_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterLine_point_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitLine_point_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitLine_point_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_point_controlContext line_point_control() throws RecognitionException {
		Line_point_controlContext _localctx = new Line_point_controlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line_point_control);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__8);
				setState(232);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(T__8);
				setState(234);
				match(FloatingPointLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(T__8);
				setState(236);
				match(T__1);
				setState(237);
				expression(0);
				setState(238);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(T__9);
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

	public static class Format_modifierContext extends ParserRuleContext {
		public Format_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterFormat_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitFormat_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitFormat_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Format_modifierContext format_modifier() throws RecognitionException {
		Format_modifierContext _localctx = new Format_modifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_format_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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

	public static class Column_specificationsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(InputStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InputStmtParser.INT, i);
		}
		public Column_specificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_specifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterColumn_specifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitColumn_specifications(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitColumn_specifications(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_specificationsContext column_specifications() throws RecognitionException {
		Column_specificationsContext _localctx = new Column_specificationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_specifications);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(INT);
			setState(246);
			match(T__3);
			setState(247);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(InputStmtParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(InputStmtParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(InputStmtParser.MAX, 0); }
		public TerminalNode EQ() { return getToken(InputStmtParser.EQ, 0); }
		public TerminalNode NE() { return getToken(InputStmtParser.NE, 0); }
		public TerminalNode GT() { return getToken(InputStmtParser.GT, 0); }
		public TerminalNode LT() { return getToken(InputStmtParser.LT, 0); }
		public TerminalNode GE() { return getToken(InputStmtParser.GE, 0); }
		public TerminalNode LE() { return getToken(InputStmtParser.LE, 0); }
		public TerminalNode EQC() { return getToken(InputStmtParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(InputStmtParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(InputStmtParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(InputStmtParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(InputStmtParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(InputStmtParser.LEC, 0); }
		public TerminalNode AND() { return getToken(InputStmtParser.AND, 0); }
		public TerminalNode OR() { return getToken(InputStmtParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(InputStmtParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(InputStmtParser.IN, 0); }
		public TerminalNode INColon() { return getToken(InputStmtParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
				setState(250);
				literal();
				}
				break;
			case Identifier:
				{
				setState(251);
				match(Identifier);
				}
				break;
			case T__1:
				{
				setState(252);
				match(T__1);
				setState(253);
				expression(0);
				setState(254);
				match(T__2);
				}
				break;
			case T__3:
			case T__7:
				{
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(258);
				match(NOT);
				setState(259);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(263);
						match(T__17);
						setState(264);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(266);
						match(MIN);
						setState(267);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(269);
						match(MAX);
						setState(270);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(272);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__18))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(275);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(276);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281);
						_la = _input.LA(1);
						if ( !(((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (EQ - 206)) | (1L << (NE - 206)) | (1L << (GT - 206)) | (1L << (LT - 206)) | (1L << (GE - 206)) | (1L << (LE - 206)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(284);
						_la = _input.LA(1);
						if ( !(((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (EQC - 213)) | (1L << (NEC - 213)) | (1L << (GTC - 213)) | (1L << (LTC - 213)) | (1L << (GEC - 213)) | (1L << (LEC - 213)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(285);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(287);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(290);
						match(EQUAL);
						setState(291);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(293);
						match(T__1);
						setState(295);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__7) | (1L << T__21))) != 0) || ((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (NOT - 222)) | (1L << (DateLiteral - 222)) | (1L << (TimeLiteral - 222)) | (1L << (DateTimeLiteral - 222)) | (1L << (BitLiteral - 222)) | (1L << (NameLiteral - 222)) | (1L << (HexLiteral - 222)) | (1L << (STRINGLITERAL - 222)) | (1L << (INT - 222)) | (1L << (FloatingPointLiteral - 222)) | (1L << (Identifier - 222)) | (1L << (DOT - 222)))) != 0)) {
							{
							setState(294);
							expressionList(0);
							}
						}

						setState(297);
						match(T__2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(299);
						match(T__4);
						setState(300);
						expression(0);
						setState(301);
						match(T__6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(304);
						match(T__15);
						setState(305);
						expression(0);
						setState(306);
						match(T__16);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(309);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(InputStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InputStmtParser.COMMA, i);
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
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitExpressionList(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__7:
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
				setState(317);
				expression(0);
				}
				break;
			case T__21:
				{
				setState(318);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					match(COMMA);
					setState(324);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__3:
					case T__7:
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
						setState(322);
						expression(0);
						}
						break;
					case T__21:
						{
						setState(323);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(331);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(332);
						match(COMMA);
						}
						}
						setState(335); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(337);
					expressionList(2);
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(InputStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(InputStmtParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InputStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InputStmtParser.COMMA, i);
		}
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(T__21);
				{
				setState(344);
				match(Identifier);
				setState(345);
				match(T__3);
				setState(346);
				match(Identifier);
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(350);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(348);
							match(COMMA);
							setState(349);
							match(T__21);
							}
						}

						{
						setState(352);
						match(Identifier);
						setState(353);
						match(T__3);
						setState(354);
						match(Identifier);
						}
						}
						} 
					}
					setState(359);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(T__21);
				setState(361);
				match(Identifier);
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362);
						match(Identifier);
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(T__21);
				setState(369);
				match(Identifier);
				setState(370);
				match(T__15);
				setState(371);
				match(T__5);
				setState(372);
				match(T__16);
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
		public List<TerminalNode> Identifier() { return getTokens(InputStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(InputStmtParser.Identifier, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(375);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(376);
					match(Identifier);
					setState(377);
					match(T__3);
					setState(378);
					match(Identifier);
					}
					break;
				}
				}
				setState(381); 
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
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(InputStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InputStmtParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_in_var_list);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(Identifier);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(T__1);
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(385);
					literal();
					}
					break;
				case 2:
					{
					setState(386);
					colonInts();
					}
					break;
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(389);
					match(COMMA);
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(390);
						literal();
						}
						break;
					case 2:
						{
						setState(391);
						colonInts();
						}
						break;
					}
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
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
		public List<TerminalNode> INT() { return getTokens(InputStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InputStmtParser.INT, i);
		}
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(INT);
			setState(404);
			match(T__13);
			setState(405);
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
		public TerminalNode INT() { return getToken(InputStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(InputStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(InputStmtParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(InputStmtParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(InputStmtParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(InputStmtParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(InputStmtParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(InputStmtParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(InputStmtParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(InputStmtParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !(((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DateLiteral - 225)) | (1L << (TimeLiteral - 225)) | (1L << (DateTimeLiteral - 225)) | (1L << (BitLiteral - 225)) | (1L << (NameLiteral - 225)) | (1L << (HexLiteral - 225)) | (1L << (STRINGLITERAL - 225)) | (1L << (INT - 225)) | (1L << (FloatingPointLiteral - 225)) | (1L << (DOT - 225)))) != 0)) ) {
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
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(InputStmtParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(InputStmtParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(InputStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(InputStmtParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitVariables(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(410);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(411);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(412);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(413);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(416);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(417);
						match(DOT);
						setState(418);
						variables(7);
						}
						break;
					case 2:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(419);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(420);
						match(T__3);
						setState(421);
						variables(6);
						}
						break;
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		public TerminalNode STRINGLITERAL() { return getToken(InputStmtParser.STRINGLITERAL, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		public TerminalNode STRINGLITERAL() { return getToken(InputStmtParser.STRINGLITERAL, 0); }
		public TablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterTablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitTablename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitTablename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablenameContext tablename() throws RecognitionException {
		TablenameContext _localctx = new TablenameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		public TerminalNode STRINGLITERAL() { return getToken(InputStmtParser.STRINGLITERAL, 0); }
		public TerminalNode Identifier() { return getToken(InputStmtParser.Identifier, 0); }
		public TerminalNode CARDS() { return getToken(InputStmtParser.CARDS, 0); }
		public TerminalNode CARDS4() { return getToken(InputStmtParser.CARDS4, 0); }
		public TerminalNode DATALINES() { return getToken(InputStmtParser.DATALINES, 0); }
		public TerminalNode DATALINES4() { return getToken(InputStmtParser.DATALINES4, 0); }
		public File_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).enterFile_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputStmtListener ) ((InputStmtListener)listener).exitFile_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InputStmtVisitor ) return ((InputStmtVisitor<? extends T>)visitor).visitFile_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_specificationContext file_specification() throws RecognitionException {
		File_specificationContext _localctx = new File_specificationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_file_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (DATALINES - 138)) | (1L << (CARDS - 138)) | (1L << (DATALINES4 - 138)) | (1L << (CARDS4 - 138)))) != 0) || _la==STRINGLITERAL || _la==Identifier) ) {
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 22:
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
		"\u0004\u0001\u00f4\u01b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0005\u0000=\b"+
		"\u0000\n\u0000\f\u0000@\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0001\u0003"+
		"\u0001L\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Q\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002W\b\u0002"+
		"\n\u0002\f\u0002Z\t\u0002\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002b\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003p\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004|\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0080\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0084\b\u0006\u0001\u0006\u0003\u0006\u0087\b\u0006\u0004"+
		"\u0006\u0089\b\u0006\u000b\u0006\f\u0006\u008a\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u008f\b\u0007\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001"+
		"\u0007\u0003\u0007\u0095\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0099"+
		"\b\u0007\u0001\u0007\u0003\u0007\u009c\b\u0007\u0001\u0007\u0003\u0007"+
		"\u009f\b\u0007\u0003\u0007\u00a1\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ad\b\b\u0001"+
		"\t\u0001\t\u0003\t\u00b1\b\t\u0001\t\u0003\t\u00b4\b\t\u0001\t\u0003\t"+
		"\u00b7\b\t\u0001\t\u0001\t\u0003\t\u00bb\b\t\u0001\t\u0003\t\u00be\b\t"+
		"\u0001\t\u0003\t\u00c1\b\t\u0003\t\u00c3\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00ca\b\n\u0001\n\u0001\n\u0003\n\u00ce\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e6\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00f2\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0105\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0128\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0138\b\u000f\n\u000f"+
		"\f\u000f\u013b\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0140\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0145\b"+
		"\u0010\u0005\u0010\u0147\b\u0010\n\u0010\f\u0010\u014a\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u014e\b\u0010\u000b\u0010\f\u0010\u014f\u0001"+
		"\u0010\u0005\u0010\u0153\b\u0010\n\u0010\f\u0010\u0156\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u015f\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0164\b\u0011\n\u0011\f\u0011\u0167\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u016c\b\u0011\n\u0011\f\u0011\u016f\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0176\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u017c\b\u0012"+
		"\u000b\u0012\f\u0012\u017d\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0184\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0189\b\u0013\u0005\u0013\u018b\b\u0013\n\u0013\f\u0013\u018e\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0192\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u019f\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u01a7\b\u0016\n\u0016\f\u0016\u01aa\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0003\u001e"+
		" ,\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468\u0000\n\u0001\u0000\u000b\u000f\u0002"+
		"\u0000\u0004\u0004\b\b\u0003\u0000\u0006\u0006\n\n\u0013\u0013\u0001\u0000"+
		"\u0014\u0015\u0001\u0000\u00ce\u00d3\u0001\u0000\u00d5\u00da\u0001\u0000"+
		"\u00dc\u00dd\u0002\u0000\u00d4\u00d4\u00db\u00db\u0002\u0000\u00e1\u00e9"+
		"\u00ec\u00ec\u0004\u0000\u008a\u008b\u008d\u008e\u00e7\u00e7\u00ea\u00ea"+
		"\u01f5\u0000>\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004"+
		"T\u0001\u0000\u0000\u0000\u0006o\u0001\u0000\u0000\u0000\b{\u0001\u0000"+
		"\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000\u0000"+
		"\u0000\u000e\u00a0\u0001\u0000\u0000\u0000\u0010\u00ac\u0001\u0000\u0000"+
		"\u0000\u0012\u00c2\u0001\u0000\u0000\u0000\u0014\u00cd\u0001\u0000\u0000"+
		"\u0000\u0016\u00e5\u0001\u0000\u0000\u0000\u0018\u00f1\u0001\u0000\u0000"+
		"\u0000\u001a\u00f3\u0001\u0000\u0000\u0000\u001c\u00f5\u0001\u0000\u0000"+
		"\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u013c\u0001\u0000\u0000\u0000"+
		"\"\u0175\u0001\u0000\u0000\u0000$\u017b\u0001\u0000\u0000\u0000&\u0191"+
		"\u0001\u0000\u0000\u0000(\u0193\u0001\u0000\u0000\u0000*\u0197\u0001\u0000"+
		"\u0000\u0000,\u019e\u0001\u0000\u0000\u0000.\u01ab\u0001\u0000\u0000\u0000"+
		"0\u01ad\u0001\u0000\u0000\u00002\u01af\u0001\u0000\u0000\u00004\u01b1"+
		"\u0001\u0000\u0000\u00006\u01b3\u0001\u0000\u0000\u00008\u01b5\u0001\u0000"+
		"\u0000\u0000:=\u0003\u0002\u0001\u0000;=\u0003\u0004\u0002\u0000<:\u0001"+
		"\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001"+
		"\u0000\u0000\u0000CG\u0005O\u0000\u0000DF\u0003\u0006\u0003\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JL\u0005\u00a8\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LP\u0001\u0000\u0000\u0000MQ\u0005\u00ed\u0000\u0000NO\u0005"+
		"\u00ed\u0000\u0000OQ\u0005\u00ed\u0000\u0000PM\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0005\u0001\u0000\u0000S\u0003\u0001\u0000\u0000\u0000TX\u0005"+
		"P\u0000\u0000UW\u0003\b\u0004\u0000VU\u0001\u0000\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0005\u00a8\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]a\u0001\u0000"+
		"\u0000\u0000^b\u0005\u00ed\u0000\u0000_`\u0005\u00ed\u0000\u0000`b\u0005"+
		"\u00ed\u0000\u0000a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0001\u0000"+
		"\u0000d\u0005\u0001\u0000\u0000\u0000ep\u0003\n\u0005\u0000fp\u0003\u000e"+
		"\u0007\u0000gp\u0003\u001c\u000e\u0000hi\u0005\u0002\u0000\u0000ij\u0003"+
		"$\u0012\u0000jk\u0005\u0003\u0000\u0000kl\u0005\u0002\u0000\u0000lm\u0003"+
		"\f\u0006\u0000mn\u0005\u0003\u0000\u0000np\u0001\u0000\u0000\u0000oe\u0001"+
		"\u0000\u0000\u0000of\u0001\u0000\u0000\u0000og\u0001\u0000\u0000\u0000"+
		"oh\u0001\u0000\u0000\u0000p\u0007\u0001\u0000\u0000\u0000q|\u0003\n\u0005"+
		"\u0000r|\u0003\u0012\t\u0000s|\u0003\u001c\u000e\u0000tu\u0005\u0002\u0000"+
		"\u0000uv\u0003$\u0012\u0000vw\u0005\u0003\u0000\u0000wx\u0005\u0002\u0000"+
		"\u0000xy\u0003\f\u0006\u0000yz\u0005\u0003\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{q\u0001\u0000\u0000\u0000{r\u0001\u0000\u0000\u0000{s\u0001\u0000"+
		"\u0000\u0000{t\u0001\u0000\u0000\u0000|\t\u0001\u0000\u0000\u0000}\u0080"+
		"\u0003\u0018\f\u0000~\u0080\u0003\u0016\u000b\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000b\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0005\u00cc\u0000\u0000\u0082\u0084\u0005\u00ef\u0000"+
		"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0087\u0003\n\u0005\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0003\u0010\b\u0000\u008d\u008f\u0005\u00ee\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u001a\r\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0005\u00cc\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u00a1\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0003\u0010\b\u0000\u0097\u0099\u0005\u00ee"+
		"\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u009c\u0003\u001a"+
		"\r\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u00cd\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u008c\u0001\u0000\u0000"+
		"\u0000\u00a0\u0096\u0001\u0000\u0000\u0000\u00a1\u000f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00ad\u0003,\u0016\u0000\u00a3\u00a4\u0003,\u0016\u0000\u00a4"+
		"\u00a5\u0005\u0004\u0000\u0000\u00a5\u00a6\u0003,\u0016\u0000\u00a6\u00ad"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003,\u0016\u0000\u00a8\u00a9\u0005"+
		"\u0005\u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0007\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a2\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003"+
		"\u0014\n\u0000\u00af\u00b1\u0005\u00ee\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0003\u001a\r\u0000\u00b3\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0005\u00cc\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00c3\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0003\u0014\n\u0000\u00b9\u00bb\u0005\u00ee\u0000\u0000"+
		"\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00be\u0003\u001a\r\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005\u00cd\u0000\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c2\u00ae\u0001\u0000\u0000\u0000\u00c2"+
		"\u00b8\u0001\u0000\u0000\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4"+
		"\u00ce\u0005\u00a7\u0000\u0000\u00c5\u00ce\u0005{\u0000\u0000\u00c6\u00ce"+
		"\u0003\u0010\b\u0000\u00c7\u00c8\u0005\u00e8\u0000\u0000\u00c8\u00ca\u0005"+
		"\u0006\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00ce\u0005"+
		"\u00e7\u0000\u0000\u00cc\u00ce\u0003*\u0015\u0000\u00cd\u00c4\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u0015\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u00ed"+
		"\u0000\u0000\u00d0\u00e6\u0005\u00e8\u0000\u0000\u00d1\u00d2\u0005\u00ed"+
		"\u0000\u0000\u00d2\u00e6\u0005\u00e9\u0000\u0000\u00d3\u00d4\u0005\u00ed"+
		"\u0000\u0000\u00d4\u00e6\u0005\u00ea\u0000\u0000\u00d5\u00d6\u0005\u00ed"+
		"\u0000\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000\u00d7\u00d8\u0003\u001e"+
		"\u000f\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u00e6\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\b\u0000\u0000\u00db\u00e6\u0005\u00e8\u0000"+
		"\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd\u00e6\u0005\u00ea\u0000\u0000"+
		"\u00de\u00df\u0005\b\u0000\u0000\u00df\u00e6\u0005\u00e9\u0000\u0000\u00e0"+
		"\u00e1\u0005\b\u0000\u0000\u00e1\u00e2\u0005\u0002\u0000\u0000\u00e2\u00e3"+
		"\u0003\u001e\u000f\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e5\u00cf\u0001\u0000\u0000\u0000\u00e5\u00d1"+
		"\u0001\u0000\u0000\u0000\u00e5\u00d3\u0001\u0000\u0000\u0000\u00e5\u00d5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00da\u0001\u0000\u0000\u0000\u00e5\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e5\u00de\u0001\u0000\u0000\u0000\u00e5\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e6\u0017\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005\t\u0000\u0000\u00e8\u00f2\u0005\u00e8\u0000\u0000\u00e9\u00ea\u0005"+
		"\t\u0000\u0000\u00ea\u00f2\u0005\u00e9\u0000\u0000\u00eb\u00ec\u0005\t"+
		"\u0000\u0000\u00ec\u00ed\u0005\u0002\u0000\u0000\u00ed\u00ee\u0003\u001e"+
		"\u000f\u0000\u00ee\u00ef\u0005\u0003\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f2\u0005\n\u0000\u0000\u00f1\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u0019\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0007\u0000\u0000\u0000\u00f4\u001b\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0005\u00e8\u0000\u0000\u00f6\u00f7\u0005\u0004\u0000"+
		"\u0000\u00f7\u00f8\u0005\u00e8\u0000\u0000\u00f8\u001d\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0006\u000f\uffff\uffff\u0000\u00fa\u0105\u0003*\u0015"+
		"\u0000\u00fb\u0105\u0005\u00ea\u0000\u0000\u00fc\u00fd\u0005\u0002\u0000"+
		"\u0000\u00fd\u00fe\u0003\u001e\u000f\u0000\u00fe\u00ff\u0005\u0003\u0000"+
		"\u0000\u00ff\u0105\u0001\u0000\u0000\u0000\u0100\u0101\u0007\u0001\u0000"+
		"\u0000\u0101\u0105\u0003\u001e\u000f\f\u0102\u0103\u0005\u00de\u0000\u0000"+
		"\u0103\u0105\u0003\u001e\u000f\u000b\u0104\u00f9\u0001\u0000\u0000\u0000"+
		"\u0104\u00fb\u0001\u0000\u0000\u0000\u0104\u00fc\u0001\u0000\u0000\u0000"+
		"\u0104\u0100\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0139\u0001\u0000\u0000\u0000\u0106\u0107\n\r\u0000\u0000\u0107"+
		"\u0108\u0005\u0012\u0000\u0000\u0108\u0138\u0003\u001e\u000f\r\u0109\u010a"+
		"\n\n\u0000\u0000\u010a\u010b\u0005\u00df\u0000\u0000\u010b\u0138\u0003"+
		"\u001e\u000f\u000b\u010c\u010d\n\t\u0000\u0000\u010d\u010e\u0005\u00e0"+
		"\u0000\u0000\u010e\u0138\u0003\u001e\u000f\n\u010f\u0110\n\b\u0000\u0000"+
		"\u0110\u0111\u0007\u0002\u0000\u0000\u0111\u0138\u0003\u001e\u000f\t\u0112"+
		"\u0113\n\u0007\u0000\u0000\u0113\u0114\u0007\u0001\u0000\u0000\u0114\u0138"+
		"\u0003\u001e\u000f\b\u0115\u0116\n\u0006\u0000\u0000\u0116\u0117\u0007"+
		"\u0003\u0000\u0000\u0117\u0138\u0003\u001e\u000f\u0007\u0118\u0119\n\u0005"+
		"\u0000\u0000\u0119\u011a\u0007\u0004\u0000\u0000\u011a\u0138\u0003\u001e"+
		"\u000f\u0006\u011b\u011c\n\u0004\u0000\u0000\u011c\u011d\u0007\u0005\u0000"+
		"\u0000\u011d\u0138\u0003\u001e\u000f\u0005\u011e\u011f\n\u0002\u0000\u0000"+
		"\u011f\u0120\u0007\u0006\u0000\u0000\u0120\u0138\u0003\u001e\u000f\u0003"+
		"\u0121\u0122\n\u0001\u0000\u0000\u0122\u0123\u0005\u00ee\u0000\u0000\u0123"+
		"\u0138\u0003\u001e\u000f\u0001\u0124\u0125\n\u0010\u0000\u0000\u0125\u0127"+
		"\u0005\u0002\u0000\u0000\u0126\u0128\u0003 \u0010\u0000\u0127\u0126\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u0138\u0005\u0003\u0000\u0000\u012a\u012b\n\u000f"+
		"\u0000\u0000\u012b\u012c\u0005\u0005\u0000\u0000\u012c\u012d\u0003\u001e"+
		"\u000f\u0000\u012d\u012e\u0005\u0007\u0000\u0000\u012e\u0138\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\n\u000e\u0000\u0000\u0130\u0131\u0005\u0010\u0000"+
		"\u0000\u0131\u0132\u0003\u001e\u000f\u0000\u0132\u0133\u0005\u0011\u0000"+
		"\u0000\u0133\u0138\u0001\u0000\u0000\u0000\u0134\u0135\n\u0003\u0000\u0000"+
		"\u0135\u0136\u0007\u0007\u0000\u0000\u0136\u0138\u0003&\u0013\u0000\u0137"+
		"\u0106\u0001\u0000\u0000\u0000\u0137\u0109\u0001\u0000\u0000\u0000\u0137"+
		"\u010c\u0001\u0000\u0000\u0000\u0137\u010f\u0001\u0000\u0000\u0000\u0137"+
		"\u0112\u0001\u0000\u0000\u0000\u0137\u0115\u0001\u0000\u0000\u0000\u0137"+
		"\u0118\u0001\u0000\u0000\u0000\u0137\u011b\u0001\u0000\u0000\u0000\u0137"+
		"\u011e\u0001\u0000\u0000\u0000\u0137\u0121\u0001\u0000\u0000\u0000\u0137"+
		"\u0124\u0001\u0000\u0000\u0000\u0137\u012a\u0001\u0000\u0000\u0000\u0137"+
		"\u012f\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u001f\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0006\u0010\uffff\uffff\u0000"+
		"\u013d\u0140\u0003\u001e\u000f\u0000\u013e\u0140\u0003\"\u0011\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140"+
		"\u0148\u0001\u0000\u0000\u0000\u0141\u0144\u0005\u00ef\u0000\u0000\u0142"+
		"\u0145\u0003\u001e\u000f\u0000\u0143\u0145\u0003\"\u0011\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0147"+
		"\u0001\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0147\u014a"+
		"\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u0154\u0001\u0000\u0000\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014b\u014d\n\u0001\u0000\u0000\u014c\u014e\u0005"+
		"\u00ef\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0003"+
		" \u0010\u0002\u0152\u014b\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155!\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005\u0016\u0000\u0000\u0158\u0159\u0005\u00ea\u0000"+
		"\u0000\u0159\u015a\u0005\u0004\u0000\u0000\u015a\u015b\u0005\u00ea\u0000"+
		"\u0000\u015b\u0165\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u00ef\u0000"+
		"\u0000\u015d\u015f\u0005\u0016\u0000\u0000\u015e\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0005\u00ea\u0000\u0000\u0161\u0162\u0005\u0004\u0000"+
		"\u0000\u0162\u0164\u0005\u00ea\u0000\u0000\u0163\u015e\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0176\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0016\u0000"+
		"\u0000\u0169\u016d\u0005\u00ea\u0000\u0000\u016a\u016c\u0005\u00ea\u0000"+
		"\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u0176\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005\u0016\u0000\u0000\u0171\u0172\u0005\u00ea\u0000"+
		"\u0000\u0172\u0173\u0005\u0010\u0000\u0000\u0173\u0174\u0005\u0006\u0000"+
		"\u0000\u0174\u0176\u0005\u0011\u0000\u0000\u0175\u0157\u0001\u0000\u0000"+
		"\u0000\u0175\u0168\u0001\u0000\u0000\u0000\u0175\u0170\u0001\u0000\u0000"+
		"\u0000\u0176#\u0001\u0000\u0000\u0000\u0177\u017c\u0005\u00ea\u0000\u0000"+
		"\u0178\u0179\u0005\u00ea\u0000\u0000\u0179\u017a\u0005\u0004\u0000\u0000"+
		"\u017a\u017c\u0005\u00ea\u0000\u0000\u017b\u0177\u0001\u0000\u0000\u0000"+
		"\u017b\u0178\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e%\u0001\u0000\u0000\u0000\u017f\u0192\u0005\u00ea\u0000\u0000\u0180"+
		"\u0183\u0005\u0002\u0000\u0000\u0181\u0184\u0003*\u0015\u0000\u0182\u0184"+
		"\u0003(\u0014\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0182\u0001"+
		"\u0000\u0000\u0000\u0184\u018c\u0001\u0000\u0000\u0000\u0185\u0188\u0005"+
		"\u00ef\u0000\u0000\u0186\u0189\u0003*\u0015\u0000\u0187\u0189\u0003(\u0014"+
		"\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0187\u0001\u0000\u0000"+
		"\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u0185\u0001\u0000\u0000"+
		"\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000"+
		"\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0003\u0000"+
		"\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u017f\u0001\u0000\u0000"+
		"\u0000\u0191\u0180\u0001\u0000\u0000\u0000\u0192\'\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0005\u00e8\u0000\u0000\u0194\u0195\u0005\u000e\u0000\u0000"+
		"\u0195\u0196\u0005\u00e8\u0000\u0000\u0196)\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0007\b\u0000\u0000\u0198+\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0006\u0016\uffff\uffff\u0000\u019a\u019f\u0005\u00ea\u0000\u0000\u019b"+
		"\u019f\u0005\u00a9\u0000\u0000\u019c\u019f\u0005\u0091\u0000\u0000\u019d"+
		"\u019f\u0005\u00ae\u0000\u0000\u019e\u0199\u0001\u0000\u0000\u0000\u019e"+
		"\u019b\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u01a8\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\n\u0006\u0000\u0000\u01a1\u01a2\u0005\u00ec\u0000\u0000\u01a2\u01a7"+
		"\u0003,\u0016\u0007\u01a3\u01a4\n\u0005\u0000\u0000\u01a4\u01a5\u0005"+
		"\u0004\u0000\u0000\u01a5\u01a7\u0003,\u0016\u0006\u01a6\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a3\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a9-\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0005\u00ea\u0000\u0000\u01ac/\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0005\u00ea\u0000\u0000\u01ae1\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0005\u00ea\u0000\u0000\u01b03\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0005\u00e7\u0000\u0000\u01b25\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005"+
		"\u00e7\u0000\u0000\u01b47\u0001\u0000\u0000\u0000\u01b5\u01b6\u0007\t"+
		"\u0000\u0000\u01b69\u0001\u0000\u0000\u00007<>GKPX\\ao{\u007f\u0083\u0086"+
		"\u008a\u008e\u0091\u0094\u0098\u009b\u009e\u00a0\u00ac\u00b0\u00b3\u00b6"+
		"\u00ba\u00bd\u00c0\u00c2\u00c9\u00cd\u00e5\u00f1\u0104\u0127\u0137\u0139"+
		"\u013f\u0144\u0148\u014f\u0154\u015e\u0165\u016d\u0175\u017b\u017d\u0183"+
		"\u0188\u018c\u0191\u019e\u01a6\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}