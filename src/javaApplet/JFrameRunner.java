package javaApplet;

import java.awt.Dimension;
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
	
	//Results: Text fields with individual results for the most recent die roll for each die type.
	JTextField res100, res20, res12, res10, res8, res6, res4, res3;
	//Results: Scrolling text field for the dice results.
	JTextArea results;
	JScrollPane scroll;
	
	//Clear and reset: Clears fields and output.
	JButton clear, reset;
	
	//Random: Returns the result from the "dice rolls".
	Random rand = new Random();
	
	//Various JLabels for text and images
	JLabel die100, die20, die12, die10, die8, die6, die4, die3;
	JLabel mod100, mod20, mod12, mod10, mod8, mod6, mod4, mod3;
	JLabel img100, img20, img12, img10, img8, img6, img4, img3;
	JLabel imgTitle, numberTitle, modifierTitle, resTitle;
	
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
		
		number100.setPreferredSize(new Dimension(48, 24));
		modifier100.setPreferredSize(new Dimension(48, 24));
		
		roll100 = new JButton("Roll");
		roll20 = new JButton("Roll");
		roll12 = new JButton("Roll");
		roll10 = new JButton("Roll");
		roll8 = new JButton("Roll");
		roll6 = new JButton("Roll");
		roll4 = new JButton("Roll");
		roll3 = new JButton("Roll");

		roll100.addActionListener(this);
		roll20.addActionListener(this);
		roll12.addActionListener(this);
		roll10.addActionListener(this);
		roll8.addActionListener(this);
		roll6.addActionListener(this);
		roll4.addActionListener(this);
		roll3.addActionListener(this);
		
		res100 = new JTextField("");
		res20 = new JTextField("");
		res12 = new JTextField("");
		res10 = new JTextField("");
		res8 = new JTextField("");
		res6 = new JTextField("");
		res4 = new JTextField("");
		res3 = new JTextField("");
		
		res100.setEditable(false);
		res20.setEditable(false);
		res12.setEditable(false);
		res10.setEditable(false);
		res8.setEditable(false);
		res6.setEditable(false);
		res4.setEditable(false);
		res3.setEditable(false);
		
		res100.setPreferredSize(new Dimension(48, 24));
		
		results = new JTextArea("The results will appear in this text field,\nwith the newest rolls on the bottom.\n--------------------");
		results.setEditable(false);
		scroll = new JScrollPane (results, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		//Add clear and reset buttons.
		clear = new JButton("Clear");
		reset = new JButton("Reset");
		
		clear.addActionListener(this);
		reset.addActionListener(this);
		
		//Add images and supplementary text.
		die100 = new JLabel("d100");
		die20 = new JLabel("d20");
		die12 = new JLabel("d12");
		die10 = new JLabel("d10");
		die8 = new JLabel("d8");
		die6 = new JLabel("d6");
		die4 = new JLabel("d4");
		die3 = new JLabel("d3");
		
		mod100 = new JLabel("+");
		mod20 = new JLabel("+");
		mod12 = new JLabel("+");
		mod10 = new JLabel("+");
		mod8 = new JLabel("+");
		mod6 = new JLabel("+");
		mod4 = new JLabel("+");
		mod3 = new JLabel("+");
		
		img100 = new JLabel();
		img20 = new JLabel();
		img12 = new JLabel();
		img10 = new JLabel();
		img8 = new JLabel();
		img6 = new JLabel();
		img4 = new JLabel();
		img3 = new JLabel();
		
		imgTitle = new JLabel("Die");
		numberTitle = new JLabel("Number");
		modifierTitle = new JLabel("Modifier");
		resTitle = new JLabel("Results");
		
		ImageIcon d100 = new ImageIcon("src/d100.jpg");
		if(d100 != null) {
			img100.setIcon(d100);
			img100.setText("");
		}
		ImageIcon d20 = new ImageIcon("src/d20.jpg");
		if(d20 != null) {
			img20.setIcon(d20);
			img20.setText("");
		}
		ImageIcon d12 = new ImageIcon("src/d12.jpg");
		if(d12 != null) {
			img12.setIcon(d12);
			img12.setText("");
		}
		ImageIcon d10 = new ImageIcon("src/d10.jpg");
		if(d10 != null) {
			img10.setIcon(d10);
			img10.setText("");
		}
		ImageIcon d8 = new ImageIcon("src/d8.jpg");
		if(d8 != null) {
			img8.setIcon(d8);
			img8.setText("");
		}
		ImageIcon d6 = new ImageIcon("src/d6.jpg");
		if(d6 != null) {
			img6.setIcon(d6);
			img6.setText("");
		}
		ImageIcon d4 = new ImageIcon("src/d4.jpg");
		if(d4 != null) {
			img4.setIcon(d4);
			img4.setText("");
		}
		ImageIcon d3 = new ImageIcon("src/d3.jpg");
		if(d3 != null) {
			img3.setIcon(d3);
			img3.setText("");
		}
		
		//Add the input and output objects to their respective containers (JPanel)
		window = new JPanel();
		inputField = new JPanel();
		outputField = new JPanel();
		
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
			res100.setText("" + total);
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll20) { //If the button for rolling the d20 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number20.getText()); j++) {
				dice += rand.nextInt(20) + 1;
			}
			int total = dice + Integer.parseInt(modifier20.getText());
			String result = number20.getText() + "d20 + " + modifier20.getText() + "\n= " + dice + " + " + modifier20.getText() + "\n= " + total + ".";
			res20.setText("" + total);
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll12) { //If the button for rolling the d12 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number12.getText()); j++) {
				dice += rand.nextInt(12) + 1;
			}
			int total = dice + Integer.parseInt(modifier12.getText());
			String result = number12.getText() + "d12 + " + modifier12.getText() + "\n= " + dice + " + " + modifier12.getText() + "\n= " + total + ".";
			res12.setText("" + total);
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll10) { //If the button for rolling the d10 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number10.getText()); j++) {
				dice += rand.nextInt(10) + 1;
			}
			int total = dice + Integer.parseInt(modifier10.getText());
			String result = number10.getText() + "d10 + " + modifier10.getText() + "\n= " + dice + " + " + modifier10.getText() + "\n= " + total + ".";
			res10.setText("" + total);
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll8) { //If the button for rolling the d8 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number8.getText()); j++) {
				dice += rand.nextInt(8) + 1;
			}
			int total = dice + Integer.parseInt(modifier8.getText());
			String result = number8.getText() + "d8 + " + modifier8.getText() + "\n= " + dice + " + " + modifier8.getText() + "\n= " + total + ".";
			res8.setText("" + total);
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll6) { //If the button for rolling the d6 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number6.getText()); j++) {
				dice += rand.nextInt(6) + 1;
			}
			int total = dice + Integer.parseInt(modifier6.getText());
			String result = number6.getText() + "d6 + " + modifier6.getText() + "\n= " + dice + " + " + modifier6.getText() + "\n= " + total + ".";
			res6.setText("" + total);
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll4) { //If the button for rolling the d4 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number4.getText()); j++) {
				dice += rand.nextInt(4) + 1;
			}
			int total = dice + Integer.parseInt(modifier4.getText());
			String result = number4.getText() + "d4 + " + modifier4.getText() + "\n= " + dice + " + " + modifier4.getText() + "\n= " + total + ".";
			res4.setText("" + total);
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == roll3) { //If the button for rolling the d3 has been pressed.
			int dice = 0;
			for(int j = 0; j < Integer.parseInt(number3.getText()); j++) {
				dice += rand.nextInt(3) + 1;
			}
			int total = dice + Integer.parseInt(modifier3.getText());
			String result = number3.getText() + "d3 + " + modifier3.getText() + "\n= " + dice + " + " + modifier3.getText() + "\n= " + total + ".";
			res3.setText("" + total);
			results.setText(results.getText() + "\n\n" + result);
		}
		if(e.getSource() == clear) { //If the button for clearing the output field has been pressed.
			results.setText("The results will appear in this text field,\nwith the newest rolls on the bottom.\n--------------------");
		}
		if(e.getSource() == reset) { //If the button for resetting the input fields has been pressed.
			number100.setText("1");
			number20.setText("1");
			number12.setText("1");
			number10.setText("1");
			number8.setText("1");
			number6.setText("1");
			number4.setText("1");
			number3.setText("1");
			
			modifier100.setText("0");
			modifier20.setText("0");
			modifier12.setText("0");
			modifier10.setText("0");
			modifier8.setText("0");
			modifier6.setText("0");
			modifier4.setText("0");
			modifier3.setText("0");
			
			res100.setText("");
			res20.setText("");
			res12.setText("");
			res10.setText("");
			res8.setText("");
			res6.setText("");
			res4.setText("");
			res3.setText("");
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
				windowLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
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
							.addComponent(imgTitle)
							.addComponent(img100)
							.addComponent(img20)
							.addComponent(img12)
							.addComponent(img10)
							.addComponent(img8)
							.addComponent(img6)
							.addComponent(img4)
							.addComponent(img3))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(numberTitle)
							.addComponent(number100)
							.addComponent(number20)
							.addComponent(number12)
							.addComponent(number10)
							.addComponent(number8)
							.addComponent(number6)
							.addComponent(number4)
							.addComponent(number3))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(die100)
							.addComponent(die20)
							.addComponent(die12)
							.addComponent(die10)
							.addComponent(die8)
							.addComponent(die6)
							.addComponent(die4)
							.addComponent(die3))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(mod100)
							.addComponent(mod20)
							.addComponent(mod12)
							.addComponent(mod10)
							.addComponent(mod8)
							.addComponent(mod6)
							.addComponent(mod4)
							.addComponent(mod3))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(modifierTitle)
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
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(resTitle)
							.addComponent(res100)
							.addComponent(res20)
							.addComponent(res12)
							.addComponent(res10)
							.addComponent(res8)
							.addComponent(res6)
							.addComponent(res4)
							.addComponent(res3))
		);
		inputLayout.setVerticalGroup(
				inputLayout.createSequentialGroup()
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(imgTitle)
							.addComponent(numberTitle)
							.addComponent(modifierTitle)
							.addComponent(resTitle))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(img100)
							.addComponent(number100)
							.addComponent(die100)
							.addComponent(mod100)
							.addComponent(modifier100)
							.addComponent(roll100)
							.addComponent(res100))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(img20)
							.addComponent(number20)
							.addComponent(die20)
							.addComponent(mod20)
							.addComponent(modifier20)
							.addComponent(roll20)
							.addComponent(res20))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(img12)
							.addComponent(number12)
							.addComponent(die12)
							.addComponent(mod12)
							.addComponent(modifier12)
							.addComponent(roll12)
							.addComponent(res12))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(img10)
							.addComponent(number10)
							.addComponent(die10)
							.addComponent(mod10)
							.addComponent(modifier10)
							.addComponent(roll10)
							.addComponent(res10))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(img8)
							.addComponent(number8)
							.addComponent(die8)
							.addComponent(mod8)
							.addComponent(modifier8)
							.addComponent(roll8)
							.addComponent(res8))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(img6)
							.addComponent(number6)
							.addComponent(die6)
							.addComponent(mod6)
							.addComponent(modifier6)
							.addComponent(roll6)
							.addComponent(res6))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(img4)
							.addComponent(number4)
							.addComponent(die4)
							.addComponent(mod4)
							.addComponent(modifier4)
							.addComponent(roll4)
							.addComponent(res4))
					.addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(img3)
							.addComponent(number3)
							.addComponent(die3)
							.addComponent(mod3)
							.addComponent(modifier3)
							.addComponent(roll3)
							.addComponent(res3))
		);
		
		//Organize the output layout
		GroupLayout outputLayout = new GroupLayout(outputField);
		outputField.setLayout(outputLayout);
		outputLayout.setAutoCreateGaps(true);
		outputLayout.setAutoCreateContainerGaps(true);
		outputLayout.setHorizontalGroup(
				outputLayout.createParallelGroup()
					.addComponent(scroll)
					.addGroup(outputLayout.createSequentialGroup()
							.addComponent(reset)
							.addContainerGap(82, 82)
							.addComponent(clear))
		);
		outputLayout.setVerticalGroup(
				outputLayout.createSequentialGroup()
					.addComponent(scroll)
					.addGroup(outputLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(reset)
							.addComponent(clear))
		);
	}
}
