package Model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author wposlednicka
 *
 */
public abstract class Entry {

	@XmlElement(name = "Representation")
	private Representation Representation;
    private List<Attribute> attributes;
    
//    @javax.xml.bind.annotation.XmlElement(name = "meaning", type=Meaning.class)
    private Meaning meaning;
	
    public Representation getRepresentation() {
		return Representation;
	}
	public void setRepresentation(Representation representation) {
		this.Representation = representation;
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
		return "Entry [Representation=" + Representation + ", Attributes="
				+ attributes + "]";
	}


	
}
