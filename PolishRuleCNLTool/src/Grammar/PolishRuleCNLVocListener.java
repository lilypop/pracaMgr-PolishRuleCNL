package Grammar;

import org.antlr.v4.runtime.misc.NotNull;

public class PolishRuleCNLVocListener extends PolishRuleCNLBaseListener {
	
	private boolean faktVisited = false;
	private boolean pojecieRzeczownikoweVisited = false;

	@Override
	public void enterFakt(@NotNull PolishRuleCNLParser.FaktContext ctx) {
//		System.out.println("FAKT");
		faktVisited = true;
	}

	@Override
	public void enterPojecieRzeczownikowe(@NotNull PolishRuleCNLParser.PojecieRzeczownikoweContext ctx) {
//		System.out.println("POJĘCIE RZECZOWNIKOWE");
		pojecieRzeczownikoweVisited = true;
	}

	public boolean isFaktVisited() {
		return faktVisited;
	}

	public boolean isPojecieRzeczownikoweVisited() {
		return pojecieRzeczownikoweVisited;
	}

}
