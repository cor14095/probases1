// Generated from ../Front-end/antlr/gramatica/SQLGramatica.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, CREATE=17, 
		DATABASE=18, DATABASES=19, ALTER=20, RENAME=21, DROP=22, TO=23, SHOW=24, 
		USE=25, CONSTRAINT=26, PRIMARY=27, FOREIGN=28, KEY=29, REFERENCES=30, 
		CHECK=31, INT=32, FLOAT=33, DATE=34, CHAR=35, AND=36, OR=37, NOT=38, TABLE=39, 
		TABLES=40, ADD=41, COLUMN=42, COLUMNS=43, SHOWX=44, FROM=45, INSERT=46, 
		SELECT=47, VALUES=48, INTO=49, UPDATE=50, SET=51, WHERE=52, DELETE=53, 
		ORDER=54, BY=55, ASC=56, DESC=57, NULL=58, WS=59, IDX=60, NUMX=61, CHARS=62, 
		CHARX=63, STRING=64, COMMENTX=65, DIGITX=66;
	public static final int
		RULE_literal = 0, RULE_fecha = 1, RULE_programa = 2, RULE_database = 3, 
		RULE_createDatabase = 4, RULE_alterDatabase = 5, RULE_dropDatabase = 6, 
		RULE_showDatabase = 7, RULE_useDatabase = 8, RULE_opTable = 9, RULE_tipo = 10, 
		RULE_createTable = 11, RULE_constraint = 12, RULE_primaryKey = 13, RULE_foreignKey = 14, 
		RULE_check = 15, RULE_exp = 16, RULE_orExpression = 17, RULE_andExpression = 18, 
		RULE_equalsExpression = 19, RULE_relationExpression = 20, RULE_addSubsExpression = 21, 
		RULE_mulDivExpression = 22, RULE_basicExpression = 23, RULE_alterTable = 24, 
		RULE_action = 25, RULE_dropTable = 26, RULE_showTables = 27, RULE_showColumns = 28, 
		RULE_insertInto = 29, RULE_updateSet = 30, RULE_deleteFrom = 31, RULE_selectFrom = 32, 
		RULE_sep = 33, RULE_rel_op = 34, RULE_eq_op = 35, RULE_add_op = 36, RULE_mult_op = 37;
	public static final String[] ruleNames = {
		"literal", "fecha", "programa", "database", "createDatabase", "alterDatabase", 
		"dropDatabase", "showDatabase", "useDatabase", "opTable", "tipo", "createTable", 
		"constraint", "primaryKey", "foreignKey", "check", "exp", "orExpression", 
		"andExpression", "equalsExpression", "relationExpression", "addSubsExpression", 
		"mulDivExpression", "basicExpression", "alterTable", "action", "dropTable", 
		"showTables", "showColumns", "insertInto", "updateSet", "deleteFrom", 
		"selectFrom", "sep", "rel_op", "eq_op", "add_op", "mult_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "';'", "'('", "')'", "','", "'='", "'*'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'+'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "CREATE", "DATABASE", "DATABASES", "ALTER", 
		"RENAME", "DROP", "TO", "SHOW", "USE", "CONSTRAINT", "PRIMARY", "FOREIGN", 
		"KEY", "REFERENCES", "CHECK", "INT", "FLOAT", "DATE", "CHAR", "AND", "OR", 
		"NOT", "TABLE", "TABLES", "ADD", "COLUMN", "COLUMNS", "SHOWX", "FROM", 
		"INSERT", "SELECT", "VALUES", "INTO", "UPDATE", "SET", "WHERE", "DELETE", 
		"ORDER", "BY", "ASC", "DESC", "NULL", "WS", "IDX", "NUMX", "CHARS", "CHARX", 
		"STRING", "COMMENTX", "DIGITX"
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

	@Override
	public String getGrammarFileName() { return "SQLGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public TerminalNode NUMX() { return getToken(SQLGramaticaParser.NUMX, 0); }
		public TerminalNode CHARX() { return getToken(SQLGramaticaParser.CHARX, 0); }
		public FechaContext fecha() {
			return getRuleContext(FechaContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SQLGramaticaParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDX:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(IDX);
				}
				break;
			case NUMX:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(NUMX);
				}
				break;
			case CHARX:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(CHARX);
				}
				break;
			case DIGITX:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				fecha();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(STRING);
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

	public static class FechaContext extends ParserRuleContext {
		public List<TerminalNode> DIGITX() { return getTokens(SQLGramaticaParser.DIGITX); }
		public TerminalNode DIGITX(int i) {
			return getToken(SQLGramaticaParser.DIGITX, i);
		}
		public FechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterFecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitFecha(this);
		}
	}

	public final FechaContext fecha() throws RecognitionException {
		FechaContext _localctx = new FechaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(DIGITX);
			setState(84);
			match(DIGITX);
			setState(85);
			match(DIGITX);
			setState(86);
			match(DIGITX);
			setState(87);
			match(T__0);
			setState(88);
			match(DIGITX);
			setState(89);
			match(DIGITX);
			setState(90);
			match(T__0);
			setState(91);
			match(DIGITX);
			setState(92);
			match(DIGITX);
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

	public static class ProgramaContext extends ParserRuleContext {
		public List<DatabaseContext> database() {
			return getRuleContexts(DatabaseContext.class);
		}
		public DatabaseContext database(int i) {
			return getRuleContext(DatabaseContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programa);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP) | (1L << SHOW) | (1L << USE) | (1L << INSERT) | (1L << SELECT) | (1L << UPDATE) | (1L << DELETE))) != 0)) {
					{
					{
					setState(95);
					database();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class DatabaseContext extends ParserRuleContext {
		public List<CreateDatabaseContext> createDatabase() {
			return getRuleContexts(CreateDatabaseContext.class);
		}
		public CreateDatabaseContext createDatabase(int i) {
			return getRuleContext(CreateDatabaseContext.class,i);
		}
		public List<AlterDatabaseContext> alterDatabase() {
			return getRuleContexts(AlterDatabaseContext.class);
		}
		public AlterDatabaseContext alterDatabase(int i) {
			return getRuleContext(AlterDatabaseContext.class,i);
		}
		public List<DropDatabaseContext> dropDatabase() {
			return getRuleContexts(DropDatabaseContext.class);
		}
		public DropDatabaseContext dropDatabase(int i) {
			return getRuleContext(DropDatabaseContext.class,i);
		}
		public List<ShowDatabaseContext> showDatabase() {
			return getRuleContexts(ShowDatabaseContext.class);
		}
		public ShowDatabaseContext showDatabase(int i) {
			return getRuleContext(ShowDatabaseContext.class,i);
		}
		public List<UseDatabaseContext> useDatabase() {
			return getRuleContexts(UseDatabaseContext.class);
		}
		public UseDatabaseContext useDatabase(int i) {
			return getRuleContext(UseDatabaseContext.class,i);
		}
		public List<OpTableContext> opTable() {
			return getRuleContexts(OpTableContext.class);
		}
		public OpTableContext opTable(int i) {
			return getRuleContext(OpTableContext.class,i);
		}
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitDatabase(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_database);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(103);
				createDatabase();
				}
				break;
			case 2:
				{
				setState(104);
				alterDatabase();
				}
				break;
			case 3:
				{
				setState(105);
				dropDatabase();
				}
				break;
			case 4:
				{
				setState(106);
				showDatabase();
				}
				break;
			case 5:
				{
				setState(107);
				useDatabase();
				}
				break;
			case 6:
				{
				setState(108);
				opTable();
				}
				break;
			}
			{
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(T__1);
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(112);
						createDatabase();
						}
						break;
					case 2:
						{
						setState(113);
						alterDatabase();
						}
						break;
					case 3:
						{
						setState(114);
						dropDatabase();
						}
						break;
					case 4:
						{
						setState(115);
						showDatabase();
						}
						break;
					case 5:
						{
						setState(116);
						useDatabase();
						}
						break;
					case 6:
						{
						setState(117);
						opTable();
						}
						break;
					}
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(125);
				match(T__1);
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

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLGramaticaParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SQLGramaticaParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitCreateDatabase(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CREATE);
			setState(129);
			match(DATABASE);
			setState(130);
			match(IDX);
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

	public static class AlterDatabaseContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGramaticaParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SQLGramaticaParser.DATABASE, 0); }
		public List<TerminalNode> IDX() { return getTokens(SQLGramaticaParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(SQLGramaticaParser.IDX, i);
		}
		public TerminalNode RENAME() { return getToken(SQLGramaticaParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SQLGramaticaParser.TO, 0); }
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterAlterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitAlterDatabase(this);
		}
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alterDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ALTER);
			setState(133);
			match(DATABASE);
			setState(134);
			match(IDX);
			setState(135);
			match(RENAME);
			setState(136);
			match(TO);
			setState(137);
			match(IDX);
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

	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLGramaticaParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SQLGramaticaParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitDropDatabase(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DROP);
			setState(140);
			match(DATABASE);
			setState(141);
			match(IDX);
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

	public static class ShowDatabaseContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SQLGramaticaParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SQLGramaticaParser.DATABASES, 0); }
		public ShowDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterShowDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitShowDatabase(this);
		}
	}

	public final ShowDatabaseContext showDatabase() throws RecognitionException {
		ShowDatabaseContext _localctx = new ShowDatabaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_showDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(SHOW);
			setState(144);
			match(DATABASES);
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

	public static class UseDatabaseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(SQLGramaticaParser.USE, 0); }
		public TerminalNode DATABASE() { return getToken(SQLGramaticaParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public UseDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterUseDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitUseDatabase(this);
		}
	}

	public final UseDatabaseContext useDatabase() throws RecognitionException {
		UseDatabaseContext _localctx = new UseDatabaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(USE);
			setState(147);
			match(DATABASE);
			setState(148);
			match(IDX);
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

	public static class OpTableContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public ShowTablesContext showTables() {
			return getRuleContext(ShowTablesContext.class,0);
		}
		public ShowColumnsContext showColumns() {
			return getRuleContext(ShowColumnsContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public UpdateSetContext updateSet() {
			return getRuleContext(UpdateSetContext.class,0);
		}
		public DeleteFromContext deleteFrom() {
			return getRuleContext(DeleteFromContext.class,0);
		}
		public SelectFromContext selectFrom() {
			return getRuleContext(SelectFromContext.class,0);
		}
		public OpTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterOpTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitOpTable(this);
		}
	}

	public final OpTableContext opTable() throws RecognitionException {
		OpTableContext _localctx = new OpTableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(150);
				createTable();
				}
				break;
			case 2:
				{
				setState(151);
				alterTable();
				}
				break;
			case 3:
				{
				setState(152);
				dropTable();
				}
				break;
			case 4:
				{
				setState(153);
				showTables();
				}
				break;
			case 5:
				{
				setState(154);
				showColumns();
				}
				break;
			case 6:
				{
				setState(155);
				insertInto();
				}
				break;
			case 7:
				{
				setState(156);
				updateSet();
				}
				break;
			case 8:
				{
				setState(157);
				deleteFrom();
				}
				break;
			case 9:
				{
				setState(158);
				selectFrom();
				}
				break;
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SQLGramaticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SQLGramaticaParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(SQLGramaticaParser.DATE, 0); }
		public TerminalNode CHAR() { return getToken(SQLGramaticaParser.CHAR, 0); }
		public TerminalNode NUMX() { return getToken(SQLGramaticaParser.NUMX, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(FLOAT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(DATE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(CHAR);
				setState(165);
				match(T__2);
				setState(166);
				match(NUMX);
				setState(167);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLGramaticaParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLGramaticaParser.TABLE, 0); }
		public List<TerminalNode> IDX() { return getTokens(SQLGramaticaParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(SQLGramaticaParser.IDX, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> CONSTRAINT() { return getTokens(SQLGramaticaParser.CONSTRAINT); }
		public TerminalNode CONSTRAINT(int i) {
			return getToken(SQLGramaticaParser.CONSTRAINT, i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitCreateTable(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CREATE);
			setState(171);
			match(TABLE);
			setState(172);
			match(IDX);
			setState(173);
			match(T__2);
			setState(174);
			match(IDX);
			setState(175);
			tipo();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					match(T__4);
					setState(177);
					match(IDX);
					setState(178);
					tipo();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(184);
				match(T__4);
				setState(185);
				match(CONSTRAINT);
				setState(186);
				constraint();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(187);
					match(T__4);
					setState(188);
					match(CONSTRAINT);
					setState(189);
					constraint();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(197);
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

	public static class ConstraintContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public List<ForeignKeyContext> foreignKey() {
			return getRuleContexts(ForeignKeyContext.class);
		}
		public ForeignKeyContext foreignKey(int i) {
			return getRuleContext(ForeignKeyContext.class,i);
		}
		public List<CheckContext> check() {
			return getRuleContexts(CheckContext.class);
		}
		public CheckContext check(int i) {
			return getRuleContext(CheckContext.class,i);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constraint);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				primaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				foreignKey();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDX) {
					{
					{
					setState(201);
					foreignKey();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				check();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDX) {
					{
					{
					setState(208);
					check();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(SQLGramaticaParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(SQLGramaticaParser.IDX, i);
		}
		public TerminalNode PRIMARY() { return getToken(SQLGramaticaParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLGramaticaParser.KEY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitPrimaryKey(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(IDX);
			setState(217);
			match(PRIMARY);
			setState(218);
			match(KEY);
			setState(219);
			match(T__2);
			setState(220);
			match(IDX);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(221);
				match(T__4);
				setState(222);
				match(IDX);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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

	public static class ForeignKeyContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(SQLGramaticaParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(SQLGramaticaParser.IDX, i);
		}
		public TerminalNode FOREIGN() { return getToken(SQLGramaticaParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLGramaticaParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(SQLGramaticaParser.REFERENCES, 0); }
		public ForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterForeignKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitForeignKey(this);
		}
	}

	public final ForeignKeyContext foreignKey() throws RecognitionException {
		ForeignKeyContext _localctx = new ForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_foreignKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(IDX);
			setState(231);
			match(FOREIGN);
			setState(232);
			match(KEY);
			setState(233);
			match(T__2);
			setState(234);
			match(IDX);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(235);
				match(T__4);
				setState(236);
				match(IDX);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__3);
			setState(243);
			match(REFERENCES);
			setState(244);
			match(IDX);
			setState(245);
			match(T__2);
			setState(246);
			match(IDX);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(247);
				match(T__4);
				setState(248);
				match(IDX);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
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

	public static class CheckContext extends ParserRuleContext {
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public TerminalNode CHECK() { return getToken(SQLGramaticaParser.CHECK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitCheck(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(IDX);
			setState(257);
			match(CHECK);
			{
			setState(258);
			exp();
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

	public static class ExpContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__2);
				setState(261);
				orExpression(0);
				setState(262);
				match(T__3);
				}
				break;
			case EOF:
			case T__1:
			case T__3:
			case T__4:
			case CREATE:
			case ALTER:
			case DROP:
			case SHOW:
			case USE:
			case INSERT:
			case SELECT:
			case UPDATE:
			case DELETE:
			case ORDER:
			case ASC:
			case DESC:
			case IDX:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(SQLGramaticaParser.OR, 0); }
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitOrExpression(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(270);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(271);
					match(OR);
					setState(272);
					andExpression(0);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLGramaticaParser.AND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279);
			equalsExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(281);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(282);
					match(AND);
					setState(283);
					equalsExpression(0);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class EqualsExpressionContext extends ParserRuleContext {
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public EqualsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitEqualsExpression(this);
		}
	}

	public final EqualsExpressionContext equalsExpression() throws RecognitionException {
		return equalsExpression(0);
	}

	private EqualsExpressionContext equalsExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualsExpressionContext _localctx = new EqualsExpressionContext(_ctx, _parentState);
		EqualsExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_equalsExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(290);
			relationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualsExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalsExpression);
					setState(292);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(293);
					eq_op();
					setState(294);
					relationExpression(0);
					}
					} 
				}
				setState(300);
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

	public static class RelationExpressionContext extends ParserRuleContext {
		public AddSubsExpressionContext addSubsExpression() {
			return getRuleContext(AddSubsExpressionContext.class,0);
		}
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public RelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitRelationExpression(this);
		}
	}

	public final RelationExpressionContext relationExpression() throws RecognitionException {
		return relationExpression(0);
	}

	private RelationExpressionContext relationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationExpressionContext _localctx = new RelationExpressionContext(_ctx, _parentState);
		RelationExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_relationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			addSubsExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpression);
					setState(304);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(305);
					rel_op();
					setState(306);
					addSubsExpression(0);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class AddSubsExpressionContext extends ParserRuleContext {
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public AddSubsExpressionContext addSubsExpression() {
			return getRuleContext(AddSubsExpressionContext.class,0);
		}
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public AddSubsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterAddSubsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitAddSubsExpression(this);
		}
	}

	public final AddSubsExpressionContext addSubsExpression() throws RecognitionException {
		return addSubsExpression(0);
	}

	private AddSubsExpressionContext addSubsExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddSubsExpressionContext _localctx = new AddSubsExpressionContext(_ctx, _parentState);
		AddSubsExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_addSubsExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314);
			mulDivExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubsExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addSubsExpression);
					setState(316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(317);
					add_op();
					setState(318);
					mulDivExpression(0);
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class MulDivExpressionContext extends ParserRuleContext {
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public Mult_opContext mult_op() {
			return getRuleContext(Mult_opContext.class,0);
		}
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitMulDivExpression(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		return mulDivExpression(0);
	}

	private MulDivExpressionContext mulDivExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, _parentState);
		MulDivExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_mulDivExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			basicExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulDivExpression);
					setState(328);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(329);
					mult_op();
					setState(330);
					basicExpression();
					}
					} 
				}
				setState(336);
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

	public static class BasicExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLGramaticaParser.NOT, 0); }
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterBasicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitBasicExpression(this);
		}
	}

	public final BasicExpressionContext basicExpression() throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_basicExpression);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(T__2);
				setState(338);
				orExpression(0);
				setState(339);
				match(T__3);
				}
				break;
			case IDX:
			case NUMX:
			case CHARX:
			case STRING:
			case DIGITX:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				literal();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(NOT);
				setState(343);
				match(T__2);
				setState(344);
				orExpression(0);
				setState(345);
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

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGramaticaParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLGramaticaParser.TABLE, 0); }
		public List<TerminalNode> IDX() { return getTokens(SQLGramaticaParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(SQLGramaticaParser.IDX, i);
		}
		public TerminalNode RENAME() { return getToken(SQLGramaticaParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SQLGramaticaParser.TO, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitAlterTable(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alterTable);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(ALTER);
				setState(350);
				match(TABLE);
				setState(351);
				match(IDX);
				setState(352);
				match(RENAME);
				setState(353);
				match(TO);
				setState(354);
				match(IDX);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(ALTER);
				setState(356);
				match(TABLE);
				setState(357);
				match(IDX);
				setState(358);
				action();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(359);
					match(T__4);
					setState(360);
					action();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLGramaticaParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SQLGramaticaParser.COLUMN, 0); }
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLGramaticaParser.CONSTRAINT, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public TerminalNode DROP() { return getToken(SQLGramaticaParser.DROP, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_action);
		int _la;
		try {
			int _alt;
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(ADD);
				setState(369);
				match(COLUMN);
				setState(370);
				match(IDX);
				setState(371);
				tipo();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(372);
					match(CONSTRAINT);
					setState(373);
					constraint();
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(374);
							match(T__4);
							setState(375);
							constraint();
							}
							} 
						}
						setState(380);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(ADD);
				setState(384);
				match(CONSTRAINT);
				setState(385);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(DROP);
				setState(387);
				match(COLUMN);
				setState(388);
				match(IDX);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(DROP);
				setState(390);
				match(CONSTRAINT);
				setState(391);
				match(IDX);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLGramaticaParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLGramaticaParser.TABLE, 0); }
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitDropTable(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(DROP);
			setState(395);
			match(TABLE);
			setState(396);
			match(IDX);
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

	public static class ShowTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SQLGramaticaParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SQLGramaticaParser.TABLES, 0); }
		public ShowTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitShowTables(this);
		}
	}

	public final ShowTablesContext showTables() throws RecognitionException {
		ShowTablesContext _localctx = new ShowTablesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_showTables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(SHOW);
			setState(399);
			match(TABLES);
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

	public static class ShowColumnsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SQLGramaticaParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SQLGramaticaParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(SQLGramaticaParser.FROM, 0); }
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public ShowColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitShowColumns(this);
		}
	}

	public final ShowColumnsContext showColumns() throws RecognitionException {
		ShowColumnsContext _localctx = new ShowColumnsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_showColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(SHOW);
			setState(402);
			match(COLUMNS);
			setState(403);
			match(FROM);
			setState(404);
			match(IDX);
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

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLGramaticaParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLGramaticaParser.INTO, 0); }
		public List<TerminalNode> IDX() { return getTokens(SQLGramaticaParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(SQLGramaticaParser.IDX, i);
		}
		public TerminalNode VALUES() { return getToken(SQLGramaticaParser.VALUES, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitInsertInto(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insertInto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(INSERT);
			setState(407);
			match(INTO);
			setState(408);
			match(IDX);
			setState(409);
			match(T__2);
			setState(410);
			match(IDX);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(411);
				match(T__4);
				setState(412);
				match(IDX);
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(T__3);
			setState(419);
			match(VALUES);
			setState(420);
			match(T__2);
			setState(421);
			literal();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(422);
				match(T__4);
				setState(423);
				literal();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
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

	public static class UpdateSetContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLGramaticaParser.UPDATE, 0); }
		public List<TerminalNode> IDX() { return getTokens(SQLGramaticaParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(SQLGramaticaParser.IDX, i);
		}
		public TerminalNode SET() { return getToken(SQLGramaticaParser.SET, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SQLGramaticaParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UpdateSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterUpdateSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitUpdateSet(this);
		}
	}

	public final UpdateSetContext updateSet() throws RecognitionException {
		UpdateSetContext _localctx = new UpdateSetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_updateSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(UPDATE);
			setState(432);
			match(IDX);
			setState(433);
			match(SET);
			setState(434);
			match(IDX);
			setState(435);
			match(T__5);
			setState(436);
			tipo();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(437);
				match(T__4);
				setState(438);
				tipo();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(444);
				match(WHERE);
				setState(445);
				exp();
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

	public static class DeleteFromContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQLGramaticaParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SQLGramaticaParser.FROM, 0); }
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public TerminalNode WHERE() { return getToken(SQLGramaticaParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeleteFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterDeleteFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitDeleteFrom(this);
		}
	}

	public final DeleteFromContext deleteFrom() throws RecognitionException {
		DeleteFromContext _localctx = new DeleteFromContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_deleteFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(DELETE);
			setState(449);
			match(FROM);
			setState(450);
			match(IDX);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(451);
				match(WHERE);
				setState(452);
				exp();
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

	public static class SelectFromContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLGramaticaParser.SELECT, 0); }
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLGramaticaParser.FROM, 0); }
		public TerminalNode IDX() { return getToken(SQLGramaticaParser.IDX, 0); }
		public TerminalNode WHERE() { return getToken(SQLGramaticaParser.WHERE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(SQLGramaticaParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLGramaticaParser.BY, 0); }
		public List<TerminalNode> ASC() { return getTokens(SQLGramaticaParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(SQLGramaticaParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(SQLGramaticaParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(SQLGramaticaParser.DESC, i);
		}
		public SelectFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterSelectFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitSelectFrom(this);
		}
	}

	public final SelectFromContext selectFrom() throws RecognitionException {
		SelectFromContext _localctx = new SelectFromContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selectFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(SELECT);
			setState(456);
			sep();
			setState(457);
			match(FROM);
			setState(458);
			match(IDX);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(459);
				match(WHERE);
				setState(460);
				exp();
				setState(477);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ORDER:
					{
					setState(461);
					match(ORDER);
					setState(462);
					match(BY);
					setState(463);
					exp();
					setState(464);
					match(ASC);
					}
					break;
				case DESC:
					{
					setState(466);
					match(DESC);
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4 || _la==DESC) {
						{
						setState(472);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__4:
							{
							setState(467);
							match(T__4);
							setState(468);
							exp();
							setState(469);
							match(ASC);
							}
							break;
						case DESC:
							{
							setState(471);
							match(DESC);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(476);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case EOF:
				case T__1:
				case CREATE:
				case ALTER:
				case DROP:
				case SHOW:
				case USE:
				case INSERT:
				case SELECT:
				case UPDATE:
				case DELETE:
					break;
				default:
					break;
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

	public static class SepContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(SQLGramaticaParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(SQLGramaticaParser.IDX, i);
		}
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitSep(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sep);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(T__6);
				}
				break;
			case IDX:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(IDX);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(483);
					match(T__4);
					setState(484);
					match(IDX);
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitAdd_op(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__13) ) {
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

	public static class Mult_opContext extends ParserRuleContext {
		public Mult_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).enterMult_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGramaticaListener ) ((SQLGramaticaListener)listener).exitMult_op(this);
		}
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		case 17:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 18:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 19:
			return equalsExpression_sempred((EqualsExpressionContext)_localctx, predIndex);
		case 20:
			return relationExpression_sempred((RelationExpressionContext)_localctx, predIndex);
		case 21:
			return addSubsExpression_sempred((AddSubsExpressionContext)_localctx, predIndex);
		case 22:
			return mulDivExpression_sempred((MulDivExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalsExpression_sempred(EqualsExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationExpression_sempred(RelationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addSubsExpression_sempred(AddSubsExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulDivExpression_sempred(MulDivExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\5\2T\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4c\n\4\f\4\16"+
		"\4f\13\4\5\4h\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5y\n\5\7\5{\n\5\f\5\16\5~\13\5\3\5\5\5\u0081\n\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ab\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u00c1\n\r\f\r\16\r\u00c4\13\r\5\r\u00c6\n\r\3\r\3\r\3\16\3\16\3\16\7"+
		"\16\u00cd\n\16\f\16\16\16\u00d0\13\16\3\16\3\16\7\16\u00d4\n\16\f\16\16"+
		"\16\u00d7\13\16\5\16\u00d9\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00e2\n\17\f\17\16\17\u00e5\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00f0\n\20\f\20\16\20\u00f3\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00fc\n\20\f\20\16\20\u00ff\13\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u010c\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0114\n\23\f\23\16\23\u0117\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u012b\n\25\f\25\16\25\u012e\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0137\n\26\f\26\16\26\u013a\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0143\n\27\f\27\16\27\u0146\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u014f\n\30\f\30\16\30\u0152\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u015e\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u016c"+
		"\n\32\f\32\16\32\u016f\13\32\5\32\u0171\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u017b\n\33\f\33\16\33\u017e\13\33\5\33\u0180\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018b\n\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u01a0\n\37\f\37\16\37\u01a3\13\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u01ab\n\37\f\37\16\37\u01ae\13\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \7 \u01ba\n \f \16 \u01bd\13 \3 \3 \5 \u01c1\n \3!"+
		"\3!\3!\3!\3!\5!\u01c8\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\7\"\u01db\n\"\f\"\16\"\u01de\13\"\5\"\u01e0\n\""+
		"\5\"\u01e2\n\"\3#\3#\3#\3#\7#\u01e8\n#\f#\16#\u01eb\13#\5#\u01ed\n#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3\'\2\b$&(*,.(\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\4\2\b\b\n\r\3\2\16\17\4"+
		"\2\3\3\20\20\4\2\t\t\21\22\2\u0213\2S\3\2\2\2\4U\3\2\2\2\6g\3\2\2\2\b"+
		"o\3\2\2\2\n\u0082\3\2\2\2\f\u0086\3\2\2\2\16\u008d\3\2\2\2\20\u0091\3"+
		"\2\2\2\22\u0094\3\2\2\2\24\u00a1\3\2\2\2\26\u00aa\3\2\2\2\30\u00ac\3\2"+
		"\2\2\32\u00d8\3\2\2\2\34\u00da\3\2\2\2\36\u00e8\3\2\2\2 \u0102\3\2\2\2"+
		"\"\u010b\3\2\2\2$\u010d\3\2\2\2&\u0118\3\2\2\2(\u0123\3\2\2\2*\u012f\3"+
		"\2\2\2,\u013b\3\2\2\2.\u0147\3\2\2\2\60\u015d\3\2\2\2\62\u0170\3\2\2\2"+
		"\64\u018a\3\2\2\2\66\u018c\3\2\2\28\u0190\3\2\2\2:\u0193\3\2\2\2<\u0198"+
		"\3\2\2\2>\u01b1\3\2\2\2@\u01c2\3\2\2\2B\u01c9\3\2\2\2D\u01ec\3\2\2\2F"+
		"\u01ee\3\2\2\2H\u01f0\3\2\2\2J\u01f2\3\2\2\2L\u01f4\3\2\2\2NT\7>\2\2O"+
		"T\7?\2\2PT\7A\2\2QT\5\4\3\2RT\7B\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3"+
		"\2\2\2SR\3\2\2\2T\3\3\2\2\2UV\7D\2\2VW\7D\2\2WX\7D\2\2XY\7D\2\2YZ\7\3"+
		"\2\2Z[\7D\2\2[\\\7D\2\2\\]\7\3\2\2]^\7D\2\2^_\7D\2\2_\5\3\2\2\2`h\5\b"+
		"\5\2ac\5\b\5\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2g`\3\2\2\2gd\3\2\2\2h\7\3\2\2\2ip\5\n\6\2jp\5\f\7\2kp\5\16\b\2lp\5"+
		"\20\t\2mp\5\22\n\2np\5\24\13\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2"+
		"om\3\2\2\2on\3\2\2\2p|\3\2\2\2qx\7\4\2\2ry\5\n\6\2sy\5\f\7\2ty\5\16\b"+
		"\2uy\5\20\t\2vy\5\22\n\2wy\5\24\13\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3"+
		"\2\2\2xv\3\2\2\2xw\3\2\2\2y{\3\2\2\2zq\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177\u0081\7\4\2\2\u0080\177\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\t\3\2\2\2\u0082\u0083\7\23\2\2\u0083\u0084\7\24\2"+
		"\2\u0084\u0085\7>\2\2\u0085\13\3\2\2\2\u0086\u0087\7\26\2\2\u0087\u0088"+
		"\7\24\2\2\u0088\u0089\7>\2\2\u0089\u008a\7\27\2\2\u008a\u008b\7\31\2\2"+
		"\u008b\u008c\7>\2\2\u008c\r\3\2\2\2\u008d\u008e\7\30\2\2\u008e\u008f\7"+
		"\24\2\2\u008f\u0090\7>\2\2\u0090\17\3\2\2\2\u0091\u0092\7\32\2\2\u0092"+
		"\u0093\7\25\2\2\u0093\21\3\2\2\2\u0094\u0095\7\33\2\2\u0095\u0096\7\24"+
		"\2\2\u0096\u0097\7>\2\2\u0097\23\3\2\2\2\u0098\u00a2\5\30\r\2\u0099\u00a2"+
		"\5\62\32\2\u009a\u00a2\5\66\34\2\u009b\u00a2\58\35\2\u009c\u00a2\5:\36"+
		"\2\u009d\u00a2\5<\37\2\u009e\u00a2\5> \2\u009f\u00a2\5@!\2\u00a0\u00a2"+
		"\5B\"\2\u00a1\u0098\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1"+
		"\u009b\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00ab"+
		"\7\"\2\2\u00a4\u00ab\7#\2\2\u00a5\u00ab\7$\2\2\u00a6\u00a7\7%\2\2\u00a7"+
		"\u00a8\7\5\2\2\u00a8\u00a9\7?\2\2\u00a9\u00ab\7\6\2\2\u00aa\u00a3\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab"+
		"\27\3\2\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\7)\2\2\u00ae\u00af\7>\2\2"+
		"\u00af\u00b0\7\5\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b7\5\26\f\2\u00b2\u00b3"+
		"\7\7\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00b2\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c5\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\7\34\2\2\u00bc"+
		"\u00c2\5\32\16\2\u00bd\u00be\7\7\2\2\u00be\u00bf\7\34\2\2\u00bf\u00c1"+
		"\5\32\16\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2"+
		"\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ba"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\6\2\2\u00c8"+
		"\31\3\2\2\2\u00c9\u00d9\5\34\17\2\u00ca\u00ce\5\36\20\2\u00cb\u00cd\5"+
		"\36\20\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d9\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\5 "+
		"\21\2\u00d2\u00d4\5 \21\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d9"+
		"\33\3\2\2\2\u00da\u00db\7>\2\2\u00db\u00dc\7\35\2\2\u00dc\u00dd\7\37\2"+
		"\2\u00dd\u00de\7\5\2\2\u00de\u00e3\7>\2\2\u00df\u00e0\7\7\2\2\u00e0\u00e2"+
		"\7>\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\6"+
		"\2\2\u00e7\35\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7\36\2\2\u00ea\u00eb"+
		"\7\37\2\2\u00eb\u00ec\7\5\2\2\u00ec\u00f1\7>\2\2\u00ed\u00ee\7\7\2\2\u00ee"+
		"\u00f0\7>\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7\6\2\2\u00f5\u00f6\7 \2\2\u00f6\u00f7\7>\2\2\u00f7\u00f8\7\5\2"+
		"\2\u00f8\u00fd\7>\2\2\u00f9\u00fa\7\7\2\2\u00fa\u00fc\7>\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\6\2\2\u0101\37\3\2\2"+
		"\2\u0102\u0103\7>\2\2\u0103\u0104\7!\2\2\u0104\u0105\5\"\22\2\u0105!\3"+
		"\2\2\2\u0106\u0107\7\5\2\2\u0107\u0108\5$\23\2\u0108\u0109\7\6\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c#\3\2\2\2\u010d\u010e\b\23\1\2\u010e\u010f\5&\24\2\u010f\u0115"+
		"\3\2\2\2\u0110\u0111\f\3\2\2\u0111\u0112\7\'\2\2\u0112\u0114\5&\24\2\u0113"+
		"\u0110\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116%\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\b\24\1\2\u0119\u011a"+
		"\5(\25\2\u011a\u0120\3\2\2\2\u011b\u011c\f\3\2\2\u011c\u011d\7&\2\2\u011d"+
		"\u011f\5(\25\2\u011e\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\'\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124"+
		"\b\25\1\2\u0124\u0125\5*\26\2\u0125\u012c\3\2\2\2\u0126\u0127\f\3\2\2"+
		"\u0127\u0128\5H%\2\u0128\u0129\5*\26\2\u0129\u012b\3\2\2\2\u012a\u0126"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		")\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\b\26\1\2\u0130\u0131\5,\27\2"+
		"\u0131\u0138\3\2\2\2\u0132\u0133\f\3\2\2\u0133\u0134\5F$\2\u0134\u0135"+
		"\5,\27\2\u0135\u0137\3\2\2\2\u0136\u0132\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139+\3\2\2\2\u013a\u0138\3\2\2\2"+
		"\u013b\u013c\b\27\1\2\u013c\u013d\5.\30\2\u013d\u0144\3\2\2\2\u013e\u013f"+
		"\f\3\2\2\u013f\u0140\5J&\2\u0140\u0141\5.\30\2\u0141\u0143\3\2\2\2\u0142"+
		"\u013e\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145-\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\b\30\1\2\u0148\u0149"+
		"\5\60\31\2\u0149\u0150\3\2\2\2\u014a\u014b\f\3\2\2\u014b\u014c\5L\'\2"+
		"\u014c\u014d\5\60\31\2\u014d\u014f\3\2\2\2\u014e\u014a\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151/\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0154\7\5\2\2\u0154\u0155\5$\23\2\u0155\u0156\7\6"+
		"\2\2\u0156\u015e\3\2\2\2\u0157\u015e\5\2\2\2\u0158\u0159\7(\2\2\u0159"+
		"\u015a\7\5\2\2\u015a\u015b\5$\23\2\u015b\u015c\7\6\2\2\u015c\u015e\3\2"+
		"\2\2\u015d\u0153\3\2\2\2\u015d\u0157\3\2\2\2\u015d\u0158\3\2\2\2\u015e"+
		"\61\3\2\2\2\u015f\u0160\7\26\2\2\u0160\u0161\7)\2\2\u0161\u0162\7>\2\2"+
		"\u0162\u0163\7\27\2\2\u0163\u0164\7\31\2\2\u0164\u0171\7>\2\2\u0165\u0166"+
		"\7\26\2\2\u0166\u0167\7)\2\2\u0167\u0168\7>\2\2\u0168\u016d\5\64\33\2"+
		"\u0169\u016a\7\7\2\2\u016a\u016c\5\64\33\2\u016b\u0169\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u015f\3\2\2\2\u0170\u0165\3\2\2\2\u0171\63\3\2\2"+
		"\2\u0172\u0173\7+\2\2\u0173\u0174\7,\2\2\u0174\u0175\7>\2\2\u0175\u017f"+
		"\5\26\f\2\u0176\u0177\7\34\2\2\u0177\u017c\5\32\16\2\u0178\u0179\7\7\2"+
		"\2\u0179\u017b\5\32\16\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0176\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u018b\3\2\2\2\u0181"+
		"\u0182\7+\2\2\u0182\u0183\7\34\2\2\u0183\u018b\5\32\16\2\u0184\u0185\7"+
		"\30\2\2\u0185\u0186\7,\2\2\u0186\u018b\7>\2\2\u0187\u0188\7\30\2\2\u0188"+
		"\u0189\7\34\2\2\u0189\u018b\7>\2\2\u018a\u0172\3\2\2\2\u018a\u0181\3\2"+
		"\2\2\u018a\u0184\3\2\2\2\u018a\u0187\3\2\2\2\u018b\65\3\2\2\2\u018c\u018d"+
		"\7\30\2\2\u018d\u018e\7)\2\2\u018e\u018f\7>\2\2\u018f\67\3\2\2\2\u0190"+
		"\u0191\7\32\2\2\u0191\u0192\7*\2\2\u01929\3\2\2\2\u0193\u0194\7\32\2\2"+
		"\u0194\u0195\7-\2\2\u0195\u0196\7/\2\2\u0196\u0197\7>\2\2\u0197;\3\2\2"+
		"\2\u0198\u0199\7\60\2\2\u0199\u019a\7\63\2\2\u019a\u019b\7>\2\2\u019b"+
		"\u019c\7\5\2\2\u019c\u01a1\7>\2\2\u019d\u019e\7\7\2\2\u019e\u01a0\7>\2"+
		"\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7\6\2\2\u01a5"+
		"\u01a6\7\62\2\2\u01a6\u01a7\7\5\2\2\u01a7\u01ac\5\2\2\2\u01a8\u01a9\7"+
		"\7\2\2\u01a9\u01ab\5\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01af\u01b0\7\6\2\2\u01b0=\3\2\2\2\u01b1\u01b2\7\64\2\2\u01b2\u01b3"+
		"\7>\2\2\u01b3\u01b4\7\65\2\2\u01b4\u01b5\7>\2\2\u01b5\u01b6\7\b\2\2\u01b6"+
		"\u01bb\5\26\f\2\u01b7\u01b8\7\7\2\2\u01b8\u01ba\5\26\f\2\u01b9\u01b7\3"+
		"\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01c0\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7\66\2\2\u01bf\u01c1\5"+
		"\"\22\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1?\3\2\2\2\u01c2\u01c3"+
		"\7\67\2\2\u01c3\u01c4\7/\2\2\u01c4\u01c7\7>\2\2\u01c5\u01c6\7\66\2\2\u01c6"+
		"\u01c8\5\"\22\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8A\3\2\2\2"+
		"\u01c9\u01ca\7\61\2\2\u01ca\u01cb\5D#\2\u01cb\u01cc\7/\2\2\u01cc\u01e1"+
		"\7>\2\2\u01cd\u01ce\7\66\2\2\u01ce\u01df\5\"\22\2\u01cf\u01d0\78\2\2\u01d0"+
		"\u01d1\79\2\2\u01d1\u01d2\5\"\22\2\u01d2\u01d3\7:\2\2\u01d3\u01e0\3\2"+
		"\2\2\u01d4\u01dc\7;\2\2\u01d5\u01d6\7\7\2\2\u01d6\u01d7\5\"\22\2\u01d7"+
		"\u01d8\7:\2\2\u01d8\u01db\3\2\2\2\u01d9\u01db\7;\2\2\u01da\u01d5\3\2\2"+
		"\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01cf\3\2\2\2\u01df"+
		"\u01d4\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01cd\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2C\3\2\2\2\u01e3\u01ed\7\t\2\2\u01e4\u01e9"+
		"\7>\2\2\u01e5\u01e6\7\7\2\2\u01e6\u01e8\7>\2\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01e3\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ed"+
		"E\3\2\2\2\u01ee\u01ef\t\2\2\2\u01efG\3\2\2\2\u01f0\u01f1\t\3\2\2\u01f1"+
		"I\3\2\2\2\u01f2\u01f3\t\4\2\2\u01f3K\3\2\2\2\u01f4\u01f5\t\5\2\2\u01f5"+
		"M\3\2\2\2,Sdgox|\u0080\u00a1\u00aa\u00b7\u00c2\u00c5\u00ce\u00d5\u00d8"+
		"\u00e3\u00f1\u00fd\u010b\u0115\u0120\u012c\u0138\u0144\u0150\u015d\u016d"+
		"\u0170\u017c\u017f\u018a\u01a1\u01ac\u01bb\u01c0\u01c7\u01da\u01dc\u01df"+
		"\u01e1\u01e9\u01ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}