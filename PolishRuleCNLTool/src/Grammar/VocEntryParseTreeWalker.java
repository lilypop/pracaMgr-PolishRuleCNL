package Grammar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import Model.Attribute;
import Model.AttributeName;
import Model.FactTypeForm;
import Model.FactTypeRole;
import Model.IndividualConcept;
import Model.IsRoleOfFactType;
import Model.Meaning;
import Model.ObjectType;
import Model.Placeholder;
import Model.Representation;
import Model.VocEntry;

public class VocEntryParseTreeWalker extends ParseTreeWalker {

	// TODO na Enuma
	public static final List<String> dataTypes = Arrays.asList(new String[] { "TYP WYLICZENIOWY", "TEXT", "LICZBA CAŁKOWITA", "LICZBA RZECZYWISTA",
			"DATA" });

	private VocEntry vocEntry;
	public List<VocEntry> isRoleOfFactTypes = new ArrayList<VocEntry>();

	public void walk(ParseTreeListener listener, ParseTree t) {
		if (t instanceof ErrorNode) {
			listener.visitErrorNode((ErrorNode) t);
			return;
		} else if (t instanceof TerminalNode) {
			listener.visitTerminal((TerminalNode) t);
			return;
		}

		RuleNode r = (RuleNode) t;
		handleNonTerminal(r);

		enterRule(listener, r);
		int n = r.getChildCount();
		for (int i = 0; i < n; i++) {
			walk(listener, r.getChild(i));
		}
		exitRule(listener, r);
	}

	private void handleNonTerminal(RuleNode r) {
		switch (r.getRuleContext().getRuleIndex()) {
		case PolishRuleCNLParser.RULE_pojecieRzeczownikowe:
			handlePojecieRzeczownikowe();
			break;
		case PolishRuleCNLParser.RULE_fakt:
			break;

		default:
			break;
		}
	}

	private void handlePojecieRzeczownikowe() {
		// if (voc.entries.FindAll(e => e.Representation.BaseForm!= null &&
		// e.Representation.BaseForm.Equals(entry.Representation.BaseForm) &&
		// !e.Equals(entry) && e.Meaning != null).Count > 0)
		// {
		// throw new Exception("Słownik zawiera już pozycję: \"" +
		// entry.Representation.Text + "\"");
		// }

		// TODO czy słownik zawiera już to pojęcie

		vocEntry.setMeaning(getMeaningPojecieRzeczownikowe(vocEntry));
		vocEntry.getRepresentation().setVetisText(vocEntry.getRepresentation().getText().replaceAll(" ", "_"));
	}

	public Meaning getMeaningPojecieRzeczownikowe(VocEntry vocEntry) {
		if (isIndividualConcept(vocEntry.getRepresentation().getText())) {
			return new IndividualConcept();
		} else if (isRole(vocEntry)) {
			return new FactTypeRole();
		}
		return new ObjectType();

	}

	private boolean isRole(VocEntry vocEntry) {

		if (!containsTypPojeciaRola(vocEntry)) {
			return false;
		}

		List<Attribute> pojecieOgoleAttributes = getAttributeByName(vocEntry, AttributeName.PojęcieOgólne);
		if (pojecieOgoleAttributes.size() > 0) {
			Attribute pojecieOgolneAttribute = pojecieOgoleAttributes.get(0);

			VocEntry ogolneFromVocabulary = getFromVocabulary(pojecieOgolneAttribute.getBaseForm());
			if (ogolneFromVocabulary != null || dataTypes.contains(pojecieOgolneAttribute.getValue().toUpperCase())) {
				createIsRoleOfFactType(vocEntry, pojecieOgolneAttribute, ogolneFromVocabulary);
				return true;
			} else {
				throw new RuntimeException("Pojęcie ogólne: " + pojecieOgolneAttribute.getValue()
						+ "nie znajduje się w słowniku i nie jest typem danych");
			}
		} else {
			throw new RuntimeException("Nie określono pojęcia ogólnego dla roli: " + vocEntry.getRepresentation().getText());
		}
	}

