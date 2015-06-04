package Grammar;

import org.antlr.v4.runtime.tree.ParseTreeWalker;

import Model.RuleEntry;

public class RuleEntryParseTreeWalker extends ParseTreeWalker {
	
	private RuleEntry entry;

	public void setRuleEntry(RuleEntry entry) {
		this.entry = entry;
		
	}

}
