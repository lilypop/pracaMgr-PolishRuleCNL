// Generated from PolishRuleCNL.g4 by ANTLR 4.4

	  package Grammar;
	
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolishRuleCNLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, PolishLetter=37, Letter=38, 
		Identifier=39, Srednik=40, Myslnik=41, Cyfry=42, WS=43;
	public static final String[] tokenNames = {
		"<INVALID>", "'prep'", "'część'", "'zawsze'", "'mieć'", "'fin'", "'a wysoko'", 
		"'maksimum'", "'się'", "'jeden'", "'tnum'", "'lub'", "'minimum'", "'być'", 
		"'adv'", "'IDENTIFIER'", "'co najwyżej'", "'zawierać'", "'subst'", "'co wysoko'", 
		"'każdy'", "'rodzaj'", "'oraz'", "'atrybut'", "'składać'", "'z'", "'adj'", 
		"'składać się z'", "'num'", "'przynajmniej'", "'własność'", "'a'", "'conj'", 
		"'dokładnie'", "'qub'", "'i'", "'ppas'", "PolishLetter", "Letter", "Identifier", 
		"';'", "'-'", "Cyfry", "WS"
	};
	public static final int
		RULE_korzen = 0, RULE_slownik = 1, RULE_regula = 2, RULE_pojecieRzeczownikowe = 3, 
		RULE_rzeczownik = 4, RULE_przymiotnik = 5, RULE_imieslowPrzymiotnikowyBierny = 6, 
		RULE_rzeczownikOkreslonyPrzymiotnikiem = 7, RULE_rzeczownikOkreslajacy = 8, 
		RULE_wyrazeniePrzyimkowe = 9, RULE_spójnik = 10, RULE_przyimek = 11, RULE_fakt = 12, 
		RULE_binarnyFakt = 13, RULE_charakterystyka = 14, RULE_cechaRzeczownika = 15, 
		RULE_czasownik = 16, RULE_relacja = 17, RULE_asocjacja = 18, RULE_caloscCzesc = 19, 
		RULE_generalizacja = 20, RULE_jestAtrybutem = 21, RULE_czasownikByc = 22, 
		RULE_ograniczenieLicznosciowe = 23, RULE_kwantyfikatorOgolny = 24, RULE_operatorModalnyDlaKoniecznosci = 25, 
		RULE_kwantyfikatorLicznosciowy = 26, RULE_minimumN = 27, RULE_minimum = 28, 
		RULE_liczba = 29, RULE_maksimumJeden = 30, RULE_coNajwyzejN = 31, RULE_coNajwyzej = 32, 
		RULE_dokladnieJeden = 33, RULE_dokladnieN = 34, RULE_dokładnie = 35, RULE_zakresLiczb = 36, 
		RULE_przynajmniejJeden = 37;
	public static final String[] ruleNames = {
		"korzen", "slownik", "regula", "pojecieRzeczownikowe", "rzeczownik", "przymiotnik", 
		"imieslowPrzymiotnikowyBierny", "rzeczownikOkreslonyPrzymiotnikiem", "rzeczownikOkreslajacy", 
		"wyrazeniePrzyimkowe", "spójnik", "przyimek", "fakt", "binarnyFakt", "charakterystyka", 
		"cechaRzeczownika", "czasownik", "relacja", "asocjacja", "caloscCzesc", 
		"generalizacja", "jestAtrybutem", "czasownikByc", "ograniczenieLicznosciowe", 
		"kwantyfikatorOgolny", "operatorModalnyDlaKoniecznosci", "kwantyfikatorLicznosciowy", 
		"minimumN", "minimum", "liczba", "maksimumJeden", "coNajwyzejN", "coNajwyzej", 
		"dokladnieJeden", "dokladnieN", "dokładnie", "zakresLiczb", "przynajmniejJeden"
	};

	@Override
	public String getGrammarFileName() { return "PolishRuleCNL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolishRuleCNLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KorzenContext extends ParserRuleContext {
		public SlownikContext slownik() {
			return getRuleContext(SlownikContext.class,0);
		}
		public RegulaContext regula() {
			return getRuleContext(RegulaContext.class,0);
		}
		public KorzenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_korzen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKorzen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKorzen(this);
		}
	}

	public final KorzenContext korzen() throws RecognitionException {
		KorzenContext _localctx = new KorzenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_korzen);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); slownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); regula();
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

	public static class SlownikContext extends ParserRuleContext {
		public FaktContext fakt() {
			return getRuleContext(FaktContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public SlownikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slownik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSlownik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSlownik(this);
		}
	}

	public final SlownikContext slownik() throws RecognitionException {
		SlownikContext _localctx = new SlownikContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_slownik);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); fakt();
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

	public static class RegulaContext extends ParserRuleContext {
		public OgraniczenieLicznoscioweContext ograniczenieLicznosciowe() {
			return getRuleContext(OgraniczenieLicznoscioweContext.class,0);
		}
		public RegulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRegula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRegula(this);
		}
	}

	public final RegulaContext regula() throws RecognitionException {
		RegulaContext _localctx = new RegulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); ograniczenieLicznosciowe();
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

	public static class PojecieRzeczownikoweContext extends ParserRuleContext {
		public WyrazeniePrzyimkoweContext wyrazeniePrzyimkowe() {
			return getRuleContext(WyrazeniePrzyimkoweContext.class,0);
		}
		public RzeczownikContext rzeczownik() {
			return getRuleContext(RzeczownikContext.class,0);
		}
		public RzeczownikOkreslonyPrzymiotnikiemContext rzeczownikOkreslonyPrzymiotnikiem() {
			return getRuleContext(RzeczownikOkreslonyPrzymiotnikiemContext.class,0);
		}
		public RzeczownikOkreslajacyContext rzeczownikOkreslajacy() {
			return getRuleContext(RzeczownikOkreslajacyContext.class,0);
		}
		public PojecieRzeczownikoweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pojecieRzeczownikowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPojecieRzeczownikowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPojecieRzeczownikowe(this);
		}
	}

	public final PojecieRzeczownikoweContext pojecieRzeczownikowe() throws RecognitionException {
		PojecieRzeczownikoweContext _localctx = new PojecieRzeczownikoweContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pojecieRzeczownikowe);
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); rzeczownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); rzeczownikOkreslonyPrzymiotnikiem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); rzeczownikOkreslonyPrzymiotnikiem();
				setState(89); rzeczownikOkreslajacy();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91); rzeczownik();
				setState(92); rzeczownikOkreslajacy();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94); rzeczownikOkreslonyPrzymiotnikiem();
				setState(95); wyrazeniePrzyimkowe();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97); rzeczownikOkreslonyPrzymiotnikiem();
				setState(98); rzeczownikOkreslajacy();
				setState(99); wyrazeniePrzyimkowe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101); rzeczownik();
				setState(102); wyrazeniePrzyimkowe();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104); rzeczownik();
				setState(105); rzeczownikOkreslajacy();
				setState(106); wyrazeniePrzyimkowe();
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

	public static class RzeczownikContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public RzeczownikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rzeczownik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRzeczownik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRzeczownik(this);
		}
	}

	public final RzeczownikContext rzeczownik() throws RecognitionException {
		RzeczownikContext _localctx = new RzeczownikContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rzeczownik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(T__18);
			setState(111); match(Identifier);
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

	public static class PrzymiotnikContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public ImieslowPrzymiotnikowyBiernyContext imieslowPrzymiotnikowyBierny() {
			return getRuleContext(ImieslowPrzymiotnikowyBiernyContext.class,0);
		}
		public PrzymiotnikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przymiotnik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPrzymiotnik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPrzymiotnik(this);
		}
	}

	public final PrzymiotnikContext przymiotnik() throws RecognitionException {
		PrzymiotnikContext _localctx = new PrzymiotnikContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_przymiotnik);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(T__10);
				setState(114); match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); imieslowPrzymiotnikowyBierny();
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

	public static class ImieslowPrzymiotnikowyBiernyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public ImieslowPrzymiotnikowyBiernyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imieslowPrzymiotnikowyBierny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterImieslowPrzymiotnikowyBierny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitImieslowPrzymiotnikowyBierny(this);
		}
	}

	public final ImieslowPrzymiotnikowyBiernyContext imieslowPrzymiotnikowyBierny() throws RecognitionException {
		ImieslowPrzymiotnikowyBiernyContext _localctx = new ImieslowPrzymiotnikowyBiernyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imieslowPrzymiotnikowyBierny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(T__0);
			setState(119); match(Identifier);
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

	public static class RzeczownikOkreslonyPrzymiotnikiemContext extends ParserRuleContext {
		public List<PrzymiotnikContext> przymiotnik() {
			return getRuleContexts(PrzymiotnikContext.class);
		}
		public RzeczownikContext rzeczownik() {
			return getRuleContext(RzeczownikContext.class,0);
		}
		public PrzymiotnikContext przymiotnik(int i) {
			return getRuleContext(PrzymiotnikContext.class,i);
		}
		public RzeczownikOkreslonyPrzymiotnikiemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rzeczownikOkreslonyPrzymiotnikiem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRzeczownikOkreslonyPrzymiotnikiem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRzeczownikOkreslonyPrzymiotnikiem(this);
		}
	}

	public final RzeczownikOkreslonyPrzymiotnikiemContext rzeczownikOkreslonyPrzymiotnikiem() throws RecognitionException {
		RzeczownikOkreslonyPrzymiotnikiemContext _localctx = new RzeczownikOkreslonyPrzymiotnikiemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rzeczownikOkreslonyPrzymiotnikiem);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); przymiotnik();
				setState(122); rzeczownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); rzeczownik();
				setState(125); przymiotnik();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127); przymiotnik();
				setState(128); rzeczownik();
				setState(129); przymiotnik();
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

	public static class RzeczownikOkreslajacyContext extends ParserRuleContext {
		public SpójnikContext spójnik() {
			return getRuleContext(SpójnikContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweContext> pojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweContext.class);
		}
		public RzeczownikOkreslajacyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rzeczownikOkreslajacy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRzeczownikOkreslajacy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRzeczownikOkreslajacy(this);
		}
	}

	public final RzeczownikOkreslajacyContext rzeczownikOkreslajacy() throws RecognitionException {
		RzeczownikOkreslajacyContext _localctx = new RzeczownikOkreslajacyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rzeczownikOkreslajacy);
		try {
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); pojecieRzeczownikowe();
				setState(135); spójnik();
				setState(136); pojecieRzeczownikowe();
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

	public static class WyrazeniePrzyimkoweContext extends ParserRuleContext {
		public SpójnikContext spójnik() {
			return getRuleContext(SpójnikContext.class,0);
		}
		public PrzyimekContext przyimek() {
			return getRuleContext(PrzyimekContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweContext> pojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweContext.class);
		}
		public WyrazeniePrzyimkoweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazeniePrzyimkowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterWyrazeniePrzyimkowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitWyrazeniePrzyimkowe(this);
		}
	}

	public final WyrazeniePrzyimkoweContext wyrazeniePrzyimkowe() throws RecognitionException {
		WyrazeniePrzyimkoweContext _localctx = new WyrazeniePrzyimkoweContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_wyrazeniePrzyimkowe);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); przyimek();
				setState(141); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); przyimek();
				setState(144); pojecieRzeczownikowe();
				setState(145); spójnik();
				setState(146); pojecieRzeczownikowe();
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

	public static class SpójnikContext extends ParserRuleContext {
		public SpójnikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spójnik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSpójnik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSpójnik(this);
		}
	}

	public final SpójnikContext spójnik() throws RecognitionException {
		SpójnikContext _localctx = new SpójnikContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_spójnik);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); match(T__4);
				setState(151); match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); match(T__4);
				setState(153); match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154); match(T__4);
				setState(155); match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156); match(T__4);
				setState(157); match(T__25);
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

	public static class PrzyimekContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public PrzyimekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przyimek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPrzyimek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPrzyimek(this);
		}
	}

	public final PrzyimekContext przyimek() throws RecognitionException {
		PrzyimekContext _localctx = new PrzyimekContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_przyimek);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); match(T__35);
				setState(161); match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); match(T__35);
				setState(163); match(Identifier);
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

	public static class FaktContext extends ParserRuleContext {
		public BinarnyFaktContext binarnyFakt() {
			return getRuleContext(BinarnyFaktContext.class,0);
		}
		public CharakterystykaContext charakterystyka() {
			return getRuleContext(CharakterystykaContext.class,0);
		}
		public FaktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fakt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterFakt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitFakt(this);
		}
	}

	public final FaktContext fakt() throws RecognitionException {
		FaktContext _localctx = new FaktContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fakt);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); binarnyFakt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); charakterystyka();
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

	public static class BinarnyFaktContext extends ParserRuleContext {
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweContext> pojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweContext.class);
		}
		public BinarnyFaktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarnyFakt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterBinarnyFakt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitBinarnyFakt(this);
		}
	}

	public final BinarnyFaktContext binarnyFakt() throws RecognitionException {
		BinarnyFaktContext _localctx = new BinarnyFaktContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binarnyFakt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); pojecieRzeczownikowe();
			setState(171); relacja();
			setState(172); pojecieRzeczownikowe();
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

	public static class CharakterystykaContext extends ParserRuleContext {
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public CechaRzeczownikaContext cechaRzeczownika() {
			return getRuleContext(CechaRzeczownikaContext.class,0);
		}
		public CharakterystykaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charakterystyka; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCharakterystyka(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCharakterystyka(this);
		}
	}

	public final CharakterystykaContext charakterystyka() throws RecognitionException {
		CharakterystykaContext _localctx = new CharakterystykaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_charakterystyka);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); pojecieRzeczownikowe();
			setState(175); cechaRzeczownika();
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

	public static class CechaRzeczownikaContext extends ParserRuleContext {
		public CzasownikContext czasownik() {
			return getRuleContext(CzasownikContext.class,0);
		}
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public PrzyimekContext przyimek() {
			return getRuleContext(PrzyimekContext.class,0);
		}
		public PrzymiotnikContext przymiotnik() {
			return getRuleContext(PrzymiotnikContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public CechaRzeczownikaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cechaRzeczownika; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCechaRzeczownika(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCechaRzeczownika(this);
		}
	}

	public final CechaRzeczownikaContext cechaRzeczownika() throws RecognitionException {
		CechaRzeczownikaContext _localctx = new CechaRzeczownikaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cechaRzeczownika);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); czasownikByc();
				setState(178); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); czasownikByc();
				setState(181); przyimek();
				setState(182); pojecieRzeczownikowe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); czasownikByc();
				setState(185); przymiotnik();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187); czasownik();
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

	public static class CzasownikContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public CzasownikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_czasownik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCzasownik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCzasownik(this);
		}
	}

	public final CzasownikContext czasownik() throws RecognitionException {
		CzasownikContext _localctx = new CzasownikContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_czasownik);
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); match(T__31);
				setState(191); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(T__31);
				setState(193); match(Identifier);
				setState(194); match(T__2);
				setState(195); match(T__28);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); match(T__31);
				setState(197); match(T__12);
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

	public static class RelacjaContext extends ParserRuleContext {
		public AsocjacjaContext asocjacja() {
			return getRuleContext(AsocjacjaContext.class,0);
		}
		public JestAtrybutemContext jestAtrybutem() {
			return getRuleContext(JestAtrybutemContext.class,0);
		}
		public CaloscCzescContext caloscCzesc() {
			return getRuleContext(CaloscCzescContext.class,0);
		}
		public GeneralizacjaContext generalizacja() {
			return getRuleContext(GeneralizacjaContext.class,0);
		}
		public RelacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRelacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRelacja(this);
		}
	}

	public final RelacjaContext relacja() throws RecognitionException {
		RelacjaContext _localctx = new RelacjaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relacja);
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); asocjacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); caloscCzesc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); generalizacja();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203); jestAtrybutem();
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

	public static class AsocjacjaContext extends ParserRuleContext {
		public CzasownikContext czasownik() {
			return getRuleContext(CzasownikContext.class,0);
		}
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public PrzyimekContext przyimek() {
			return getRuleContext(PrzyimekContext.class,0);
		}
		public PrzymiotnikContext przymiotnik() {
			return getRuleContext(PrzymiotnikContext.class,0);
		}
		public AsocjacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asocjacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterAsocjacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitAsocjacja(this);
		}
	}

	public final AsocjacjaContext asocjacja() throws RecognitionException {
		AsocjacjaContext _localctx = new AsocjacjaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asocjacja);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); czasownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); czasownik();
				setState(208); przyimek();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210); czasownikByc();
				setState(211); przymiotnik();
				setState(212); przyimek();
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

	public static class CaloscCzescContext extends ParserRuleContext {
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public CaloscCzescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caloscCzesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCaloscCzesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCaloscCzesc(this);
		}
	}

	public final CaloscCzescContext caloscCzesc() throws RecognitionException {
		CaloscCzescContext _localctx = new CaloscCzescContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_caloscCzesc);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(T__31);
				setState(217); match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219); czasownikByc();
				setState(220); match(T__18);
				setState(221); match(T__34);
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

	public static class GeneralizacjaContext extends ParserRuleContext {
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public GeneralizacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalizacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterGeneralizacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitGeneralizacja(this);
		}
	}

	public final GeneralizacjaContext generalizacja() throws RecognitionException {
		GeneralizacjaContext _localctx = new GeneralizacjaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_generalizacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); czasownikByc();
			setState(226); match(T__18);
			setState(227); match(T__15);
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

	public static class JestAtrybutemContext extends ParserRuleContext {
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public JestAtrybutemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestAtrybutem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterJestAtrybutem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitJestAtrybutem(this);
		}
	}

	public final JestAtrybutemContext jestAtrybutem() throws RecognitionException {
		JestAtrybutemContext _localctx = new JestAtrybutemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jestAtrybutem);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); czasownikByc();
				setState(230); match(T__18);
				setState(231); match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); czasownikByc();
				setState(234); match(T__18);
				setState(235); match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237); match(T__31);
				setState(238); match(T__32);
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

	public static class CzasownikBycContext extends ParserRuleContext {
		public CzasownikBycContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_czasownikByc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCzasownikByc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCzasownikByc(this);
		}
	}

	public final CzasownikBycContext czasownikByc() throws RecognitionException {
		CzasownikBycContext _localctx = new CzasownikBycContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_czasownikByc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(T__31);
			setState(242); match(T__23);
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

	public static class OgraniczenieLicznoscioweContext extends ParserRuleContext {
		public KwantyfikatorOgolnyContext kwantyfikatorOgolny() {
			return getRuleContext(KwantyfikatorOgolnyContext.class,0);
		}
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweContext> pojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweContext.class);
		}
		public OperatorModalnyDlaKoniecznosciContext operatorModalnyDlaKoniecznosci() {
			return getRuleContext(OperatorModalnyDlaKoniecznosciContext.class,0);
		}
		public KwantyfikatorLicznosciowyContext kwantyfikatorLicznosciowy() {
			return getRuleContext(KwantyfikatorLicznosciowyContext.class,0);
		}
		public OgraniczenieLicznoscioweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ograniczenieLicznosciowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOgraniczenieLicznosciowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOgraniczenieLicznosciowe(this);
		}
	}

	public final OgraniczenieLicznoscioweContext ograniczenieLicznosciowe() throws RecognitionException {
		OgraniczenieLicznoscioweContext _localctx = new OgraniczenieLicznoscioweContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ograniczenieLicznosciowe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); kwantyfikatorOgolny();
			setState(245); pojecieRzeczownikowe();
			setState(246); operatorModalnyDlaKoniecznosci();
			setState(247); relacja();
			setState(248); kwantyfikatorLicznosciowy();
			setState(249); pojecieRzeczownikowe();
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

	public static class KwantyfikatorOgolnyContext extends ParserRuleContext {
		public KwantyfikatorOgolnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwantyfikatorOgolny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKwantyfikatorOgolny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKwantyfikatorOgolny(this);
		}
	}

	public final KwantyfikatorOgolnyContext kwantyfikatorOgolny() throws RecognitionException {
		KwantyfikatorOgolnyContext _localctx = new KwantyfikatorOgolnyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_kwantyfikatorOgolny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(T__10);
			setState(252); match(T__16);
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

	public static class OperatorModalnyDlaKoniecznosciContext extends ParserRuleContext {
		public OperatorModalnyDlaKoniecznosciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorModalnyDlaKoniecznosci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOperatorModalnyDlaKoniecznosci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOperatorModalnyDlaKoniecznosci(this);
		}
	}

	public final OperatorModalnyDlaKoniecznosciContext operatorModalnyDlaKoniecznosci() throws RecognitionException {
		OperatorModalnyDlaKoniecznosciContext _localctx = new OperatorModalnyDlaKoniecznosciContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operatorModalnyDlaKoniecznosci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(T__33);
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

	public static class KwantyfikatorLicznosciowyContext extends ParserRuleContext {
		public MinimumNContext minimumN() {
			return getRuleContext(MinimumNContext.class,0);
		}
		public MaksimumJedenContext maksimumJeden() {
			return getRuleContext(MaksimumJedenContext.class,0);
		}
		public DokladnieJedenContext dokladnieJeden() {
			return getRuleContext(DokladnieJedenContext.class,0);
		}
		public ZakresLiczbContext zakresLiczb() {
			return getRuleContext(ZakresLiczbContext.class,0);
		}
		public CoNajwyzejNContext coNajwyzejN() {
			return getRuleContext(CoNajwyzejNContext.class,0);
		}
		public PrzynajmniejJedenContext przynajmniejJeden() {
			return getRuleContext(PrzynajmniejJedenContext.class,0);
		}
		public DokladnieNContext dokladnieN() {
			return getRuleContext(DokladnieNContext.class,0);
		}
		public KwantyfikatorLicznosciowyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwantyfikatorLicznosciowy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKwantyfikatorLicznosciowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKwantyfikatorLicznosciowy(this);
		}
	}

	public final KwantyfikatorLicznosciowyContext kwantyfikatorLicznosciowy() throws RecognitionException {
		KwantyfikatorLicznosciowyContext _localctx = new KwantyfikatorLicznosciowyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_kwantyfikatorLicznosciowy);
		try {
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); minimumN();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); maksimumJeden();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258); coNajwyzejN();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259); dokladnieJeden();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260); dokladnieN();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261); zakresLiczb();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(262); przynajmniejJeden();
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

	public static class MinimumNContext extends ParserRuleContext {
		public MinimumContext minimum() {
			return getRuleContext(MinimumContext.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public MinimumNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimumN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMinimumN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMinimumN(this);
		}
	}

	public final MinimumNContext minimumN() throws RecognitionException {
		MinimumNContext _localctx = new MinimumNContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_minimumN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); minimum();
			setState(266); liczba();
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

	public static class MinimumContext extends ParserRuleContext {
		public MinimumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMinimum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMinimum(this);
		}
	}

	public final MinimumContext minimum() throws RecognitionException {
		MinimumContext _localctx = new MinimumContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_minimum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(T__18);
			setState(269); match(T__24);
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

	public static class LiczbaContext extends ParserRuleContext {
		public TerminalNode Cyfry() { return getToken(PolishRuleCNLParser.Cyfry, 0); }
		public LiczbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liczba; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterLiczba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitLiczba(this);
		}
	}

	public final LiczbaContext liczba() throws RecognitionException {
		LiczbaContext _localctx = new LiczbaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_liczba);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(T__8);
				setState(272); match(T__21);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); match(T__26);
				setState(274); match(Cyfry);
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

	public static class MaksimumJedenContext extends ParserRuleContext {
		public MaksimumJedenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maksimumJeden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMaksimumJeden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMaksimumJeden(this);
		}
	}

	public final MaksimumJedenContext maksimumJeden() throws RecognitionException {
		MaksimumJedenContext _localctx = new MaksimumJedenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_maksimumJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(T__18);
			setState(278); match(T__29);
			setState(279); match(T__10);
			setState(280); match(T__27);
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

	public static class CoNajwyzejNContext extends ParserRuleContext {
		public CoNajwyzejContext coNajwyzej() {
			return getRuleContext(CoNajwyzejContext.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public CoNajwyzejNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coNajwyzejN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCoNajwyzejN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCoNajwyzejN(this);
		}
	}

	public final CoNajwyzejNContext coNajwyzejN() throws RecognitionException {
		CoNajwyzejNContext _localctx = new CoNajwyzejNContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_coNajwyzejN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); coNajwyzej();
			setState(283); liczba();
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

	public static class CoNajwyzejContext extends ParserRuleContext {
		public CoNajwyzejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coNajwyzej; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCoNajwyzej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCoNajwyzej(this);
		}
	}

	public final CoNajwyzejContext coNajwyzej() throws RecognitionException {
		CoNajwyzejContext _localctx = new CoNajwyzejContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_coNajwyzej);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(285); match(T__20);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(T__18);
				setState(287); match(T__29);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(288); match(T__17);
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

	public static class DokladnieJedenContext extends ParserRuleContext {
		public DokladnieJedenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dokladnieJeden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDokladnieJeden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDokladnieJeden(this);
		}
	}

	public final DokladnieJedenContext dokladnieJeden() throws RecognitionException {
		DokladnieJedenContext _localctx = new DokladnieJedenContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dokladnieJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(T__22);
			setState(292); match(T__3);
			setState(293); match(T__10);
			setState(294); match(T__27);
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

	public static class DokladnieNContext extends ParserRuleContext {
		public DokładnieContext dokładnie() {
			return getRuleContext(DokładnieContext.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public DokladnieNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dokladnieN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDokladnieN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDokladnieN(this);
		}
	}

	public final DokladnieNContext dokladnieN() throws RecognitionException {
		DokladnieNContext _localctx = new DokladnieNContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dokladnieN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); dokładnie();
			setState(297); liczba();
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

	public static class DokładnieContext extends ParserRuleContext {
		public DokładnieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dokładnie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDokładnie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDokładnie(this);
		}
	}

	public final DokładnieContext dokładnie() throws RecognitionException {
		DokładnieContext _localctx = new DokładnieContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dokładnie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(T__22);
			setState(300); match(T__3);
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

	public static class ZakresLiczbContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PolishRuleCNLParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PolishRuleCNLParser.Identifier, i);
		}
		public LiczbaContext liczba(int i) {
			return getRuleContext(LiczbaContext.class,i);
		}
		public List<LiczbaContext> liczba() {
			return getRuleContexts(LiczbaContext.class);
		}
		public ZakresLiczbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zakresLiczb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterZakresLiczb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitZakresLiczb(this);
		}
	}

	public final ZakresLiczbContext zakresLiczb() throws RecognitionException {
		ZakresLiczbContext _localctx = new ZakresLiczbContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_zakresLiczb);
		try {
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); match(T__7);
				setState(303); match(T__8);
				setState(304); match(Identifier);
				setState(305); match(T__4);
				setState(306); match(T__30);
				setState(307); match(T__8);
				setState(308); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(T__7);
				setState(310); match(T__26);
				setState(311); liczba();
				setState(312); match(T__4);
				setState(313); match(T__30);
				setState(314); match(T__26);
				setState(315); liczba();
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

	public static class PrzynajmniejJedenContext extends ParserRuleContext {
		public PrzynajmniejJedenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przynajmniejJeden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPrzynajmniejJeden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPrzynajmniejJeden(this);
		}
	}

	public final PrzynajmniejJedenContext przynajmniejJeden() throws RecognitionException {
		PrzynajmniejJedenContext _localctx = new PrzynajmniejJedenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_przynajmniejJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(T__7);
			setState(320); match(T__10);
			setState(321); match(T__27);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\5\2Q\n\2\3\3\3\3\5"+
		"\3U\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3\6\3\6\3\7\3\7\3\7\5"+
		"\7w\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0086"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a1\n\f"+
		"\3\r\3\r\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\5\16\u00ab\n\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00bf\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c9"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u00cf\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00d9\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e2"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00f2\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010a"+
		"\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0116\n\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0124\n\"\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0140"+
		"\n&\3\'\3\'\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJL\2\2\u014a\2P\3\2\2\2\4T\3\2\2\2\6V\3\2\2"+
		"\2\bn\3\2\2\2\np\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20\u0085\3\2\2\2\22\u008c"+
		"\3\2\2\2\24\u0096\3\2\2\2\26\u00a0\3\2\2\2\30\u00a6\3\2\2\2\32\u00aa\3"+
		"\2\2\2\34\u00ac\3\2\2\2\36\u00b0\3\2\2\2 \u00be\3\2\2\2\"\u00c8\3\2\2"+
		"\2$\u00ce\3\2\2\2&\u00d8\3\2\2\2(\u00e1\3\2\2\2*\u00e3\3\2\2\2,\u00f1"+
		"\3\2\2\2.\u00f3\3\2\2\2\60\u00f6\3\2\2\2\62\u00fd\3\2\2\2\64\u0100\3\2"+
		"\2\2\66\u0109\3\2\2\28\u010b\3\2\2\2:\u010e\3\2\2\2<\u0115\3\2\2\2>\u0117"+
		"\3\2\2\2@\u011c\3\2\2\2B\u0123\3\2\2\2D\u0125\3\2\2\2F\u012a\3\2\2\2H"+
		"\u012d\3\2\2\2J\u013f\3\2\2\2L\u0141\3\2\2\2NQ\5\4\3\2OQ\5\6\4\2PN\3\2"+
		"\2\2PO\3\2\2\2Q\3\3\2\2\2RU\5\b\5\2SU\5\32\16\2TR\3\2\2\2TS\3\2\2\2U\5"+
		"\3\2\2\2VW\5\60\31\2W\7\3\2\2\2Xo\5\n\6\2Yo\5\20\t\2Z[\5\20\t\2[\\\5\22"+
		"\n\2\\o\3\2\2\2]^\5\n\6\2^_\5\22\n\2_o\3\2\2\2`a\5\20\t\2ab\5\24\13\2"+
		"bo\3\2\2\2cd\5\20\t\2de\5\22\n\2ef\5\24\13\2fo\3\2\2\2gh\5\n\6\2hi\5\24"+
		"\13\2io\3\2\2\2jk\5\n\6\2kl\5\22\n\2lm\5\24\13\2mo\3\2\2\2nX\3\2\2\2n"+
		"Y\3\2\2\2nZ\3\2\2\2n]\3\2\2\2n`\3\2\2\2nc\3\2\2\2ng\3\2\2\2nj\3\2\2\2"+
		"o\t\3\2\2\2pq\7\24\2\2qr\7)\2\2r\13\3\2\2\2st\7\34\2\2tw\7)\2\2uw\5\16"+
		"\b\2vs\3\2\2\2vu\3\2\2\2w\r\3\2\2\2xy\7&\2\2yz\7)\2\2z\17\3\2\2\2{|\5"+
		"\f\7\2|}\5\n\6\2}\u0086\3\2\2\2~\177\5\n\6\2\177\u0080\5\f\7\2\u0080\u0086"+
		"\3\2\2\2\u0081\u0082\5\f\7\2\u0082\u0083\5\n\6\2\u0083\u0084\5\f\7\2\u0084"+
		"\u0086\3\2\2\2\u0085{\3\2\2\2\u0085~\3\2\2\2\u0085\u0081\3\2\2\2\u0086"+
		"\21\3\2\2\2\u0087\u008d\5\b\5\2\u0088\u0089\5\b\5\2\u0089\u008a\5\26\f"+
		"\2\u008a\u008b\5\b\5\2\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088"+
		"\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\5\30\r\2\u008f\u0090\5\b\5\2\u0090"+
		"\u0097\3\2\2\2\u0091\u0092\5\30\r\2\u0092\u0093\5\b\5\2\u0093\u0094\5"+
		"\26\f\2\u0094\u0095\5\b\5\2\u0095\u0097\3\2\2\2\u0096\u008e\3\2\2\2\u0096"+
		"\u0091\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099\7\"\2\2\u0099\u00a1\7%\2\2"+
		"\u009a\u009b\7\"\2\2\u009b\u00a1\7\30\2\2\u009c\u009d\7\"\2\2\u009d\u00a1"+
		"\7!\2\2\u009e\u009f\7\"\2\2\u009f\u00a1\7\r\2\2\u00a0\u0098\3\2\2\2\u00a0"+
		"\u009a\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\27\3\2\2"+
		"\2\u00a2\u00a3\7\3\2\2\u00a3\u00a7\7\33\2\2\u00a4\u00a5\7\3\2\2\u00a5"+
		"\u00a7\7)\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\31\3\2\2\2"+
		"\u00a8\u00ab\5\34\17\2\u00a9\u00ab\5\36\20\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\5$\23"+
		"\2\u00ae\u00af\5\b\5\2\u00af\35\3\2\2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2"+
		"\5 \21\2\u00b2\37\3\2\2\2\u00b3\u00b4\5.\30\2\u00b4\u00b5\5\b\5\2\u00b5"+
		"\u00bf\3\2\2\2\u00b6\u00b7\5.\30\2\u00b7\u00b8\5\30\r\2\u00b8\u00b9\5"+
		"\b\5\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\5.\30\2\u00bb\u00bc\5\f\7\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bf\5\"\22\2\u00be\u00b3\3\2\2\2\u00be\u00b6\3"+
		"\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf!\3\2\2\2\u00c0\u00c1"+
		"\7\7\2\2\u00c1\u00c9\7)\2\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\7)\2\2\u00c4"+
		"\u00c5\7$\2\2\u00c5\u00c9\7\n\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c9\7\32"+
		"\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"#\3\2\2\2\u00ca\u00cf\5&\24\2\u00cb\u00cf\5(\25\2\u00cc\u00cf\5*\26\2"+
		"\u00cd\u00cf\5,\27\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf%\3\2\2\2\u00d0\u00d9\5\"\22\2\u00d1"+
		"\u00d2\5\"\22\2\u00d2\u00d3\5\30\r\2\u00d3\u00d9\3\2\2\2\u00d4\u00d5\5"+
		".\30\2\u00d5\u00d6\5\f\7\2\u00d6\u00d7\5\30\r\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d0\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\'\3\2\2\2"+
		"\u00da\u00db\7\7\2\2\u00db\u00e2\7\23\2\2\u00dc\u00e2\7\35\2\2\u00dd\u00de"+
		"\5.\30\2\u00de\u00df\7\24\2\2\u00df\u00e0\7\4\2\2\u00e0\u00e2\3\2\2\2"+
		"\u00e1\u00da\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2)\3"+
		"\2\2\2\u00e3\u00e4\5.\30\2\u00e4\u00e5\7\24\2\2\u00e5\u00e6\7\27\2\2\u00e6"+
		"+\3\2\2\2\u00e7\u00e8\5.\30\2\u00e8\u00e9\7\24\2\2\u00e9\u00ea\7\31\2"+
		"\2\u00ea\u00f2\3\2\2\2\u00eb\u00ec\5.\30\2\u00ec\u00ed\7\24\2\2\u00ed"+
		"\u00ee\7 \2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f0\7\7\2\2\u00f0\u00f2\7\6"+
		"\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"-\3\2\2\2\u00f3\u00f4\7\7\2\2\u00f4\u00f5\7\17\2\2\u00f5/\3\2\2\2\u00f6"+
		"\u00f7\5\62\32\2\u00f7\u00f8\5\b\5\2\u00f8\u00f9\5\64\33\2\u00f9\u00fa"+
		"\5$\23\2\u00fa\u00fb\5\66\34\2\u00fb\u00fc\5\b\5\2\u00fc\61\3\2\2\2\u00fd"+
		"\u00fe\7\34\2\2\u00fe\u00ff\7\26\2\2\u00ff\63\3\2\2\2\u0100\u0101\7\5"+
		"\2\2\u0101\65\3\2\2\2\u0102\u010a\58\35\2\u0103\u010a\5> \2\u0104\u010a"+
		"\5@!\2\u0105\u010a\5D#\2\u0106\u010a\5F$\2\u0107\u010a\5J&\2\u0108\u010a"+
		"\5L\'\2\u0109\u0102\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0104\3\2\2\2\u0109"+
		"\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2"+
		"\2\2\u010a\67\3\2\2\2\u010b\u010c\5:\36\2\u010c\u010d\5<\37\2\u010d9\3"+
		"\2\2\2\u010e\u010f\7\24\2\2\u010f\u0110\7\16\2\2\u0110;\3\2\2\2\u0111"+
		"\u0112\7\36\2\2\u0112\u0116\7\21\2\2\u0113\u0114\7\f\2\2\u0114\u0116\7"+
		",\2\2\u0115\u0111\3\2\2\2\u0115\u0113\3\2\2\2\u0116=\3\2\2\2\u0117\u0118"+
		"\7\24\2\2\u0118\u0119\7\t\2\2\u0119\u011a\7\34\2\2\u011a\u011b\7\13\2"+
		"\2\u011b?\3\2\2\2\u011c\u011d\5B\"\2\u011d\u011e\5<\37\2\u011eA\3\2\2"+
		"\2\u011f\u0124\7\22\2\2\u0120\u0121\7\24\2\2\u0121\u0124\7\t\2\2\u0122"+
		"\u0124\7\25\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0122\3"+
		"\2\2\2\u0124C\3\2\2\2\u0125\u0126\7\20\2\2\u0126\u0127\7#\2\2\u0127\u0128"+
		"\7\34\2\2\u0128\u0129\7\13\2\2\u0129E\3\2\2\2\u012a\u012b\5H%\2\u012b"+
		"\u012c\5<\37\2\u012cG\3\2\2\2\u012d\u012e\7\20\2\2\u012e\u012f\7#\2\2"+
		"\u012fI\3\2\2\2\u0130\u0131\7\37\2\2\u0131\u0132\7\36\2\2\u0132\u0133"+
		"\7)\2\2\u0133\u0134\7\"\2\2\u0134\u0135\7\b\2\2\u0135\u0136\7\36\2\2\u0136"+
		"\u0140\7)\2\2\u0137\u0138\7\37\2\2\u0138\u0139\7\f\2\2\u0139\u013a\5<"+
		"\37\2\u013a\u013b\7\"\2\2\u013b\u013c\7\b\2\2\u013c\u013d\7\f\2\2\u013d"+
		"\u013e\5<\37\2\u013e\u0140\3\2\2\2\u013f\u0130\3\2\2\2\u013f\u0137\3\2"+
		"\2\2\u0140K\3\2\2\2\u0141\u0142\7\37\2\2\u0142\u0143\7\34\2\2\u0143\u0144"+
		"\7\13\2\2\u0144M\3\2\2\2\26PTnv\u0085\u008c\u0096\u00a0\u00a6\u00aa\u00be"+
		"\u00c8\u00ce\u00d8\u00e1\u00f1\u0109\u0115\u0123\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}