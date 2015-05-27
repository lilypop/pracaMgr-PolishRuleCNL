package GUI;

import javax.swing.JDialog;

import Controller.WindowController;
/**
 * 
 * @author wposlednicka
 *
 */
public class Main {
	
	private WindowController windowController;
	private JDialog dialog;
	
	public void run(){
		dialog = new JDialog();
		windowController = new WindowController();
		dialog.add(windowController.getWindow());
		dialog.setTitle("PolishRuleCNL - Tools");
		dialog.setVisible(true);
		dialog.setLocation(100, 100);
		dialog.setSize(1200, 400);
	}

	public static void main (String [] args){
		Main main = new Main();
		main.run();
	}
	

}
