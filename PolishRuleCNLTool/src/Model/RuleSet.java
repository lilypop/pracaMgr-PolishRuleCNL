package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author wposlednicka
 *
 */
public class RuleSet {

	private List<RuleEntry> entries;
	
	public RuleSet(){
		this.entries = new ArrayList<RuleEntry>();
	}

	public List<RuleEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<RuleEntry> entries) {
		this.entries = entries;
	}
	
	
}
