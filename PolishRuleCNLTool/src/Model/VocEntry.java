package Model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author wposlednicka
 *
 */
@XmlRootElement(namespace = "pl")
public class VocEntry extends Entry{

	public VocEntry(){
		
	}

	@Override
	public String toString() {
		
		return "VocEntry [ " + getRepresentation()
				+ ", getAttributes()=" + getAttributes() + "]";
	}
	
	
	
	 
}
