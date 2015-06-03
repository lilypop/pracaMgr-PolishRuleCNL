package GUI;

import javax.swing.JFrame;

import Controller.WindowController;
/**
 * 
 * @author wposlednicka
 *
 */
public class Main {
	
	private WindowController windowController;
	private JFrame frame;
	
	public void run(){
		frame = new JFrame();
		windowController = new WindowController();
		frame.add(windowController.getWindow());
		frame.setTitle("PolishRuleCNL - Tools");
		frame.setVisible(true);
		frame.setLocation(100, 100);
		frame.setSize(1200, 400);
	}

	public static void main (String [] args){
		Main main = new Main();
		main.run();
	}
	

}
