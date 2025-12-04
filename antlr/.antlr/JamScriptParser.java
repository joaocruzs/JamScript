// Generated from c:/Users/joaoc/Documents/Compiladores/JamScript/antlr/JamScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JamScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PLUS=6, MINUS=7, STAR=8, SLASH=9, 
		EQ=10, EQEQ=11, NEQ=12, GT=13, LT=14, AND=15, OR=16, NOT=17, INC=18, DEC=19, 
		LPAREN=20, RPAREN=21, LBRACE=22, RBRACE=23, SEMI=24, COLON=25, COMMA=26, 
		DOT=27, PROGRAM=28, FUNCTION=29, LET=30, CONST=31, STRUCT=32, MAIN=33, 
		IF=34, ELSE=35, WHILE=36, FOR=37, RETURN=38, PRINT=39, INPUT=40, BREAK=41, 
		WS=42, LINE_COMMENT=43, BLOCK_COMMENT=44, BOOL=45, ID=46, FLOAT=47, NUMBER=48, 
		STRING=49, UNCLOSED_STRING=50;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_structDecl = 2, RULE_structField = 3, 
		RULE_varDecl = 4, RULE_funcDecl = 5, RULE_paramList = 6, RULE_param = 7, 
		RULE_mainBlock = 8, RULE_block = 9, RULE_stmt = 10, RULE_simpleStmt = 11, 
		RULE_assignStmt = 12, RULE_leftHandSide = 13, RULE_callStmt = 14, RULE_printStmt = 15, 
		RULE_inputStmt = 16, RULE_idList = 17, RULE_ifStmt = 18, RULE_whileStmt = 19, 
		RULE_forStmt = 20, RULE_forInit = 21, RULE_forUpdate = 22, RULE_assignNoSemi = 23, 
		RULE_incExpr = 24, RULE_returnStmt = 25, RULE_expr = 26, RULE_orExpr = 27, 
		RULE_andExpr = 28, RULE_eqExpr = 29, RULE_relExpr = 30, RULE_addExpr = 31, 
		RULE_mulExpr = 32, RULE_unaryExpr = 33, RULE_postfixExpr = 34, RULE_primary = 35, 
		RULE_functionCall = 36, RULE_argList = 37, RULE_type_ = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "structDecl", "structField", "varDecl", "funcDecl", 
			"paramList", "param", "mainBlock", "block", "stmt", "simpleStmt", "assignStmt", 
			"leftHandSide", "callStmt", "printStmt", "inputStmt", "idList", "ifStmt", 
			"whileStmt", "forStmt", "forInit", "forUpdate", "assignNoSemi", "incExpr", 
			"returnStmt", "expr", "orExpr", "andExpr", "eqExpr", "relExpr", "addExpr", 
			"mulExpr", "unaryExpr", "postfixExpr", "primary", "functionCall", "argList", 
			"type_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'bool'", "'string'", "'void'", "'+'", "'-'", 
			"'*'", "'/'", "'='", "'=='", "'!='", "'>'", "'<'", "'&&'", "'||'", "'!'", 
			"'++'", "'--'", "'('", "')'", "'{'", "'}'", "';'", "':'", "','", "'.'", 
			"'program'", "'function'", "'let'", "'const'", "'struct'", "'main'", 
			"'if'", "'else'", "'while'", "'for'", "'return'", "'print'", "'input'", 
			"'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "PLUS", "MINUS", "STAR", "SLASH", 
			"EQ", "EQEQ", "NEQ", "GT", "LT", "AND", "OR", "NOT", "INC", "DEC", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "SEMI", "COLON", "COMMA", "DOT", "PROGRAM", 
			"FUNCTION", "LET", "CONST", "STRUCT", "MAIN", "IF", "ELSE", "WHILE", 
			"FOR", "RETURN", "PRINT", "INPUT", "BREAK", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
			"BOOL", "ID", "FLOAT", "NUMBER", "STRING", "UNCLOSED_STRING"
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
	public String getGrammarFileName() { return "JamScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JamScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(JamScriptParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JamScriptParser.EOF, 0); }
		public List<StructDeclContext> structDecl() {
			return getRuleContexts(StructDeclContext.class);
		}
		public StructDeclContext structDecl(int i) {
			return getRuleContext(StructDeclContext.class,i);
		}
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(PROGRAM);
			setState(79);
			match(ID);
			setState(80);
			match(SEMI);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRUCT) {
				{
				{
				setState(81);
				structDecl();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(87);
				funcDecl();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			mainBlock();
			setState(94);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			varDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(JamScriptParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(JamScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JamScriptParser.RBRACE, 0); }
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public StructDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDecl; }
	}

	public final StructDeclContext structDecl() throws RecognitionException {
		StructDeclContext _localctx = new StructDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(STRUCT);
			setState(99);
			match(ID);
			setState(100);
			match(LBRACE);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET) {
				{
				{
				setState(101);
				structField();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(JamScriptParser.LET, 0); }
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode COLON() { return getToken(JamScriptParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LET);
			setState(110);
			match(ID);
			setState(111);
			match(COLON);
			setState(112);
			type_();
			setState(113);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(JamScriptParser.LET, 0); }
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode COLON() { return getToken(JamScriptParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
		public TerminalNode EQ() { return getToken(JamScriptParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONST() { return getToken(JamScriptParser.CONST, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(LET);
				setState(116);
				match(ID);
				setState(117);
				match(COLON);
				setState(118);
				type_();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(119);
					match(EQ);
					setState(120);
					expr();
					}
				}

				setState(123);
				match(SEMI);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(CONST);
				setState(126);
				match(ID);
				setState(127);
				match(COLON);
				setState(128);
				type_();
				setState(129);
				match(EQ);
				setState(130);
				expr();
				setState(131);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JamScriptParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(JamScriptParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FUNCTION);
			setState(136);
			match(ID);
			setState(137);
			match(LPAREN);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(138);
				paramList();
				}
			}

			setState(141);
			match(RPAREN);
			setState(142);
			match(COLON);
			setState(143);
			type_();
			setState(144);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JamScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JamScriptParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			param();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147);
				match(COMMA);
				setState(148);
				param();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode COLON() { return getToken(JamScriptParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ID);
			setState(155);
			match(COLON);
			setState(156);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainBlockContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(JamScriptParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mainBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(MAIN);
			setState(159);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JamScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JamScriptParser.RBRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(LBRACE);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					decl();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74718477287424L) != 0)) {
				{
				{
				setState(168);
				stmt();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
			case LET:
			case CONST:
			case RETURN:
			case PRINT:
			case INPUT:
			case BREAK:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				simpleStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				whileStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				forStmt();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtContext extends ParserRuleContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public IncExprContext incExpr() {
			return getRuleContext(IncExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(JamScriptParser.BREAK, 0); }
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleStmt);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				assignStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				incExpr();
				setState(185);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				callStmt();
				setState(188);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				returnStmt();
				setState(191);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				varDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(BREAK);
				setState(195);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JamScriptParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			leftHandSide();
			setState(199);
			match(EQ);
			setState(200);
			expr();
			setState(201);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeftHandSideContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JamScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JamScriptParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JamScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JamScriptParser.DOT, i);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_leftHandSide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(204);
				match(DOT);
				setState(205);
				match(ID);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallStmtContext extends ParserRuleContext {
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callStmt);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				printStmt();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				inputStmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				functionCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(JamScriptParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(PRINT);
			setState(217);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715536720000L) != 0)) {
				{
				setState(218);
				argList();
				}
			}

			setState(221);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputStmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(JamScriptParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(INPUT);
			setState(224);
			match(LPAREN);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(225);
				idList();
				}
			}

			setState(228);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JamScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JamScriptParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JamScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JamScriptParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ID);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				match(ID);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JamScriptParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JamScriptParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IF);
			setState(239);
			match(LPAREN);
			setState(240);
			expr();
			setState(241);
			match(RPAREN);
			setState(242);
			block();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(243);
				match(ELSE);
				setState(244);
				block();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JamScriptParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(WHILE);
			setState(248);
			match(LPAREN);
			setState(249);
			expr();
			setState(250);
			match(RPAREN);
			setState(251);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JamScriptParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JamScriptParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JamScriptParser.SEMI, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(FOR);
			setState(254);
			match(LPAREN);
			setState(255);
			forInit();
			setState(256);
			match(SEMI);
			setState(257);
			expr();
			setState(258);
			match(SEMI);
			setState(259);
			forUpdate();
			setState(260);
			match(RPAREN);
			setState(261);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(JamScriptParser.LET, 0); }
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode COLON() { return getToken(JamScriptParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode EQ() { return getToken(JamScriptParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONST() { return getToken(JamScriptParser.CONST, 0); }
		public AssignNoSemiContext assignNoSemi() {
			return getRuleContext(AssignNoSemiContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forInit);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(LET);
				setState(264);
				match(ID);
				setState(265);
				match(COLON);
				setState(266);
				type_();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(267);
					match(EQ);
					setState(268);
					expr();
					}
				}

				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(CONST);
				setState(272);
				match(ID);
				setState(273);
				match(COLON);
				setState(274);
				type_();
				setState(275);
				match(EQ);
				setState(276);
				expr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				assignNoSemi();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public IncExprContext incExpr() {
			return getRuleContext(IncExprContext.class,0);
		}
		public AssignNoSemiContext assignNoSemi() {
			return getRuleContext(AssignNoSemiContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forUpdate);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				incExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				assignNoSemi();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignNoSemiContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JamScriptParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignNoSemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignNoSemi; }
	}

	public final AssignNoSemiContext assignNoSemi() throws RecognitionException {
		AssignNoSemiContext _localctx = new AssignNoSemiContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignNoSemi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			leftHandSide();
			setState(286);
			match(EQ);
			setState(287);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode INC() { return getToken(JamScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JamScriptParser.DEC, 0); }
		public IncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incExpr; }
	}

	public final IncExprContext incExpr() throws RecognitionException {
		IncExprContext _localctx = new IncExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_incExpr);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(ID);
				setState(290);
				match(INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(ID);
				setState(292);
				match(DEC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(INC);
				setState(294);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(DEC);
				setState(296);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JamScriptParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(RETURN);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715536720000L) != 0)) {
				{
				setState(300);
				expr();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			orExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JamScriptParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JamScriptParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			andExpr();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(306);
				match(OR);
				setState(307);
				andExpr();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public List<EqExprContext> eqExpr() {
			return getRuleContexts(EqExprContext.class);
		}
		public EqExprContext eqExpr(int i) {
			return getRuleContext(EqExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JamScriptParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JamScriptParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			eqExpr();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(314);
				match(AND);
				setState(315);
				eqExpr();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends ParserRuleContext {
		public List<RelExprContext> relExpr() {
			return getRuleContexts(RelExprContext.class);
		}
		public RelExprContext relExpr(int i) {
			return getRuleContext(RelExprContext.class,i);
		}
		public List<TerminalNode> EQEQ() { return getTokens(JamScriptParser.EQEQ); }
		public TerminalNode EQEQ(int i) {
			return getToken(JamScriptParser.EQEQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(JamScriptParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(JamScriptParser.NEQ, i);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			relExpr();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQEQ || _la==NEQ) {
				{
				{
				setState(322);
				_la = _input.LA(1);
				if ( !(_la==EQEQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				relExpr();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelExprContext extends ParserRuleContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(JamScriptParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JamScriptParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(JamScriptParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JamScriptParser.LT, i);
		}
		public RelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr; }
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			addExpr();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT || _la==LT) {
				{
				{
				setState(330);
				_la = _input.LA(1);
				if ( !(_la==GT || _la==LT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(331);
				addExpr();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ParserRuleContext {
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(JamScriptParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JamScriptParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JamScriptParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JamScriptParser.MINUS, i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			mulExpr();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				mulExpr();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(JamScriptParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JamScriptParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(JamScriptParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(JamScriptParser.SLASH, i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			unaryExpr();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH) {
				{
				{
				setState(346);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(347);
				unaryExpr();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JamScriptParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(JamScriptParser.MINUS, 0); }
		public TerminalNode INC() { return getToken(JamScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JamScriptParser.DEC, 0); }
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unaryExpr);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917632L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(354);
				unaryExpr();
				}
				break;
			case LPAREN:
			case BOOL:
			case ID:
			case FLOAT:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				postfixExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode INC() { return getToken(JamScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JamScriptParser.DEC, 0); }
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_postfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			primary();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INC || _la==DEC) {
				{
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JamScriptParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(JamScriptParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(JamScriptParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(JamScriptParser.BOOL, 0); }
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primary);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				leftHandSide();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(368);
				match(LPAREN);
				setState(369);
				expr();
				setState(370);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ID);
			setState(375);
			match(LPAREN);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715536720000L) != 0)) {
				{
				setState(376);
				argList();
				}
			}

			setState(379);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JamScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JamScriptParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			expr();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(382);
				match(COMMA);
				setState(383);
				expr();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744177726L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u00012\u0188\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000S\b\u0000\n\u0000\f\u0000V\t\u0000"+
		"\u0001\u0000\u0005\u0000Y\b\u0000\n\u0000\f\u0000\\\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002g\b\u0002\n\u0002\f\u0002j\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004z\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0086\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u008c\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0096\b\u0006\n\u0006\f\u0006\u0099\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0005\t\u00a4\b\t\n\t\f\t\u00a7\t\t\u0001\t\u0005\t\u00aa\b\t\n\t\f\t"+
		"\u00ad\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00b6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00c5\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00cf\b\r\n\r\f\r\u00d2"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d7\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00dc\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e3\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ea"+
		"\b\u0011\n\u0011\f\u0011\u00ed\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f6\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010e\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0118\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u011c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u012a\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u012e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u0135\b\u001b\n\u001b\f\u001b\u0138\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u013d\b\u001c\n\u001c\f\u001c"+
		"\u0140\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0145\b"+
		"\u001d\n\u001d\f\u001d\u0148\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u014d\b\u001e\n\u001e\f\u001e\u0150\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0155\b\u001f\n\u001f\f\u001f\u0158\t\u001f"+
		"\u0001 \u0001 \u0001 \u0005 \u015d\b \n \f \u0160\t \u0001!\u0001!\u0001"+
		"!\u0003!\u0165\b!\u0001\"\u0001\"\u0003\"\u0169\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0175\b#\u0001"+
		"$\u0001$\u0001$\u0003$\u017a\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0005"+
		"%\u0181\b%\n%\f%\u0184\t%\u0001&\u0001&\u0001&\u0000\u0000\'\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJL\u0000\u0007\u0001\u0000\u000b\f\u0001\u0000\r"+
		"\u000e\u0001\u0000\u0006\u0007\u0001\u0000\b\t\u0002\u0000\u0007\u0007"+
		"\u0011\u0013\u0001\u0000\u0012\u0013\u0002\u0000\u0001\u0005..\u0191\u0000"+
		"N\u0001\u0000\u0000\u0000\u0002`\u0001\u0000\u0000\u0000\u0004b\u0001"+
		"\u0000\u0000\u0000\u0006m\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000"+
		"\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000"+
		"\u0000\u000e\u009a\u0001\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000"+
		"\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00b5\u0001\u0000\u0000"+
		"\u0000\u0016\u00c4\u0001\u0000\u0000\u0000\u0018\u00c6\u0001\u0000\u0000"+
		"\u0000\u001a\u00cb\u0001\u0000\u0000\u0000\u001c\u00d6\u0001\u0000\u0000"+
		"\u0000\u001e\u00d8\u0001\u0000\u0000\u0000 \u00df\u0001\u0000\u0000\u0000"+
		"\"\u00e6\u0001\u0000\u0000\u0000$\u00ee\u0001\u0000\u0000\u0000&\u00f7"+
		"\u0001\u0000\u0000\u0000(\u00fd\u0001\u0000\u0000\u0000*\u0117\u0001\u0000"+
		"\u0000\u0000,\u011b\u0001\u0000\u0000\u0000.\u011d\u0001\u0000\u0000\u0000"+
		"0\u0129\u0001\u0000\u0000\u00002\u012b\u0001\u0000\u0000\u00004\u012f"+
		"\u0001\u0000\u0000\u00006\u0131\u0001\u0000\u0000\u00008\u0139\u0001\u0000"+
		"\u0000\u0000:\u0141\u0001\u0000\u0000\u0000<\u0149\u0001\u0000\u0000\u0000"+
		">\u0151\u0001\u0000\u0000\u0000@\u0159\u0001\u0000\u0000\u0000B\u0164"+
		"\u0001\u0000\u0000\u0000D\u0166\u0001\u0000\u0000\u0000F\u0174\u0001\u0000"+
		"\u0000\u0000H\u0176\u0001\u0000\u0000\u0000J\u017d\u0001\u0000\u0000\u0000"+
		"L\u0185\u0001\u0000\u0000\u0000NO\u0005\u001c\u0000\u0000OP\u0005.\u0000"+
		"\u0000PT\u0005\u0018\u0000\u0000QS\u0003\u0004\u0002\u0000RQ\u0001\u0000"+
		"\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UZ\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WY\u0003\n\u0005\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0003\u0010\b\u0000^_\u0005"+
		"\u0000\u0000\u0001_\u0001\u0001\u0000\u0000\u0000`a\u0003\b\u0004\u0000"+
		"a\u0003\u0001\u0000\u0000\u0000bc\u0005 \u0000\u0000cd\u0005.\u0000\u0000"+
		"dh\u0005\u0016\u0000\u0000eg\u0003\u0006\u0003\u0000fe\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005"+
		"\u0017\u0000\u0000l\u0005\u0001\u0000\u0000\u0000mn\u0005\u001e\u0000"+
		"\u0000no\u0005.\u0000\u0000op\u0005\u0019\u0000\u0000pq\u0003L&\u0000"+
		"qr\u0005\u0018\u0000\u0000r\u0007\u0001\u0000\u0000\u0000st\u0005\u001e"+
		"\u0000\u0000tu\u0005.\u0000\u0000uv\u0005\u0019\u0000\u0000vy\u0003L&"+
		"\u0000wx\u0005\n\u0000\u0000xz\u00034\u001a\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u0018"+
		"\u0000\u0000|\u0086\u0001\u0000\u0000\u0000}~\u0005\u001f\u0000\u0000"+
		"~\u007f\u0005.\u0000\u0000\u007f\u0080\u0005\u0019\u0000\u0000\u0080\u0081"+
		"\u0003L&\u0000\u0081\u0082\u0005\n\u0000\u0000\u0082\u0083\u00034\u001a"+
		"\u0000\u0083\u0084\u0005\u0018\u0000\u0000\u0084\u0086\u0001\u0000\u0000"+
		"\u0000\u0085s\u0001\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000\u0086"+
		"\t\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u001d\u0000\u0000\u0088\u0089"+
		"\u0005.\u0000\u0000\u0089\u008b\u0005\u0014\u0000\u0000\u008a\u008c\u0003"+
		"\f\u0006\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0015"+
		"\u0000\u0000\u008e\u008f\u0005\u0019\u0000\u0000\u008f\u0090\u0003L&\u0000"+
		"\u0090\u0091\u0003\u0012\t\u0000\u0091\u000b\u0001\u0000\u0000\u0000\u0092"+
		"\u0097\u0003\u000e\u0007\u0000\u0093\u0094\u0005\u001a\u0000\u0000\u0094"+
		"\u0096\u0003\u000e\u0007\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\r\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0005.\u0000\u0000\u009b\u009c\u0005"+
		"\u0019\u0000\u0000\u009c\u009d\u0003L&\u0000\u009d\u000f\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005!\u0000\u0000\u009f\u00a0\u0003\u0012\t\u0000"+
		"\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1\u00a5\u0005\u0016\u0000\u0000"+
		"\u00a2\u00a4\u0003\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u0014\n\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\u0017\u0000\u0000\u00af\u0013\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b6\u0003\u0016\u000b\u0000\u00b1\u00b6\u0003$\u0012\u0000\u00b2\u00b6"+
		"\u0003&\u0013\u0000\u00b3\u00b6\u0003(\u0014\u0000\u00b4\u00b6\u0003\u0012"+
		"\t\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u0015\u0001\u0000\u0000"+
		"\u0000\u00b7\u00c5\u0003\u0018\f\u0000\u00b8\u00b9\u00030\u0018\u0000"+
		"\u00b9\u00ba\u0005\u0018\u0000\u0000\u00ba\u00c5\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0003\u001c\u000e\u0000\u00bc\u00bd\u0005\u0018\u0000\u0000"+
		"\u00bd\u00c5\u0001\u0000\u0000\u0000\u00be\u00bf\u00032\u0019\u0000\u00bf"+
		"\u00c0\u0005\u0018\u0000\u0000\u00c0\u00c5\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c5\u0003\b\u0004\u0000\u00c2\u00c3\u0005)\u0000\u0000\u00c3\u00c5"+
		"\u0005\u0018\u0000\u0000\u00c4\u00b7\u0001\u0000\u0000\u0000\u00c4\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c4\u00bb\u0001\u0000\u0000\u0000\u00c4\u00be"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0003\u001a\r\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u00c9\u0003"+
		"4\u001a\u0000\u00c9\u00ca\u0005\u0018\u0000\u0000\u00ca\u0019\u0001\u0000"+
		"\u0000\u0000\u00cb\u00d0\u0005.\u0000\u0000\u00cc\u00cd\u0005\u001b\u0000"+
		"\u0000\u00cd\u00cf\u0005.\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u001b\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d7\u0003\u001e\u000f\u0000"+
		"\u00d4\u00d7\u0003 \u0010\u0000\u00d5\u00d7\u0003H$\u0000\u00d6\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u001d\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\'\u0000\u0000\u00d9\u00db\u0005\u0014\u0000\u0000\u00da\u00dc\u0003"+
		"J%\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0015\u0000"+
		"\u0000\u00de\u001f\u0001\u0000\u0000\u0000\u00df\u00e0\u0005(\u0000\u0000"+
		"\u00e0\u00e2\u0005\u0014\u0000\u0000\u00e1\u00e3\u0003\"\u0011\u0000\u00e2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0015\u0000\u0000\u00e5"+
		"!\u0001\u0000\u0000\u0000\u00e6\u00eb\u0005.\u0000\u0000\u00e7\u00e8\u0005"+
		"\u001a\u0000\u0000\u00e8\u00ea\u0005.\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec#\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\"\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0014\u0000\u0000\u00f0\u00f1\u00034\u001a\u0000\u00f1"+
		"\u00f2\u0005\u0015\u0000\u0000\u00f2\u00f5\u0003\u0012\t\u0000\u00f3\u00f4"+
		"\u0005#\u0000\u0000\u00f4\u00f6\u0003\u0012\t\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6%\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0005$\u0000\u0000\u00f8\u00f9\u0005\u0014\u0000"+
		"\u0000\u00f9\u00fa\u00034\u001a\u0000\u00fa\u00fb\u0005\u0015\u0000\u0000"+
		"\u00fb\u00fc\u0003\u0012\t\u0000\u00fc\'\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005%\u0000\u0000\u00fe\u00ff\u0005\u0014\u0000\u0000\u00ff\u0100"+
		"\u0003*\u0015\u0000\u0100\u0101\u0005\u0018\u0000\u0000\u0101\u0102\u0003"+
		"4\u001a\u0000\u0102\u0103\u0005\u0018\u0000\u0000\u0103\u0104\u0003,\u0016"+
		"\u0000\u0104\u0105\u0005\u0015\u0000\u0000\u0105\u0106\u0003\u0012\t\u0000"+
		"\u0106)\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u001e\u0000\u0000\u0108"+
		"\u0109\u0005.\u0000\u0000\u0109\u010a\u0005\u0019\u0000\u0000\u010a\u010d"+
		"\u0003L&\u0000\u010b\u010c\u0005\n\u0000\u0000\u010c\u010e\u00034\u001a"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0118\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u001f\u0000"+
		"\u0000\u0110\u0111\u0005.\u0000\u0000\u0111\u0112\u0005\u0019\u0000\u0000"+
		"\u0112\u0113\u0003L&\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114\u0115"+
		"\u00034\u001a\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0118\u0003"+
		".\u0017\u0000\u0117\u0107\u0001\u0000\u0000\u0000\u0117\u010f\u0001\u0000"+
		"\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118+\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u00030\u0018\u0000\u011a\u011c\u0003.\u0017\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c"+
		"-\u0001\u0000\u0000\u0000\u011d\u011e\u0003\u001a\r\u0000\u011e\u011f"+
		"\u0005\n\u0000\u0000\u011f\u0120\u00034\u001a\u0000\u0120/\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005.\u0000\u0000\u0122\u012a\u0005\u0012\u0000"+
		"\u0000\u0123\u0124\u0005.\u0000\u0000\u0124\u012a\u0005\u0013\u0000\u0000"+
		"\u0125\u0126\u0005\u0012\u0000\u0000\u0126\u012a\u0005.\u0000\u0000\u0127"+
		"\u0128\u0005\u0013\u0000\u0000\u0128\u012a\u0005.\u0000\u0000\u0129\u0121"+
		"\u0001\u0000\u0000\u0000\u0129\u0123\u0001\u0000\u0000\u0000\u0129\u0125"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a1\u0001"+
		"\u0000\u0000\u0000\u012b\u012d\u0005&\u0000\u0000\u012c\u012e\u00034\u001a"+
		"\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e3\u0001\u0000\u0000\u0000\u012f\u0130\u00036\u001b\u0000\u0130"+
		"5\u0001\u0000\u0000\u0000\u0131\u0136\u00038\u001c\u0000\u0132\u0133\u0005"+
		"\u0010\u0000\u0000\u0133\u0135\u00038\u001c\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u01377\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013e\u0003:\u001d\u0000"+
		"\u013a\u013b\u0005\u000f\u0000\u0000\u013b\u013d\u0003:\u001d\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"9\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0146"+
		"\u0003<\u001e\u0000\u0142\u0143\u0007\u0000\u0000\u0000\u0143\u0145\u0003"+
		"<\u001e\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147;\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u014e\u0003>\u001f\u0000\u014a\u014b\u0007\u0001\u0000\u0000"+
		"\u014b\u014d\u0003>\u001f\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d"+
		"\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f=\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u0156\u0003@ \u0000\u0152\u0153\u0007\u0002"+
		"\u0000\u0000\u0153\u0155\u0003@ \u0000\u0154\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157?\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0159\u015e\u0003B!\u0000\u015a\u015b\u0007"+
		"\u0003\u0000\u0000\u015b\u015d\u0003B!\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015fA\u0001\u0000\u0000\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0007\u0004\u0000\u0000"+
		"\u0162\u0165\u0003B!\u0000\u0163\u0165\u0003D\"\u0000\u0164\u0161\u0001"+
		"\u0000\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165C\u0001\u0000"+
		"\u0000\u0000\u0166\u0168\u0003F#\u0000\u0167\u0169\u0007\u0005\u0000\u0000"+
		"\u0168\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169E\u0001\u0000\u0000\u0000\u016a\u0175\u00050\u0000\u0000\u016b\u0175"+
		"\u0005/\u0000\u0000\u016c\u0175\u00051\u0000\u0000\u016d\u0175\u0005-"+
		"\u0000\u0000\u016e\u0175\u0003\u001a\r\u0000\u016f\u0175\u0003H$\u0000"+
		"\u0170\u0171\u0005\u0014\u0000\u0000\u0171\u0172\u00034\u001a\u0000\u0172"+
		"\u0173\u0005\u0015\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174"+
		"\u016a\u0001\u0000\u0000\u0000\u0174\u016b\u0001\u0000\u0000\u0000\u0174"+
		"\u016c\u0001\u0000\u0000\u0000\u0174\u016d\u0001\u0000\u0000\u0000\u0174"+
		"\u016e\u0001\u0000\u0000\u0000\u0174\u016f\u0001\u0000\u0000\u0000\u0174"+
		"\u0170\u0001\u0000\u0000\u0000\u0175G\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0005.\u0000\u0000\u0177\u0179\u0005\u0014\u0000\u0000\u0178\u017a\u0003"+
		"J%\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0015\u0000"+
		"\u0000\u017cI\u0001\u0000\u0000\u0000\u017d\u0182\u00034\u001a\u0000\u017e"+
		"\u017f\u0005\u001a\u0000\u0000\u017f\u0181\u00034\u001a\u0000\u0180\u017e"+
		"\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183K\u0001"+
		"\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186\u0007"+
		"\u0006\u0000\u0000\u0186M\u0001\u0000\u0000\u0000!TZhy\u0085\u008b\u0097"+
		"\u00a5\u00ab\u00b5\u00c4\u00d0\u00d6\u00db\u00e2\u00eb\u00f5\u010d\u0117"+
		"\u011b\u0129\u012d\u0136\u013e\u0146\u014e\u0156\u015e\u0164\u0168\u0174"+
		"\u0179\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}