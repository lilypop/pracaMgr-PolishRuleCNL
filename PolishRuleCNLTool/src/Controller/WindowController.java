package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFileChooser;

import GUI.Window;
import Model.Line;

/**
 * 
 * @author wposlednicka
 *
 */
public class WindowController {

	private Window window;
	private ArrayList<Line> vocabularyLine;
	private ArrayList<Line> rulesLine;
	private String loadPath;
	private Algorytm algorytm;
	
	private String ruleFile = "C:\\Users\\wposlednicka\\Documents\\rules.txt";
	private String vocFile = "C:\\Users\\wposlednicka\\Documents\\voc.txt";
	
	public WindowController(){
		window = new Window();
		vocabularyLine = new ArrayList<Line>();
		rulesLine = new ArrayList<Line>();
		algorytm = new Algorytm();
	}
	
	public JComponent getWindow(){
		window.setChooserPathButtonAction(createPathButtonAction());
		window.setLoadVocabularyButtonAction(createLoadVocabularyButtonAction());
		window.setLoadRulesButtonAction(createLoadRuleButtonAction());
		window.setRunRulesTager(createRunRulesTagerButtonAction());
		window.setRunVocTager(createRunVocTagerButtonAction());
		return window.getWindow();
	}
	
	

	private ActionListener createRunVocTagerButtonAction() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				algorytm.fillWithTagerDateVocabulary();
				algorytm.createVocabularyXMLFile();
				
			}
		};
	}

	private ActionListener createRunRulesTagerButtonAction() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				algorytm.fillWithTagerDateRules();
				algorytm.createRulesXMLFile();
				
			}
		};
	}

	private ActionListener createPathButtonAction(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
		        int returnValue = fileChooser.showOpenDialog(null);
					if (returnValue == JFileChooser.APPROVE_OPTION) {
						File selectedFile = fileChooser.getSelectedFile();
					    loadPath = selectedFile.getPath();
					    window.getLoadPathText().setText(loadPath);
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
	
	private ActionListener loadDate(ArrayList<Line> list, boolean rules){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File file = null;
				
				file = chooseFile(rules);

				Scanner sc;
				try {
					sc = new Scanner(file);
					while (sc.hasNextLine()) {
						String line = sc.nextLine();
						line = line.replaceAll("\t", "");
						Line stringLine = new Line(line);
						list.add(stringLine);
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
			if (!algorytm.getVocabulary().isEmpty()) {
				window.getTagVocPanel().setVisible(true);
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
