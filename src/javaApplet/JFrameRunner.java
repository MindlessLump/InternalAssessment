package javaApplet;

import javax.swing.*;

/**
 * Runs the JFrame in which the game is run.
 * @author Erik Martin
 * @version November 20, 2014
 */
public class JFrameRunner extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public JPanel buttonField, window, tB;
	public JTextArea textField;
	
	public JFrameRunner() {
		super("Erik Martin: Dice Roller");
		setSize(853, 480);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		window = new JPanel();
		window.setSize(853, 480);
		
		//Add the text
		tB = new JPanel();
		tB.setSize(160, 480);
		textField = new JTextArea("NOTES\n--------------------\nThis records your rolls, with the latest at the top.");
		textField.setSize(160, 480);
		textField.setLineWrap(true);
		textField.setWrapStyleWord(true);
		
		//Add the buttons and assorted fields
		
	}
}
