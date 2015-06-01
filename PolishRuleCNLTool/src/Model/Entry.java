package Model;

import java.util.List;

/**
 * 
 * @author wposlednicka
 *
 */
public abstract class Entry {

	private Representation representation;
    private List<Attribute> attributes;
    private Meaning meaning;
	
    public Representation getRepresentation() {
		return representation;
	}
	public void setRepresentation(Representation representation) {
		this.representation = representation;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public Meaning getMeaning() {
		return meaning;
	}

	public void setMeaning(Meaning meaning) {
		this.meaning = meaning;
	}
	@Override
	public String toString() {
		return "Entry [Representation=" + representation + ", Attributes="
				+ attributes + "]";
	}


	
}
