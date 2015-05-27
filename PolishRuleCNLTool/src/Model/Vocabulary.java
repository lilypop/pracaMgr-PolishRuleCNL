package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author wposlednicka
 *
 */
public class Vocabulary {

	private List<VocEntry> entries;
	
	public Vocabulary(){
		this.entries = new ArrayList<VocEntry>();
	}

	public List<VocEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<VocEntry> entries) {
		this.entries = entries;
	}

   
}
