// Generated from d:/Importante/Estudo/UFPI/2025.2/Compiladores/trabalho final/JamScript/JamScript.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, PLUS=5, MINUS=6, STAR=7, SLASH=8, EQ=9, 
		EQEQ=10, NEQ=11, GT=12, LT=13, GE=14, LE=15, AND=16, OR=17, NOT=18, INC=19, 
		DEC=20, LPAREN=21, RPAREN=22, LBRACE=23, RBRACE=24, SEMI=25, COLON=26, 
		COMMA=27, DOT=28, PROGRAM=29, FUNCTION=30, LET=31, CONST=32, STRUCT=33, 
		MAIN=34, IF=35, ELSE=36, WHILE=37, FOR=38, RETURN=39, PRINT=40, INPUT=41, 
		WS=42, LINE_COMMENT=43, BLOCK_COMMENT=44, BOOL=45, ID=46, FLOAT=47, NUMBER=48, 
		STRING=49;
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
			null, "'int'", "'float'", "'bool'", "'string'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", 
			"'!'", "'++'", "'--'", "'('", "')'", "'{'", "'}'", "';'", "':'", "','", 
			"'.'", "'program'", "'function'", "'let'", "'const'", "'struct'", "'main'", 
			"'if'", "'else'", "'while'", "'for'", "'return'", "'print'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PLUS", "MINUS", "STAR", "SLASH", "EQ", 
			"EQEQ", "NEQ", "GT", "LT", "GE", "LE", "AND", "OR", "NOT", "INC", "DEC", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COLON", "COMMA", "DOT", 
			"PROGRAM", "FUNCTION", "LET", "CONST", "STRUCT", "MAIN", "IF", "ELSE", 
			"WHILE", "FOR", "RETURN", "PRINT", "INPUT", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
			"BOOL", "ID", "FLOAT", "NUMBER", "STRING"
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
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(96);
			match(ID);
			setState(97);
			match(COLON);
			setState(98);
			type_();
			setState(99);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				match(ID);
				setState(103);
				match(COLON);
				setState(104);
				type_();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(105);
					match(EQ);
					setState(106);
					expr(0);
					}
				}

				setState(109);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(112);
				match(ID);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					match(ID);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(COLON);
				setState(121);
				type_();
				setState(122);
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
			setState(126);
			match(FUNCTION);
			setState(127);
			match(ID);
			setState(128);
			match(LPAREN);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(129);
				paramList();
				}
			}

			setState(132);
			match(RPAREN);
			setState(133);
			match(COLON);
			setState(134);
			type_();
			setState(135);
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
			setState(137);
			param();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				param();
				}
				}
				setState(144);
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
			setState(145);
			match(ID);
			setState(146);
			match(COLON);
			setState(147);
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
			setState(149);
			match(MAIN);
			setState(150);
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
			setState(152);
			match(LBRACE);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					decl();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74670162313216L) != 0)) {
				{
				{
				setState(159);
				stmt();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
			case RETURN:
			case PRINT:
			case INPUT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				simpleStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				whileStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				forStmt();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				assignStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				callStmt();
				setState(176);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				returnStmt();
				setState(179);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
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
			setState(184);
			leftHandSide();
			setState(185);
			match(EQ);
			setState(186);
			expr(0);
			setState(187);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ID);
				setState(191);
				match(DOT);
				setState(192);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				printStmt();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				inputStmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(ID);
				setState(198);
				match(LPAREN);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715538686016L) != 0)) {
					{
					setState(199);
					argList();
					}
				}

				setState(202);
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
			setState(205);
			match(PRINT);
			setState(206);
			match(LPAREN);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715538686016L) != 0)) {
				{
				setState(207);
				argList();
				}
			}

			setState(210);
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
			setState(212);
			match(INPUT);
			setState(213);
			match(LPAREN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(214);
				idList();
				}
			}

			setState(217);
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
			setState(219);
			match(ID);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				match(ID);
				}
				}
				setState(226);
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
			setState(227);
			match(IF);
			setState(228);
			match(LPAREN);
			setState(229);
			expr(0);
			setState(230);
			match(RPAREN);
			setState(231);
			block();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(232);
				match(ELSE);
				setState(233);
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
			setState(236);
			match(WHILE);
			setState(237);
			match(LPAREN);
			setState(238);
			expr(0);
			setState(239);
			match(RPAREN);
			setState(240);
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
			setState(242);
			match(FOR);
			setState(243);
			match(LPAREN);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70375186628608L) != 0)) {
				{
				setState(244);
				forInit();
				}
			}

			setState(247);
			match(SEMI);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715538686016L) != 0)) {
				{
				setState(248);
				expr(0);
				}
			}

			setState(251);
			match(SEMI);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368745750528L) != 0)) {
				{
				setState(252);
				forUpdate();
				}
			}

			setState(255);
			match(RPAREN);
			setState(256);
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
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				match(ID);
				setState(260);
				match(COLON);
				setState(261);
				type_();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(262);
					match(EQ);
					setState(263);
					expr(0);
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(ID);
				setState(267);
				match(EQ);
				setState(268);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				incExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
			setState(275);
			leftHandSide();
			setState(276);
			match(EQ);
			setState(277);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(ID);
				setState(280);
				match(INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(ID);
				setState(282);
				match(DEC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(INC);
				setState(284);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(DEC);
				setState(286);
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
			setState(289);
			match(RETURN);
			setState(290);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(293);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new PostIncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(ID);
				setState(296);
				match(INC);
				}
				break;
			case 3:
				{
				_localctx = new PostDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(ID);
				setState(298);
				match(DEC);
				}
				break;
			case 4:
				{
				_localctx = new PreIncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(INC);
				setState(300);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new PreDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(DEC);
				setState(302);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(LPAREN);
				setState(304);
				expr(0);
				setState(305);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new FieldOrIdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				leftHandSide();
				}
				break;
			case 8:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(ID);
				setState(309);
				match(LPAREN);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715538686016L) != 0)) {
					{
					setState(310);
					argList();
					}
				}

				setState(313);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(NUMBER);
				}
				break;
			case 10:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(FLOAT);
				}
				break;
			case 11:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(STRING);
				}
				break;
			case 12:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(321);
						match(OR);
						setState(322);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(324);
						match(AND);
						setState(325);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(327);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(328);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(330);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(333);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(336);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						expr(14);
						}
						break;
					}
					} 
				}
				setState(342);
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
			setState(343);
			expr(0);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(344);
				match(COMMA);
				setState(345);
				expr(0);
				}
				}
				setState(350);
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
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744177694L) != 0)) ) {
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
		"\u0004\u00011\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"l\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004t\b\u0004\n\u0004\f\u0004w\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004}\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\t\u009b\b\t\n\t\f\t\u009e\t\t\u0001\t\u0005\t\u00a1\b"+
		"\t\n\t\f\t\u00a4\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00ad\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b7\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00c2\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00c9\b\u000e\u0001\u000e\u0003\u000e\u00cc\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d1\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d8\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00df"+
		"\b\u0011\n\u0011\f\u0011\u00e2\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00eb\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f6\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00fa\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00fe\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0109\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010e\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0112\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0120\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0138\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u013f\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0153\b\u001a\n\u001a\f\u001a\u0156\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u015b\b\u001b\n\u001b\f\u001b\u015e\t\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u00014\u001d\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468\u0000\u0007\u0001\u0000\u001f \u0002\u0000\u0006\u0006\u0012"+
		"\u0012\u0001\u0000\n\u000b\u0001\u0000\f\u000f\u0001\u0000\u0005\u0006"+
		"\u0001\u0000\u0007\b\u0002\u0000\u0001\u0004..\u017a\u0000:\u0001\u0000"+
		"\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000"+
		"\u0006_\u0001\u0000\u0000\u0000\b|\u0001\u0000\u0000\u0000\n~\u0001\u0000"+
		"\u0000\u0000\f\u0089\u0001\u0000\u0000\u0000\u000e\u0091\u0001\u0000\u0000"+
		"\u0000\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000"+
		"\u0000\u0014\u00ac\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000\u0000"+
		"\u0000\u0018\u00b8\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000\u0000"+
		"\u0000\u001c\u00cb\u0001\u0000\u0000\u0000\u001e\u00cd\u0001\u0000\u0000"+
		"\u0000 \u00d4\u0001\u0000\u0000\u0000\"\u00db\u0001\u0000\u0000\u0000"+
		"$\u00e3\u0001\u0000\u0000\u0000&\u00ec\u0001\u0000\u0000\u0000(\u00f2"+
		"\u0001\u0000\u0000\u0000*\u010d\u0001\u0000\u0000\u0000,\u0111\u0001\u0000"+
		"\u0000\u0000.\u0113\u0001\u0000\u0000\u00000\u011f\u0001\u0000\u0000\u0000"+
		"2\u0121\u0001\u0000\u0000\u00004\u013e\u0001\u0000\u0000\u00006\u0157"+
		"\u0001\u0000\u0000\u00008\u015f\u0001\u0000\u0000\u0000:;\u0005\u001d"+
		"\u0000\u0000;<\u0005.\u0000\u0000<@\u0005\u0019\u0000\u0000=?\u0003\u0002"+
		"\u0001\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AF\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000CE\u0003\u0004\u0002\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GL\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0003"+
		"\n\u0005\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0003\u0010\b\u0000PQ\u0005\u0000\u0000\u0001"+
		"Q\u0001\u0001\u0000\u0000\u0000RS\u0003\b\u0004\u0000S\u0003\u0001\u0000"+
		"\u0000\u0000TU\u0005!\u0000\u0000UV\u0005.\u0000\u0000VZ\u0005\u0017\u0000"+
		"\u0000WY\u0003\u0006\u0003\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u0018\u0000\u0000"+
		"^\u0005\u0001\u0000\u0000\u0000_`\u0007\u0000\u0000\u0000`a\u0005.\u0000"+
		"\u0000ab\u0005\u001a\u0000\u0000bc\u00038\u001c\u0000cd\u0005\u0019\u0000"+
		"\u0000d\u0007\u0001\u0000\u0000\u0000ef\u0007\u0000\u0000\u0000fg\u0005"+
		".\u0000\u0000gh\u0005\u001a\u0000\u0000hk\u00038\u001c\u0000ij\u0005\t"+
		"\u0000\u0000jl\u00034\u001a\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\u0019\u0000\u0000n}\u0001"+
		"\u0000\u0000\u0000op\u0007\u0000\u0000\u0000pu\u0005.\u0000\u0000qr\u0005"+
		"\u001b\u0000\u0000rt\u0005.\u0000\u0000sq\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u001a\u0000"+
		"\u0000yz\u00038\u001c\u0000z{\u0005\u0019\u0000\u0000{}\u0001\u0000\u0000"+
		"\u0000|e\u0001\u0000\u0000\u0000|o\u0001\u0000\u0000\u0000}\t\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u001e\u0000\u0000\u007f\u0080\u0005.\u0000\u0000"+
		"\u0080\u0082\u0005\u0015\u0000\u0000\u0081\u0083\u0003\f\u0006\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0016\u0000\u0000\u0085"+
		"\u0086\u0005\u001a\u0000\u0000\u0086\u0087\u00038\u001c\u0000\u0087\u0088"+
		"\u0003\u0012\t\u0000\u0088\u000b\u0001\u0000\u0000\u0000\u0089\u008e\u0003"+
		"\u000e\u0007\u0000\u008a\u008b\u0005\u001b\u0000\u0000\u008b\u008d\u0003"+
		"\u000e\u0007\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005.\u0000\u0000\u0092\u0093\u0005\u001a\u0000"+
		"\u0000\u0093\u0094\u00038\u001c\u0000\u0094\u000f\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\"\u0000\u0000\u0096\u0097\u0003\u0012\t\u0000\u0097"+
		"\u0011\u0001\u0000\u0000\u0000\u0098\u009c\u0005\u0017\u0000\u0000\u0099"+
		"\u009b\u0003\u0002\u0001\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u00a2\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u00a1\u0003\u0014\n\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005\u0018\u0000\u0000\u00a6\u0013\u0001\u0000\u0000\u0000\u00a7\u00ad"+
		"\u0003\u0016\u000b\u0000\u00a8\u00ad\u0003$\u0012\u0000\u00a9\u00ad\u0003"+
		"&\u0013\u0000\u00aa\u00ad\u0003(\u0014\u0000\u00ab\u00ad\u0003\u0012\t"+
		"\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u0015\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b7\u0003\u0018\f\u0000\u00af\u00b0\u0003\u001c\u000e\u0000"+
		"\u00b0\u00b1\u0005\u0019\u0000\u0000\u00b1\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u00032\u0019\u0000\u00b3\u00b4\u0005\u0019\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\b\u0004\u0000\u00b6\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b6\u00af\u0001\u0000\u0000\u0000\u00b6\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u0017"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u001a\r\u0000\u00b9\u00ba\u0005"+
		"\t\u0000\u0000\u00ba\u00bb\u00034\u001a\u0000\u00bb\u00bc\u0005\u0019"+
		"\u0000\u0000\u00bc\u0019\u0001\u0000\u0000\u0000\u00bd\u00c2\u0005.\u0000"+
		"\u0000\u00be\u00bf\u0005.\u0000\u0000\u00bf\u00c0\u0005\u001c\u0000\u0000"+
		"\u00c0\u00c2\u0005.\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1"+
		"\u00be\u0001\u0000\u0000\u0000\u00c2\u001b\u0001\u0000\u0000\u0000\u00c3"+
		"\u00cc\u0003\u001e\u000f\u0000\u00c4\u00cc\u0003 \u0010\u0000\u00c5\u00c6"+
		"\u0005.\u0000\u0000\u00c6\u00c8\u0005\u0015\u0000\u0000\u00c7\u00c9\u0003"+
		"6\u001b\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\u0016"+
		"\u0000\u0000\u00cb\u00c3\u0001\u0000\u0000\u0000\u00cb\u00c4\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cc\u001d\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005(\u0000\u0000\u00ce\u00d0\u0005\u0015\u0000"+
		"\u0000\u00cf\u00d1\u00036\u001b\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0016\u0000\u0000\u00d3\u001f\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0005)\u0000\u0000\u00d5\u00d7\u0005\u0015\u0000\u0000\u00d6"+
		"\u00d8\u0003\"\u0011\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u0016\u0000\u0000\u00da!\u0001\u0000\u0000\u0000\u00db\u00e0\u0005"+
		".\u0000\u0000\u00dc\u00dd\u0005\u001b\u0000\u0000\u00dd\u00df\u0005.\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1#\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005#\u0000\u0000\u00e4\u00e5\u0005\u0015\u0000\u0000\u00e5"+
		"\u00e6\u00034\u001a\u0000\u00e6\u00e7\u0005\u0016\u0000\u0000\u00e7\u00ea"+
		"\u0003\u0012\t\u0000\u00e8\u00e9\u0005$\u0000\u0000\u00e9\u00eb\u0003"+
		"\u0012\t\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb%\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005%\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0015\u0000\u0000\u00ee\u00ef\u00034\u001a\u0000\u00ef"+
		"\u00f0\u0005\u0016\u0000\u0000\u00f0\u00f1\u0003\u0012\t\u0000\u00f1\'"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005&\u0000\u0000\u00f3\u00f5\u0005"+
		"\u0015\u0000\u0000\u00f4\u00f6\u0003*\u0015\u0000\u00f5\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f9\u0005\u0019\u0000\u0000\u00f8\u00fa\u00034\u001a"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\u0019\u0000"+
		"\u0000\u00fc\u00fe\u0003,\u0016\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0005\u0016\u0000\u0000\u0100\u0101\u0003\u0012\t\u0000\u0101"+
		")\u0001\u0000\u0000\u0000\u0102\u0103\u0007\u0000\u0000\u0000\u0103\u0104"+
		"\u0005.\u0000\u0000\u0104\u0105\u0005\u001a\u0000\u0000\u0105\u0108\u0003"+
		"8\u001c\u0000\u0106\u0107\u0005\t\u0000\u0000\u0107\u0109\u00034\u001a"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010e\u0001\u0000\u0000\u0000\u010a\u010b\u0005.\u0000\u0000"+
		"\u010b\u010c\u0005\t\u0000\u0000\u010c\u010e\u00034\u001a\u0000\u010d"+
		"\u0102\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010e"+
		"+\u0001\u0000\u0000\u0000\u010f\u0112\u00030\u0018\u0000\u0110\u0112\u0003"+
		".\u0017\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000"+
		"\u0000\u0000\u0112-\u0001\u0000\u0000\u0000\u0113\u0114\u0003\u001a\r"+
		"\u0000\u0114\u0115\u0005\t\u0000\u0000\u0115\u0116\u00034\u001a\u0000"+
		"\u0116/\u0001\u0000\u0000\u0000\u0117\u0118\u0005.\u0000\u0000\u0118\u0120"+
		"\u0005\u0013\u0000\u0000\u0119\u011a\u0005.\u0000\u0000\u011a\u0120\u0005"+
		"\u0014\u0000\u0000\u011b\u011c\u0005\u0013\u0000\u0000\u011c\u0120\u0005"+
		".\u0000\u0000\u011d\u011e\u0005\u0014\u0000\u0000\u011e\u0120\u0005.\u0000"+
		"\u0000\u011f\u0117\u0001\u0000\u0000\u0000\u011f\u0119\u0001\u0000\u0000"+
		"\u0000\u011f\u011b\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u01201\u0001\u0000\u0000\u0000\u0121\u0122\u0005\'\u0000\u0000"+
		"\u0122\u0123\u00034\u001a\u0000\u01233\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0006\u001a\uffff\uffff\u0000\u0125\u0126\u0007\u0001\u0000\u0000\u0126"+
		"\u013f\u00034\u001a\f\u0127\u0128\u0005.\u0000\u0000\u0128\u013f\u0005"+
		"\u0013\u0000\u0000\u0129\u012a\u0005.\u0000\u0000\u012a\u013f\u0005\u0014"+
		"\u0000\u0000\u012b\u012c\u0005\u0013\u0000\u0000\u012c\u013f\u0005.\u0000"+
		"\u0000\u012d\u012e\u0005\u0014\u0000\u0000\u012e\u013f\u0005.\u0000\u0000"+
		"\u012f\u0130\u0005\u0015\u0000\u0000\u0130\u0131\u00034\u001a\u0000\u0131"+
		"\u0132\u0005\u0016\u0000\u0000\u0132\u013f\u0001\u0000\u0000\u0000\u0133"+
		"\u013f\u0003\u001a\r\u0000\u0134\u0135\u0005.\u0000\u0000\u0135\u0137"+
		"\u0005\u0015\u0000\u0000\u0136\u0138\u00036\u001b\u0000\u0137\u0136\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001"+
		"\u0000\u0000\u0000\u0139\u013f\u0005\u0016\u0000\u0000\u013a\u013f\u0005"+
		"0\u0000\u0000\u013b\u013f\u0005/\u0000\u0000\u013c\u013f\u00051\u0000"+
		"\u0000\u013d\u013f\u0005-\u0000\u0000\u013e\u0124\u0001\u0000\u0000\u0000"+
		"\u013e\u0127\u0001\u0000\u0000\u0000\u013e\u0129\u0001\u0000\u0000\u0000"+
		"\u013e\u012b\u0001\u0000\u0000\u0000\u013e\u012d\u0001\u0000\u0000\u0000"+
		"\u013e\u012f\u0001\u0000\u0000\u0000\u013e\u0133\u0001\u0000\u0000\u0000"+
		"\u013e\u0134\u0001\u0000\u0000\u0000\u013e\u013a\u0001\u0000\u0000\u0000"+
		"\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0154\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\n\u0012\u0000\u0000\u0141\u0142\u0005\u0011\u0000\u0000\u0142"+
		"\u0153\u00034\u001a\u0013\u0143\u0144\n\u0011\u0000\u0000\u0144\u0145"+
		"\u0005\u0010\u0000\u0000\u0145\u0153\u00034\u001a\u0012\u0146\u0147\n"+
		"\u0010\u0000\u0000\u0147\u0148\u0007\u0002\u0000\u0000\u0148\u0153\u0003"+
		"4\u001a\u0011\u0149\u014a\n\u000f\u0000\u0000\u014a\u014b\u0007\u0003"+
		"\u0000\u0000\u014b\u0153\u00034\u001a\u0010\u014c\u014d\n\u000e\u0000"+
		"\u0000\u014d\u014e\u0007\u0004\u0000\u0000\u014e\u0153\u00034\u001a\u000f"+
		"\u014f\u0150\n\r\u0000\u0000\u0150\u0151\u0007\u0005\u0000\u0000\u0151"+
		"\u0153\u00034\u001a\u000e\u0152\u0140\u0001\u0000\u0000\u0000\u0152\u0143"+
		"\u0001\u0000\u0000\u0000\u0152\u0146\u0001\u0000\u0000\u0000\u0152\u0149"+
		"\u0001\u0000\u0000\u0000\u0152\u014c\u0001\u0000\u0000\u0000\u0152\u014f"+
		"\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u01555\u0001"+
		"\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015c\u0003"+
		"4\u001a\u0000\u0158\u0159\u0005\u001b\u0000\u0000\u0159\u015b\u00034\u001a"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015d7\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0007\u0006\u0000\u0000\u01609\u0001\u0000\u0000\u0000 @"+
		"FLZku|\u0082\u008e\u009c\u00a2\u00ac\u00b6\u00c1\u00c8\u00cb\u00d0\u00d7"+
		"\u00e0\u00ea\u00f5\u00f9\u00fd\u0108\u010d\u0111\u011f\u0137\u013e\u0152"+
		"\u0154\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}