package Grammar;

import java.io.File;
import java.io.FileWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.TestRig;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import Grammar.PolishRuleCNLParser.SlownikContext;
import Model.Representation;
import Model.VocEntry;

public class VocabularySemanticAnalyzer {
	
	private PolishRuleCNLLexer lexer;
	private PolishRuleCNLParser parser;
	private PolishRuleCNLVocListener treeListener = new PolishRuleCNLVocListener();
	private VocEntry vocEntry;
	
//	Representation [text=tania pożyczka, baseForm=tani pożyczka, taggedText=adj tani subst pożyczka, fullyTaggedText=tani:adj:sg:nom:f:pos:tania pożyczka:subst:sg:nom:f:pożyczka]
//	Representation [text=pożyczka jest związana z wnioskiem o pożyczkę, baseForm=pożyczka być związać z wniosek o pożyczka, taggedText=subst pożyczka fin być ppas związać prep z subst wniosek prep o subst pożyczka, fullyTaggedText=pożyczka:subst:sg:nom:f:pożyczka być:fin:sg:ter:imperf:jest związać:ppas:sg:nom:f:perf:aff:związana z:prep:inst:nwok:z wniosek:subst:sg:inst:m3:wnioskiem o:prep:acc:o pożyczka:subst:sg:acc:f:pożyczkę]
//	Representation [text=Każda pożyczka zawsze jest otrzymana przez dokładnie jednego dłużnika, baseForm=każdy pożyczka zawsze być otrzymać przez dokładnie jeden dłużnik, taggedText=adj każdy subst pożyczka adv zawsze fin być ppas otrzymać prep przez qub dokładnie adj jeden subst dłużnik, fullyTaggedText=każdy:adj:sg:nom:f:pos:Każda pożyczka:subst:sg:nom:f:pożyczka zawsze:adv:zawsze być:fin:sg:ter:imperf:jest otrzymać:ppas:sg:nom:f:perf:aff:otrzymana przez:prep:acc:nwok:przez dokładnie:qub:dokładnie jeden:adj:sg:acc:m1:pos:jednego dłużnik:subst:sg:acc:m1:dłużnika]
//
	
	public static void drawTree(VocEntry vocEntry) throws Exception {
		File file = new File("C:\\Users\\wposlednicka\\Documents\\rules_tmp.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.append(vocEntry.getRepresentation().getTaggedText());
		fileWriter.flush();
		fileWriter.close();
		
		TestRig.main(new String[] {"Grammar.PolishRuleCNL", "slownik", "-gui", "C:\\Users\\wposlednicka\\Documents\\rules_tmp.txt"});
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
		
		System.out.println("VocEntry przed: " + vocEntry);
		
		VocEntryParseTreeWalker walker = new VocEntryParseTreeWalker();
		walker.setVocEntry(vocEntry);
		SlownikContext slownik = null;
		
		try {
			slownik = parser.korzen().slownik();
		} catch (RecognitionException e) {
			System.err.println("ZZZ " + e.getMessage());
		}
		
		if(slownik != null) {
			walker.walk(treeListener, slownik);
			System.out.println("\n" + slownik.toStringTree());
		} else {
			throw new RuntimeException("Wpis nie jest wpisem słownikowym");
		}
		
		System.out.println("VocEntry po: " + vocEntry);
	}
	
	public static void main(String[] args) {
		VocEntry vocEntry = new VocEntry();
		vocEntry.setRepresentation(new Representation());
		vocEntry.getRepresentation().setTaggedText("subst kierowca fin prowadzić subst samochód");
		VocabularySemanticAnalyzer analyzer = new VocabularySemanticAnalyzer(vocEntry);
		analyzer.walkTree();
		
	}

}
