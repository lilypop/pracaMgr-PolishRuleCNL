
 grammar PolishRuleCNL;

 @lexer::header {
	  package Grammar;
	}

 @parser::header {
	  package Grammar;
	}

korzen :
	slownik 
	| regula
;

slownik :
	pojecieRzeczownikowe
	| fakt
;

regula :
	ograniczenieLicznosciowe | logiczneSformulowania | modalneSformulowania
;

logiczneSformulowania :
	sfurmulowanieLogiczneNegacja
	| sformulowanieRownowaznosc
	| sformulowanieImplikacji
;

modalneSformulowania :
	sformułowanieModalneProste
	| sformułowanieModalneZlozone
;

sformułowanieModalneZlozone :
	pojecieRzeczownikoweZOkresleniem
	operatorModalny
	pojecieRzeczownikoweZOkresleniem
;

sformułowanieModalneProste :
	operatorModalny
	pojecieRzeczownikoweRelacjaPojecieRzeczownikowe
;

pojecieRzeczownikowe :
	rzeczownik
	| rzeczownikOkreslonyPrzymiotnikiem
	| rzeczownikOkreslonyPrzymiotnikiem rzeczownikOkreslajacy
	| rzeczownik rzeczownikOkreslajacy
	| rzeczownikOkreslonyPrzymiotnikiem wyrazeniePrzyimkowe
	| rzeczownikOkreslonyPrzymiotnikiem rzeczownikOkreslajacy wyrazeniePrzyimkowe
	| rzeczownik wyrazeniePrzyimkowe
	| rzeczownik rzeczownikOkreslajacy wyrazeniePrzyimkowe
//	| RzeczownikZImieslowemPrzymCzynnymPseudo
;


//RzeczownikZImieslowemPrzymCzynnymPseudo:
//	pojecieRzeczownikowe imieslowPrzymiotnikowyCzynnyPseudo pojecieRzeczownikowe
//	| pojecieRzeczownikowe imieslowPrzymiotnikowyCzynnyPseudo
//	| pojecieRzeczownikowe imieslowPrzymiotnikowyCzynnyPseudo wyrazeniePrzyimkowe
//	
//;

rzeczownik :
	'subst' Identifier
;

przymiotnik :
	'adj' Identifier
	| imieslowPrzymiotnikowyBierny
;

imieslowPrzymiotnikowyBierny :
	'ppas' Identifier
;

rzeczownikOkreslonyPrzymiotnikiem :
	przymiotnik rzeczownik
	| rzeczownik przymiotnik
	| przymiotnik rzeczownik przymiotnik
;

rzeczownikOkreslajacy :
	pojecieRzeczownikowe
	| pojecieRzeczownikowe spójnik pojecieRzeczownikowe
;

wyrazeniePrzyimkowe :
	przyimek pojecieRzeczownikowe
	| przyimek pojecieRzeczownikowe spójnik pojecieRzeczownikowe
;

spójnik :
	'conj' 'i'
	| 'conj' 'oraz'
	| 'conj' 'a'
	| 'conj' 'lub'
;

przyimek :
	'prep' 'z'
	| 'prep' Identifier
;

fakt :
	binarnyFakt
	| charakterystyka
;

binarnyFakt :
	pojecieRzeczownikowe relacja pojecieRzeczownikowe
;

charakterystyka :
	pojecieRzeczownikowe cechaRzeczownika
;

//imieslowPrzymiotnikowyCzynnyPseudo : 'pact' IDENTIFIER | 'pact' IDENTIFIER 'qub' 'się' | 'praet' IDENTIFIER ;

cechaRzeczownika :
	czasownikByc pojecieRzeczownikowe
	| czasownikByc przyimek pojecieRzeczownikowe
	| czasownikByc przymiotnik
	| czasownik
;

czasownik :
	'fin' Identifier
	| 'fin' Identifier 'qub' 'się'
	| 'fin' 'składać'
;

relacja :
	asocjacja
	| caloscCzesc
	| generalizacja
	| jestAtrybutem
