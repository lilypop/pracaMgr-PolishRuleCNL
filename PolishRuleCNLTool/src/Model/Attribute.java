package Model;
/**
 * 
 * @author wposlednicka
 *
 */
public class Attribute {

	 private AttributeName Name;
	 private String Value;

	 private String taggedValue;
	 private String baseForm;
	 private String vetisText;


     public Attribute() {}

     public Attribute(AttributeName name, String value, String vetisText)
     {
         this.Name = name;
         this.Value = value;
         this.vetisText = vetisText;
     }

	@Override
	public String toString() {
		return "Attribute [Name=" + Name + ", Value=" + Value + ", VetisText="
				+ vetisText + "]";
	}

	public AttributeName getName() {
		return Name;
	}

	public void setName(AttributeName name) {
		Name = name;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	public String getTaggedValue() {
		return taggedValue;
	}

	public void setTaggedValue(String taggedValue) {
		this.taggedValue = taggedValue;
	}

	public String getBaseForm() {
		return baseForm;
	}

	public void setBaseForm(String baseForm) {
		this.baseForm = baseForm;
	}

	public String getVetisText() {
		return vetisText;
	}

	public void setVetisText(String vetisText) {
		this.vetisText = vetisText;
	}
     
     
	
     
     

}
