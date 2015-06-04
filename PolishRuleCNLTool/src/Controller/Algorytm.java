package Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Grammar.VocabularySemanticAnalyzer;
import Model.Attribute;
import Model.AttributeName;
import Model.Entry;
import Model.Line;
import Model.Representation;
import Model.RuleEntry;
import Model.VocEntry;

/**
 * 
 * @author wposlednicka
 *
 */
public class Algorytm {
	
	private List<VocEntry> vocabulary;
	private List<RuleEntry> rules;
	private ArrayList<AttributeName> attributeNames;
	private FormatXML formatXML;
	
	private String ruleXMLFilePath = "C:\\Users\\wposlednicka\\Documents\\rules.xml";
	private String vocXMLFilePath = "C:\\Users\\wposlednicka\\Documents\\vocabulary.xml";
	
	public Algorytm(){
		attributeNames = generateAttributeNamesList();
		formatXML = new FormatXML();
	}
	
	private ArrayList<AttributeName> generateAttributeNamesList() {
		ArrayList<AttributeName> list = new ArrayList<AttributeName>();
		list.add(AttributeName.Definicja);
		list.add(AttributeName.Źródło);
		list.add(AttributeName.DefinicjaBazowa);
		list.add(AttributeName.PojęcieOgólne);
		list.add(AttributeName.TypPojęcia);
		list.add(AttributeName.Konieczność);
		list.add(AttributeName.Możliwość);
		list.add(AttributeName.SchematOdniesienia);
		list.add(AttributeName.Uwaga);
		list.add(AttributeName.Przykład);
		list.add(AttributeName.Synonim);
		list.add(AttributeName.FormaRównoznaczna);
		list.add(AttributeName.ZobaczTeż);
		list.add(AttributeName.Tematyka);
		list.add(AttributeName.URIDlaPrzestrzeniNazw);
		list.add(AttributeName.Nazwa);
		list.add(AttributeName.TypWytycznej);
		list.add(AttributeName.Opis);
		list.add(AttributeName.PoziomWymuszenia);
		
		return list;
	}

	public void generateVocabulary(ArrayList<Line> vocabularyLine) {
		vocabulary = new ArrayList<VocEntry>();
		VocEntry entry = null;

		for (Line line : vocabularyLine) {

			if (!line.getWords().get(0).startsWith("#")) {

				AttributeName checkIsAttribute = checkIsAttribute(line);

				if (checkIsAttribute != null) { // jest atrybutem
					Attribute a = new Attribute();
					a.setName(checkIsAttribute);

					String value = "";

					for (int i = 1; i < line.getWords().size(); i++) {
						value += line.getWords().get(i) + " ";
					}

					a.setValue(value);
					a.setVetisText(value);

					entry.getAttributes().add(a);
				} else {
					entry = new VocEntry();
					entry.setAttributes(new ArrayList<Attribute>());
					Representation rep = new Representation(line.getValue());
					rep.setVetisText(createVetisText(line.getValue()));
					entry.setRepresentation(rep);
					vocabulary.add(entry);
				}
			}

		}

		System.out.println("Wczytano do słownika: " + vocabulary.size());

	}
	
	private String createVetisText(String value) {
		//TODO
		return value;
	}

	private AttributeName checkIsAttribute(Line line) {
		String firstWord = line.getWords().get(0).trim();
		
		for (AttributeName attributeName : attributeNames) {
			if (attributeName.getValue().equals(firstWord)) {
				return attributeName;
			}
		}
		return null;
	}
	
	public void fillWithTagerDateVocabulary(){
		
		for (VocEntry voc : vocabulary) {
			// text do tagera -voc
			voc = (VocEntry) formatXML.addTagerInfo(voc);
		}
		
		System.out.println("Słownik po otagowaniu");
		for (VocEntry voc : vocabulary) {
			System.out.println(voc.getRepresentation().toString());
		}
	}
	
