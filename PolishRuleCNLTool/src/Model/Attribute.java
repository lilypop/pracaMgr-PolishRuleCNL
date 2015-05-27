package Model;
/**
 * 
 * @author wposlednicka
 *
 */
public class Attribute {

	 public AttributeName Name;
     public String Value;

     public String TaggedValue;
     public String BaseForm;
     public String VetisText;


     public Attribute() {}

     public Attribute(AttributeName name, String value, String vetisText)
     {
         this.Name = name;
         this.Value = value;
         this.VetisText = vetisText;
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
		return TaggedValue;
	}

	public void setTaggedValue(String taggedValue) {
		TaggedValue = taggedValue;
	}

	public String getBaseForm() {
		return BaseForm;
	}

	public void setBaseForm(String baseForm) {
		BaseForm = baseForm;
	}

	public String getVetisText() {
		return VetisText;
	}

	public void setVetisText(String vetisText) {
		VetisText = vetisText;
	}

	@Override
	public String toString() {
		return "Attribute [Name=" + Name + ", Value=" + Value + ", VetisText="
				+ VetisText + "]";
	}
     
     
	
     
     

}
