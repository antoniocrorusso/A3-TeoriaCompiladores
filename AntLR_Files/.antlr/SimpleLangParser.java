// Generated from e:/_NonGameDevProjects/ANHEMBI/2025-2/UC-TeoriaCompiladores/A3-TeoriaCompiladores/AntLR_Files/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, IF=21, ELSE=22, WHILE=23, FOR=24, PASS=25, 
		SCANF=26, PRINTF=27, INT_T=28, FLOAT_T=29, BOOL_T=30, BOOL_LIT=31, ID=32, 
		NUMBER=33, WS=34, COMMENT=35, MCOMMENT=36;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_type = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_ifStmtNoElse = 5, RULE_ifStmtWithElse = 6, RULE_whileStmt = 7, 
		RULE_forStmt = 8, RULE_forInit = 9, RULE_forStep = 10, RULE_assignStmt = 11, 
		RULE_scanfStmt = 12, RULE_printfStmt = 13, RULE_expr = 14, RULE_orExpr = 15, 
		RULE_andExpr = 16, RULE_eqExpr = 17, RULE_relExpr = 18, RULE_addExpr = 19, 
		RULE_mulExpr = 20, RULE_unary = 21, RULE_primary = 22, RULE_literal = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "type", "statement", "block", "ifStmtNoElse", 
			"ifStmtWithElse", "whileStmt", "forStmt", "forInit", "forStep", "assignStmt", 
			"scanfStmt", "printfStmt", "expr", "orExpr", "andExpr", "eqExpr", "relExpr", 
			"addExpr", "mulExpr", "unary", "primary", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'{'", "'}'", "'('", "')'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!'", "'if'", "'else'", "'while'", "'for'", "'pass'", "'scanf'", "'printf'", 
			"'int'", "'float'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "IF", "ELSE", "WHILE", 
			"FOR", "PASS", "SCANF", "PRINTF", "INT_T", "FLOAT_T", "BOOL_T", "BOOL_LIT", 
			"ID", "NUMBER", "WS", "COMMENT", "MCOMMENT"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_T:
				case FLOAT_T:
				case BOOL_T:
					{
					setState(48);
					declaration();
					}
					break;
				case T__1:
				case T__2:
				case IF:
				case WHILE:
				case FOR:
				case SCANF:
				case PRINTF:
				case ID:
					{
					setState(49);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6402605068L) != 0) );
			setState(54);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			type();
			setState(57);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(58);
				match(T__0);
				setState(59);
				expr();
				}
			}

			setState(62);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(SimpleLangParser.INT_T, 0); }
		public TerminalNode FLOAT_T() { return getToken(SimpleLangParser.FLOAT_T, 0); }
		public TerminalNode BOOL_T() { return getToken(SimpleLangParser.BOOL_T, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtNoElseContext ifStmtNoElse() {
			return getRuleContext(IfStmtNoElseContext.class,0);
		}
		public IfStmtWithElseContext ifStmtWithElse() {
			return getRuleContext(IfStmtWithElseContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ScanfStmtContext scanfStmt() {
			return getRuleContext(ScanfStmtContext.class,0);
		}
		public PrintfStmtContext printfStmt() {
			return getRuleContext(PrintfStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				ifStmtNoElse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				ifStmtWithElse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				forStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				assignStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				scanfStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				printfStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				match(T__1);
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
	public static class BlockContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__2);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6402605068L) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_T:
				case FLOAT_T:
				case BOOL_T:
					{
					setState(78);
					declaration();
					}
					break;
				case T__1:
				case T__2:
				case IF:
				case WHILE:
				case FOR:
				case SCANF:
				case PRINTF:
				case ID:
					{
					setState(79);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__3);
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
	public static class IfStmtNoElseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleLangParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStmtNoElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmtNoElse; }
	}

	public final IfStmtNoElseContext ifStmtNoElse() throws RecognitionException {
		IfStmtNoElseContext _localctx = new IfStmtNoElseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmtNoElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IF);
			setState(88);
			match(T__4);
			setState(89);
			expr();
			setState(90);
			match(T__5);
			setState(91);
			statement();
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
	public static class IfStmtWithElseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleLangParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleLangParser.ELSE, 0); }
		public IfStmtWithElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmtWithElse; }
	}

	public final IfStmtWithElseContext ifStmtWithElse() throws RecognitionException {
		IfStmtWithElseContext _localctx = new IfStmtWithElseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStmtWithElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IF);
			setState(94);
			match(T__4);
			setState(95);
			expr();
			setState(96);
			match(T__5);
			setState(97);
			statement();
			setState(98);
			match(ELSE);
			setState(99);
			statement();
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
		public TerminalNode WHILE() { return getToken(SimpleLangParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(WHILE);
			setState(102);
			match(T__4);
			setState(103);
			expr();
			setState(104);
			match(T__5);
			setState(105);
			statement();
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
		public TerminalNode FOR() { return getToken(SimpleLangParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForStepContext forStep() {
			return getRuleContext(ForStepContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(FOR);
			setState(108);
			match(T__4);
			setState(109);
			forInit();
			setState(110);
			match(T__1);
			setState(111);
			expr();
			setState(112);
			match(T__1);
			setState(113);
			forStep();
			setState(114);
			match(T__5);
			setState(115);
			statement();
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public TerminalNode PASS() { return getToken(SimpleLangParser.PASS, 0); }
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forInit);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
			case FLOAT_T:
			case BOOL_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				assignStmt();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(PASS);
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
	public static class ForStepContext extends ParserRuleContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public TerminalNode PASS() { return getToken(SimpleLangParser.PASS, 0); }
		public ForStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStep; }
	}

	public final ForStepContext forStep() throws RecognitionException {
		ForStepContext _localctx = new ForStepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStep);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				assignStmt();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(PASS);
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
	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(T__0);
			setState(128);
			expr();
			setState(129);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScanfStmtContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(SimpleLangParser.SCANF, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public ScanfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfStmt; }
	}

	public final ScanfStmtContext scanfStmt() throws RecognitionException {
		ScanfStmtContext _localctx = new ScanfStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scanfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(SCANF);
			setState(132);
			match(T__4);
			setState(133);
			match(ID);
			setState(134);
			match(T__5);
			setState(135);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintfStmtContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(SimpleLangParser.PRINTF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfStmt; }
	}

	public final PrintfStmtContext printfStmt() throws RecognitionException {
		PrintfStmtContext _localctx = new PrintfStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(PRINTF);
			setState(138);
			match(T__4);
			setState(139);
			expr();
			setState(140);
			match(T__5);
			setState(141);
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
		enterRule(_localctx, 28, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			andExpr();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(146);
				match(T__6);
				setState(147);
				andExpr();
				}
				}
				setState(152);
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
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			eqExpr();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(154);
				match(T__7);
				setState(155);
				eqExpr();
				}
				}
				setState(160);
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
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			relExpr();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				relExpr();
				}
				}
				setState(168);
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
		public RelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr; }
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			addExpr();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				addExpr();
				}
				}
				setState(176);
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
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			mulExpr();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				mulExpr();
				}
				}
				setState(184);
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
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			unary();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				{
				setState(186);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				unary();
				}
				}
				setState(192);
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
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unary);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				unary();
				}
				break;
			case T__4:
			case BOOL_LIT:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				primary();
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
	public static class PrimaryContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__4);
				setState(199);
				expr();
				setState(200);
				match(T__5);
				}
				break;
			case BOOL_LIT:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(ID);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOL_LIT() { return getToken(SimpleLangParser.BOOL_LIT, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleLangParser.NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==BOOL_LIT || _la==NUMBER) ) {
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
		"\u0004\u0001$\u00d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0004\u00003\b\u0000\u000b\u0000\f\u00004\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003L\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004Q\b\u0004\n\u0004\f\u0004T\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\ty\b\t\u0001"+
		"\n\u0001\n\u0003\n}\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0095\b\u000f\n\u000f\f\u000f\u0098"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u009d\b\u0010"+
		"\n\u0010\f\u0010\u00a0\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00a5\b\u0011\n\u0011\f\u0011\u00a8\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00ad\b\u0012\n\u0012\f\u0012\u00b0\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00b5\b\u0013\n\u0013\f\u0013"+
		"\u00b8\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00bd\b"+
		"\u0014\n\u0014\f\u0014\u00c0\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00c5\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00cd\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0007\u0001"+
		"\u0000\u001c\u001e\u0001\u0000\t\n\u0001\u0000\u000b\u000e\u0001\u0000"+
		"\u000f\u0010\u0001\u0000\u0011\u0013\u0002\u0000\u0010\u0010\u0014\u0014"+
		"\u0002\u0000\u001f\u001f!!\u00d1\u00002\u0001\u0000\u0000\u0000\u0002"+
		"8\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006K\u0001"+
		"\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000"+
		"\f]\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010k\u0001"+
		"\u0000\u0000\u0000\u0012x\u0001\u0000\u0000\u0000\u0014|\u0001\u0000\u0000"+
		"\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u0083\u0001\u0000\u0000\u0000"+
		"\u001a\u0089\u0001\u0000\u0000\u0000\u001c\u008f\u0001\u0000\u0000\u0000"+
		"\u001e\u0091\u0001\u0000\u0000\u0000 \u0099\u0001\u0000\u0000\u0000\""+
		"\u00a1\u0001\u0000\u0000\u0000$\u00a9\u0001\u0000\u0000\u0000&\u00b1\u0001"+
		"\u0000\u0000\u0000(\u00b9\u0001\u0000\u0000\u0000*\u00c4\u0001\u0000\u0000"+
		"\u0000,\u00cc\u0001\u0000\u0000\u0000.\u00ce\u0001\u0000\u0000\u00000"+
		"3\u0003\u0002\u0001\u000013\u0003\u0006\u0003\u000020\u0001\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0005"+
		"\u0000\u0000\u00017\u0001\u0001\u0000\u0000\u000089\u0003\u0004\u0002"+
		"\u00009<\u0005 \u0000\u0000:;\u0005\u0001\u0000\u0000;=\u0003\u001c\u000e"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0005\u0002\u0000\u0000?\u0003\u0001\u0000\u0000\u0000"+
		"@A\u0007\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BL\u0003\b\u0004"+
		"\u0000CL\u0003\n\u0005\u0000DL\u0003\f\u0006\u0000EL\u0003\u000e\u0007"+
		"\u0000FL\u0003\u0010\b\u0000GL\u0003\u0016\u000b\u0000HL\u0003\u0018\f"+
		"\u0000IL\u0003\u001a\r\u0000JL\u0005\u0002\u0000\u0000KB\u0001\u0000\u0000"+
		"\u0000KC\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000KE\u0001\u0000"+
		"\u0000\u0000KF\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KH\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"L\u0007\u0001\u0000\u0000\u0000MR\u0005\u0003\u0000\u0000NQ\u0003\u0002"+
		"\u0001\u0000OQ\u0003\u0006\u0003\u0000PN\u0001\u0000\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000UV\u0005\u0004\u0000\u0000V\t\u0001\u0000\u0000\u0000WX\u0005\u0015"+
		"\u0000\u0000XY\u0005\u0005\u0000\u0000YZ\u0003\u001c\u000e\u0000Z[\u0005"+
		"\u0006\u0000\u0000[\\\u0003\u0006\u0003\u0000\\\u000b\u0001\u0000\u0000"+
		"\u0000]^\u0005\u0015\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0003\u001c"+
		"\u000e\u0000`a\u0005\u0006\u0000\u0000ab\u0003\u0006\u0003\u0000bc\u0005"+
		"\u0016\u0000\u0000cd\u0003\u0006\u0003\u0000d\r\u0001\u0000\u0000\u0000"+
		"ef\u0005\u0017\u0000\u0000fg\u0005\u0005\u0000\u0000gh\u0003\u001c\u000e"+
		"\u0000hi\u0005\u0006\u0000\u0000ij\u0003\u0006\u0003\u0000j\u000f\u0001"+
		"\u0000\u0000\u0000kl\u0005\u0018\u0000\u0000lm\u0005\u0005\u0000\u0000"+
		"mn\u0003\u0012\t\u0000no\u0005\u0002\u0000\u0000op\u0003\u001c\u000e\u0000"+
		"pq\u0005\u0002\u0000\u0000qr\u0003\u0014\n\u0000rs\u0005\u0006\u0000\u0000"+
		"st\u0003\u0006\u0003\u0000t\u0011\u0001\u0000\u0000\u0000uy\u0003\u0002"+
		"\u0001\u0000vy\u0003\u0016\u000b\u0000wy\u0005\u0019\u0000\u0000xu\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"y\u0013\u0001\u0000\u0000\u0000z}\u0003\u0016\u000b\u0000{}\u0005\u0019"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0015"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005 \u0000\u0000\u007f\u0080\u0005\u0001"+
		"\u0000\u0000\u0080\u0081\u0003\u001c\u000e\u0000\u0081\u0082\u0005\u0002"+
		"\u0000\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u001a"+
		"\u0000\u0000\u0084\u0085\u0005\u0005\u0000\u0000\u0085\u0086\u0005 \u0000"+
		"\u0000\u0086\u0087\u0005\u0006\u0000\u0000\u0087\u0088\u0005\u0002\u0000"+
		"\u0000\u0088\u0019\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u001b\u0000"+
		"\u0000\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008c\u0003\u001c\u000e"+
		"\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d\u008e\u0005\u0002\u0000"+
		"\u0000\u008e\u001b\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u001e\u000f"+
		"\u0000\u0090\u001d\u0001\u0000\u0000\u0000\u0091\u0096\u0003 \u0010\u0000"+
		"\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u0095\u0003 \u0010\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u001f\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u009e\u0003\"\u0011\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009d"+
		"\u0003\"\u0011\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f!\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a6\u0003$\u0012\u0000\u00a2\u00a3\u0007\u0001\u0000"+
		"\u0000\u00a3\u00a5\u0003$\u0012\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7#\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ae\u0003&\u0013\u0000\u00aa\u00ab"+
		"\u0007\u0002\u0000\u0000\u00ab\u00ad\u0003&\u0013\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af%\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003(\u0014"+
		"\u0000\u00b2\u00b3\u0007\u0003\u0000\u0000\u00b3\u00b5\u0003(\u0014\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\'\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00be\u0003*\u0015\u0000\u00ba\u00bb\u0007\u0004\u0000\u0000\u00bb\u00bd"+
		"\u0003*\u0015\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf)\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0007\u0005\u0000\u0000\u00c2\u00c5\u0003*\u0015"+
		"\u0000\u00c3\u00c5\u0003,\u0016\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5+\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\u0005\u0000\u0000\u00c7\u00c8\u0003\u001c\u000e\u0000\u00c8"+
		"\u00c9\u0005\u0006\u0000\u0000\u00c9\u00cd\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0003.\u0017\u0000\u00cb\u00cd\u0005 \u0000\u0000\u00cc\u00c6\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd-\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0006"+
		"\u0000\u0000\u00cf/\u0001\u0000\u0000\u0000\u001024<KPRx|\u0096\u009e"+
		"\u00a6\u00ae\u00b6\u00be\u00c4\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}