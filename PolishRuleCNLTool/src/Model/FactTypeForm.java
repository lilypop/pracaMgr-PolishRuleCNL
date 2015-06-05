package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author wposlednicka
 *
 */
public class FactTypeForm {

	private List<Placeholder> placeholders = new ArrayList<Placeholder>();
	private List<Placeholder> verbPhrases = new ArrayList<Placeholder>();
	
    public List<Placeholder> getPlaceholders() {
		return placeholders;
	}
	public void setPlaceholders(List<Placeholder> placeholders) {
		this.placeholders = placeholders;
	}
	public List<Placeholder> getVerbPhrases() {
		return verbPhrases;
	}
	public void setVerbPhrases(List<Placeholder> verbPhrases) {
		this.verbPhrases = verbPhrases;
	}

}
