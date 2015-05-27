package Model;
/**
 * 
 * @author wposlednicka
 *
 */
public enum AttributeName {

	Definicja("Definicja:"),
    Źródło("Źródło:"),
    DefinicjaBazowa("DefinicjaBazowa:"),
    PojęcieOgólne("PojęcieOgólne:"),
    TypPojęcia("TypPojęcia:"),
    Konieczność("Konieczność:"),
    Możliwość("Możliwość:"),
    SchematOdniesienia("SchematOdniesienia:"),
    Uwaga("Uwaga:"),
    Przykład("Przykład:"),
    Synonim("Synonim:"),
    FormaRównoznaczna("FormaRównoznaczna:"),
    ZobaczTeż("ZobaczTeż:"),
    Tematyka("Tematyka:"),
    URIDlaPrzestrzeniNazw("URIDlaPrzestrzeniNazw:"),
    Nazwa("Nazwa:"),
    TypWytycznej("TypWytycznej:"),
    Opis("Opis:"),
    PoziomWymuszenia("PoziomWymuszenia:");
	
	private String value;
	
	private AttributeName(String value){
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
