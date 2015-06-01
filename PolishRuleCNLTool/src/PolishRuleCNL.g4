
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
	ograniczenieLicznosciowe
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

ograniczenieLicznosciowe :
	kwantyfikatorOgolny pojecieRzeczownikowe operatorModalnyDlaKoniecznosci
	relacja kwantyfikatorLicznosciowy pojecieRzeczownikowe
;

kwantyfikatorOgolny :
	'adj' 'każdy'
;

operatorModalnyDlaKoniecznosci :
	'zawsze'
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
	| rownowaznosc
	| sformulowanieNieZaleznosciElementow
;

logicznaNegacja :
	niePrawdaZe | niejestPrawdaZe | nie
;

niejestPrawdaZe :
	'qub' 'nie' 'fin' 'jest' 'subst' 'prawdą' 'interp' ',' 'comp' 'że'
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
	'comp' 'jesli'  
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
	'fin' 'jest' 'subst' 'obowiązkiem' 'interp' ',' 'comp' 'aby' 
; 

sformulowanieObowiazkuNegacja :
	nieMoze | jestZabronioneAby
;

nieMoze :
	'qub' 'nie' 'fin' 'może'
;

jestZabronioneAby :
	'fin' 'jest' 'ppas' 'zabronione' 'interp' ',' 'comp' 'aby'
;

sformulowanieKoniecznosci :
	zawsze | jestKonieczneAby
;

zawsze :
	'adv' 'zawsze'
;

jestKonieczneAby :
	'fin' 'jest' 'adj' 'konieczne' 'interp' ',' 'comp' 'aby'
;

sformulowanieKoniecznosciNegacja :
	nigdy | nieIstniejeMozliwoscZe
;

nigdy :
	'adv' 'nigdy' 
;

nieIstniejeMozliwoscZe :
	'qub' 'nie' 'fin' 'istnieje' 'subst' 'mozliwosc' 'interp' ',' 'comp' 'że'
;

sformulowanieMozliwosci :
	istniejeMozliwoscZe
;

istniejeMozliwoscZe :
	'fin' 'istnieje' 'subst' 'możliwość' 'interp' ',' 'comp' 'że'
;

sformulowaniePozwolenia :
	moze | nieMusi
;

moze :
	'qub' 'może'
;

nieMusi :
	'qub' 'nie' 'fin' 'musi'
;



PolishLetter : [ęóąśłżźćńĘÓĄŚŁŻŹĆŃ] ;

Letter : ('a' .. 'z' | 'A' .. 'Z' | '-' | PolishLetter) ;

Identifier : Letter+ ;

Srednik : ';' ;

Myslnik : '-' ;

Cyfry : ('0' .. '9')+ ;

WS : [ \t\r\n]+ -> skip; // pomiń białe znaki

