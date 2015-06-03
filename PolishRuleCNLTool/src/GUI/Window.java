package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * 
 * @author wposlednicka
 *
 */
public class Window {

	private PanelBuilder builder;
	private FormLayout layout;
	private CellConstraints cc;
	private ActionListener loadRulesButtonAction;
	private ActionListener loadVocabularyButtonAction;
	private ActionListener chooserPathButtonAction;
	private ActionListener runVocTager;
	private ActionListener runRulesTager;
	private ActionListener runRuleAntlrParserButtonAction;
	private ActionListener runVocAntlrParserButtonAction;
	private JTextField loadPathText;
	private JPanel tagVocPanel;
	private JPanel tagRulePanel;
	private JPanel antlrVocPanel;
	private JPanel antlrRulePanel;
	
	public JComponent getWindow() {
		JComponent component = createWindow();
		return component;
	}

	private JComponent createWindow() {
		layout = new FormLayout("5px, f:d:g, 20px, f:d:g, 5px", "5px,pref, 20px, pref, 20px, pref, 20px, pref, 5px");
		builder = new PanelBuilder(layout);
		cc = new CellConstraints();
		
		builder.add(createLoadPanel("1.ETAP - Wczytywanie słownika", loadVocabularyButtonAction), cc.xy(2, 2));
		builder.add(createLoadPanel("1.ETAP - Wczytywanie reguł", loadRulesButtonAction), cc.xy(4, 2));

		tagVocPanel = createTagerPanel("2.ETAP - Tagowanie słownika: ", runVocTager);
		tagVocPanel.setVisible(false);
		builder.add(tagVocPanel, cc.xy(2, 4));
		
		tagRulePanel = createTagerPanel("2.ETAP - Tagowanie reguł: ", runRulesTager);
		tagRulePanel.setVisible(false);
		builder.add(tagRulePanel, cc.xy(4, 4));
		
		antlrVocPanel = createAntlrPanel("3. ETAP - Uruchomienie Antlr dla słownika", runVocAntlrParserButtonAction);
		antlrVocPanel.setVisible(false);
		builder.add(antlrVocPanel, cc.xy(2, 6));
		
		antlrRulePanel = createAntlrPanel("3. ETAP - Uruchomienie Antlr dla reguł", runRuleAntlrParserButtonAction);
		antlrRulePanel.setVisible(false);
		builder.add(antlrRulePanel, cc.xy(4, 6));
		
		return builder.getPanel();
	}
	
	private JPanel createAntlrPanel(String title, ActionListener action){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		JButton runAntlr = new JButton("Run Antlr");
		runAntlr.addActionListener(action);
		panel.add(runAntlr);
		panel.setBorder(new TitledBorder(title));
		
		return panel;
	}

	private JPanel createTagerPanel(String title, ActionListener action){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		JButton runTager = new JButton("Tager WCRFT2");
		runTager.addActionListener(action);
		panel.add(runTager);
		panel.setBorder(new TitledBorder(title));
		
		return panel;
	}
	
	private JPanel createLoadPanel(String title, ActionListener loadButtonAction){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		JButton loadButton = new JButton("Wczytaj");
		loadButton.addActionListener(loadButtonAction);
		panel.add(loadButton);
		loadPathText = new JTextField();
		loadPathText.setPreferredSize(new Dimension(400, 25));
		panel.add(loadPathText);
		JButton pathChooser = new JButton("...");
		pathChooser.addActionListener(chooserPathButtonAction);
		panel.add(pathChooser);
		panel.setBorder(new TitledBorder(title));
		
		return panel;
	}

	public ActionListener getChooserPathButtonAction() {
		return chooserPathButtonAction;
	}

	public void setChooserPathButtonAction(ActionListener chooserPathButtonAction) {
		this.chooserPathButtonAction = chooserPathButtonAction;
	}

	public ActionListener getLoadRulesButtonAction() {
		return loadRulesButtonAction;
	}

	public void setLoadRulesButtonAction(ActionListener loadRulesButtonAction) {
		this.loadRulesButtonAction = loadRulesButtonAction;
	}

	public ActionListener getLoadVocabularyButtonAction() {
		return loadVocabularyButtonAction;
	}

	public void setLoadVocabularyButtonAction(
			ActionListener loadVocabularyButtonAction) {
		this.loadVocabularyButtonAction = loadVocabularyButtonAction;
	}
	
	public JTextField getLoadPathText() {
		return loadPathText;
	}

	public void setLoadPathText(JTextField pathText) {
		this.loadPathText = pathText;
	}

	public ActionListener getRunVocTager() {
		return runVocTager;
	}

	public void setRunVocTager(ActionListener runVocTager) {
		this.runVocTager = runVocTager;
	}

	public ActionListener getRunRulesTager() {
		return runRulesTager;
	}

	public void setRunRulesTager(ActionListener runRulesTager) {
		this.runRulesTager = runRulesTager;
	}

	public JPanel getTagVocPanel() {
		return tagVocPanel;
	}

	public void setTagVocPanel(JPanel tagVocPanel) {
		this.tagVocPanel = tagVocPanel;
	}

	public JPanel getTagRulePanel() {
		return tagRulePanel;
	}

	public void setTagRulePanel(JPanel tagRulePanel) {
		this.tagRulePanel = tagRulePanel;
	}

	public JPanel getAntlrVocPanel() {
		return antlrVocPanel;
	}

	public void setAntlrVocPanel(JPanel antlrVocPanel) {
		this.antlrVocPanel = antlrVocPanel;
	}

	public JPanel getAntlrRulePanel() {
		return antlrRulePanel;
	}

	public void setAntlrRulePanel(JPanel antlrRulePanel) {
		this.antlrRulePanel = antlrRulePanel;
	}

	public ActionListener getRunRuleAntlrParserButtonAction() {
		return runRuleAntlrParserButtonAction;
	}

	public void setRunRuleAntlrParserButtonAction(
			ActionListener runRuleAntlrParserButtonAction) {
		this.runRuleAntlrParserButtonAction = runRuleAntlrParserButtonAction;
	}

	public ActionListener getRunVocAntlrParserButtonAction() {
		return runVocAntlrParserButtonAction;
	}

	public void setRunVocAntlrParserButtonAction(
			ActionListener runVocAntlrParserButtonAction) {
		this.runVocAntlrParserButtonAction = runVocAntlrParserButtonAction;
	}

	

	
	
	

	
	
	
	
}