	public void fillWithTagerDateRules(){

		for (RuleEntry rule : rules) {
			
			rule = (RuleEntry) formatXML.addTagerInfo(rule);
		}
		
		System.out.println("Reguły po atagowaniu:");
		
		for(RuleEntry rule : rules){
			System.out.println(rule.getRepresentation().toString());
		}
	}
	
	
	public boolean createVocabularyXMLFile(){
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("ArrayOfVocEntry");
			doc.appendChild(rootElement);
	 
			
			for (VocEntry voc : vocabulary) {
				
				Element vocEntry = doc.createElement("VocEntry");
				rootElement.appendChild(vocEntry);
				
				Element representation = doc.createElement("Representation");
				vocEntry.appendChild(representation);
				
				Element text = doc.createElement("Text");
				String value = voc.getRepresentation().getText();
				text.appendChild(doc.createTextNode(value));
				representation.appendChild(text);
				
				Element attribute = doc.createElement("Attributes");
				vocEntry.appendChild(attribute);
				
				if(!voc.getAttributes().isEmpty()){
					
					for (Attribute attr : voc.getAttributes()) {
						
						Element attrElement = doc.createElement("Attribute");
						attribute.appendChild(attrElement);
						
						Element nameElement = doc.createElement("Name");
						String valueName = attr.getName().toString();
						nameElement.appendChild(doc.createTextNode(valueName));
						attrElement.appendChild(nameElement);
						
						Element valueElement = doc.createElement("Value");
						String valueValue = attr.getValue();
						valueElement.appendChild(doc.createTextNode(valueValue));
						attrElement.appendChild(valueElement);
						
						Element vetisElement = doc.createElement("VetisElement");
						String vetisValue = attr.getValue();
						vetisElement.appendChild(doc.createTextNode(vetisValue));
						attrElement.appendChild(vetisElement);
						
					}
				}
			}
	 
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(vocXMLFilePath));
	 
			transformer.transform(source, result);
	 
