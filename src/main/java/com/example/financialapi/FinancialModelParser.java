package com.example.financialapi;
// Generated from FinancialModel.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FinancialModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, WS=8;
	public static final int
		RULE_calculation = 0, RULE_baseSalary = 1, RULE_extraHours = 2, RULE_bonus = 3, 
		RULE_tax = 4, RULE_insurance = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculation", "baseSalary", "extraHours", "bonus", "tax", "insurance"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SUELDO'", "'='", "'HORAS_EXTRA'", "'BONO'", "'IMPUESTO'", "'SEGURO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INT", "WS"
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
	public String getGrammarFileName() { return "FinancialModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FinancialModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalculationContext extends ParserRuleContext {
		public BaseSalaryContext baseSalary() {
			return getRuleContext(BaseSalaryContext.class,0);
		}
		public ExtraHoursContext extraHours() {
			return getRuleContext(ExtraHoursContext.class,0);
		}
		public BonusContext bonus() {
			return getRuleContext(BonusContext.class,0);
		}
		public TaxContext tax() {
			return getRuleContext(TaxContext.class,0);
		}
		public InsuranceContext insurance() {
			return getRuleContext(InsuranceContext.class,0);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).enterCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).exitCalculation(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculation);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(T__0);
				setState(13);
				match(T__1);
				setState(14);
				baseSalary();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(T__2);
				setState(16);
				match(T__1);
				setState(17);
				extraHours();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(T__3);
				setState(19);
				match(T__1);
				setState(20);
				bonus();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				match(T__4);
				setState(22);
				match(T__1);
				setState(23);
				tax();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				match(T__5);
				setState(25);
				match(T__1);
				setState(26);
				insurance();
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
	public static class BaseSalaryContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FinancialModelParser.INT, 0); }
		public BaseSalaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSalary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).enterBaseSalary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).exitBaseSalary(this);
		}
	}

	public final BaseSalaryContext baseSalary() throws RecognitionException {
		BaseSalaryContext _localctx = new BaseSalaryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_baseSalary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtraHoursContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FinancialModelParser.INT, 0); }
		public ExtraHoursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraHours; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).enterExtraHours(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).exitExtraHours(this);
		}
	}

	public final ExtraHoursContext extraHours() throws RecognitionException {
		ExtraHoursContext _localctx = new ExtraHoursContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_extraHours);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BonusContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FinancialModelParser.INT, 0); }
		public BonusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bonus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).enterBonus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).exitBonus(this);
		}
	}

	public final BonusContext bonus() throws RecognitionException {
		BonusContext _localctx = new BonusContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bonus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TaxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FinancialModelParser.INT, 0); }
		public TaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).enterTax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).exitTax(this);
		}
	}

	public final TaxContext tax() throws RecognitionException {
		TaxContext _localctx = new TaxContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsuranceContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FinancialModelParser.INT, 0); }
		public InsuranceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insurance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).enterInsurance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinancialModelListener ) ((FinancialModelListener)listener).exitInsurance(this);
		}
	}

	public final InsuranceContext insurance() throws RecognitionException {
		InsuranceContext _localctx = new InsuranceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insurance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
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

	public static final String _serializedATN =
		"\u0004\u0001\b(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001c"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000"+
		"\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000%\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004\u001f\u0001"+
		"\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b#\u0001\u0000\u0000"+
		"\u0000\n%\u0001\u0000\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r\u000e"+
		"\u0005\u0002\u0000\u0000\u000e\u001c\u0003\u0002\u0001\u0000\u000f\u0010"+
		"\u0005\u0003\u0000\u0000\u0010\u0011\u0005\u0002\u0000\u0000\u0011\u001c"+
		"\u0003\u0004\u0002\u0000\u0012\u0013\u0005\u0004\u0000\u0000\u0013\u0014"+
		"\u0005\u0002\u0000\u0000\u0014\u001c\u0003\u0006\u0003\u0000\u0015\u0016"+
		"\u0005\u0005\u0000\u0000\u0016\u0017\u0005\u0002\u0000\u0000\u0017\u001c"+
		"\u0003\b\u0004\u0000\u0018\u0019\u0005\u0006\u0000\u0000\u0019\u001a\u0005"+
		"\u0002\u0000\u0000\u001a\u001c\u0003\n\u0005\u0000\u001b\f\u0001\u0000"+
		"\u0000\u0000\u001b\u000f\u0001\u0000\u0000\u0000\u001b\u0012\u0001\u0000"+
		"\u0000\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000"+
		"\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0007"+
		"\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\u0007\u0000"+
		"\u0000 \u0005\u0001\u0000\u0000\u0000!\"\u0005\u0007\u0000\u0000\"\u0007"+
		"\u0001\u0000\u0000\u0000#$\u0005\u0007\u0000\u0000$\t\u0001\u0000\u0000"+
		"\u0000%&\u0005\u0007\u0000\u0000&\u000b\u0001\u0000\u0000\u0000\u0001"+
		"\u001b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}