;

asocjacja :
	czasownik
	| czasownik przyimek
	| czasownikByc przymiotnik przyimek
;

caloscCzesc :
	'fin' 'zawierać'
	| 'składać się z'
	| czasownikByc 'subst' 'część'
;

generalizacja :
	czasownikByc 'subst' 'rodzaj'
;

jestAtrybutem :
	czasownikByc 'subst' 'atrybut'
	| czasownikByc 'subst' 'własność'
	| 'fin' 'mieć'
;

czasownikByc :
	'fin' 'być'
;

sformulowanieRownowaznosc :
	pojecieRzeczownikoweRelacjaPojecieRzeczownikowe
	operatorLogiczny
	pojecieRzeczownikoweRelacjaPojecieRzeczownikowe	
;

sformulowanieImplikacji :
	prostaImplikacja | zlozonaImplikacja
;

prostaImplikacja :
	pojecieRzeczownikoweRelacjaPojecieRzeczownikowe
	operatorLogiczny
	pojecieRzeczownikoweRelacjaPojecieRzeczownikowe
;

zlozonaImplikacja :
	operatorLogiczny
	pojecieRzeczownikoweRelacjaPojecieRzeczownikowe
	operatorLogiczny
	pojecieRzeczownikoweRelacjaPojecieRzeczownikowe
;

pojecieRzeczownikoweRelacjaPojecieRzeczownikowe:
	pojecieRzeczownikoweZOkresleniem
	relacja
	pojecieRzeczownikoweZOkresleniem
;

ograniczenieLicznosciowe :
	kwantyfikatorOgolny pojecieRzeczownikowe operatorModalnyDlaKoniecznosci
	relacja kwantyfikatorLicznosciowy pojecieRzeczownikowe
;

sfurmulowanieLogiczneNegacja :
	operatorLogiczny pojecieRzeczownikoweZOkresleniem 
	relacja 
	kwantyfikatorLicznosciowy pojecieRzeczownikowe
;

pojecieRzeczownikoweZOkresleniem :
	 pojecieRzeczownikowe 
	| kwantyfikatorOgolny pojecieRzeczownikowe 
	| pojecieRzeczownikowe kwantyfikatorOgolny 
	| operatorModalnyCalosc pojecieRzeczownikowe
	| operatorModalnyDlaKoniecznosci kwantyfikatorOgolny pojecieRzeczownikowe
	| operatorModalnyDlaKoniecznosci pojecieRzeczownikowe
	| pojecieRzeczownikowe operatorModalnyDlaKoniecznosci
	| ''
;

kwantyfikatorOgolny :
	'adj' 'każdy'
;

operatorModalnyDlaKoniecznosci :
	'zawsze'
;

operatorModalnyCalosc : 
	 'adj' 'wszystko'
;	

kwantyfikatorLicznosciowy :
	minimumN
	| maksimumJeden
	| coNajwyzejN
	| dokladnieJeden
	| dokladnieN
	| zakresLiczb
	| przynajmniejJeden
;

minimumN :
	minimum liczba
;

minimum :
	'subst' 'minimum'
;

liczba :
	'num' 'IDENTIFIER'
	| 'tnum' Cyfry
;

maksimumJeden :
	'subst' 'maksimum' 'adj' 'jeden'
;

coNajwyzejN :
	coNajwyzej liczba
;

coNajwyzej :
	'co najwyżej'
	| 'subst' 'maksimum'
	| 'co wysoko'
;

dokladnieJeden :
	'adv' 'dokładnie' 'adj' 'jeden'
;

dokladnieN :
	dokładnie liczba
;

dokładnie :
	'adv' 'dokładnie'
;

zakresLiczb :
	'przynajmniej' 'num' Identifier 'conj' 'a wysoko' 'num' Identifier
	| 'przynajmniej' 'tnum' liczba 'conj' 'a wysoko' 'tnum' liczba
;

przynajmniejJeden :
	'przynajmniej' 'adj' 'jeden'
;

