package Controller;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Model.Entry;
import Model.VocEntry;

/**
 * 
 * @author wposlednicka
 *
 */
public class FormatXML {

	public Entry addTagerInfo(Entry entry){
		
		 try {
			 	String id = Tager.nlpFileUpload(entry.getRepresentation().getText());
				id = Tager.nlpProcess("wcrft2",id);
				Tager.nlpFileDownload(id,"test_nlp.xml");
			 	
				File fXmlFile = new File("test_nlp.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
			 
				doc.getDocumentElement().normalize();
			 
				NodeList nList = doc.getElementsByTagName("sentence");
		
					if(nList != null && nList.getLength() > 0) {
					
						for(int i = 0 ; i < nList.getLength();i++) {
							
							Element el = (Element)nList.item(i);
							
							NodeList childNodes = el.getChildNodes();
							
							for (int a=0; a<childNodes.getLength(); a++){
								Node item = childNodes.item(a);

								if (item.getNodeType() == Node.ELEMENT_NODE) {
									entry = makeE(item, entry);
								}
							
							}
						}
					}
				
			    } catch (Exception e) {
				e.printStackTrace();
		    }
		
		return entry;
	}
	
	
	private Entry makeE(Node item, Entry entry) {
		Element el = (Element) item;
		if(el != null){
			
			String orth = el.getElementsByTagName("orth").item(0).getTextContent();
			String base = el.getElementsByTagName("base").item(0).getTextContent();
			String ctag = el.getElementsByTagName("ctag").item(0).getTextContent();
	
			entry = fillEntry(entry, orth, base, ctag);
			
		}
		
		return entry;
	}

	
	private Entry fillEntry(Entry entry, String orth, String base, String ctag) {

		// fulyytaggedtext
		String full = base + ":" + ctag + ":" + orth;
		String fullyTaggedText = entry.getRepresentation().getFullyTaggedText();
		
		if (fullyTaggedText != null) {
			fullyTaggedText = fullyTaggedText + " " + full;
			entry.getRepresentation().setFullyTaggedText(fullyTaggedText);
		}
		else{
			entry.getRepresentation().setFullyTaggedText(full);
		}
		
		String tagged = getFlex(ctag) + " " + base;
		String taggedText = entry.getRepresentation().getTaggedText();
		
		if(taggedText != null){
			taggedText = taggedText + " " + tagged;
			entry.getRepresentation().setTaggedText(taggedText);
		}
		else{
			entry.getRepresentation().setTaggedText(tagged);
		}
//		entry.getRepresentation().setVetisText(createVetisText(taggedText));
		
		String baseForm = entry.getRepresentation().getBaseForm();
		
		if(baseForm != null){
			baseForm = baseForm + " " + base;
			entry.getRepresentation().setBaseForm(baseForm);
		}
		else{
			entry.getRepresentation().setBaseForm(base);
		}
		
		return entry;
	}


	private String createVetisText(String taggedText) {
		return taggedText.replaceAll(" ", "_");
	}


	private String getFlex(String ctag) {
		String[] splited = ctag.split(":");
		return splited[0];
	}

}
