package Grammar;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.TestRig;
import org.antlr.v4.runtime.tree.ParseTree;

import Grammar.PolishRuleCNLParser.RegulaContext;
import Grammar.PolishRuleCNLParser.SlownikContext;
import Model.Entry;
import Model.Representation;
import Model.RuleEntry;
import Model.VocEntry;
import Model.Vocabulary;

public class VocabularySemanticAnalyzer {

	private PolishRuleCNLLexer lexer;
	private PolishRuleCNLParser parser;
	private PolishRuleCNLVocListener treeListener = new PolishRuleCNLVocListener();
	private Entry entry;
	private Vocabulary vocabulary;
	private List<VocEntry> newEtries = new ArrayList<VocEntry>();
	
	public static void drawTree(Entry vocEntry) throws Exception {
		File file = new File("rules_tmp.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.append(vocEntry.getRepresentation().getTaggedText());
		fileWriter.flush();
		fileWriter.close();

		TestRig.main(new String[] { "Grammar.PolishRuleCNL", "korzen", "-gui",
				"rules_tmp.txt" });
	}

	public VocabularySemanticAnalyzer(Entry entry, Vocabulary vocabulary) {
		this.entry = entry;
		this.vocabulary = vocabulary;
		reset();
	}

	public void enableTrace() {
		parser.setTrace(true);
	}

	public void printAllChildren() {
		printChild(parser.slownik());
	}

	private void printChild(ParseTree parseTree) {
		if (parseTree.getChildCount() == 0) {
			System.out.println("Chlid: " + parseTree.getText());
		} else {
			for (int i = 0; i < parseTree.getChildCount(); i++) {
				printChild(parseTree.getChild(i));
			}
		}
	}

	private void reset() {
		lexer = new PolishRuleCNLLexer(new ANTLRInputStream(entry.getRepresentation().getTaggedText()));
		parser = new PolishRuleCNLParser(new BufferedTokenStream(lexer));
		parser.addParseListener(treeListener);
		parser.addErrorListener(new PolishRuleCNLErrorListener());
	}

	public void walkRuleTree() {
		System.out.println("RuleEntry przed: " + entry);

		RuleEntryParseTreeWalker walker = new RuleEntryParseTreeWalker();
		walker.setRuleEntry((RuleEntry) entry);
		RegulaContext regula = null;

		try {
			regula = parser.korzen().regula();
		} catch (RecognitionException e) {
			System.err.println("ZZZ " + e.getMessage());
		}

		if (regula != null) {
			walker.walk(treeListener, regula);
			System.out.println("\n" + regula.toStringTree());
		} else {
			throw new RuntimeException("Wpis nie jest regułą");
		}

		System.out.println("RuleEntry po: " + entry);
	}

	public void walkVocTree() {

		System.out.println("VocEntry przed: " + entry);

		VocEntryParseTreeWalker walker = new VocEntryParseTreeWalker();
		walker.setVocEntry((VocEntry) entry);
		SlownikContext slownik = null;

		try {
			slownik = parser.korzen().slownik();
		} catch (RecognitionException e) {
			System.err.println("ZZZ " + e.getMessage());
		}

		if (slownik != null) {
			walker.walk(treeListener, slownik);
			System.out.println("\n" + slownik.toStringTree());
		} else {
			throw new RuntimeException("Wpis nie jest wpisem słownikowym");
		}
		
		newEtries.addAll(walker.getIsRoleOfFactTypes());

		System.out.println("VocEntry po: " + entry);
		System.out.println("New entries count: " + walker.getIsRoleOfFactTypes().size());
	}

	public static void main(String[] args) throws Exception {
		Entry vocEntry = new RuleEntry();
		vocEntry.setRepresentation(new Representation());
		vocEntry.getRepresentation().setTaggedText(
				"fin być adj konieczny comp aby subst bank adj poinformal subst dłużnik");// prep o subst kwota subst zadłużenie");
		VocabularySemanticAnalyzer analyzer = new VocabularySemanticAnalyzer(vocEntry, null);
		analyzer.walkRuleTree();
		
		drawTree(vocEntry);

	}

	public List<VocEntry> getNewEtries() {
		return newEtries;
	}

}