	private VocEntry getFromVocabulary(String baseForm) {
		return new VocEntry();
	}

	private void createIsRoleOfFactType(VocEntry entry, Attribute pojecieOgolneAttribute, VocEntry ogolneFromVoc) {
		VocEntry newVocEntry = new VocEntry();
		newVocEntry.setRepresentation(new Representation());
		newVocEntry.getRepresentation().setText(entry.getRepresentation().getText() + " jest rolą dla pojęcia " + pojecieOgolneAttribute.getValue());
		newVocEntry.getRepresentation().setTaggedText(
				entry.getRepresentation().getTaggedText() + " fin być subst rola prep dla subst pojęcie " + pojecieOgolneAttribute.getTaggedValue());
		newVocEntry.getRepresentation().setVetisText(
				entry.getRepresentation().getVetisText() + " jest_rolą_dla_pojęcia " + pojecieOgolneAttribute.getVetisText());

		IsRoleOfFactType rft = new IsRoleOfFactType();

		FactTypeRole ftr1 = new FactTypeRole();
		ftr1.setObjectPlayingRole(entry);
		rft.getOrderedFactTypeRoles().add(ftr1);

		FactTypeRole ftr2 = new FactTypeRole();

		if (ogolneFromVoc != null) {
			ogolneFromVoc = new VocEntry();
			ogolneFromVoc.setRepresentation(new Representation(pojecieOgolneAttribute.getValue()));
			ogolneFromVoc.getRepresentation().setTaggedText(pojecieOgolneAttribute.getTaggedValue());
			ogolneFromVoc.getRepresentation().setVetisText(pojecieOgolneAttribute.getVetisText());
			ogolneFromVoc.setMeaning(new ObjectType());
		}
		ftr2.setObjectPlayingRole(ogolneFromVoc);
		rft.getOrderedFactTypeRoles().add(ftr2);

		newVocEntry.getRepresentation().setFactInformation(new FactTypeForm());
		Placeholder p1 = new Placeholder();
		p1.setPosition(0);
		p1.setText(entry.getRepresentation().getVetisText());

		Placeholder p2 = new Placeholder();
		p2.setPosition(p1.getText().length() + 23);
		p2.setText(pojecieOgolneAttribute.getVetisText());

		Placeholder p3 = new Placeholder();
		p3.setPosition(p1.getText().length() + 1);
		p3.setText("jest_rolą_dla_pojęcia");

		newVocEntry.getRepresentation().getFactInformation().getPlaceholders().add(p1);
		newVocEntry.getRepresentation().getFactInformation().getPlaceholders().add(p2);
		newVocEntry.getRepresentation().getFactInformation().getPlaceholders().add(p3);
		newVocEntry.setMeaning(rft);

		isRoleOfFactTypes.add(newVocEntry);
	}

	private boolean containsTypPojeciaRola(VocEntry vocEntry) {
		List<Attribute> typPojeciaAttributes = getAttributeByName(vocEntry, AttributeName.TypPojęcia);
		return typPojeciaAttributes.size() > 0 && typPojeciaAttributes.get(0).getValue().toUpperCase().trim().equals("ROLA");
	}

	private List<Attribute> getAttributeByName(VocEntry vocEntry, AttributeName attributeName) {
		List<Attribute> attributes = vocEntry.getAttributes();
		List<Attribute> typPojeciaAttributes = new ArrayList<Attribute>();
		for (Attribute attribute : attributes) {
			if (attribute.getName().equals(attributeName)) {
				typPojeciaAttributes.add(attribute);
			}
		}
		return typPojeciaAttributes;
	}

	private boolean isIndividualConcept(String vocText) {
		return Character.isUpperCase(vocText.charAt(0));
	}

	public VocEntry getVocEntry() {
		return vocEntry;
	}

	public void setVocEntry(VocEntry vocEntry) {
		this.vocEntry = vocEntry;
	}

	public List<VocEntry> getIsRoleOfFactTypes() {
		return isRoleOfFactTypes;
	}
}
