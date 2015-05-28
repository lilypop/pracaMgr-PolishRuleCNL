package Grammar;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.misc.TestRig;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import Grammar.PolishRuleCNLParser.SlownikContext;
import Model.VocEntry;

public class VocabularySemanticAnalyzer {
	
	private PolishRuleCNLLexer lexer;
	private PolishRuleCNLParser parser;
	private PolishRuleCNLVocListener treeListener = new PolishRuleCNLVocListener();
	private VocEntry vocEntry;
	
	
	public static void main(String[] args) throws Exception {
		TestRig.main(new String[] {"Grammar.PolishRuleCNL", "slownik", "-gui", "/home/mkosior/voc_tag"});
	}
	
	public VocabularySemanticAnalyzer(VocEntry vocEntry) {
		this.vocEntry = vocEntry;
		reset();
	}
	
	public void enableTrace() {
		parser.setTrace(true);
	}
	
	public boolean isCorrectVocRoot() {
		return treeListener.isFaktVisited() || treeListener.isPojecieRzeczownikoweVisited();
	}
	
	public void printAllChildren() {
		printChild(parser.slownik());
	}
	
	private void printChild(ParseTree parseTree) {
		if(parseTree.getChildCount() == 0) {
			System.out.println("Chlid: " + parseTree.getText());
		} else {
			for(int i=0; i < parseTree.getChildCount(); i++) {
				printChild(parseTree.getChild(i));
			}
		}
	}
	
	private void reset() {
		lexer = new PolishRuleCNLLexer(new ANTLRInputStream(vocEntry.getRepresentation().getTaggedText()));
		parser = new PolishRuleCNLParser(new BufferedTokenStream(lexer));
		parser.addParseListener(treeListener);
		parser.addErrorListener(new PolishRuleCNLErrorListener());
	}

	public void walkTree() {
		
		ParseTreeWalker walker = new ParseTreeWalker();
		
		SlownikContext slownik = parser.korzen().slownik();
		if(slownik != null) {
			walker.walk(treeListener, slownik);
			System.out.println("\n" + slownik.toStringTree());
		} else {
			throw new RuntimeException("To nie jest słownik!!!");
		}
	}

}
