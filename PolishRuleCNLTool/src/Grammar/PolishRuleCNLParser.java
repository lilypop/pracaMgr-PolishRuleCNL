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
		T__65=1, T__64=2, T__63=3, T__62=4, T__61=5, T__60=6, T__59=7, T__58=8, 
		T__57=9, T__56=10, T__55=11, T__54=12, T__53=13, T__52=14, T__51=15, T__50=16, 
		T__49=17, T__48=18, T__47=19, T__46=20, T__45=21, T__44=22, T__43=23, 
		T__42=24, T__41=25, T__40=26, T__39=27, T__38=28, T__37=29, T__36=30, 
		T__35=31, T__34=32, T__33=33, T__32=34, T__31=35, T__30=36, T__29=37, 
		T__28=38, T__27=39, T__26=40, T__25=41, T__24=42, T__23=43, T__22=44, 
		T__21=45, T__20=46, T__19=47, T__18=48, T__17=49, T__16=50, T__15=51, 
		T__14=52, T__13=53, T__12=54, T__11=55, T__10=56, T__9=57, T__8=58, T__7=59, 
		T__6=60, T__5=61, T__4=62, T__3=63, T__2=64, T__1=65, T__0=66, PolishLetter=67, 
		Letter=68, Identifier=69, Srednik=70, Myslnik=71, Cyfry=72, WS=73;
	public static final String[] tokenNames = {
		"<INVALID>", "'o'", "'część'", "'zawsze'", "'mieć'", "'tego'", "'od'", 
		"'fin'", "'a wysoko'", "'się'", "'jeden'", "'minimum'", "'możliwość'", 
		"'być'", "'IDENTIFIER'", "'praet'", "'subst'", "'zawierać'", "'musieć'", 
		"'co wysoko'", "''", "'nie'", "'każdy'", "'musić'", "'rodzaj'", "'inf'", 
		"'oraz'", "'składać'", "'zabronić'", "'atrybut'", "'z'", "'adj'", "'num'", 
		"'niezależnie'", "'a'", "'nigdy'", "'dokładnie'", "'gdy'", "'i'", "'wtedy'", 
		"'że'", "'prep'", "'albo'", "'pred'", "'maksimum'", "'lub'", "'tnum'", 
		"'móc'", "'obowiązek'", "'adv'", "'co najwyżej'", "'wszystko'", "'tylko'", 
		"'pact'", "'to'", "'prawda'", "'jeśli'", "'składać się z'", "'przynajmniej'", 
		"'własność'", "'konieczny'", "'conj'", "'qub'", "'ppas'", "'aby'", "'comp'", 
		"'istnieć'", "PolishLetter", "Letter", "Identifier", "';'", "'-'", "Cyfry", 
		"WS"
	};
	public static final int
		RULE_korzen = 0, RULE_slownik = 1, RULE_regula = 2, RULE_logiczneSformulowania = 3, 
		RULE_modalneSformulowania = 4, RULE_sformułowanieModalneZlozone = 5, RULE_sformułowanieModalneProste = 6, 
		RULE_pojecieRzeczownikowe = 7, RULE_rzeczownikOkreslonyPrzymiotnikiem = 8, 
		RULE_rzeczownikOkreslajacy = 9, RULE_wyrazeniePrzyimkowe = 10, RULE_fakt = 11, 
		RULE_binarnyFakt = 12, RULE_charakterystyka = 13, RULE_cechaRzeczownika = 14, 
		RULE_relacja = 15, RULE_asocjacja = 16, RULE_caloscCzesc = 17, RULE_generalizacja = 18, 
		RULE_jestAtrybutem = 19, RULE_czasownikByc = 20, RULE_sformulowanieRownowaznosc = 21, 
		RULE_sformulowanieImplikacji = 22, RULE_prostaImplikacja = 23, RULE_zlozonaImplikacja = 24, 
		RULE_pojecieRzeczownikoweRelacjaPojecieRzeczownikowe = 25, RULE_relacjaPojecieRzeczownikowe = 26, 
		RULE_ograniczenieLicznosciowe = 27, RULE_sfurmulowanieLogiczneNegacja = 28, 
		RULE_pojecieRzeczownikoweZOkresleniem = 29, RULE_kwantyfikatorOgolny = 30, 
		RULE_operatorModalnyDlaKoniecznosci = 31, RULE_operatorModalnyCalosc = 32, 
		RULE_kwantyfikatorLicznosciowy = 33, RULE_minimumN = 34, RULE_minimum = 35, 
		RULE_liczba = 36, RULE_maksimumJeden = 37, RULE_coNajwyzejN = 38, RULE_coNajwyzej = 39, 
		RULE_dokladnieJeden = 40, RULE_dokladnieN = 41, RULE_dokładnie = 42, RULE_zakresLiczb = 43, 
		RULE_przynajmniejJeden = 44, RULE_operatorLogiczny = 45, RULE_logicznaNegacja = 46, 
		RULE_niejestPrawdaZe = 47, RULE_niePrawdaZe = 48, RULE_nie = 49, RULE_koniunkcja = 50, 
		RULE_i = 51, RULE_dysjunkcja = 52, RULE_oraz = 53, RULE_dysjunkcjaRozlaczna = 54, 
		RULE_implikacja = 55, RULE_koniecImplikacji = 56, RULE_rownowaznosc = 57, 
		RULE_tylkoGdy = 58, RULE_wtedyItylkoWtedyGdy = 59, RULE_sformulowanieNieZaleznosciElementow = 60, 
		RULE_operatorModalny = 61, RULE_sformulowanieObowiazku = 62, RULE_musi = 63, 
		RULE_jestObowiazkiemAby = 64, RULE_sformulowanieObowiazkuNegacja = 65, 
		RULE_nieMoze = 66, RULE_jestZabronioneAby = 67, RULE_sformulowanieKoniecznosci = 68, 
		RULE_zawsze = 69, RULE_jestKonieczneAby = 70, RULE_sformulowanieKoniecznosciNegacja = 71, 
		RULE_nigdy = 72, RULE_nieIstniejeMozliwoscZe = 73, RULE_sformulowanieMozliwosci = 74, 
		RULE_istniejeMozliwoscZe = 75, RULE_sformulowaniePozwolenia = 76, RULE_moze = 77, 
		RULE_nieMusi = 78, RULE_rzeczownik = 79, RULE_przymiotnik = 80, RULE_imieslowPrzymiotnikowyCzynnyPseudo = 81, 
		RULE_czasownik = 82, RULE_bezokolicznik = 83, RULE_spójnik = 84, RULE_przyimek = 85, 
		RULE_imieslowPrzymiotnikowyBierny = 86;
	public static final String[] ruleNames = {
		"korzen", "slownik", "regula", "logiczneSformulowania", "modalneSformulowania", 
		"sformułowanieModalneZlozone", "sformułowanieModalneProste", "pojecieRzeczownikowe", 
		"rzeczownikOkreslonyPrzymiotnikiem", "rzeczownikOkreslajacy", "wyrazeniePrzyimkowe", 
		"fakt", "binarnyFakt", "charakterystyka", "cechaRzeczownika", "relacja", 
		"asocjacja", "caloscCzesc", "generalizacja", "jestAtrybutem", "czasownikByc", 
		"sformulowanieRownowaznosc", "sformulowanieImplikacji", "prostaImplikacja", 
		"zlozonaImplikacja", "pojecieRzeczownikoweRelacjaPojecieRzeczownikowe", 
		"relacjaPojecieRzeczownikowe", "ograniczenieLicznosciowe", "sfurmulowanieLogiczneNegacja", 
		"pojecieRzeczownikoweZOkresleniem", "kwantyfikatorOgolny", "operatorModalnyDlaKoniecznosci", 
		"operatorModalnyCalosc", "kwantyfikatorLicznosciowy", "minimumN", "minimum", 
		"liczba", "maksimumJeden", "coNajwyzejN", "coNajwyzej", "dokladnieJeden", 
		"dokladnieN", "dokładnie", "zakresLiczb", "przynajmniejJeden", "operatorLogiczny", 
		"logicznaNegacja", "niejestPrawdaZe", "niePrawdaZe", "nie", "koniunkcja", 
		"i", "dysjunkcja", "oraz", "dysjunkcjaRozlaczna", "implikacja", "koniecImplikacji", 
		"rownowaznosc", "tylkoGdy", "wtedyItylkoWtedyGdy", "sformulowanieNieZaleznosciElementow", 
		"operatorModalny", "sformulowanieObowiazku", "musi", "jestObowiazkiemAby", 
		"sformulowanieObowiazkuNegacja", "nieMoze", "jestZabronioneAby", "sformulowanieKoniecznosci", 
		"zawsze", "jestKonieczneAby", "sformulowanieKoniecznosciNegacja", "nigdy", 
		"nieIstniejeMozliwoscZe", "sformulowanieMozliwosci", "istniejeMozliwoscZe", 
		"sformulowaniePozwolenia", "moze", "nieMusi", "rzeczownik", "przymiotnik", 
		"imieslowPrzymiotnikowyCzynnyPseudo", "czasownik", "bezokolicznik", "spójnik", 
		"przyimek", "imieslowPrzymiotnikowyBierny"
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
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); slownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175); regula();
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
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179); fakt();
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
		public ModalneSformulowaniaContext modalneSformulowania() {
			return getRuleContext(ModalneSformulowaniaContext.class,0);
		}
		public OgraniczenieLicznoscioweContext ograniczenieLicznosciowe() {
			return getRuleContext(OgraniczenieLicznoscioweContext.class,0);
		}
		public LogiczneSformulowaniaContext logiczneSformulowania() {
			return getRuleContext(LogiczneSformulowaniaContext.class,0);
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
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); ograniczenieLicznosciowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); logiczneSformulowania();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); modalneSformulowania();
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

	public static class LogiczneSformulowaniaContext extends ParserRuleContext {
		public SformulowanieRownowaznoscContext sformulowanieRownowaznosc() {
			return getRuleContext(SformulowanieRownowaznoscContext.class,0);
		}
		public SfurmulowanieLogiczneNegacjaContext sfurmulowanieLogiczneNegacja() {
			return getRuleContext(SfurmulowanieLogiczneNegacjaContext.class,0);
		}
		public SformulowanieImplikacjiContext sformulowanieImplikacji() {
			return getRuleContext(SformulowanieImplikacjiContext.class,0);
		}
		public LogiczneSformulowaniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logiczneSformulowania; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterLogiczneSformulowania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitLogiczneSformulowania(this);
		}
	}

	public final LogiczneSformulowaniaContext logiczneSformulowania() throws RecognitionException {
		LogiczneSformulowaniaContext _localctx = new LogiczneSformulowaniaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logiczneSformulowania);
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); sfurmulowanieLogiczneNegacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); sformulowanieRownowaznosc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); sformulowanieImplikacji();
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

	public static class ModalneSformulowaniaContext extends ParserRuleContext {
		public SformułowanieModalneZlozoneContext sformułowanieModalneZlozone() {
			return getRuleContext(SformułowanieModalneZlozoneContext.class,0);
		}
		public SformułowanieModalneProsteContext sformułowanieModalneProste() {
			return getRuleContext(SformułowanieModalneProsteContext.class,0);
		}
		public ModalneSformulowaniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalneSformulowania; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterModalneSformulowania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitModalneSformulowania(this);
		}
	}

	public final ModalneSformulowaniaContext modalneSformulowania() throws RecognitionException {
		ModalneSformulowaniaContext _localctx = new ModalneSformulowaniaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modalneSformulowania);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); sformułowanieModalneProste();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); sformułowanieModalneZlozone();
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

	public static class SformułowanieModalneZlozoneContext extends ParserRuleContext {
		public PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem(int i) {
			return getRuleContext(PojecieRzeczownikoweZOkresleniemContext.class,i);
		}
		public OperatorModalnyContext operatorModalny() {
			return getRuleContext(OperatorModalnyContext.class,0);
		}
		public List<PojecieRzeczownikoweZOkresleniemContext> pojecieRzeczownikoweZOkresleniem() {
			return getRuleContexts(PojecieRzeczownikoweZOkresleniemContext.class);
		}
		public BezokolicznikContext bezokolicznik() {
			return getRuleContext(BezokolicznikContext.class,0);
		}
		public SformułowanieModalneZlozoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformułowanieModalneZlozone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformułowanieModalneZlozone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformułowanieModalneZlozone(this);
		}
	}

	public final SformułowanieModalneZlozoneContext sformułowanieModalneZlozone() throws RecognitionException {
		SformułowanieModalneZlozoneContext _localctx = new SformułowanieModalneZlozoneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sformułowanieModalneZlozone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); pojecieRzeczownikoweZOkresleniem();
			setState(197); operatorModalny();
			setState(198); bezokolicznik();
			setState(199); pojecieRzeczownikoweZOkresleniem();
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

	public static class SformułowanieModalneProsteContext extends ParserRuleContext {
		public OperatorModalnyContext operatorModalny() {
			return getRuleContext(OperatorModalnyContext.class,0);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class,0);
		}
		public SformułowanieModalneProsteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformułowanieModalneProste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformułowanieModalneProste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformułowanieModalneProste(this);
		}
	}

	public final SformułowanieModalneProsteContext sformułowanieModalneProste() throws RecognitionException {
		SformułowanieModalneProsteContext _localctx = new SformułowanieModalneProsteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sformułowanieModalneProste);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); operatorModalny();
			setState(202); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
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
		enterRule(_localctx, 14, RULE_pojecieRzeczownikowe);
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); rzeczownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); rzeczownikOkreslonyPrzymiotnikiem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206); rzeczownikOkreslonyPrzymiotnikiem();
				setState(207); rzeczownikOkreslajacy();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209); rzeczownik();
				setState(210); rzeczownikOkreslajacy();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212); rzeczownikOkreslonyPrzymiotnikiem();
				setState(213); wyrazeniePrzyimkowe();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215); rzeczownikOkreslonyPrzymiotnikiem();
				setState(216); rzeczownikOkreslajacy();
				setState(217); wyrazeniePrzyimkowe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219); rzeczownik();
				setState(220); wyrazeniePrzyimkowe();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222); rzeczownik();
				setState(223); rzeczownikOkreslajacy();
				setState(224); wyrazeniePrzyimkowe();
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
		enterRule(_localctx, 16, RULE_rzeczownikOkreslonyPrzymiotnikiem);
		try {
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); przymiotnik();
				setState(229); rzeczownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); rzeczownik();
				setState(232); przymiotnik();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234); przymiotnik();
				setState(235); rzeczownik();
				setState(236); przymiotnik();
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
		enterRule(_localctx, 18, RULE_rzeczownikOkreslajacy);
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); pojecieRzeczownikowe();
				setState(242); spójnik();
				setState(243); pojecieRzeczownikowe();
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
		enterRule(_localctx, 20, RULE_wyrazeniePrzyimkowe);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); przyimek();
				setState(248); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); przyimek();
				setState(251); pojecieRzeczownikowe();
				setState(252); spójnik();
				setState(253); pojecieRzeczownikowe();
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
		enterRule(_localctx, 22, RULE_fakt);
		try {
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); binarnyFakt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); charakterystyka();
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
		enterRule(_localctx, 24, RULE_binarnyFakt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); pojecieRzeczownikowe();
			setState(262); relacja();
			setState(263); pojecieRzeczownikowe();
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
		enterRule(_localctx, 26, RULE_charakterystyka);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); pojecieRzeczownikowe();
			setState(266); cechaRzeczownika();
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
		enterRule(_localctx, 28, RULE_cechaRzeczownika);
		try {
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); czasownikByc();
				setState(269); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); czasownikByc();
				setState(272); przyimek();
				setState(273); pojecieRzeczownikowe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275); czasownikByc();
				setState(276); przymiotnik();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278); czasownik();
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
		enterRule(_localctx, 30, RULE_relacja);
		try {
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); asocjacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); caloscCzesc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283); generalizacja();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284); jestAtrybutem();
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
		public ImieslowPrzymiotnikowyCzynnyPseudoContext imieslowPrzymiotnikowyCzynnyPseudo() {
			return getRuleContext(ImieslowPrzymiotnikowyCzynnyPseudoContext.class,0);
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
		enterRule(_localctx, 32, RULE_asocjacja);
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); czasownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288); czasownik();
				setState(289); przyimek();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291); czasownikByc();
				setState(292); przymiotnik();
				setState(293); przyimek();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295); imieslowPrzymiotnikowyCzynnyPseudo();
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
		enterRule(_localctx, 34, RULE_caloscCzesc);
		try {
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298); match(T__59);
				setState(299); match(T__49);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301); czasownikByc();
				setState(302); match(T__50);
				setState(303); match(T__64);
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
		enterRule(_localctx, 36, RULE_generalizacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); czasownikByc();
			setState(308); match(T__50);
			setState(309); match(T__42);
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
		enterRule(_localctx, 38, RULE_jestAtrybutem);
		try {
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311); czasownikByc();
				setState(312); match(T__50);
				setState(313); match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); czasownikByc();
				setState(316); match(T__50);
				setState(317); match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319); match(T__59);
				setState(320); match(T__62);
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
		enterRule(_localctx, 40, RULE_czasownikByc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(T__59);
			setState(324); match(T__53);
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

	public static class SformulowanieRownowaznoscContext extends ParserRuleContext {
		public OperatorLogicznyContext operatorLogiczny() {
			return getRuleContext(OperatorLogicznyContext.class,0);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext> pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class);
		}
		public SformulowanieRownowaznoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieRownowaznosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieRownowaznosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieRownowaznosc(this);
		}
	}

	public final SformulowanieRownowaznoscContext sformulowanieRownowaznosc() throws RecognitionException {
		SformulowanieRownowaznoscContext _localctx = new SformulowanieRownowaznoscContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sformulowanieRownowaznosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
			setState(327); operatorLogiczny();
			setState(328); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
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

	public static class SformulowanieImplikacjiContext extends ParserRuleContext {
		public ZlozonaImplikacjaContext zlozonaImplikacja() {
			return getRuleContext(ZlozonaImplikacjaContext.class,0);
		}
		public ProstaImplikacjaContext prostaImplikacja() {
			return getRuleContext(ProstaImplikacjaContext.class,0);
		}
		public SformulowanieImplikacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieImplikacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieImplikacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieImplikacji(this);
		}
	}

	public final SformulowanieImplikacjiContext sformulowanieImplikacji() throws RecognitionException {
		SformulowanieImplikacjiContext _localctx = new SformulowanieImplikacjiContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sformulowanieImplikacji);
		try {
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); prostaImplikacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); zlozonaImplikacja();
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

	public static class ProstaImplikacjaContext extends ParserRuleContext {
		public OperatorLogicznyContext operatorLogiczny() {
			return getRuleContext(OperatorLogicznyContext.class,0);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext> pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class);
		}
		public RelacjaPojecieRzeczownikoweContext relacjaPojecieRzeczownikowe() {
			return getRuleContext(RelacjaPojecieRzeczownikoweContext.class,0);
		}
		public ProstaImplikacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prostaImplikacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterProstaImplikacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitProstaImplikacja(this);
		}
	}

	public final ProstaImplikacjaContext prostaImplikacja() throws RecognitionException {
		ProstaImplikacjaContext _localctx = new ProstaImplikacjaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prostaImplikacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
			setState(335); operatorLogiczny();
			setState(338);
			switch (_input.LA(1)) {
			case T__50:
			case T__46:
			case T__35:
			case T__17:
			case T__3:
				{
				setState(336); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
				}
				break;
			case T__59:
			case T__51:
			case T__13:
			case T__9:
				{
				setState(337); relacjaPojecieRzeczownikowe();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ZlozonaImplikacjaContext extends ParserRuleContext {
		public List<OperatorLogicznyContext> operatorLogiczny() {
			return getRuleContexts(OperatorLogicznyContext.class);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class,i);
		}
		public OperatorLogicznyContext operatorLogiczny(int i) {
			return getRuleContext(OperatorLogicznyContext.class,i);
		}
		public List<PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext> pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class);
		}
		public ZlozonaImplikacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zlozonaImplikacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterZlozonaImplikacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitZlozonaImplikacja(this);
		}
	}

	public final ZlozonaImplikacjaContext zlozonaImplikacja() throws RecognitionException {
		ZlozonaImplikacjaContext _localctx = new ZlozonaImplikacjaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_zlozonaImplikacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); operatorLogiczny();
			setState(341); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
			setState(342); operatorLogiczny();
			setState(343); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
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

	public static class PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext extends ParserRuleContext {
		public PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem(int i) {
			return getRuleContext(PojecieRzeczownikoweZOkresleniemContext.class,i);
		}
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public List<PojecieRzeczownikoweZOkresleniemContext> pojecieRzeczownikoweZOkresleniem() {
			return getRuleContexts(PojecieRzeczownikoweZOkresleniemContext.class);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pojecieRzeczownikoweRelacjaPojecieRzeczownikowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPojecieRzeczownikoweRelacjaPojecieRzeczownikowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPojecieRzeczownikoweRelacjaPojecieRzeczownikowe(this);
		}
	}

	public final PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() throws RecognitionException {
		PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext _localctx = new PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pojecieRzeczownikoweRelacjaPojecieRzeczownikowe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); pojecieRzeczownikoweZOkresleniem();
			setState(346); relacja();
			setState(347); pojecieRzeczownikoweZOkresleniem();
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

	public static class RelacjaPojecieRzeczownikoweContext extends ParserRuleContext {
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem() {
			return getRuleContext(PojecieRzeczownikoweZOkresleniemContext.class,0);
		}
		public RelacjaPojecieRzeczownikoweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacjaPojecieRzeczownikowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRelacjaPojecieRzeczownikowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRelacjaPojecieRzeczownikowe(this);
		}
	}

	public final RelacjaPojecieRzeczownikoweContext relacjaPojecieRzeczownikowe() throws RecognitionException {
		RelacjaPojecieRzeczownikoweContext _localctx = new RelacjaPojecieRzeczownikoweContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relacjaPojecieRzeczownikowe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); relacja();
			setState(350); pojecieRzeczownikoweZOkresleniem();
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
		enterRule(_localctx, 54, RULE_ograniczenieLicznosciowe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); kwantyfikatorOgolny();
			setState(353); pojecieRzeczownikowe();
			setState(354); operatorModalnyDlaKoniecznosci();
			setState(355); relacja();
			setState(356); kwantyfikatorLicznosciowy();
			setState(357); pojecieRzeczownikowe();
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

	public static class SfurmulowanieLogiczneNegacjaContext extends ParserRuleContext {
		public OperatorLogicznyContext operatorLogiczny() {
			return getRuleContext(OperatorLogicznyContext.class,0);
		}
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem() {
			return getRuleContext(PojecieRzeczownikoweZOkresleniemContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public KwantyfikatorLicznosciowyContext kwantyfikatorLicznosciowy() {
			return getRuleContext(KwantyfikatorLicznosciowyContext.class,0);
		}
		public SfurmulowanieLogiczneNegacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sfurmulowanieLogiczneNegacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSfurmulowanieLogiczneNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSfurmulowanieLogiczneNegacja(this);
		}
	}

	public final SfurmulowanieLogiczneNegacjaContext sfurmulowanieLogiczneNegacja() throws RecognitionException {
		SfurmulowanieLogiczneNegacjaContext _localctx = new SfurmulowanieLogiczneNegacjaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sfurmulowanieLogiczneNegacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); operatorLogiczny();
			setState(360); pojecieRzeczownikoweZOkresleniem();
			setState(361); relacja();
			setState(362); kwantyfikatorLicznosciowy();
			setState(363); pojecieRzeczownikowe();
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

	public static class PojecieRzeczownikoweZOkresleniemContext extends ParserRuleContext {
		public KwantyfikatorOgolnyContext kwantyfikatorOgolny() {
			return getRuleContext(KwantyfikatorOgolnyContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public OperatorModalnyDlaKoniecznosciContext operatorModalnyDlaKoniecznosci() {
			return getRuleContext(OperatorModalnyDlaKoniecznosciContext.class,0);
		}
		public OperatorModalnyCaloscContext operatorModalnyCalosc() {
			return getRuleContext(OperatorModalnyCaloscContext.class,0);
		}
		public PojecieRzeczownikoweZOkresleniemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pojecieRzeczownikoweZOkresleniem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPojecieRzeczownikoweZOkresleniem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPojecieRzeczownikoweZOkresleniem(this);
		}
	}

	public final PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem() throws RecognitionException {
		PojecieRzeczownikoweZOkresleniemContext _localctx = new PojecieRzeczownikoweZOkresleniemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pojecieRzeczownikoweZOkresleniem);
		try {
			setState(386);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); kwantyfikatorOgolny();
				setState(367); pojecieRzeczownikowe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369); pojecieRzeczownikowe();
				setState(370); kwantyfikatorOgolny();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372); operatorModalnyCalosc();
				setState(373); pojecieRzeczownikowe();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(375); operatorModalnyDlaKoniecznosci();
				setState(376); kwantyfikatorOgolny();
				setState(377); pojecieRzeczownikowe();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(379); operatorModalnyDlaKoniecznosci();
				setState(380); pojecieRzeczownikowe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(382); pojecieRzeczownikowe();
				setState(383); operatorModalnyDlaKoniecznosci();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(385); match(T__46);
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
		enterRule(_localctx, 60, RULE_kwantyfikatorOgolny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(T__35);
			setState(389); match(T__44);
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
		enterRule(_localctx, 62, RULE_operatorModalnyDlaKoniecznosci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(T__17);
			setState(392); match(T__63);
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

	public static class OperatorModalnyCaloscContext extends ParserRuleContext {
		public OperatorModalnyCaloscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorModalnyCalosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOperatorModalnyCalosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOperatorModalnyCalosc(this);
		}
	}

	public final OperatorModalnyCaloscContext operatorModalnyCalosc() throws RecognitionException {
		OperatorModalnyCaloscContext _localctx = new OperatorModalnyCaloscContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operatorModalnyCalosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(T__35);
			setState(395); match(T__15);
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
		enterRule(_localctx, 66, RULE_kwantyfikatorLicznosciowy);
		try {
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397); minimumN();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); maksimumJeden();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399); coNajwyzejN();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400); dokladnieJeden();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(401); dokladnieN();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(402); zakresLiczb();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(403); przynajmniejJeden();
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
		enterRule(_localctx, 68, RULE_minimumN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); minimum();
			setState(407); liczba();
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
		enterRule(_localctx, 70, RULE_minimum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(T__50);
			setState(410); match(T__55);
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
		enterRule(_localctx, 72, RULE_liczba);
		try {
			setState(416);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(412); match(T__34);
				setState(413); match(T__52);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(414); match(T__20);
				setState(415); match(Cyfry);
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
		enterRule(_localctx, 74, RULE_maksimumJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(T__50);
			setState(419); match(T__22);
			setState(420); match(T__35);
			setState(421); match(T__56);
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
		enterRule(_localctx, 76, RULE_coNajwyzejN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); coNajwyzej();
			setState(424); liczba();
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
		enterRule(_localctx, 78, RULE_coNajwyzej);
		try {
			setState(430);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(426); match(T__16);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(427); match(T__50);
				setState(428); match(T__22);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(429); match(T__47);
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
		enterRule(_localctx, 80, RULE_dokladnieJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); match(T__17);
			setState(433); match(T__30);
			setState(434); match(T__35);
			setState(435); match(T__56);
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
		enterRule(_localctx, 82, RULE_dokladnieN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); dokładnie();
			setState(438); liczba();
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
		enterRule(_localctx, 84, RULE_dokładnie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440); match(T__17);
			setState(441); match(T__30);
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
		enterRule(_localctx, 86, RULE_zakresLiczb);
		try {
			setState(458);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443); match(T__8);
				setState(444); match(T__34);
				setState(445); match(Identifier);
				setState(446); match(T__5);
				setState(447); match(T__58);
				setState(448); match(T__34);
				setState(449); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450); match(T__8);
				setState(451); match(T__20);
				setState(452); liczba();
				setState(453); match(T__5);
				setState(454); match(T__58);
				setState(455); match(T__20);
				setState(456); liczba();
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
		enterRule(_localctx, 88, RULE_przynajmniejJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); match(T__8);
			setState(461); match(T__35);
			setState(462); match(T__56);
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

	public static class OperatorLogicznyContext extends ParserRuleContext {
		public ImplikacjaContext implikacja() {
			return getRuleContext(ImplikacjaContext.class,0);
		}
		public SformulowanieNieZaleznosciElementowContext sformulowanieNieZaleznosciElementow() {
			return getRuleContext(SformulowanieNieZaleznosciElementowContext.class,0);
		}
		public KoniunkcjaContext koniunkcja() {
			return getRuleContext(KoniunkcjaContext.class,0);
		}
		public LogicznaNegacjaContext logicznaNegacja() {
			return getRuleContext(LogicznaNegacjaContext.class,0);
		}
		public KoniecImplikacjiContext koniecImplikacji() {
			return getRuleContext(KoniecImplikacjiContext.class,0);
		}
		public DysjunkcjaRozlacznaContext dysjunkcjaRozlaczna() {
			return getRuleContext(DysjunkcjaRozlacznaContext.class,0);
		}
		public RownowaznoscContext rownowaznosc() {
			return getRuleContext(RownowaznoscContext.class,0);
		}
		public DysjunkcjaContext dysjunkcja() {
			return getRuleContext(DysjunkcjaContext.class,0);
		}
		public OperatorLogicznyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorLogiczny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOperatorLogiczny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOperatorLogiczny(this);
		}
	}

	public final OperatorLogicznyContext operatorLogiczny() throws RecognitionException {
		OperatorLogicznyContext _localctx = new OperatorLogicznyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_operatorLogiczny);
		try {
			setState(472);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464); logicznaNegacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465); koniunkcja();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466); dysjunkcja();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467); dysjunkcjaRozlaczna();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(468); implikacja();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(469); koniecImplikacji();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(470); rownowaznosc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(471); sformulowanieNieZaleznosciElementow();
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

	public static class LogicznaNegacjaContext extends ParserRuleContext {
		public NieContext nie() {
			return getRuleContext(NieContext.class,0);
		}
		public NiePrawdaZeContext niePrawdaZe() {
			return getRuleContext(NiePrawdaZeContext.class,0);
		}
		public NiejestPrawdaZeContext niejestPrawdaZe() {
			return getRuleContext(NiejestPrawdaZeContext.class,0);
		}
		public LogicznaNegacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicznaNegacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterLogicznaNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitLogicznaNegacja(this);
		}
	}

	public final LogicznaNegacjaContext logicznaNegacja() throws RecognitionException {
		LogicznaNegacjaContext _localctx = new LogicznaNegacjaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_logicznaNegacja);
		try {
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474); niePrawdaZe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475); niejestPrawdaZe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476); nie();
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

	public static class NiejestPrawdaZeContext extends ParserRuleContext {
		public NiejestPrawdaZeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_niejestPrawdaZe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNiejestPrawdaZe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNiejestPrawdaZe(this);
		}
	}

	public final NiejestPrawdaZeContext niejestPrawdaZe() throws RecognitionException {
		NiejestPrawdaZeContext _localctx = new NiejestPrawdaZeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_niejestPrawdaZe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); match(T__4);
			setState(480); match(T__45);
			setState(481); match(T__59);
			setState(482); match(T__53);
			setState(483); match(T__50);
			setState(484); match(T__11);
			setState(485); match(T__1);
			setState(486); match(T__26);
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

	public static class NiePrawdaZeContext extends ParserRuleContext {
		public NiePrawdaZeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_niePrawdaZe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNiePrawdaZe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNiePrawdaZe(this);
		}
	}

	public final NiePrawdaZeContext niePrawdaZe() throws RecognitionException {
		NiePrawdaZeContext _localctx = new NiePrawdaZeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_niePrawdaZe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(T__4);
			setState(489); match(T__45);
			setState(490); match(T__50);
			setState(491); match(T__11);
			setState(492); match(T__1);
			setState(493); match(T__26);
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

	public static class NieContext extends ParserRuleContext {
		public NieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNie(this);
		}
	}

	public final NieContext nie() throws RecognitionException {
		NieContext _localctx = new NieContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495); match(T__4);
			setState(496); match(T__45);
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

	public static class KoniunkcjaContext extends ParserRuleContext {
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public OrazContext oraz() {
			return getRuleContext(OrazContext.class,0);
		}
		public KoniunkcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koniunkcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKoniunkcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKoniunkcja(this);
		}
	}

	public final KoniunkcjaContext koniunkcja() throws RecognitionException {
		KoniunkcjaContext _localctx = new KoniunkcjaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_koniunkcja);
		try {
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498); i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499); oraz();
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

	public static class IContext extends ParserRuleContext {
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502); match(T__5);
			setState(503); match(T__28);
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

	public static class DysjunkcjaContext extends ParserRuleContext {
		public DysjunkcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dysjunkcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDysjunkcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDysjunkcja(this);
		}
	}

	public final DysjunkcjaContext dysjunkcja() throws RecognitionException {
		DysjunkcjaContext _localctx = new DysjunkcjaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_dysjunkcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); match(T__5);
			setState(506); match(T__21);
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

	public static class OrazContext extends ParserRuleContext {
		public OrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oraz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOraz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOraz(this);
		}
	}

	public final OrazContext oraz() throws RecognitionException {
		OrazContext _localctx = new OrazContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_oraz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508); match(T__5);
			setState(509); match(T__40);
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

	public static class DysjunkcjaRozlacznaContext extends ParserRuleContext {
		public DysjunkcjaRozlacznaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dysjunkcjaRozlaczna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDysjunkcjaRozlaczna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDysjunkcjaRozlaczna(this);
		}
	}

	public final DysjunkcjaRozlacznaContext dysjunkcjaRozlaczna() throws RecognitionException {
		DysjunkcjaRozlacznaContext _localctx = new DysjunkcjaRozlacznaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dysjunkcjaRozlaczna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); match(T__5);
			setState(512); match(T__24);
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

	public static class ImplikacjaContext extends ParserRuleContext {
		public ImplikacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implikacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterImplikacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitImplikacja(this);
		}
	}

	public final ImplikacjaContext implikacja() throws RecognitionException {
		ImplikacjaContext _localctx = new ImplikacjaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_implikacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); match(T__1);
			setState(515); match(T__10);
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

	public static class KoniecImplikacjiContext extends ParserRuleContext {
		public KoniecImplikacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koniecImplikacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKoniecImplikacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKoniecImplikacji(this);
		}
	}

	public final KoniecImplikacjiContext koniecImplikacji() throws RecognitionException {
		KoniecImplikacjiContext _localctx = new KoniecImplikacjiContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_koniecImplikacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); match(T__23);
			setState(518); match(T__12);
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

	public static class RownowaznoscContext extends ParserRuleContext {
		public WtedyItylkoWtedyGdyContext wtedyItylkoWtedyGdy() {
			return getRuleContext(WtedyItylkoWtedyGdyContext.class,0);
		}
		public TylkoGdyContext tylkoGdy() {
			return getRuleContext(TylkoGdyContext.class,0);
		}
		public RownowaznoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rownowaznosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRownowaznosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRownowaznosc(this);
		}
	}

	public final RownowaznoscContext rownowaznosc() throws RecognitionException {
		RownowaznoscContext _localctx = new RownowaznoscContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_rownowaznosc);
		try {
			setState(522);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(520); tylkoGdy();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(521); wtedyItylkoWtedyGdy();
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

	public static class TylkoGdyContext extends ParserRuleContext {
		public TylkoGdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tylkoGdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterTylkoGdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitTylkoGdy(this);
		}
	}

	public final TylkoGdyContext tylkoGdy() throws RecognitionException {
		TylkoGdyContext _localctx = new TylkoGdyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tylkoGdy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524); match(T__4);
			setState(525); match(T__14);
			setState(526); match(T__17);
			setState(527); match(T__29);
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

	public static class WtedyItylkoWtedyGdyContext extends ParserRuleContext {
		public WtedyItylkoWtedyGdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wtedyItylkoWtedyGdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterWtedyItylkoWtedyGdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitWtedyItylkoWtedyGdy(this);
		}
	}

	public final WtedyItylkoWtedyGdyContext wtedyItylkoWtedyGdy() throws RecognitionException {
		WtedyItylkoWtedyGdyContext _localctx = new WtedyItylkoWtedyGdyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_wtedyItylkoWtedyGdy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(T__17);
			setState(530); match(T__27);
			setState(531); match(T__5);
			setState(532); match(T__28);
			setState(533); match(T__4);
			setState(534); match(T__14);
			setState(535); match(T__17);
			setState(536); match(T__27);
			setState(537); match(T__17);
			setState(538); match(T__29);
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

	public static class SformulowanieNieZaleznosciElementowContext extends ParserRuleContext {
		public SformulowanieNieZaleznosciElementowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieNieZaleznosciElementow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieNieZaleznosciElementow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieNieZaleznosciElementow(this);
		}
	}

	public final SformulowanieNieZaleznosciElementowContext sformulowanieNieZaleznosciElementow() throws RecognitionException {
		SformulowanieNieZaleznosciElementowContext _localctx = new SformulowanieNieZaleznosciElementowContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sformulowanieNieZaleznosciElementow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); match(T__17);
			setState(541); match(T__33);
			setState(542); match(T__25);
			setState(543); match(T__60);
			setState(544); match(T__50);
			setState(545); match(T__61);
			setState(546); match(T__4);
			setState(547); match(T__29);
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

	public static class OperatorModalnyContext extends ParserRuleContext {
		public SformulowaniePozwoleniaContext sformulowaniePozwolenia() {
			return getRuleContext(SformulowaniePozwoleniaContext.class,0);
		}
		public SformulowanieObowiazkuNegacjaContext sformulowanieObowiazkuNegacja() {
			return getRuleContext(SformulowanieObowiazkuNegacjaContext.class,0);
		}
		public SformulowanieKoniecznosciNegacjaContext sformulowanieKoniecznosciNegacja() {
			return getRuleContext(SformulowanieKoniecznosciNegacjaContext.class,0);
		}
		public SformulowanieObowiazkuContext sformulowanieObowiazku() {
			return getRuleContext(SformulowanieObowiazkuContext.class,0);
		}
		public SformulowanieMozliwosciContext sformulowanieMozliwosci() {
			return getRuleContext(SformulowanieMozliwosciContext.class,0);
		}
		public SformulowanieKoniecznosciContext sformulowanieKoniecznosci() {
			return getRuleContext(SformulowanieKoniecznosciContext.class,0);
		}
		public IstniejeMozliwoscZeContext istniejeMozliwoscZe() {
			return getRuleContext(IstniejeMozliwoscZeContext.class,0);
		}
		public OperatorModalnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorModalny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOperatorModalny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOperatorModalny(this);
		}
	}

	public final OperatorModalnyContext operatorModalny() throws RecognitionException {
		OperatorModalnyContext _localctx = new OperatorModalnyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_operatorModalny);
		try {
			setState(556);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549); sformulowanieObowiazku();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550); sformulowanieObowiazkuNegacja();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551); sformulowanieKoniecznosci();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(552); sformulowanieKoniecznosciNegacja();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(553); sformulowanieMozliwosci();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(554); istniejeMozliwoscZe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(555); sformulowaniePozwolenia();
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

	public static class SformulowanieObowiazkuContext extends ParserRuleContext {
		public MusiContext musi() {
			return getRuleContext(MusiContext.class,0);
		}
		public JestObowiazkiemAbyContext jestObowiazkiemAby() {
			return getRuleContext(JestObowiazkiemAbyContext.class,0);
		}
		public SformulowanieObowiazkuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieObowiazku; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieObowiazku(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieObowiazku(this);
		}
	}

	public final SformulowanieObowiazkuContext sformulowanieObowiazku() throws RecognitionException {
		SformulowanieObowiazkuContext _localctx = new SformulowanieObowiazkuContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sformulowanieObowiazku);
		try {
			setState(560);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558); musi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559); jestObowiazkiemAby();
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

	public static class MusiContext extends ParserRuleContext {
		public MusiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMusi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMusi(this);
		}
	}

	public final MusiContext musi() throws RecognitionException {
		MusiContext _localctx = new MusiContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_musi);
		try {
			setState(566);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562); match(T__59);
				setState(563); match(T__48);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564); match(T__59);
				setState(565); match(T__43);
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

	public static class JestObowiazkiemAbyContext extends ParserRuleContext {
		public JestObowiazkiemAbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestObowiazkiemAby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterJestObowiazkiemAby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitJestObowiazkiemAby(this);
		}
	}

	public final JestObowiazkiemAbyContext jestObowiazkiemAby() throws RecognitionException {
		JestObowiazkiemAbyContext _localctx = new JestObowiazkiemAbyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_jestObowiazkiemAby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(T__59);
			setState(569); match(T__53);
			setState(570); match(T__50);
			setState(571); match(T__18);
			setState(572); match(T__1);
			setState(573); match(T__2);
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

	public static class SformulowanieObowiazkuNegacjaContext extends ParserRuleContext {
		public JestZabronioneAbyContext jestZabronioneAby() {
			return getRuleContext(JestZabronioneAbyContext.class,0);
		}
		public NieMozeContext nieMoze() {
			return getRuleContext(NieMozeContext.class,0);
		}
		public SformulowanieObowiazkuNegacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieObowiazkuNegacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieObowiazkuNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieObowiazkuNegacja(this);
		}
	}

	public final SformulowanieObowiazkuNegacjaContext sformulowanieObowiazkuNegacja() throws RecognitionException {
		SformulowanieObowiazkuNegacjaContext _localctx = new SformulowanieObowiazkuNegacjaContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sformulowanieObowiazkuNegacja);
		try {
			setState(577);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(575); nieMoze();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(576); jestZabronioneAby();
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

	public static class NieMozeContext extends ParserRuleContext {
		public NieMozeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nieMoze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNieMoze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNieMoze(this);
		}
	}

	public final NieMozeContext nieMoze() throws RecognitionException {
		NieMozeContext _localctx = new NieMozeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_nieMoze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(T__4);
			setState(580); match(T__45);
			setState(581); match(T__59);
			setState(582); match(T__19);
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

	public static class JestZabronioneAbyContext extends ParserRuleContext {
		public JestZabronioneAbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestZabronioneAby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterJestZabronioneAby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitJestZabronioneAby(this);
		}
	}

	public final JestZabronioneAbyContext jestZabronioneAby() throws RecognitionException {
		JestZabronioneAbyContext _localctx = new JestZabronioneAbyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_jestZabronioneAby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); match(T__59);
			setState(585); match(T__53);
			setState(586); match(T__3);
			setState(587); match(T__38);
			setState(588); match(T__1);
			setState(589); match(T__2);
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

	public static class SformulowanieKoniecznosciContext extends ParserRuleContext {
		public JestKonieczneAbyContext jestKonieczneAby() {
			return getRuleContext(JestKonieczneAbyContext.class,0);
		}
		public ZawszeContext zawsze() {
			return getRuleContext(ZawszeContext.class,0);
		}
		public SformulowanieKoniecznosciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieKoniecznosci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieKoniecznosci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieKoniecznosci(this);
		}
	}

	public final SformulowanieKoniecznosciContext sformulowanieKoniecznosci() throws RecognitionException {
		SformulowanieKoniecznosciContext _localctx = new SformulowanieKoniecznosciContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sformulowanieKoniecznosci);
		try {
			setState(593);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(591); zawsze();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(592); jestKonieczneAby();
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

	public static class ZawszeContext extends ParserRuleContext {
		public ZawszeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zawsze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterZawsze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitZawsze(this);
		}
	}

	public final ZawszeContext zawsze() throws RecognitionException {
		ZawszeContext _localctx = new ZawszeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_zawsze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); match(T__17);
			setState(596); match(T__63);
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

	public static class JestKonieczneAbyContext extends ParserRuleContext {
		public JestKonieczneAbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestKonieczneAby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterJestKonieczneAby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitJestKonieczneAby(this);
		}
	}

	public final JestKonieczneAbyContext jestKonieczneAby() throws RecognitionException {
		JestKonieczneAbyContext _localctx = new JestKonieczneAbyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_jestKonieczneAby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); match(T__59);
			setState(599); match(T__53);
			setState(600); match(T__35);
			setState(601); match(T__6);
			setState(602); match(T__1);
			setState(603); match(T__2);
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

	public static class SformulowanieKoniecznosciNegacjaContext extends ParserRuleContext {
		public NieIstniejeMozliwoscZeContext nieIstniejeMozliwoscZe() {
			return getRuleContext(NieIstniejeMozliwoscZeContext.class,0);
		}
		public NigdyContext nigdy() {
			return getRuleContext(NigdyContext.class,0);
		}
		public SformulowanieKoniecznosciNegacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieKoniecznosciNegacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieKoniecznosciNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieKoniecznosciNegacja(this);
		}
	}

	public final SformulowanieKoniecznosciNegacjaContext sformulowanieKoniecznosciNegacja() throws RecognitionException {
		SformulowanieKoniecznosciNegacjaContext _localctx = new SformulowanieKoniecznosciNegacjaContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sformulowanieKoniecznosciNegacja);
		try {
			setState(607);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(605); nigdy();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(606); nieIstniejeMozliwoscZe();
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

	public static class NigdyContext extends ParserRuleContext {
		public NigdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nigdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNigdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNigdy(this);
		}
	}

	public final NigdyContext nigdy() throws RecognitionException {
		NigdyContext _localctx = new NigdyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_nigdy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(T__17);
			setState(610); match(T__31);
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

	public static class NieIstniejeMozliwoscZeContext extends ParserRuleContext {
		public NieIstniejeMozliwoscZeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nieIstniejeMozliwoscZe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNieIstniejeMozliwoscZe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNieIstniejeMozliwoscZe(this);
		}
	}

	public final NieIstniejeMozliwoscZeContext nieIstniejeMozliwoscZe() throws RecognitionException {
		NieIstniejeMozliwoscZeContext _localctx = new NieIstniejeMozliwoscZeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_nieIstniejeMozliwoscZe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); match(T__4);
			setState(613); match(T__45);
			setState(614); match(T__59);
			setState(615); match(T__0);
			setState(616); match(T__50);
			setState(617); match(T__54);
			setState(618); match(T__1);
			setState(619); match(T__26);
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

	public static class SformulowanieMozliwosciContext extends ParserRuleContext {
		public IstniejeMozliwoscZeContext istniejeMozliwoscZe() {
			return getRuleContext(IstniejeMozliwoscZeContext.class,0);
		}
		public SformulowanieMozliwosciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieMozliwosci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieMozliwosci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieMozliwosci(this);
		}
	}

	public final SformulowanieMozliwosciContext sformulowanieMozliwosci() throws RecognitionException {
		SformulowanieMozliwosciContext _localctx = new SformulowanieMozliwosciContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_sformulowanieMozliwosci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621); istniejeMozliwoscZe();
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

	public static class IstniejeMozliwoscZeContext extends ParserRuleContext {
		public IstniejeMozliwoscZeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_istniejeMozliwoscZe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterIstniejeMozliwoscZe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitIstniejeMozliwoscZe(this);
		}
	}

	public final IstniejeMozliwoscZeContext istniejeMozliwoscZe() throws RecognitionException {
		IstniejeMozliwoscZeContext _localctx = new IstniejeMozliwoscZeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_istniejeMozliwoscZe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); match(T__59);
			setState(624); match(T__0);
			setState(625); match(T__50);
			setState(626); match(T__54);
			setState(627); match(T__1);
			setState(628); match(T__26);
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

	public static class SformulowaniePozwoleniaContext extends ParserRuleContext {
		public NieMusiContext nieMusi() {
			return getRuleContext(NieMusiContext.class,0);
		}
		public MozeContext moze() {
			return getRuleContext(MozeContext.class,0);
		}
		public SformulowaniePozwoleniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowaniePozwolenia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowaniePozwolenia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowaniePozwolenia(this);
		}
	}

	public final SformulowaniePozwoleniaContext sformulowaniePozwolenia() throws RecognitionException {
		SformulowaniePozwoleniaContext _localctx = new SformulowaniePozwoleniaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_sformulowaniePozwolenia);
		try {
			setState(632);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630); moze();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631); nieMusi();
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

	public static class MozeContext extends ParserRuleContext {
		public MozeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMoze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMoze(this);
		}
	}

	public final MozeContext moze() throws RecognitionException {
		MozeContext _localctx = new MozeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_moze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); match(T__4);
			setState(635); match(T__19);
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

	public static class NieMusiContext extends ParserRuleContext {
		public NieMusiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nieMusi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNieMusi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNieMusi(this);
		}
	}

	public final NieMusiContext nieMusi() throws RecognitionException {
		NieMusiContext _localctx = new NieMusiContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_nieMusi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(T__4);
			setState(638); match(T__45);
			setState(639); match(T__59);
			setState(640); match(T__48);
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
		enterRule(_localctx, 158, RULE_rzeczownik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642); match(T__50);
			setState(643); match(Identifier);
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
		enterRule(_localctx, 160, RULE_przymiotnik);
		try {
			setState(648);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(645); match(T__35);
				setState(646); match(Identifier);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(647); imieslowPrzymiotnikowyBierny();
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

	public static class ImieslowPrzymiotnikowyCzynnyPseudoContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public ImieslowPrzymiotnikowyCzynnyPseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imieslowPrzymiotnikowyCzynnyPseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterImieslowPrzymiotnikowyCzynnyPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitImieslowPrzymiotnikowyCzynnyPseudo(this);
		}
	}

	public final ImieslowPrzymiotnikowyCzynnyPseudoContext imieslowPrzymiotnikowyCzynnyPseudo() throws RecognitionException {
		ImieslowPrzymiotnikowyCzynnyPseudoContext _localctx = new ImieslowPrzymiotnikowyCzynnyPseudoContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_imieslowPrzymiotnikowyCzynnyPseudo);
		try {
			setState(658);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650); match(T__13);
				setState(651); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652); match(T__13);
				setState(653); match(Identifier);
				setState(654); match(T__4);
				setState(655); match(T__57);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(656); match(T__51);
				setState(657); match(Identifier);
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
		enterRule(_localctx, 164, RULE_czasownik);
		try {
			setState(668);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660); match(T__59);
				setState(661); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662); match(T__59);
				setState(663); match(Identifier);
				setState(664); match(T__4);
				setState(665); match(T__57);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(666); match(T__59);
				setState(667); match(T__39);
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

	public static class BezokolicznikContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public BezokolicznikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bezokolicznik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterBezokolicznik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitBezokolicznik(this);
		}
	}

	public final BezokolicznikContext bezokolicznik() throws RecognitionException {
		BezokolicznikContext _localctx = new BezokolicznikContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_bezokolicznik);
		try {
			setState(676);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670); match(T__41);
				setState(671); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672); match(T__41);
				setState(673); match(Identifier);
				setState(674); match(T__4);
				setState(675); match(T__57);
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
		enterRule(_localctx, 168, RULE_spójnik);
		try {
			setState(686);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678); match(T__5);
				setState(679); match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680); match(T__5);
				setState(681); match(T__40);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682); match(T__5);
				setState(683); match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684); match(T__5);
				setState(685); match(T__21);
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
		enterRule(_localctx, 170, RULE_przyimek);
		try {
			setState(694);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688); match(T__25);
				setState(689); match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690); match(T__25);
				setState(691); match(T__65);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692); match(T__25);
				setState(693); match(Identifier);
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
		enterRule(_localctx, 172, RULE_imieslowPrzymiotnikowyBierny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); match(T__3);
			setState(697); match(Identifier);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u02be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\5\2\u00b3\n\2\3\3\3\3\5\3\u00b7\n\3\3"+
		"\4\3\4\3\4\5\4\u00bc\n\4\3\5\3\5\3\5\5\5\u00c1\n\5\3\6\3\6\5\6\u00c5\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e5\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f1\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00f8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0102\n\f\3"+
		"\r\3\r\5\r\u0106\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011a\n\20\3\21\3\21\3\21"+
		"\3\21\5\21\u0120\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u012b\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0134\n\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0144"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u014f\n\30\3\31"+
		"\3\31\3\31\3\31\5\31\u0155\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0185\n\37\3 "+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u0197\n#\3$\3$\3$"+
		"\3%\3%\3%\3&\3&\3&\3&\5&\u01a3\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3)\5)\u01b1\n)\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01cd\n-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u01db\n/\3\60\3\60\3\60\5\60\u01e0\n\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\64\3\64\5\64\u01f7\n\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\5;\u020d\n;\3<\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\3?\5?\u022f\n?\3@\3@\5@\u0233\n@\3A\3A\3A\3A\5A\u0239\nA\3B\3B\3"+
		"B\3B\3B\3B\3B\3C\3C\5C\u0244\nC\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3"+
		"F\3F\5F\u0254\nF\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\5I\u0262\nI\3J\3"+
		"J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\5N\u027b"+
		"\nN\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\5R\u028b\nR\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\5S\u0295\nS\3T\3T\3T\3T\3T\3T\3T\3T\5T\u029f\nT\3U\3U\3U"+
		"\3U\3U\3U\5U\u02a7\nU\3V\3V\3V\3V\3V\3V\3V\3V\5V\u02b1\nV\3W\3W\3W\3W"+
		"\3W\3W\5W\u02b9\nW\3X\3X\3X\3X\2\2Y\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\2\u02bb"+
		"\2\u00b2\3\2\2\2\4\u00b6\3\2\2\2\6\u00bb\3\2\2\2\b\u00c0\3\2\2\2\n\u00c4"+
		"\3\2\2\2\f\u00c6\3\2\2\2\16\u00cb\3\2\2\2\20\u00e4\3\2\2\2\22\u00f0\3"+
		"\2\2\2\24\u00f7\3\2\2\2\26\u0101\3\2\2\2\30\u0105\3\2\2\2\32\u0107\3\2"+
		"\2\2\34\u010b\3\2\2\2\36\u0119\3\2\2\2 \u011f\3\2\2\2\"\u012a\3\2\2\2"+
		"$\u0133\3\2\2\2&\u0135\3\2\2\2(\u0143\3\2\2\2*\u0145\3\2\2\2,\u0148\3"+
		"\2\2\2.\u014e\3\2\2\2\60\u0150\3\2\2\2\62\u0156\3\2\2\2\64\u015b\3\2\2"+
		"\2\66\u015f\3\2\2\28\u0162\3\2\2\2:\u0169\3\2\2\2<\u0184\3\2\2\2>\u0186"+
		"\3\2\2\2@\u0189\3\2\2\2B\u018c\3\2\2\2D\u0196\3\2\2\2F\u0198\3\2\2\2H"+
		"\u019b\3\2\2\2J\u01a2\3\2\2\2L\u01a4\3\2\2\2N\u01a9\3\2\2\2P\u01b0\3\2"+
		"\2\2R\u01b2\3\2\2\2T\u01b7\3\2\2\2V\u01ba\3\2\2\2X\u01cc\3\2\2\2Z\u01ce"+
		"\3\2\2\2\\\u01da\3\2\2\2^\u01df\3\2\2\2`\u01e1\3\2\2\2b\u01ea\3\2\2\2"+
		"d\u01f1\3\2\2\2f\u01f6\3\2\2\2h\u01f8\3\2\2\2j\u01fb\3\2\2\2l\u01fe\3"+
		"\2\2\2n\u0201\3\2\2\2p\u0204\3\2\2\2r\u0207\3\2\2\2t\u020c\3\2\2\2v\u020e"+
		"\3\2\2\2x\u0213\3\2\2\2z\u021e\3\2\2\2|\u022e\3\2\2\2~\u0232\3\2\2\2\u0080"+
		"\u0238\3\2\2\2\u0082\u023a\3\2\2\2\u0084\u0243\3\2\2\2\u0086\u0245\3\2"+
		"\2\2\u0088\u024a\3\2\2\2\u008a\u0253\3\2\2\2\u008c\u0255\3\2\2\2\u008e"+
		"\u0258\3\2\2\2\u0090\u0261\3\2\2\2\u0092\u0263\3\2\2\2\u0094\u0266\3\2"+
		"\2\2\u0096\u026f\3\2\2\2\u0098\u0271\3\2\2\2\u009a\u027a\3\2\2\2\u009c"+
		"\u027c\3\2\2\2\u009e\u027f\3\2\2\2\u00a0\u0284\3\2\2\2\u00a2\u028a\3\2"+
		"\2\2\u00a4\u0294\3\2\2\2\u00a6\u029e\3\2\2\2\u00a8\u02a6\3\2\2\2\u00aa"+
		"\u02b0\3\2\2\2\u00ac\u02b8\3\2\2\2\u00ae\u02ba\3\2\2\2\u00b0\u00b3\5\4"+
		"\3\2\u00b1\u00b3\5\6\4\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\3\3\2\2\2\u00b4\u00b7\5\20\t\2\u00b5\u00b7\5\30\r\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\5\3\2\2\2\u00b8\u00bc\58\35\2\u00b9\u00bc"+
		"\5\b\5\2\u00ba\u00bc\5\n\6\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\7\3\2\2\2\u00bd\u00c1\5:\36\2\u00be\u00c1\5,\27\2"+
		"\u00bf\u00c1\5.\30\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\t\3\2\2\2\u00c2\u00c5\5\16\b\2\u00c3\u00c5\5\f\7\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\13\3\2\2\2\u00c6\u00c7\5<\37"+
		"\2\u00c7\u00c8\5|?\2\u00c8\u00c9\5\u00a8U\2\u00c9\u00ca\5<\37\2\u00ca"+
		"\r\3\2\2\2\u00cb\u00cc\5|?\2\u00cc\u00cd\5\64\33\2\u00cd\17\3\2\2\2\u00ce"+
		"\u00e5\5\u00a0Q\2\u00cf\u00e5\5\22\n\2\u00d0\u00d1\5\22\n\2\u00d1\u00d2"+
		"\5\24\13\2\u00d2\u00e5\3\2\2\2\u00d3\u00d4\5\u00a0Q\2\u00d4\u00d5\5\24"+
		"\13\2\u00d5\u00e5\3\2\2\2\u00d6\u00d7\5\22\n\2\u00d7\u00d8\5\26\f\2\u00d8"+
		"\u00e5\3\2\2\2\u00d9\u00da\5\22\n\2\u00da\u00db\5\24\13\2\u00db\u00dc"+
		"\5\26\f\2\u00dc\u00e5\3\2\2\2\u00dd\u00de\5\u00a0Q\2\u00de\u00df\5\26"+
		"\f\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\5\u00a0Q\2\u00e1\u00e2\5\24\13\2"+
		"\u00e2\u00e3\5\26\f\2\u00e3\u00e5\3\2\2\2\u00e4\u00ce\3\2\2\2\u00e4\u00cf"+
		"\3\2\2\2\u00e4\u00d0\3\2\2\2\u00e4\u00d3\3\2\2\2\u00e4\u00d6\3\2\2\2\u00e4"+
		"\u00d9\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\21\3\2\2"+
		"\2\u00e6\u00e7\5\u00a2R\2\u00e7\u00e8\5\u00a0Q\2\u00e8\u00f1\3\2\2\2\u00e9"+
		"\u00ea\5\u00a0Q\2\u00ea\u00eb\5\u00a2R\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed"+
		"\5\u00a2R\2\u00ed\u00ee\5\u00a0Q\2\u00ee\u00ef\5\u00a2R\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1"+
		"\23\3\2\2\2\u00f2\u00f8\5\20\t\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\5\u00aa"+
		"V\2\u00f5\u00f6\5\20\t\2\u00f6\u00f8\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f3\3\2\2\2\u00f8\25\3\2\2\2\u00f9\u00fa\5\u00acW\2\u00fa\u00fb\5\20"+
		"\t\2\u00fb\u0102\3\2\2\2\u00fc\u00fd\5\u00acW\2\u00fd\u00fe\5\20\t\2\u00fe"+
		"\u00ff\5\u00aaV\2\u00ff\u0100\5\20\t\2\u0100\u0102\3\2\2\2\u0101\u00f9"+
		"\3\2\2\2\u0101\u00fc\3\2\2\2\u0102\27\3\2\2\2\u0103\u0106\5\32\16\2\u0104"+
		"\u0106\5\34\17\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\31\3\2"+
		"\2\2\u0107\u0108\5\20\t\2\u0108\u0109\5 \21\2\u0109\u010a\5\20\t\2\u010a"+
		"\33\3\2\2\2\u010b\u010c\5\20\t\2\u010c\u010d\5\36\20\2\u010d\35\3\2\2"+
		"\2\u010e\u010f\5*\26\2\u010f\u0110\5\20\t\2\u0110\u011a\3\2\2\2\u0111"+
		"\u0112\5*\26\2\u0112\u0113\5\u00acW\2\u0113\u0114\5\20\t\2\u0114\u011a"+
		"\3\2\2\2\u0115\u0116\5*\26\2\u0116\u0117\5\u00a2R\2\u0117\u011a\3\2\2"+
		"\2\u0118\u011a\5\u00a6T\2\u0119\u010e\3\2\2\2\u0119\u0111\3\2\2\2\u0119"+
		"\u0115\3\2\2\2\u0119\u0118\3\2\2\2\u011a\37\3\2\2\2\u011b\u0120\5\"\22"+
		"\2\u011c\u0120\5$\23\2\u011d\u0120\5&\24\2\u011e\u0120\5(\25\2\u011f\u011b"+
		"\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"!\3\2\2\2\u0121\u012b\5\u00a6T\2\u0122\u0123\5\u00a6T\2\u0123\u0124\5"+
		"\u00acW\2\u0124\u012b\3\2\2\2\u0125\u0126\5*\26\2\u0126\u0127\5\u00a2"+
		"R\2\u0127\u0128\5\u00acW\2\u0128\u012b\3\2\2\2\u0129\u012b\5\u00a4S\2"+
		"\u012a\u0121\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0129"+
		"\3\2\2\2\u012b#\3\2\2\2\u012c\u012d\7\t\2\2\u012d\u0134\7\23\2\2\u012e"+
		"\u0134\7;\2\2\u012f\u0130\5*\26\2\u0130\u0131\7\22\2\2\u0131\u0132\7\4"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u012c\3\2\2\2\u0133\u012e\3\2\2\2\u0133"+
		"\u012f\3\2\2\2\u0134%\3\2\2\2\u0135\u0136\5*\26\2\u0136\u0137\7\22\2\2"+
		"\u0137\u0138\7\32\2\2\u0138\'\3\2\2\2\u0139\u013a\5*\26\2\u013a\u013b"+
		"\7\22\2\2\u013b\u013c\7\37\2\2\u013c\u0144\3\2\2\2\u013d\u013e\5*\26\2"+
		"\u013e\u013f\7\22\2\2\u013f\u0140\7=\2\2\u0140\u0144\3\2\2\2\u0141\u0142"+
		"\7\t\2\2\u0142\u0144\7\6\2\2\u0143\u0139\3\2\2\2\u0143\u013d\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144)\3\2\2\2\u0145\u0146\7\t\2\2\u0146\u0147\7\17\2\2"+
		"\u0147+\3\2\2\2\u0148\u0149\5\64\33\2\u0149\u014a\5\\/\2\u014a\u014b\5"+
		"\64\33\2\u014b-\3\2\2\2\u014c\u014f\5\60\31\2\u014d\u014f\5\62\32\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f/\3\2\2\2\u0150\u0151\5\64\33"+
		"\2\u0151\u0154\5\\/\2\u0152\u0155\5\64\33\2\u0153\u0155\5\66\34\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\61\3\2\2\2\u0156\u0157\5\\/\2"+
		"\u0157\u0158\5\64\33\2\u0158\u0159\5\\/\2\u0159\u015a\5\64\33\2\u015a"+
		"\63\3\2\2\2\u015b\u015c\5<\37\2\u015c\u015d\5 \21\2\u015d\u015e\5<\37"+
		"\2\u015e\65\3\2\2\2\u015f\u0160\5 \21\2\u0160\u0161\5<\37\2\u0161\67\3"+
		"\2\2\2\u0162\u0163\5> \2\u0163\u0164\5\20\t\2\u0164\u0165\5@!\2\u0165"+
		"\u0166\5 \21\2\u0166\u0167\5D#\2\u0167\u0168\5\20\t\2\u01689\3\2\2\2\u0169"+
		"\u016a\5\\/\2\u016a\u016b\5<\37\2\u016b\u016c\5 \21\2\u016c\u016d\5D#"+
		"\2\u016d\u016e\5\20\t\2\u016e;\3\2\2\2\u016f\u0185\5\20\t\2\u0170\u0171"+
		"\5> \2\u0171\u0172\5\20\t\2\u0172\u0185\3\2\2\2\u0173\u0174\5\20\t\2\u0174"+
		"\u0175\5> \2\u0175\u0185\3\2\2\2\u0176\u0177\5B\"\2\u0177\u0178\5\20\t"+
		"\2\u0178\u0185\3\2\2\2\u0179\u017a\5@!\2\u017a\u017b\5> \2\u017b\u017c"+
		"\5\20\t\2\u017c\u0185\3\2\2\2\u017d\u017e\5@!\2\u017e\u017f\5\20\t\2\u017f"+
		"\u0185\3\2\2\2\u0180\u0181\5\20\t\2\u0181\u0182\5@!\2\u0182\u0185\3\2"+
		"\2\2\u0183\u0185\7\26\2\2\u0184\u016f\3\2\2\2\u0184\u0170\3\2\2\2\u0184"+
		"\u0173\3\2\2\2\u0184\u0176\3\2\2\2\u0184\u0179\3\2\2\2\u0184\u017d\3\2"+
		"\2\2\u0184\u0180\3\2\2\2\u0184\u0183\3\2\2\2\u0185=\3\2\2\2\u0186\u0187"+
		"\7!\2\2\u0187\u0188\7\30\2\2\u0188?\3\2\2\2\u0189\u018a\7\63\2\2\u018a"+
		"\u018b\7\5\2\2\u018bA\3\2\2\2\u018c\u018d\7!\2\2\u018d\u018e\7\65\2\2"+
		"\u018eC\3\2\2\2\u018f\u0197\5F$\2\u0190\u0197\5L\'\2\u0191\u0197\5N(\2"+
		"\u0192\u0197\5R*\2\u0193\u0197\5T+\2\u0194\u0197\5X-\2\u0195\u0197\5Z"+
		".\2\u0196\u018f\3\2\2\2\u0196\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196"+
		"\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197E\3\2\2\2\u0198\u0199\5H%\2\u0199\u019a\5J&\2\u019aG\3\2\2\2"+
		"\u019b\u019c\7\22\2\2\u019c\u019d\7\r\2\2\u019dI\3\2\2\2\u019e\u019f\7"+
		"\"\2\2\u019f\u01a3\7\20\2\2\u01a0\u01a1\7\60\2\2\u01a1\u01a3\7J\2\2\u01a2"+
		"\u019e\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3K\3\2\2\2\u01a4\u01a5\7\22\2\2"+
		"\u01a5\u01a6\7.\2\2\u01a6\u01a7\7!\2\2\u01a7\u01a8\7\f\2\2\u01a8M\3\2"+
		"\2\2\u01a9\u01aa\5P)\2\u01aa\u01ab\5J&\2\u01abO\3\2\2\2\u01ac\u01b1\7"+
		"\64\2\2\u01ad\u01ae\7\22\2\2\u01ae\u01b1\7.\2\2\u01af\u01b1\7\25\2\2\u01b0"+
		"\u01ac\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1Q\3\2\2\2"+
		"\u01b2\u01b3\7\63\2\2\u01b3\u01b4\7&\2\2\u01b4\u01b5\7!\2\2\u01b5\u01b6"+
		"\7\f\2\2\u01b6S\3\2\2\2\u01b7\u01b8\5V,\2\u01b8\u01b9\5J&\2\u01b9U\3\2"+
		"\2\2\u01ba\u01bb\7\63\2\2\u01bb\u01bc\7&\2\2\u01bcW\3\2\2\2\u01bd\u01be"+
		"\7<\2\2\u01be\u01bf\7\"\2\2\u01bf\u01c0\7G\2\2\u01c0\u01c1\7?\2\2\u01c1"+
		"\u01c2\7\n\2\2\u01c2\u01c3\7\"\2\2\u01c3\u01cd\7G\2\2\u01c4\u01c5\7<\2"+
		"\2\u01c5\u01c6\7\60\2\2\u01c6\u01c7\5J&\2\u01c7\u01c8\7?\2\2\u01c8\u01c9"+
		"\7\n\2\2\u01c9\u01ca\7\60\2\2\u01ca\u01cb\5J&\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01bd\3\2\2\2\u01cc\u01c4\3\2\2\2\u01cdY\3\2\2\2\u01ce\u01cf\7<\2\2\u01cf"+
		"\u01d0\7!\2\2\u01d0\u01d1\7\f\2\2\u01d1[\3\2\2\2\u01d2\u01db\5^\60\2\u01d3"+
		"\u01db\5f\64\2\u01d4\u01db\5j\66\2\u01d5\u01db\5n8\2\u01d6\u01db\5p9\2"+
		"\u01d7\u01db\5r:\2\u01d8\u01db\5t;\2\u01d9\u01db\5z>\2\u01da\u01d2\3\2"+
		"\2\2\u01da\u01d3\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d5\3\2\2\2\u01da"+
		"\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01db]\3\2\2\2\u01dc\u01e0\5b\62\2\u01dd\u01e0\5`\61\2\u01de\u01e0"+
		"\5d\63\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"_\3\2\2\2\u01e1\u01e2\7@\2\2\u01e2\u01e3\7\27\2\2\u01e3\u01e4\7\t\2\2"+
		"\u01e4\u01e5\7\17\2\2\u01e5\u01e6\7\22\2\2\u01e6\u01e7\79\2\2\u01e7\u01e8"+
		"\7C\2\2\u01e8\u01e9\7*\2\2\u01e9a\3\2\2\2\u01ea\u01eb\7@\2\2\u01eb\u01ec"+
		"\7\27\2\2\u01ec\u01ed\7\22\2\2\u01ed\u01ee\79\2\2\u01ee\u01ef\7C\2\2\u01ef"+
		"\u01f0\7*\2\2\u01f0c\3\2\2\2\u01f1\u01f2\7@\2\2\u01f2\u01f3\7\27\2\2\u01f3"+
		"e\3\2\2\2\u01f4\u01f7\5h\65\2\u01f5\u01f7\5l\67\2\u01f6\u01f4\3\2\2\2"+
		"\u01f6\u01f5\3\2\2\2\u01f7g\3\2\2\2\u01f8\u01f9\7?\2\2\u01f9\u01fa\7("+
		"\2\2\u01fai\3\2\2\2\u01fb\u01fc\7?\2\2\u01fc\u01fd\7/\2\2\u01fdk\3\2\2"+
		"\2\u01fe\u01ff\7?\2\2\u01ff\u0200\7\34\2\2\u0200m\3\2\2\2\u0201\u0202"+
		"\7?\2\2\u0202\u0203\7,\2\2\u0203o\3\2\2\2\u0204\u0205\7C\2\2\u0205\u0206"+
		"\7:\2\2\u0206q\3\2\2\2\u0207\u0208\7-\2\2\u0208\u0209\78\2\2\u0209s\3"+
		"\2\2\2\u020a\u020d\5v<\2\u020b\u020d\5x=\2\u020c\u020a\3\2\2\2\u020c\u020b"+
		"\3\2\2\2\u020du\3\2\2\2\u020e\u020f\7@\2\2\u020f\u0210\7\66\2\2\u0210"+
		"\u0211\7\63\2\2\u0211\u0212\7\'\2\2\u0212w\3\2\2\2\u0213\u0214\7\63\2"+
		"\2\u0214\u0215\7)\2\2\u0215\u0216\7?\2\2\u0216\u0217\7(\2\2\u0217\u0218"+
		"\7@\2\2\u0218\u0219\7\66\2\2\u0219\u021a\7\63\2\2\u021a\u021b\7)\2\2\u021b"+
		"\u021c\7\63\2\2\u021c\u021d\7\'\2\2\u021dy\3\2\2\2\u021e\u021f\7\63\2"+
		"\2\u021f\u0220\7#\2\2\u0220\u0221\7+\2\2\u0221\u0222\7\b\2\2\u0222\u0223"+
		"\7\22\2\2\u0223\u0224\7\7\2\2\u0224\u0225\7@\2\2\u0225\u0226\7\'\2\2\u0226"+
		"{\3\2\2\2\u0227\u022f\5~@\2\u0228\u022f\5\u0084C\2\u0229\u022f\5\u008a"+
		"F\2\u022a\u022f\5\u0090I\2\u022b\u022f\5\u0096L\2\u022c\u022f\5\u0098"+
		"M\2\u022d\u022f\5\u009aN\2\u022e\u0227\3\2\2\2\u022e\u0228\3\2\2\2\u022e"+
		"\u0229\3\2\2\2\u022e\u022a\3\2\2\2\u022e\u022b\3\2\2\2\u022e\u022c\3\2"+
		"\2\2\u022e\u022d\3\2\2\2\u022f}\3\2\2\2\u0230\u0233\5\u0080A\2\u0231\u0233"+
		"\5\u0082B\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\177\3\2\2\2"+
		"\u0234\u0235\7\t\2\2\u0235\u0239\7\24\2\2\u0236\u0237\7\t\2\2\u0237\u0239"+
		"\7\31\2\2\u0238\u0234\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u0081\3\2\2\2"+
		"\u023a\u023b\7\t\2\2\u023b\u023c\7\17\2\2\u023c\u023d\7\22\2\2\u023d\u023e"+
		"\7\62\2\2\u023e\u023f\7C\2\2\u023f\u0240\7B\2\2\u0240\u0083\3\2\2\2\u0241"+
		"\u0244\5\u0086D\2\u0242\u0244\5\u0088E\2\u0243\u0241\3\2\2\2\u0243\u0242"+
		"\3\2\2\2\u0244\u0085\3\2\2\2\u0245\u0246\7@\2\2\u0246\u0247\7\27\2\2\u0247"+
		"\u0248\7\t\2\2\u0248\u0249\7\61\2\2\u0249\u0087\3\2\2\2\u024a\u024b\7"+
		"\t\2\2\u024b\u024c\7\17\2\2\u024c\u024d\7A\2\2\u024d\u024e\7\36\2\2\u024e"+
		"\u024f\7C\2\2\u024f\u0250\7B\2\2\u0250\u0089\3\2\2\2\u0251\u0254\5\u008c"+
		"G\2\u0252\u0254\5\u008eH\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254"+
		"\u008b\3\2\2\2\u0255\u0256\7\63\2\2\u0256\u0257\7\5\2\2\u0257\u008d\3"+
		"\2\2\2\u0258\u0259\7\t\2\2\u0259\u025a\7\17\2\2\u025a\u025b\7!\2\2\u025b"+
		"\u025c\7>\2\2\u025c\u025d\7C\2\2\u025d\u025e\7B\2\2\u025e\u008f\3\2\2"+
		"\2\u025f\u0262\5\u0092J\2\u0260\u0262\5\u0094K\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0260\3\2\2\2\u0262\u0091\3\2\2\2\u0263\u0264\7\63\2\2\u0264\u0265\7"+
		"%\2\2\u0265\u0093\3\2\2\2\u0266\u0267\7@\2\2\u0267\u0268\7\27\2\2\u0268"+
		"\u0269\7\t\2\2\u0269\u026a\7D\2\2\u026a\u026b\7\22\2\2\u026b\u026c\7\16"+
		"\2\2\u026c\u026d\7C\2\2\u026d\u026e\7*\2\2\u026e\u0095\3\2\2\2\u026f\u0270"+
		"\5\u0098M\2\u0270\u0097\3\2\2\2\u0271\u0272\7\t\2\2\u0272\u0273\7D\2\2"+
		"\u0273\u0274\7\22\2\2\u0274\u0275\7\16\2\2\u0275\u0276\7C\2\2\u0276\u0277"+
		"\7*\2\2\u0277\u0099\3\2\2\2\u0278\u027b\5\u009cO\2\u0279\u027b\5\u009e"+
		"P\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027b\u009b\3\2\2\2\u027c"+
		"\u027d\7@\2\2\u027d\u027e\7\61\2\2\u027e\u009d\3\2\2\2\u027f\u0280\7@"+
		"\2\2\u0280\u0281\7\27\2\2\u0281\u0282\7\t\2\2\u0282\u0283\7\24\2\2\u0283"+
		"\u009f\3\2\2\2\u0284\u0285\7\22\2\2\u0285\u0286\7G\2\2\u0286\u00a1\3\2"+
		"\2\2\u0287\u0288\7!\2\2\u0288\u028b\7G\2\2\u0289\u028b\5\u00aeX\2\u028a"+
		"\u0287\3\2\2\2\u028a\u0289\3\2\2\2\u028b\u00a3\3\2\2\2\u028c\u028d\7\67"+
		"\2\2\u028d\u0295\7G\2\2\u028e\u028f\7\67\2\2\u028f\u0290\7G\2\2\u0290"+
		"\u0291\7@\2\2\u0291\u0295\7\13\2\2\u0292\u0293\7\21\2\2\u0293\u0295\7"+
		"G\2\2\u0294\u028c\3\2\2\2\u0294\u028e\3\2\2\2\u0294\u0292\3\2\2\2\u0295"+
		"\u00a5\3\2\2\2\u0296\u0297\7\t\2\2\u0297\u029f\7G\2\2\u0298\u0299\7\t"+
		"\2\2\u0299\u029a\7G\2\2\u029a\u029b\7@\2\2\u029b\u029f\7\13\2\2\u029c"+
		"\u029d\7\t\2\2\u029d\u029f\7\35\2\2\u029e\u0296\3\2\2\2\u029e\u0298\3"+
		"\2\2\2\u029e\u029c\3\2\2\2\u029f\u00a7\3\2\2\2\u02a0\u02a1\7\33\2\2\u02a1"+
		"\u02a7\7G\2\2\u02a2\u02a3\7\33\2\2\u02a3\u02a4\7G\2\2\u02a4\u02a5\7@\2"+
		"\2\u02a5\u02a7\7\13\2\2\u02a6\u02a0\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a7"+
		"\u00a9\3\2\2\2\u02a8\u02a9\7?\2\2\u02a9\u02b1\7(\2\2\u02aa\u02ab\7?\2"+
		"\2\u02ab\u02b1\7\34\2\2\u02ac\u02ad\7?\2\2\u02ad\u02b1\7$\2\2\u02ae\u02af"+
		"\7?\2\2\u02af\u02b1\7/\2\2\u02b0\u02a8\3\2\2\2\u02b0\u02aa\3\2\2\2\u02b0"+
		"\u02ac\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u00ab\3\2\2\2\u02b2\u02b3\7+"+
		"\2\2\u02b3\u02b9\7 \2\2\u02b4\u02b5\7+\2\2\u02b5\u02b9\7\3\2\2\u02b6\u02b7"+
		"\7+\2\2\u02b7\u02b9\7G\2\2\u02b8\u02b2\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b8"+
		"\u02b6\3\2\2\2\u02b9\u00ad\3\2\2\2\u02ba\u02bb\7A\2\2\u02bb\u02bc\7G\2"+
		"\2\u02bc\u00af\3\2\2\2)\u00b2\u00b6\u00bb\u00c0\u00c4\u00e4\u00f0\u00f7"+
		"\u0101\u0105\u0119\u011f\u012a\u0133\u0143\u014e\u0154\u0184\u0196\u01a2"+
		"\u01b0\u01cc\u01da\u01df\u01f6\u020c\u022e\u0232\u0238\u0243\u0253\u0261"+
		"\u027a\u028a\u0294\u029e\u02a6\u02b0\u02b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}