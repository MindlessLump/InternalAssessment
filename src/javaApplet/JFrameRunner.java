package javaApplet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 * Runs the JFrame in which the game is run.
 * @author Erik Martin
 * @version November 20, 2014
 */
public class JFrameRunner extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	//Number: User inputs the number of dice to roll.
	JTextField number100, number20, number12, number10, number8, number6, number4, number3;
	//Modifier: User inputs the total modifier to the dice rolled.
	JTextField modifier100, modifier20, modifier12, modifier10, modifier8, modifier6, modifier4, modifier3;
	//Roll: Button that the user clicks to roll that die type, with the given number of dice and total modifier.
	JButton roll100, roll20, roll12, roll10, roll8, roll6, roll4, roll3;
	//Results: Scrolling text field for the dice results.
	JTextArea results;
	JScrollPane scroll;
	
	//Random: Returns the result from the "dice rolls".
	Random rand = new Random();
		
	//Various JPanels to help with layout
	JPanel window, inputField, outputField;
	
	public JFrameRunner() {
		super("Erik Martin: Dice Roller");
		setSize(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		//Initialize the text fields and buttons
		number100 = new JTextField("1");
		number20 = new JTextField("1");
		number12 = new JTextField("1");
		number10 = new JTextField("1");
		number8 = new JTextField("1");
		number6 = new JTextField("1");
		number4 = new JTextField("1");
		number3 = new JTextField("1");
		
		modifier100 = new JTextField("0");
		modifier20 = new JTextField("0");
		modifier12 = new JTextField("0");
		modifier10 = new JTextField("0");
		modifier8 = new JTextField("0");
		modifier6 = new JTextField("0");
		modifier4 = new JTextField("0");
		modifier3 = new JTextField("0");
		
		roll100 = new JButton("Roll");
		roll100.addActionListener(this);
		roll20 = new JButton("Roll");
		roll20.addActionListener(this);
		roll12 = new JButton("Roll");
		roll12.addActionListener(this);
		roll10 = new JButton("Roll");
		roll10.addActionListener(this);
		roll8 = new JButton("Roll");
		roll8.addActionListener(this);
		roll6 = new JButton("Roll");
		roll6.addActionListener(this);
		roll4 = new JButton("Roll");
		roll4.addActionListener(this);
		roll3 = new JButton("Roll");
		roll3.addActionListener(this);
		
		results = new JTextArea("--------------------\nThe results will appear in this text field,\nwith the newest rolls on the bottom.");
		results.setEditable(false);
		scroll = new JScrollPane (results, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		//Add the input and output objects to their respective containers (JPanel)
		window = new JPanel();
		window.setSize(800, 400);
		inputField = new JPanel();
		inputField.setSize(600, 400);
		outputField = new JPanel();
		outputField.setSize(200, 400);
		
		//Define the applet layout
		doLayoutWork();
		
		//Display the JFrame
		getContentPane().add(window);
		pack();
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new JFrameRunner();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == roll100) { //If the button for rolling the d100 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number100.getText()); j++) {
				dice += rand.nextInt(100) + 1;
			}
			int total = dice + Integer.parseInt(modifier100.getText());
			String result = number100.getText() + "d100 + " + modifier100.getText() + "\n= " + dice + " + " + modifier100.getText() + "\n= " + total + ".";
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll20) { //If the button for rolling the d20 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number20.getText()); j++) {
				dice += rand.nextInt(20) + 1;
			}
			int total = dice + Integer.parseInt(modifier20.getText());
			String result = number20.getText() + "d20 + " + modifier20.getText() + "\n= " + dice + " + " + modifier20.getText() + "\n= " + total + ".";
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll12) { //If the button for rolling the d12 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number12.getText()); j++) {
				dice += rand.nextInt(12) + 1;
			}
			int total = dice + Integer.parseInt(modifier12.getText());
			String result = number12.getText() + "d12 + " + modifier12.getText() + "\n= " + dice + " + " + modifier12.getText() + "\n= " + total + ".";
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll10) { //If the button for rolling the d10 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number10.getText()); j++) {
				dice += rand.nextInt(10) + 1;
			}
			int total = dice + Integer.parseInt(modifier10.getText());
			String result = number10.getText() + "d10 + " + modifier10.getText() + "\n= " + dice + " + " + modifier10.getText() + "\n= " + total + ".";
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll8) { //If the button for rolling the d8 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number8.getText()); j++) {
				dice += rand.nextInt(8) + 1;
			}
			int total = dice + Integer.parseInt(modifier8.getText());
			String result = number8.getText() + "d8 + " + modifier8.getText() + "\n= " + dice + " + " + modifier8.getText() + "\n= " + total + ".";
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll6) { //If the button for rolling the d6 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number6.getText()); j++) {
				dice += rand.nextInt(6) + 1;
			}
			int total = dice + Integer.parseInt(modifier6.getText());
			String result = number6.getText() + "d6 + " + modifier6.getText() + "\n= " + dice + " + " + modifier6.getText() + "\n= " + total + ".";
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll4) { //If the button for rolling the d4 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number4.getText()); j++) {
				dice += rand.nextInt(4) + 1;
			}
			int total = dice + Integer.parseInt(modifier4.getText());
			String result = number4.getText() + "d4 + " + modifier4.getText() + "\n= " + dice + " + " + modifier4.getText() + "\n= " + total + ".";
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll3) { //If the button for rolling the d3 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number3.getText()); j++) {
				dice += rand.nextInt(3) + 1;
			}
			int total = dice + Integer.parseInt(modifier3.getText());
			String result = number3.getText() + "d3 + " + modifier3.getText() + "\n= " + dice + " + " + modifier3.getText() + "\n= " + total + ".";
			results.setText(results.getText() + "\n\n" + result);
		}
	}
	
	public void doLayoutWork() {
		//Organize the general layout
		GroupLayout windowLayout = new GroupLayout(window);
		window.setLayout(windowLayout);
		windowLayout.setAutoCreateGaps(true);
		windowLayout.setAutoCreateContainerGaps(true);
		windowLayout.setHorizontalGroup(
				windowLayout.createSequentialGroup()
					.addComponent(inputField)
					.addComponent(outputField)
		);
		windowLayout.setVerticalGroup(
				windowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inputField)
					.addComponent(outputField)
		);
		
		//Organize the input layout
		GroupLayout inputLayout = new GroupLayout(inputField);
		inputField.setLayout(inputLayout);
		inputLayout.setAutoCreateGaps(true);
		inputLayout.setAutoCreateContainerGaps(true);
		inputLayout.setHorizontalGroup(
				inputLayout.createSequentialGroup()
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number100)
							.addComponent(number20)
							.addComponent(number12)
							.addComponent(number10)
							.addComponent(number8)
							.addComponent(number6)
							.addComponent(number4)
							.addComponent(number3))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(modifier100)
							.addComponent(modifier20)
							.addComponent(modifier12)
							.addComponent(modifier10)
							.addComponent(modifier8)
							.addComponent(modifier6)
							.addComponent(modifier4)
							.addComponent(modifier3))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(roll100)
							.addComponent(roll20)
							.addComponent(roll12)
							.addComponent(roll10)
							.addComponent(roll8)
							.addComponent(roll6)
							.addComponent(roll4)
							.addComponent(roll3))
		);
		inputLayout.setVerticalGroup(
				inputLayout.createSequentialGroup()
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number100)
							.addComponent(modifier100)
							.addComponent(roll100))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number20)
							.addComponent(modifier20)
							.addComponent(roll20))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number12)
							.addComponent(modifier12)
							.addComponent(roll12))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number10)
							.addComponent(modifier10)
							.addComponent(roll10))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number8)
							.addComponent(modifier8)
							.addComponent(roll8))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number6)
							.addComponent(modifier6)
							.addComponent(roll6))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number4)
							.addComponent(modifier4)
							.addComponent(roll4))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(number3)
							.addComponent(modifier3)
							.addComponent(roll3))
		);
		
		//Organize the output layout
		GroupLayout outputLayout = new GroupLayout(outputField);
		outputField.setLayout(outputLayout);
		outputLayout.setAutoCreateGaps(true);
		outputLayout.setAutoCreateContainerGaps(true);
		outputLayout.setHorizontalGroup(
				outputLayout.createSequentialGroup()
					.addComponent(scroll)
		);
		outputLayout.setVerticalGroup(
				outputLayout.createSequentialGroup()
					.addComponent(scroll)
		);
	}
}