			JOptionPane.showMessageDialog(null, "Poprawnie otagowany słownik: " + vocXMLFilePath, "InfoBox: " + "PolishRuleCNL - Tools", JOptionPane.INFORMATION_MESSAGE);
			return true;
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			wrongInfo(e.toString());
			return false;
		} catch (TransformerException e) {
			e.printStackTrace();
			wrongInfo(e.toString());
			return false;
		}
	}
	
	
	public boolean createRulesXMLFile(){
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("ArrayOfRuleSetEntry");
			doc.appendChild(rootElement);
	 
			
			for (RuleEntry rule : rules) {
				
				Element ruleEntry = doc.createElement("RuleEntry");
				rootElement.appendChild(ruleEntry);
				
				Element representation = doc.createElement("Representation");
				ruleEntry.appendChild(representation);
				
				Element text = doc.createElement("Text");
				String value = rule.getRepresentation().getText();
				text.appendChild(doc.createTextNode(value));
				representation.appendChild(text);
				
				Element attribute = doc.createElement("Attributes");
				ruleEntry.appendChild(attribute);
				
				if(!rule.getAttributes().isEmpty()){
					
					for (Attribute attr : rule.getAttributes()) {
						
						Element attrElement = doc.createElement("Attribute");
						attribute.appendChild(attrElement);
						
						Element nameElement = doc.createElement("Name");
						String valueName = attr.getName().toString();
						nameElement.appendChild(doc.createTextNode(valueName));
						attrElement.appendChild(nameElement);
						
						Element valueElement = doc.createElement("Value");
						String valueValue = attr.getValue();
						valueElement.appendChild(doc.createTextNode(valueValue));
						attrElement.appendChild(valueElement);
						
						Element vetisElement = doc.createElement("VetisElement");
						String vetisValue = attr.getValue();
						vetisElement.appendChild(doc.createTextNode(vetisValue));
						attrElement.appendChild(vetisElement);
						
					}
				}
			}
	 
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(ruleXMLFilePath));
	 
			transformer.transform(source, result);
	 
			JOptionPane.showMessageDialog(null, "Poprawnie otagowany słownik: " + ruleXMLFilePath, "InfoBox: " + "PolishRuleCNL - Tools", JOptionPane.INFORMATION_MESSAGE);
			return true;
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			wrongInfo(e.toString());
			return false;
		} catch (TransformerException e) {
			e.printStackTrace();
			wrongInfo(e.toString());
			return false;
		}
	}
	
	private void wrongInfo(String text){
		JOptionPane.showMessageDialog(null, "Błąd podczas tagowania: " + text, "InfoBox: " + "PolishRuleCNL - Tools", JOptionPane.ERROR_MESSAGE);
	}

	public void generateRules(ArrayList<Line> rulesLine) {
		
		rules = new ArrayList<RuleEntry>();
		RuleEntry entry = null;
		
		for (Line line : rulesLine) {

			AttributeName checkIsAttribute = checkIsAttribute(line);
			
			if(checkIsAttribute != null){ // jest atrybutem
				Attribute a = new Attribute();
				a.setName(checkIsAttribute);
				
				String value = "";
				
				for(int i=1; i<line.getWords().size(); i++){
					value += line.getWords().get(i) + " ";
				}
				
				a.setValue(value);
				a.setVetisText(value);
				
				entry.getAttributes().add(a);
			}
			else{
				entry = new RuleEntry();
				entry.setAttributes(new ArrayList<Attribute>());
				Representation rep = new Representation(line.getValue());
				entry.setRepresentation(rep);
				rules.add(entry);
			}
		}
		
		System.out.println("Wczytano reguły: " + rules.size());
		
	}
	
	public void parseVocabulary() {
		Iterator<VocEntry> vocIterator = vocabulary.iterator();
		while (vocIterator.hasNext()) {
			VocEntry vocEntry = vocIterator.next();
			try {
				parseVocEntry(vocEntry);
				drawTree(vocEntry);
			} catch (Exception e) {
				e.printStackTrace();
				String errorMsg = "Błąd dla wpisu " + vocEntry.getRepresentation().getBaseForm();
				errorMsg += ":\n";
				errorMsg += e.getMessage();
				JOptionPane.showMessageDialog(null, errorMsg);
				vocIterator.remove();
			}
		}

	}
	
	public void parseRules(){
		Iterator<RuleEntry> ruleIterator = rules.iterator();
		while(ruleIterator.hasNext()){
			RuleEntry ruleEntry = ruleIterator.next();
			try {
				parseRuleEntry(ruleEntry);
				drawTree(ruleEntry);
			}
			catch(Exception e){
				e.printStackTrace();
				String errorMsg = "Błąd dla wpisu " + ruleEntry.getRepresentation().getBaseForm();
				errorMsg += ":\n";
				errorMsg += e.getMessage();
				JOptionPane.showMessageDialog(null, errorMsg);
				ruleIterator.remove();
			}
		}
	}
	
	
	private void drawTree(Entry vocEntry) {
		try {
			VocabularySemanticAnalyzer.drawTree(vocEntry);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void parseVocEntry(VocEntry vocEntry) {
		VocabularySemanticAnalyzer semanticAnalyzer = new VocabularySemanticAnalyzer(vocEntry);
		semanticAnalyzer.walkVocTree();
	}

	private void parseRuleEntry(RuleEntry ruleEntry){
		System.out.println("parsuj rule");
		VocabularySemanticAnalyzer semanticAnalyzer = new VocabularySemanticAnalyzer(ruleEntry);
		semanticAnalyzer.walkRuleTree();
	}
	
	public List<VocEntry> getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(List<VocEntry> vocabulary) {
		this.vocabulary = vocabulary;
	}
	
	public List<RuleEntry> getRules() {
		return rules;
	}

	public void setRules(List<RuleEntry> rules) {
		this.rules = rules;
	}

	
	
	
}
