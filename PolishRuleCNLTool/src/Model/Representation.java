package Model;
/**
 * 
 * @author wposlednicka
 *
 */
public class Representation {
	
	private String text;
	private String baseForm;
	private String taggedText;
	private String fullyTaggedText;
	private FactTypeForm factInformation;
	private String vetisText;
	
	 public Representation() {}

	 public Representation(String text)
     {
         this.text = text;
     }

     public Representation(String text, String baseForm, String taggedText, String fullyTaggedText)
     {
         this.text = text;
         this.baseForm = baseForm;
         this.taggedText = taggedText;
         this.fullyTaggedText = fullyTaggedText;
     }

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getBaseForm() {
		return baseForm;
	}

	public void setBaseForm(String baseForm) {
		this.baseForm = baseForm;
	}

	public String getTaggedText() {
		return taggedText;
	}

	public void setTaggedText(String taggedText) {
		this.taggedText = taggedText;
	}

	public String getFullyTaggedText() {
		return fullyTaggedText;
	}

	public void setFullyTaggedText(String fullyTaggedText) {
		this.fullyTaggedText = fullyTaggedText;
	}

	public FactTypeForm getFactInformation() {
		return factInformation;
	}

	public void setFactInformation(FactTypeForm factInformation) {
		this.factInformation = factInformation;
	}

	public String getVetisText() {
		return vetisText;
	}

	public void setVetisText(String vetisText) {
		this.vetisText = vetisText;
	}

	@Override
	public String toString() {
		return "Representation [text=" + text + ", baseForm=" + baseForm
				+ ", taggedText=" + taggedText + ", fullyTaggedText="
				+ fullyTaggedText + "]";
	}

	

	
     
	
}
