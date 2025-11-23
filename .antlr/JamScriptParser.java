// Generated from c:/Users/joaoc/Documents/compilas/JamScript/JamScript.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, BOOL=5, ID=6, FLOAT=7, NUMBER=8, STRING=9, 
		PLUS=10, MINUS=11, STAR=12, SLASH=13, EQ=14, EQEQ=15, NEQ=16, GT=17, LT=18, 
		GE=19, LE=20, AND=21, OR=22, NOT=23, INC=24, DEC=25, LPAREN=26, RPAREN=27, 
		LBRACE=28, RBRACE=29, SEMI=30, COLON=31, COMMA=32, DOT=33, PROGRAM=34, 
		FUNCTION=35, LET=36, CONST=37, STRUCT=38, MAIN=39, IF=40, ELSE=41, WHILE=42, 
		FOR=43, RETURN=44, PRINT=45, INPUT=46, WS=47, LINE_COMMENT=48, BLOCK_COMMENT=49;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_structDecl = 2, RULE_structField = 3, 
		RULE_varDecl = 4, RULE_funcDecl = 5, RULE_paramList = 6, RULE_param = 7, 
		RULE_mainBlock = 8, RULE_block = 9, RULE_stmt = 10, RULE_simpleStmt = 11, 
		RULE_assignStmt = 12, RULE_leftHandSide = 13, RULE_callStmt = 14, RULE_printStmt = 15, 
		RULE_inputStmt = 16, RULE_idList = 17, RULE_ifStmt = 18, RULE_whileStmt = 19, 
		RULE_forStmt = 20, RULE_forInit = 21, RULE_forUpdate = 22, RULE_assignNoSemi = 23, 
		RULE_incExpr = 24, RULE_returnStmt = 25, RULE_expr = 26, RULE_argList = 27, 
		RULE_type_ = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "structDecl", "structField", "varDecl", "funcDecl", 
			"paramList", "param", "mainBlock", "block", "stmt", "simpleStmt", "assignStmt", 
			"leftHandSide", "callStmt", "printStmt", "inputStmt", "idList", "ifStmt", 
			"whileStmt", "forStmt", "forInit", "forUpdate", "assignNoSemi", "incExpr", 
			"returnStmt", "expr", "argList", "type_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'bool'", "'string'", null, null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'&&'", "'||'", "'!'", "'++'", "'--'", "'('", "')'", 
			"'{'", "'}'", "';'", "':'", "','", "'.'", "'program'", "'function'", 
			"'let'", "'const'", "'struct'", "'main'", "'if'", "'else'", "'while'", 
			"'for'", "'return'", "'print'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BOOL", "ID", "FLOAT", "NUMBER", "STRING", 
			"PLUS", "MINUS", "STAR", "SLASH", "EQ", "EQEQ", "NEQ", "GT", "LT", "GE", 
			"LE", "AND", "OR", "NOT", "INC", "DEC", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "COLON", "COMMA", "DOT", "PROGRAM", "FUNCTION", "LET", 
			"CONST", "STRUCT", "MAIN", "IF", "ELSE", "WHILE", "FOR", "RETURN", "PRINT", 
			"INPUT", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
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
			setState(58);
			match(PROGRAM);
			setState(59);
			match(ID);
			setState(60);
			match(SEMI);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET || _la==CONST) {
				{
				{
				setState(61);
				decl();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRUCT) {
				{
				{
				setState(67);
				structDecl();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(73);
				funcDecl();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			mainBlock();
			setState(80);
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
			setState(82);
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
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
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
			setState(84);
			match(STRUCT);
			setState(85);
			match(ID);
			setState(86);
			match(LBRACE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET || _la==CONST) {
				{
				{
				setState(87);
				structField();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(RBRACE);
			setState(94);
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
	public static class StructFieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode COLON() { return getToken(JamScriptParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
		public TerminalNode LET() { return getToken(JamScriptParser.LET, 0); }
		public TerminalNode CONST() { return getToken(JamScriptParser.CONST, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(97);
			match(ID);
			setState(98);
			match(COLON);
			setState(99);
			type_();
			setState(100);
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
		public List<TerminalNode> ID() { return getTokens(JamScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JamScriptParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(JamScriptParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
		public TerminalNode LET() { return getToken(JamScriptParser.LET, 0); }
		public TerminalNode CONST() { return getToken(JamScriptParser.CONST, 0); }
		public TerminalNode EQ() { return getToken(JamScriptParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JamScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JamScriptParser.COMMA, i);
		}
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				match(ID);
				setState(104);
				match(COLON);
				setState(105);
				type_();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(106);
					match(EQ);
					setState(107);
					expr(0);
					}
				}

				setState(110);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				match(ID);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					match(ID);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(COLON);
				setState(122);
				type_();
				setState(123);
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
			setState(127);
			match(FUNCTION);
			setState(128);
			match(ID);
			setState(129);
			match(LPAREN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(130);
				paramList();
				}
			}

			setState(133);
			match(RPAREN);
			setState(134);
			match(COLON);
			setState(135);
			type_();
			setState(136);
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
			setState(138);
			param();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139);
				match(COMMA);
				setState(140);
				param();
				}
				}
				setState(145);
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
			setState(146);
			match(ID);
			setState(147);
			match(COLON);
			setState(148);
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
			setState(150);
			match(MAIN);
			setState(151);
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
			setState(153);
			match(LBRACE);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					decl();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137645380337728L) != 0)) {
				{
				{
				setState(160);
				stmt();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case LET:
			case CONST:
			case RETURN:
			case PRINT:
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				simpleStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				whileStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				forStmt();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
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
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JamScriptParser.SEMI, 0); }
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleStmt);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				assignStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				callStmt();
				setState(177);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				returnStmt();
				setState(180);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				varDecl();
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
			setState(185);
			leftHandSide();
			setState(186);
			match(EQ);
			setState(187);
			expr(0);
			setState(188);
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
		public TerminalNode DOT() { return getToken(JamScriptParser.DOT, 0); }
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_leftHandSide);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(ID);
				setState(192);
				match(DOT);
				setState(193);
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
	public static class CallStmtContext extends ParserRuleContext {
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callStmt);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				printStmt();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				inputStmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(ID);
				setState(199);
				match(LPAREN);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125832160L) != 0)) {
					{
					setState(200);
					argList();
					}
				}

				setState(203);
				match(RPAREN);
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
			setState(206);
			match(PRINT);
			setState(207);
			match(LPAREN);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125832160L) != 0)) {
				{
				setState(208);
				argList();
				}
			}

			setState(211);
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
			setState(213);
			match(INPUT);
			setState(214);
			match(LPAREN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(215);
				idList();
				}
			}

			setState(218);
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
			setState(220);
			match(ID);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				match(ID);
				}
				}
				setState(227);
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
			setState(228);
			match(IF);
			setState(229);
			match(LPAREN);
			setState(230);
			expr(0);
			setState(231);
			match(RPAREN);
			setState(232);
			block();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(233);
				match(ELSE);
				setState(234);
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
			setState(237);
			match(WHILE);
			setState(238);
			match(LPAREN);
			setState(239);
			expr(0);
			setState(240);
			match(RPAREN);
			setState(241);
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
		public List<TerminalNode> SEMI() { return getTokens(JamScriptParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JamScriptParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(FOR);
			setState(244);
			match(LPAREN);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 206158430272L) != 0)) {
				{
				setState(245);
				forInit();
				}
			}

			setState(248);
			match(SEMI);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125832160L) != 0)) {
				{
				setState(249);
				expr(0);
				}
			}

			setState(252);
			match(SEMI);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50331712L) != 0)) {
				{
				setState(253);
				forUpdate();
				}
			}

			setState(256);
			match(RPAREN);
			setState(257);
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
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode COLON() { return getToken(JamScriptParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode LET() { return getToken(JamScriptParser.LET, 0); }
		public TerminalNode CONST() { return getToken(JamScriptParser.CONST, 0); }
		public TerminalNode EQ() { return getToken(JamScriptParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				match(ID);
				setState(261);
				match(COLON);
				setState(262);
				type_();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(263);
					match(EQ);
					setState(264);
					expr(0);
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(ID);
				setState(268);
				match(EQ);
				setState(269);
				expr(0);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				incExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
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
			setState(276);
			leftHandSide();
			setState(277);
			match(EQ);
			setState(278);
			expr(0);
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
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(ID);
				setState(281);
				match(INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(ID);
				setState(283);
				match(DEC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(INC);
				setState(285);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(DEC);
				setState(287);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(RETURN);
			setState(291);
			expr(0);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(JamScriptParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(JamScriptParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(JamScriptParser.BOOL, 0); }
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncExprContext extends ExprContext {
		public TerminalNode INC() { return getToken(JamScriptParser.INC, 0); }
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public PreIncExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatExprContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(JamScriptParser.FLOAT, 0); }
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(JamScriptParser.GT, 0); }
		public TerminalNode LT() { return getToken(JamScriptParser.LT, 0); }
		public TerminalNode GE() { return getToken(JamScriptParser.GE, 0); }
		public TerminalNode LE() { return getToken(JamScriptParser.LE, 0); }
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreDecExprContext extends ExprContext {
		public TerminalNode DEC() { return getToken(JamScriptParser.DEC, 0); }
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public PreDecExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JamScriptParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(JamScriptParser.MINUS, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(JamScriptParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(JamScriptParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(JamScriptParser.SLASH, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldOrIdExprContext extends ExprContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public FieldOrIdExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode INC() { return getToken(JamScriptParser.INC, 0); }
		public PostIncExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(JamScriptParser.NUMBER, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(JamScriptParser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(JamScriptParser.NEQ, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode DEC() { return getToken(JamScriptParser.DEC, 0); }
		public PostDecExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JamScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JamScriptParser.MINUS, 0); }
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JamScriptParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(JamScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JamScriptParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FuncCallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(294);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(295);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new PostIncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(ID);
				setState(297);
				match(INC);
				}
				break;
			case 3:
				{
				_localctx = new PostDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(ID);
				setState(299);
				match(DEC);
				}
				break;
			case 4:
				{
				_localctx = new PreIncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(INC);
				setState(301);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new PreDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(DEC);
				setState(303);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(LPAREN);
				setState(305);
				expr(0);
				setState(306);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new FieldOrIdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				leftHandSide();
				}
				break;
			case 8:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(ID);
				setState(310);
				match(LPAREN);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125832160L) != 0)) {
					{
					setState(311);
					argList();
					}
				}

				setState(314);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(NUMBER);
				}
				break;
			case 10:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(FLOAT);
				}
				break;
			case 11:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(STRING);
				}
				break;
			case 12:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(322);
						match(OR);
						setState(323);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(325);
						match(AND);
						setState(326);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(328);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(331);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(332);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(334);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(336);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(337);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(338);
						expr(14);
						}
						break;
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 54, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			expr(0);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				expr(0);
				}
				}
				setState(351);
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
		enterRule(_localctx, 56, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 94L) != 0)) ) {
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
		case 26:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u0163\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0005\u0000"+
		"E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0005\u0000K\b\u0000\n"+
		"\u0000\f\u0000N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004m\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004u\b\u0004\n\u0004\f\u0004x\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004~\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0084\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u008e\b\u0006\n\u0006\f\u0006\u0091"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0005\t\u009c\b\t\n\t\f\t\u009f\t\t\u0001\t"+
		"\u0005\t\u00a2\b\t\n\t\f\t\u00a5\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00ae\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00b8\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00c3\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00ca\b\u000e\u0001\u000e\u0003\u000e"+
		"\u00cd\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d2\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00d9\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00e0\b\u0011\n\u0011\f\u0011\u00e3\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00ec\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00f7\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fb\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00ff\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u010a\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u010f\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0113\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0121\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0139\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0140\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0154\b\u001a\n\u001a"+
		"\f\u001a\u0157\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u015c\b\u001b\n\u001b\f\u001b\u015f\t\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0000\u00014\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0007\u0001\u0000"+
		"$%\u0002\u0000\u000b\u000b\u0017\u0017\u0001\u0000\u000f\u0010\u0001\u0000"+
		"\u0011\u0014\u0001\u0000\n\u000b\u0001\u0000\f\r\u0002\u0000\u0001\u0004"+
		"\u0006\u0006\u017b\u0000:\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000"+
		"\u0000\u0004T\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000\b"+
		"}\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u008a\u0001"+
		"\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0096\u0001"+
		"\u0000\u0000\u0000\u0012\u0099\u0001\u0000\u0000\u0000\u0014\u00ad\u0001"+
		"\u0000\u0000\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00b9\u0001"+
		"\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000\u0000\u001c\u00cc\u0001"+
		"\u0000\u0000\u0000\u001e\u00ce\u0001\u0000\u0000\u0000 \u00d5\u0001\u0000"+
		"\u0000\u0000\"\u00dc\u0001\u0000\u0000\u0000$\u00e4\u0001\u0000\u0000"+
		"\u0000&\u00ed\u0001\u0000\u0000\u0000(\u00f3\u0001\u0000\u0000\u0000*"+
		"\u010e\u0001\u0000\u0000\u0000,\u0112\u0001\u0000\u0000\u0000.\u0114\u0001"+
		"\u0000\u0000\u00000\u0120\u0001\u0000\u0000\u00002\u0122\u0001\u0000\u0000"+
		"\u00004\u013f\u0001\u0000\u0000\u00006\u0158\u0001\u0000\u0000\u00008"+
		"\u0160\u0001\u0000\u0000\u0000:;\u0005\"\u0000\u0000;<\u0005\u0006\u0000"+
		"\u0000<@\u0005\u001e\u0000\u0000=?\u0003\u0002\u0001\u0000>=\u0001\u0000"+
		"\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AF\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"CE\u0003\u0004\u0002\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GL\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0003\n\u0005\u0000JI\u0001\u0000"+
		"\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OP\u0003\u0010\b\u0000PQ\u0005\u0000\u0000\u0001Q\u0001\u0001\u0000\u0000"+
		"\u0000RS\u0003\b\u0004\u0000S\u0003\u0001\u0000\u0000\u0000TU\u0005&\u0000"+
		"\u0000UV\u0005\u0006\u0000\u0000VZ\u0005\u001c\u0000\u0000WY\u0003\u0006"+
		"\u0003\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]^\u0005\u001d\u0000\u0000^_\u0005\u001e\u0000"+
		"\u0000_\u0005\u0001\u0000\u0000\u0000`a\u0007\u0000\u0000\u0000ab\u0005"+
		"\u0006\u0000\u0000bc\u0005\u001f\u0000\u0000cd\u00038\u001c\u0000de\u0005"+
		"\u001e\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fg\u0007\u0000\u0000"+
		"\u0000gh\u0005\u0006\u0000\u0000hi\u0005\u001f\u0000\u0000il\u00038\u001c"+
		"\u0000jk\u0005\u000e\u0000\u0000km\u00034\u001a\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\u001e"+
		"\u0000\u0000o~\u0001\u0000\u0000\u0000pq\u0007\u0000\u0000\u0000qv\u0005"+
		"\u0006\u0000\u0000rs\u0005 \u0000\u0000su\u0005\u0006\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000yz\u0005\u001f\u0000\u0000z{\u00038\u001c\u0000{|\u0005\u001e\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}f\u0001\u0000\u0000\u0000}p\u0001\u0000"+
		"\u0000\u0000~\t\u0001\u0000\u0000\u0000\u007f\u0080\u0005#\u0000\u0000"+
		"\u0080\u0081\u0005\u0006\u0000\u0000\u0081\u0083\u0005\u001a\u0000\u0000"+
		"\u0082\u0084\u0003\f\u0006\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005\u001b\u0000\u0000\u0086\u0087\u0005\u001f\u0000\u0000\u0087"+
		"\u0088\u00038\u001c\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089\u000b"+
		"\u0001\u0000\u0000\u0000\u008a\u008f\u0003\u000e\u0007\u0000\u008b\u008c"+
		"\u0005 \u0000\u0000\u008c\u008e\u0003\u000e\u0007\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\r\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0006"+
		"\u0000\u0000\u0093\u0094\u0005\u001f\u0000\u0000\u0094\u0095\u00038\u001c"+
		"\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0097\u0005\'\u0000\u0000"+
		"\u0097\u0098\u0003\u0012\t\u0000\u0098\u0011\u0001\u0000\u0000\u0000\u0099"+
		"\u009d\u0005\u001c\u0000\u0000\u009a\u009c\u0003\u0002\u0001\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u00a3\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0003\u0014\n\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001d\u0000\u0000\u00a7\u0013"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ae\u0003\u0016\u000b\u0000\u00a9\u00ae"+
		"\u0003$\u0012\u0000\u00aa\u00ae\u0003&\u0013\u0000\u00ab\u00ae\u0003("+
		"\u0014\u0000\u00ac\u00ae\u0003\u0012\t\u0000\u00ad\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u0015\u0001\u0000\u0000\u0000\u00af\u00b8\u0003\u0018\f\u0000"+
		"\u00b0\u00b1\u0003\u001c\u000e\u0000\u00b1\u00b2\u0005\u001e\u0000\u0000"+
		"\u00b2\u00b8\u0001\u0000\u0000\u0000\u00b3\u00b4\u00032\u0019\u0000\u00b4"+
		"\u00b5\u0005\u001e\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0003\b\u0004\u0000\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u0017\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0003\u001a\r\u0000\u00ba\u00bb\u0005\u000e\u0000\u0000\u00bb\u00bc\u0003"+
		"4\u001a\u0000\u00bc\u00bd\u0005\u001e\u0000\u0000\u00bd\u0019\u0001\u0000"+
		"\u0000\u0000\u00be\u00c3\u0005\u0006\u0000\u0000\u00bf\u00c0\u0005\u0006"+
		"\u0000\u0000\u00c0\u00c1\u0005!\u0000\u0000\u00c1\u00c3\u0005\u0006\u0000"+
		"\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00cd\u0003\u001e\u000f"+
		"\u0000\u00c5\u00cd\u0003 \u0010\u0000\u00c6\u00c7\u0005\u0006\u0000\u0000"+
		"\u00c7\u00c9\u0005\u001a\u0000\u0000\u00c8\u00ca\u00036\u001b\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\u001b\u0000\u0000\u00cc"+
		"\u00c4\u0001\u0000\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c6\u0001\u0000\u0000\u0000\u00cd\u001d\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005-\u0000\u0000\u00cf\u00d1\u0005\u001a\u0000\u0000\u00d0\u00d2"+
		"\u00036\u001b\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\u001b\u0000\u0000\u00d4\u001f\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		".\u0000\u0000\u00d6\u00d8\u0005\u001a\u0000\u0000\u00d7\u00d9\u0003\""+
		"\u0011\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u001b"+
		"\u0000\u0000\u00db!\u0001\u0000\u0000\u0000\u00dc\u00e1\u0005\u0006\u0000"+
		"\u0000\u00dd\u00de\u0005 \u0000\u0000\u00de\u00e0\u0005\u0006\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2#\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005(\u0000\u0000\u00e5\u00e6\u0005\u001a\u0000\u0000\u00e6\u00e7"+
		"\u00034\u001a\u0000\u00e7\u00e8\u0005\u001b\u0000\u0000\u00e8\u00eb\u0003"+
		"\u0012\t\u0000\u00e9\u00ea\u0005)\u0000\u0000\u00ea\u00ec\u0003\u0012"+
		"\t\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005*\u0000\u0000\u00ee"+
		"\u00ef\u0005\u001a\u0000\u0000\u00ef\u00f0\u00034\u001a\u0000\u00f0\u00f1"+
		"\u0005\u001b\u0000\u0000\u00f1\u00f2\u0003\u0012\t\u0000\u00f2\'\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0005+\u0000\u0000\u00f4\u00f6\u0005\u001a"+
		"\u0000\u0000\u00f5\u00f7\u0003*\u0015\u0000\u00f6\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0005\u001e\u0000\u0000\u00f9\u00fb\u00034\u001a\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0005\u001e\u0000\u0000"+
		"\u00fd\u00ff\u0003,\u0016\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\u001b\u0000\u0000\u0101\u0102\u0003\u0012\t\u0000\u0102)"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0007\u0000\u0000\u0000\u0104\u0105"+
		"\u0005\u0006\u0000\u0000\u0105\u0106\u0005\u001f\u0000\u0000\u0106\u0109"+
		"\u00038\u001c\u0000\u0107\u0108\u0005\u000e\u0000\u0000\u0108\u010a\u0003"+
		"4\u001a\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010f\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0006"+
		"\u0000\u0000\u010c\u010d\u0005\u000e\u0000\u0000\u010d\u010f\u00034\u001a"+
		"\u0000\u010e\u0103\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000"+
		"\u0000\u010f+\u0001\u0000\u0000\u0000\u0110\u0113\u00030\u0018\u0000\u0111"+
		"\u0113\u0003.\u0017\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0113-\u0001\u0000\u0000\u0000\u0114\u0115\u0003"+
		"\u001a\r\u0000\u0115\u0116\u0005\u000e\u0000\u0000\u0116\u0117\u00034"+
		"\u001a\u0000\u0117/\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0006\u0000"+
		"\u0000\u0119\u0121\u0005\u0018\u0000\u0000\u011a\u011b\u0005\u0006\u0000"+
		"\u0000\u011b\u0121\u0005\u0019\u0000\u0000\u011c\u011d\u0005\u0018\u0000"+
		"\u0000\u011d\u0121\u0005\u0006\u0000\u0000\u011e\u011f\u0005\u0019\u0000"+
		"\u0000\u011f\u0121\u0005\u0006\u0000\u0000\u0120\u0118\u0001\u0000\u0000"+
		"\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u01211\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0005,\u0000\u0000\u0123\u0124\u00034\u001a\u0000\u01243"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0006\u001a\uffff\uffff\u0000\u0126"+
		"\u0127\u0007\u0001\u0000\u0000\u0127\u0140\u00034\u001a\f\u0128\u0129"+
		"\u0005\u0006\u0000\u0000\u0129\u0140\u0005\u0018\u0000\u0000\u012a\u012b"+
		"\u0005\u0006\u0000\u0000\u012b\u0140\u0005\u0019\u0000\u0000\u012c\u012d"+
		"\u0005\u0018\u0000\u0000\u012d\u0140\u0005\u0006\u0000\u0000\u012e\u012f"+
		"\u0005\u0019\u0000\u0000\u012f\u0140\u0005\u0006\u0000\u0000\u0130\u0131"+
		"\u0005\u001a\u0000\u0000\u0131\u0132\u00034\u001a\u0000\u0132\u0133\u0005"+
		"\u001b\u0000\u0000\u0133\u0140\u0001\u0000\u0000\u0000\u0134\u0140\u0003"+
		"\u001a\r\u0000\u0135\u0136\u0005\u0006\u0000\u0000\u0136\u0138\u0005\u001a"+
		"\u0000\u0000\u0137\u0139\u00036\u001b\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u0140\u0005\u001b\u0000\u0000\u013b\u0140\u0005\b\u0000\u0000"+
		"\u013c\u0140\u0005\u0007\u0000\u0000\u013d\u0140\u0005\t\u0000\u0000\u013e"+
		"\u0140\u0005\u0005\u0000\u0000\u013f\u0125\u0001\u0000\u0000\u0000\u013f"+
		"\u0128\u0001\u0000\u0000\u0000\u013f\u012a\u0001\u0000\u0000\u0000\u013f"+
		"\u012c\u0001\u0000\u0000\u0000\u013f\u012e\u0001\u0000\u0000\u0000\u013f"+
		"\u0130\u0001\u0000\u0000\u0000\u013f\u0134\u0001\u0000\u0000\u0000\u013f"+
		"\u0135\u0001\u0000\u0000\u0000\u013f\u013b\u0001\u0000\u0000\u0000\u013f"+
		"\u013c\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f"+
		"\u013e\u0001\u0000\u0000\u0000\u0140\u0155\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\n\u0012\u0000\u0000\u0142\u0143\u0005\u0016\u0000\u0000\u0143\u0154"+
		"\u00034\u001a\u0013\u0144\u0145\n\u0011\u0000\u0000\u0145\u0146\u0005"+
		"\u0015\u0000\u0000\u0146\u0154\u00034\u001a\u0012\u0147\u0148\n\u0010"+
		"\u0000\u0000\u0148\u0149\u0007\u0002\u0000\u0000\u0149\u0154\u00034\u001a"+
		"\u0011\u014a\u014b\n\u000f\u0000\u0000\u014b\u014c\u0007\u0003\u0000\u0000"+
		"\u014c\u0154\u00034\u001a\u0010\u014d\u014e\n\u000e\u0000\u0000\u014e"+
		"\u014f\u0007\u0004\u0000\u0000\u014f\u0154\u00034\u001a\u000f\u0150\u0151"+
		"\n\r\u0000\u0000\u0151\u0152\u0007\u0005\u0000\u0000\u0152\u0154\u0003"+
		"4\u001a\u000e\u0153\u0141\u0001\u0000\u0000\u0000\u0153\u0144\u0001\u0000"+
		"\u0000\u0000\u0153\u0147\u0001\u0000\u0000\u0000\u0153\u014a\u0001\u0000"+
		"\u0000\u0000\u0153\u014d\u0001\u0000\u0000\u0000\u0153\u0150\u0001\u0000"+
		"\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u01565\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015d\u00034\u001a\u0000"+
		"\u0159\u015a\u0005 \u0000\u0000\u015a\u015c\u00034\u001a\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e7\u0001"+
		"\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0007"+
		"\u0006\u0000\u0000\u01619\u0001\u0000\u0000\u0000 @FLZlv}\u0083\u008f"+
		"\u009d\u00a3\u00ad\u00b7\u00c2\u00c9\u00cc\u00d1\u00d8\u00e1\u00eb\u00f6"+
		"\u00fa\u00fe\u0109\u010e\u0112\u0120\u0138\u013f\u0153\u0155\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}