operatorLogiczny :
	logicznaNegacja
	| koniunkcja
	| dysjunkcja
	| dysjunkcjaRozlaczna
	| implikacja
	| koniecImplikacji
	| rownowaznosc
	| sformulowanieNieZaleznosciElementow
;

logicznaNegacja :
	niePrawdaZe | niejestPrawdaZe | nie
;

niejestPrawdaZe :
	'qub' 'nie' 'fin' 'jest' 'subst' 'prawda' 'interp' ',' 'comp' 'że'
;

niePrawdaZe :
	'qub' 'nie' 'subst' 'prawda' 'interp' ',' 'comp' 'że' 
;

nie :
	'qub' 'nie'
;

koniunkcja :
	i | oraz
;

i :
	'conj' 'i'
;

dysjunkcja :
	'conj' 'lub'
;

oraz :
	'conj' 'oraz'
;

dysjunkcjaRozlaczna :
	'conj' 'albo'
;

implikacja :
	'comp' 'jeśli'  
;

koniecImplikacji :
	'subst' 'to'
;

rownowaznosc :
	tylkoGdy | wtedyItylkoWtedyGdy
;
tylkoGdy :
	'qub' 'tylko' 'adv' 'gdy'
;

wtedyItylkoWtedyGdy :
	'adv' 'wtedy' 'conj' 'i' 'qub' 'tylko' 'adv' 'wtedy' 'interp' ',' 'adv' 'gdy'
;

sformulowanieNieZaleznosciElementow :
	'adv' 'niezależnie' 'prep' 'od' 'subst' 'tego' 'interp' ',' 'qub' 'gdy'
;

operatorModalny :
	sformulowanieObowiazku
	| sformulowanieObowiazkuNegacja
	| sformulowanieKoniecznosci
	| sformulowanieKoniecznosciNegacja
	| sformulowanieMozliwosci
	| istniejeMozliwoscZe
	| sformulowaniePozwolenia
;

sformulowanieObowiazku :
	musi | jestObowiazkiemAby
;

musi :
	'fin' 'musieć' | 'fin' 'musić' 
;

jestObowiazkiemAby :
	'fin' 'być' 'subst' 'obowiązek' 'interp' ',' 'comp' 'aby' 
; 

sformulowanieObowiazkuNegacja :
	nieMoze | jestZabronioneAby
;

nieMoze :
	'qub' 'nie' 'fin' 'móc'
;

jestZabronioneAby :
	'fin' 'być' 'ppas' 'zabronić' 'interp' ',' 'comp' 'aby'
;

sformulowanieKoniecznosci :
	zawsze | jestKonieczneAby
;

zawsze :
	'adv' 'zawsze'
;

jestKonieczneAby :
	'fin' 'być' 'adj' 'konieczny' 'interp' ',' 'comp' 'aby'
;

sformulowanieKoniecznosciNegacja :
	nigdy | nieIstniejeMozliwoscZe
;

nigdy :
	'adv' 'nigdy' 
;

nieIstniejeMozliwoscZe :
	'qub' 'nie' 'fin' 'istnieć' 'subst' 'możliwość' 'interp' ',' 'comp' 'że'
;

sformulowanieMozliwosci :
	istniejeMozliwoscZe
;

istniejeMozliwoscZe :
	'fin' 'istnieć' 'subst' 'możliwość' 'interp' ',' 'comp' 'że'
;

sformulowaniePozwolenia :
	moze | nieMusi
;

moze :
	'qub' 'móc'
;

nieMusi :
	'qub' 'nie' 'fin' 'musieć'
;



PolishLetter : [ęóąśłżźćńĘÓĄŚŁŻŹĆŃ] ;

Letter : ('a' .. 'z' | 'A' .. 'Z' | '-' | PolishLetter) ;

Identifier : Letter+ ;

Srednik : ';' ;

Myslnik : '-' ;

Cyfry : ('0' .. '9')+ ;

WS : [ \t\r\n]+ -> skip; // pomiń białe znaki

