package Model;

import java.util.List;

/**
 * 
 * @author wposlednicka
 *
 */
public abstract class Entry {

	private Representation Representation;
    private List<Attribute> Attributes;
//    private Meaning Meaning;
	
    public Representation getRepresentation() {
		return Representation;
	}
	public void setRepresentation(Representation representation) {
		Representation = representation;
	}
	public List<Attribute> getAttributes() {
		return Attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		Attributes = attributes;
	}
//	public Meaning getMeaning() {
//		return Meaning;
//	}
//	public void setMeaning(Meaning meaning) {
//		Meaning = meaning;
//	}
	@Override
	public String toString() {
		return "Entry [Representation=" + Representation + ", Attributes="
				+ Attributes + "]";
	}


	
}
