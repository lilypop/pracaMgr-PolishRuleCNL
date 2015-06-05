package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import GUI.Window;
import Model.Line;
import Model.VocEntry;

/**
 * 
 * @author wposlednicka
 *
 */
public class WindowController {

	private Window window;
	private ArrayList<Line> vocabularyLine;
	private ArrayList<Line> rulesLine;
	private String vocLoadPath;
	private String vocRulePath;
	private Algorytm algorytm;
	
	private String ruleFile = "C:\\Users\\wposlednicka\\Documents\\rules.txt";
	private String vocFile = "C:\\Users\\wposlednicka\\Documents\\voc.txt";
	
	public WindowController(String ruleFile, String vocFile){
		this();
		this.ruleFile = ruleFile;
		this.vocFile = vocFile;
	}
	
	public WindowController(){
		window = new Window();
		vocabularyLine = new ArrayList<Line>();
		rulesLine = new ArrayList<Line>();
		algorytm = new Algorytm();
	}
	
	public JComponent getWindow(){
		window.setChooserVocPathButtonAction(createVocPathButtonAction());
		window.setChooserRulePathButtonAction(createRulePathButtonAction());
		
		window.setLoadVocabularyButtonAction(createLoadVocabularyButtonAction());
		window.setLoadRulesButtonAction(createLoadRuleButtonAction());
		
		window.setRunRulesTager(createRunRulesTagerButtonAction());
		window.setRunVocTager(createRunVocTagerButtonAction());
		
		window.setRunRuleAntlrParserButtonAction(createRunRuleAntlrParserButtonAction());
		window.setRunVocAntlrParserButtonAction(createRunVocAntlrParserButtonAction());
		
		return window.getWindow();
	}
	
	

	private ActionListener createRunVocAntlrParserButtonAction() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				algorytm.parseVocabulary();
				algorytm.saveVocabularyToXml();
			}

		};
	}

	private ActionListener createRunRuleAntlrParserButtonAction() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				algorytm.parseRules();
			}
		};
	}

	private ActionListener createRunVocTagerButtonAction() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				algorytm.fillWithTagerDateVocabulary();
				boolean validation = algorytm.createVocabularyXMLFile();
				if (validation) {
					window.getAntlrVocPanel().setVisible(true);
				}
			}
		};
	}

	private ActionListener createRunRulesTagerButtonAction() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				algorytm.fillWithTagerDateRules();
				boolean validation = algorytm.createRulesXMLFile();
				if (validation) {
					window.getAntlrRulePanel().setVisible(true);
				}
				
			}
		};
	}

	private ActionListener createVocPathButtonAction(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
		        int returnValue = fileChooser.showOpenDialog(null);
					if (returnValue == JFileChooser.APPROVE_OPTION) {
						File selectedFile = fileChooser.getSelectedFile();
					    vocLoadPath = selectedFile.getPath();
					    window.getLoadVocPathText().setText(vocLoadPath);
					}
			}
		};
	}
	
	private ActionListener createRulePathButtonAction(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
		        int returnValue = fileChooser.showOpenDialog(null);
					if (returnValue == JFileChooser.APPROVE_OPTION) {
						File selectedFile = fileChooser.getSelectedFile();
					    vocRulePath = selectedFile.getPath();
					    window.getLoadRulesPathText().setText(vocRulePath);
					}
			}
		};
	}
	
	private ActionListener createLoadRuleButtonAction() {
		return loadDate(rulesLine, true);
	}

	private ActionListener createLoadVocabularyButtonAction(){
		return loadDate(vocabularyLine, false);
	}
	
	private ActionListener loadDate(final ArrayList<Line> list, final boolean rules){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				list.clear();
				File file = null;
				
				file = chooseFile(rules);

				Scanner sc;
				try {
					sc = new Scanner(file);
					while (sc.hasNextLine()) {
						String line = sc.nextLine();
						if (line.trim().length() > 0 && !line.startsWith("#")) {
							line = line.replaceAll("\t", "");
							line = line.replaceAll(",", "");
							Line stringLine = new Line(line);
							list.add(stringLine);
						}
					}
					
					generateVocOrRuleList(list, rules);
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		};
	}
	
	private void generateVocOrRuleList(ArrayList<Line> list, boolean rules) {
		if(rules){
			algorytm.generateRules(list);
			
			// odblokowuje 2. KROK
			if (!algorytm.getRules().isEmpty()) {
				window.getTagRulePanel().setVisible(true);
			}
		}
		else{
			algorytm.generateVocabulary(list);
			
			// odblokowuje 2. KROK
			if (!algorytm.getVocabulary().getEntries().isEmpty()) {
				window.getTagVocPanel().setVisible(true);
				
				for (VocEntry voc : algorytm.getVocabulary().getEntries()) {
					System.out.println(voc.toString());
				}
				
			}
		}
	}
	
	private File chooseFile(boolean rules) {
		File file;
		if(rules){
			file = new File(ruleFile);
		}
		else{
			file = new File(vocFile);
		}
		return file;
	}
	
	
	
	
	
}
