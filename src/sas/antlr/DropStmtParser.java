// Generated from /home/david/IdeaProjects/SASparser/sas-grammar-master/DropStmt.g4 by ANTLR 4.10.1
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
public class DropStmtParser extends Parser {
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
		RULE_drop_main = 0, RULE_drop_stmt = 1, RULE_expression = 2, RULE_expressionList = 3, 
		RULE_of_var_list = 4, RULE_identifiers_list = 5, RULE_in_var_list = 6, 
		RULE_colonInts = 7, RULE_literal = 8, RULE_variables = 9, RULE_variable = 10, 
		RULE_request = 11, RULE_list = 12, RULE_filename = 13, RULE_tablename = 14, 
		RULE_file_specification = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"drop_main", "drop_stmt", "expression", "expressionList", "of_var_list", 
			"identifiers_list", "in_var_list", "colonInts", "literal", "variables", 
			"variable", "request", "list", "filename", "tablename", "file_specification"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'**'", 
			"'+'", "'*'", "'/'", "'%'", "'||'", "'!!'", "'of'", "':'", null, null, 
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
	public String getGrammarFileName() { return "DropStmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DropStmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Drop_mainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DropStmtParser.EOF, 0); }
		public List<Drop_stmtContext> drop_stmt() {
			return getRuleContexts(Drop_stmtContext.class);
		}
		public Drop_stmtContext drop_stmt(int i) {
			return getRuleContext(Drop_stmtContext.class,i);
		}
		public Drop_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterDrop_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitDrop_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitDrop_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_mainContext drop_main() throws RecognitionException {
		Drop_mainContext _localctx = new Drop_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_drop_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DROP) {
				{
				{
				setState(32);
				drop_stmt();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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

	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(DropStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(DROP);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(41);
					variables(0);
					}
					break;
				case 2:
					{
					setState(42);
					variables(0);
					setState(43);
					match(T__0);
					setState(44);
					variables(0);
					}
					break;
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (ALTER - 140)) | (1L << (DATE - 140)) | (1L << (DROP - 140)))) != 0) || _la==Identifier );
			setState(50);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DropStmtParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DropStmtParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(DropStmtParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(DropStmtParser.MAX, 0); }
		public TerminalNode EQ() { return getToken(DropStmtParser.EQ, 0); }
		public TerminalNode NE() { return getToken(DropStmtParser.NE, 0); }
		public TerminalNode GT() { return getToken(DropStmtParser.GT, 0); }
		public TerminalNode LT() { return getToken(DropStmtParser.LT, 0); }
		public TerminalNode GE() { return getToken(DropStmtParser.GE, 0); }
		public TerminalNode LE() { return getToken(DropStmtParser.LE, 0); }
		public TerminalNode EQC() { return getToken(DropStmtParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(DropStmtParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(DropStmtParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(DropStmtParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(DropStmtParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(DropStmtParser.LEC, 0); }
		public TerminalNode AND() { return getToken(DropStmtParser.AND, 0); }
		public TerminalNode OR() { return getToken(DropStmtParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(DropStmtParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(DropStmtParser.IN, 0); }
		public TerminalNode INColon() { return getToken(DropStmtParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
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
				setState(53);
				literal();
				}
				break;
			case Identifier:
				{
				setState(54);
				match(Identifier);
				}
				break;
			case T__2:
				{
				setState(55);
				match(T__2);
				setState(56);
				expression(0);
				setState(57);
				match(T__3);
				}
				break;
			case T__0:
			case T__9:
				{
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(61);
				match(NOT);
				setState(62);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(66);
						match(T__8);
						setState(67);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(69);
						match(MIN);
						setState(70);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(72);
						match(MAX);
						setState(73);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(75);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(76);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(78);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(81);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(84);
						_la = _input.LA(1);
						if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (EQ - 201)) | (1L << (NE - 201)) | (1L << (GT - 201)) | (1L << (LT - 201)) | (1L << (GE - 201)) | (1L << (LE - 201)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(87);
						_la = _input.LA(1);
						if ( !(((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (EQC - 208)) | (1L << (NEC - 208)) | (1L << (GTC - 208)) | (1L << (LTC - 208)) | (1L << (GEC - 208)) | (1L << (LEC - 208)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(93);
						match(EQUAL);
						setState(94);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(96);
						match(T__2);
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__9) | (1L << T__15))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NOT - 217)) | (1L << (DateLiteral - 217)) | (1L << (TimeLiteral - 217)) | (1L << (DateTimeLiteral - 217)) | (1L << (BitLiteral - 217)) | (1L << (NameLiteral - 217)) | (1L << (HexLiteral - 217)) | (1L << (STRINGLITERAL - 217)) | (1L << (INT - 217)) | (1L << (FloatingPointLiteral - 217)) | (1L << (Identifier - 217)) | (1L << (DOT - 217)))) != 0)) {
							{
							setState(97);
							expressionList(0);
							}
						}

						setState(100);
						match(T__3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(102);
						match(T__4);
						setState(103);
						expression(0);
						setState(104);
						match(T__5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(107);
						match(T__6);
						setState(108);
						expression(0);
						setState(109);
						match(T__7);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(DropStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DropStmtParser.COMMA, i);
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
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitExpressionList(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
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
				setState(120);
				expression(0);
				}
				break;
			case T__15:
				{
				setState(121);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(COMMA);
					setState(127);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__2:
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
						setState(125);
						expression(0);
						}
						break;
					case T__15:
						{
						setState(126);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(134);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(135);
						match(COMMA);
						}
						}
						setState(138); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(140);
					expressionList(2);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(DropStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DropStmtParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DropStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DropStmtParser.COMMA, i);
		}
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__15);
				{
				setState(147);
				match(Identifier);
				setState(148);
				match(T__0);
				setState(149);
				match(Identifier);
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(151);
							match(COMMA);
							setState(152);
							match(T__15);
							}
						}

						{
						setState(155);
						match(Identifier);
						setState(156);
						match(T__0);
						setState(157);
						match(Identifier);
						}
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__15);
				setState(164);
				match(Identifier);
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						match(Identifier);
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(T__15);
				setState(172);
				match(Identifier);
				setState(173);
				match(T__6);
				setState(174);
				match(T__10);
				setState(175);
				match(T__7);
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
		public List<TerminalNode> Identifier() { return getTokens(DropStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DropStmtParser.Identifier, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(178);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(179);
					match(Identifier);
					setState(180);
					match(T__0);
					setState(181);
					match(Identifier);
					}
					break;
				}
				}
				setState(184); 
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
		public TerminalNode Identifier() { return getToken(DropStmtParser.Identifier, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(DropStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DropStmtParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_in_var_list);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(Identifier);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__2);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(188);
					literal();
					}
					break;
				case 2:
					{
					setState(189);
					colonInts();
					}
					break;
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(192);
					match(COMMA);
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(193);
						literal();
						}
						break;
					case 2:
						{
						setState(194);
						colonInts();
						}
						break;
					}
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(T__3);
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
		public List<TerminalNode> INT() { return getTokens(DropStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DropStmtParser.INT, i);
		}
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(INT);
			setState(207);
			match(T__16);
			setState(208);
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
		public TerminalNode INT() { return getToken(DropStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(DropStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(DropStmtParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(DropStmtParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(DropStmtParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(DropStmtParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(DropStmtParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(DropStmtParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(DropStmtParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(DropStmtParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		public TerminalNode Identifier() { return getToken(DropStmtParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(DropStmtParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(DropStmtParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(DropStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DropStmtParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitVariables(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(213);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(214);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(215);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(216);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(219);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(220);
						match(DOT);
						setState(221);
						variables(7);
						}
						break;
					case 2:
						{
						_localctx = new VariablesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variables);
						setState(222);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(223);
						match(T__0);
						setState(224);
						variables(6);
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public TerminalNode Identifier() { return getToken(DropStmtParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		public TerminalNode Identifier() { return getToken(DropStmtParser.Identifier, 0); }
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		public TerminalNode Identifier() { return getToken(DropStmtParser.Identifier, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		public TerminalNode STRINGLITERAL() { return getToken(DropStmtParser.STRINGLITERAL, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		public TerminalNode STRINGLITERAL() { return getToken(DropStmtParser.STRINGLITERAL, 0); }
		public TablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterTablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitTablename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitTablename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablenameContext tablename() throws RecognitionException {
		TablenameContext _localctx = new TablenameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		public TerminalNode STRINGLITERAL() { return getToken(DropStmtParser.STRINGLITERAL, 0); }
		public TerminalNode Identifier() { return getToken(DropStmtParser.Identifier, 0); }
		public TerminalNode CARDS() { return getToken(DropStmtParser.CARDS, 0); }
		public TerminalNode CARDS4() { return getToken(DropStmtParser.CARDS4, 0); }
		public TerminalNode DATALINES() { return getToken(DropStmtParser.DATALINES, 0); }
		public TerminalNode DATALINES4() { return getToken(DropStmtParser.DATALINES4, 0); }
		public File_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).enterFile_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DropStmtListener ) ((DropStmtListener)listener).exitFile_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DropStmtVisitor ) return ((DropStmtVisitor<? extends T>)visitor).visitFile_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_specificationContext file_specification() throws RecognitionException {
		File_specificationContext _localctx = new File_specificationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_file_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 3:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 9:
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
		"\u0004\u0001\u00ef\u00f3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001/\b\u0001\u000b\u0001\f\u00010\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002@\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"c\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002s\b\u0002\n\u0002\f\u0002"+
		"v\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003{\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0080\b\u0003\u0005\u0003\u0082"+
		"\b\u0003\n\u0003\f\u0003\u0085\t\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"\u0089\b\u0003\u000b\u0003\f\u0003\u008a\u0001\u0003\u0005\u0003\u008e"+
		"\b\u0003\n\u0003\f\u0003\u0091\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009a\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009f\b\u0004\n\u0004"+
		"\f\u0004\u00a2\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00a7\b\u0004\n\u0004\f\u0004\u00aa\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b1\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00b7\b\u0005\u000b\u0005\f"+
		"\u0005\u00b8\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00bf\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c4\b"+
		"\u0006\u0005\u0006\u00c6\b\u0006\n\u0006\f\u0006\u00c9\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00cd\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00da\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e2"+
		"\b\t\n\t\f\t\u00e5\t\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0003\u0004\u0006\u0012\u0010\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\t\u0002"+
		"\u0000\u0001\u0001\n\n\u0001\u0000\u000b\r\u0001\u0000\u000e\u000f\u0001"+
		"\u0000\u00c9\u00ce\u0001\u0000\u00d0\u00d5\u0001\u0000\u00d7\u00d8\u0002"+
		"\u0000\u00cf\u00cf\u00d6\u00d6\u0002\u0000\u00dc\u00e4\u00e7\u00e7\u0004"+
		"\u0000\u0085\u0086\u0088\u0089\u00e2\u00e2\u00e5\u00e5\u010d\u0000#\u0001"+
		"\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000"+
		"\u0000\u0006w\u0001\u0000\u0000\u0000\b\u00b0\u0001\u0000\u0000\u0000"+
		"\n\u00b6\u0001\u0000\u0000\u0000\f\u00cc\u0001\u0000\u0000\u0000\u000e"+
		"\u00ce\u0001\u0000\u0000\u0000\u0010\u00d2\u0001\u0000\u0000\u0000\u0012"+
		"\u00d9\u0001\u0000\u0000\u0000\u0014\u00e6\u0001\u0000\u0000\u0000\u0016"+
		"\u00e8\u0001\u0000\u0000\u0000\u0018\u00ea\u0001\u0000\u0000\u0000\u001a"+
		"\u00ec\u0001\u0000\u0000\u0000\u001c\u00ee\u0001\u0000\u0000\u0000\u001e"+
		"\u00f0\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000(.\u0005\u00a9"+
		"\u0000\u0000)/\u0003\u0012\t\u0000*+\u0003\u0012\t\u0000+,\u0005\u0001"+
		"\u0000\u0000,-\u0003\u0012\t\u0000-/\u0001\u0000\u0000\u0000.)\u0001\u0000"+
		"\u0000\u0000.*\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"23\u0005\u0002\u0000\u00003\u0003\u0001\u0000\u0000\u000045\u0006\u0002"+
		"\uffff\uffff\u00005@\u0003\u0010\b\u00006@\u0005\u00e5\u0000\u000078\u0005"+
		"\u0003\u0000\u000089\u0003\u0004\u0002\u00009:\u0005\u0004\u0000\u0000"+
		":@\u0001\u0000\u0000\u0000;<\u0007\u0000\u0000\u0000<@\u0003\u0004\u0002"+
		"\f=>\u0005\u00d9\u0000\u0000>@\u0003\u0004\u0002\u000b?4\u0001\u0000\u0000"+
		"\u0000?6\u0001\u0000\u0000\u0000?7\u0001\u0000\u0000\u0000?;\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@t\u0001\u0000\u0000\u0000AB\n\r"+
		"\u0000\u0000BC\u0005\t\u0000\u0000Cs\u0003\u0004\u0002\rDE\n\n\u0000\u0000"+
		"EF\u0005\u00da\u0000\u0000Fs\u0003\u0004\u0002\u000bGH\n\t\u0000\u0000"+
		"HI\u0005\u00db\u0000\u0000Is\u0003\u0004\u0002\nJK\n\b\u0000\u0000KL\u0007"+
		"\u0001\u0000\u0000Ls\u0003\u0004\u0002\tMN\n\u0007\u0000\u0000NO\u0007"+
		"\u0000\u0000\u0000Os\u0003\u0004\u0002\bPQ\n\u0006\u0000\u0000QR\u0007"+
		"\u0002\u0000\u0000Rs\u0003\u0004\u0002\u0007ST\n\u0005\u0000\u0000TU\u0007"+
		"\u0003\u0000\u0000Us\u0003\u0004\u0002\u0006VW\n\u0004\u0000\u0000WX\u0007"+
		"\u0004\u0000\u0000Xs\u0003\u0004\u0002\u0005YZ\n\u0002\u0000\u0000Z[\u0007"+
		"\u0005\u0000\u0000[s\u0003\u0004\u0002\u0003\\]\n\u0001\u0000\u0000]^"+
		"\u0005\u00e9\u0000\u0000^s\u0003\u0004\u0002\u0001_`\n\u0010\u0000\u0000"+
		"`b\u0005\u0003\u0000\u0000ac\u0003\u0006\u0003\u0000ba\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000ds\u0005\u0004"+
		"\u0000\u0000ef\n\u000f\u0000\u0000fg\u0005\u0005\u0000\u0000gh\u0003\u0004"+
		"\u0002\u0000hi\u0005\u0006\u0000\u0000is\u0001\u0000\u0000\u0000jk\n\u000e"+
		"\u0000\u0000kl\u0005\u0007\u0000\u0000lm\u0003\u0004\u0002\u0000mn\u0005"+
		"\b\u0000\u0000ns\u0001\u0000\u0000\u0000op\n\u0003\u0000\u0000pq\u0007"+
		"\u0006\u0000\u0000qs\u0003\f\u0006\u0000rA\u0001\u0000\u0000\u0000rD\u0001"+
		"\u0000\u0000\u0000rG\u0001\u0000\u0000\u0000rJ\u0001\u0000\u0000\u0000"+
		"rM\u0001\u0000\u0000\u0000rP\u0001\u0000\u0000\u0000rS\u0001\u0000\u0000"+
		"\u0000rV\u0001\u0000\u0000\u0000rY\u0001\u0000\u0000\u0000r\\\u0001\u0000"+
		"\u0000\u0000r_\u0001\u0000\u0000\u0000re\u0001\u0000\u0000\u0000rj\u0001"+
		"\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0005\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000wz\u0006\u0003\uffff\uffff\u0000"+
		"x{\u0003\u0004\u0002\u0000y{\u0003\b\u0004\u0000zx\u0001\u0000\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{\u0083\u0001\u0000\u0000\u0000|\u007f\u0005"+
		"\u00ea\u0000\u0000}\u0080\u0003\u0004\u0002\u0000~\u0080\u0003\b\u0004"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u008f\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\n\u0001\u0000\u0000\u0087\u0089\u0005"+
		"\u00ea\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0003"+
		"\u0006\u0003\u0002\u008d\u0086\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0007\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0010\u0000\u0000\u0093\u0094\u0005"+
		"\u00e5\u0000\u0000\u0094\u0095\u0005\u0001\u0000\u0000\u0095\u0096\u0005"+
		"\u00e5\u0000\u0000\u0096\u00a0\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\u00ea\u0000\u0000\u0098\u009a\u0005\u0010\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\u00e5\u0000\u0000\u009c\u009d\u0005"+
		"\u0001\u0000\u0000\u009d\u009f\u0005\u00e5\u0000\u0000\u009e\u0099\u0001"+
		"\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00b1\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0010\u0000\u0000\u00a4\u00a8\u0005\u00e5\u0000\u0000\u00a5\u00a7\u0005"+
		"\u00e5\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00b1\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\u0010\u0000\u0000\u00ac\u00ad\u0005"+
		"\u00e5\u0000\u0000\u00ad\u00ae\u0005\u0007\u0000\u0000\u00ae\u00af\u0005"+
		"\u000b\u0000\u0000\u00af\u00b1\u0005\b\u0000\u0000\u00b0\u0092\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a3\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b1\t\u0001\u0000\u0000\u0000\u00b2\u00b7\u0005\u00e5\u0000"+
		"\u0000\u00b3\u00b4\u0005\u00e5\u0000\u0000\u00b4\u00b5\u0005\u0001\u0000"+
		"\u0000\u00b5\u00b7\u0005\u00e5\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u000b\u0001\u0000\u0000\u0000\u00ba\u00cd\u0005\u00e5\u0000"+
		"\u0000\u00bb\u00be\u0005\u0003\u0000\u0000\u00bc\u00bf\u0003\u0010\b\u0000"+
		"\u00bd\u00bf\u0003\u000e\u0007\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c3\u0005\u00ea\u0000\u0000\u00c1\u00c4\u0003\u0010\b\u0000\u00c2"+
		"\u00c4\u0003\u000e\u0007\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0004\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00cc\u00bb\u0001\u0000\u0000\u0000\u00cd"+
		"\r\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u00e3\u0000\u0000\u00cf\u00d0"+
		"\u0005\u0011\u0000\u0000\u00d0\u00d1\u0005\u00e3\u0000\u0000\u00d1\u000f"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0007\u0007\u0000\u0000\u00d3\u0011"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0006\t\uffff\uffff\u0000\u00d5\u00da"+
		"\u0005\u00e5\u0000\u0000\u00d6\u00da\u0005\u00a4\u0000\u0000\u00d7\u00da"+
		"\u0005\u008c\u0000\u0000\u00d8\u00da\u0005\u00a9\u0000\u0000\u00d9\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00e3"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\n\u0006\u0000\u0000\u00dc\u00dd\u0005"+
		"\u00e7\u0000\u0000\u00dd\u00e2\u0003\u0012\t\u0007\u00de\u00df\n\u0005"+
		"\u0000\u0000\u00df\u00e0\u0005\u0001\u0000\u0000\u00e0\u00e2\u0003\u0012"+
		"\t\u0006\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u0013\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u00e5\u0000"+
		"\u0000\u00e7\u0015\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u00e5\u0000"+
		"\u0000\u00e9\u0017\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u00e5\u0000"+
		"\u0000\u00eb\u0019\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u00e2\u0000"+
		"\u0000\u00ed\u001b\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u00e2\u0000"+
		"\u0000\u00ef\u001d\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007\b\u0000\u0000"+
		"\u00f1\u001f\u0001\u0000\u0000\u0000\u0019#.0?brtz\u007f\u0083\u008a\u008f"+
		"\u0099\u00a0\u00a8\u00b0\u00b6\u00b8\u00be\u00c3\u00c7\u00cc\u00d9\u00e1"+
		"\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}