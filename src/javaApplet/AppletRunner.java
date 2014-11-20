package javaApplet;

import javax.swing.*;

/**
 * Runs the applet in which the game is run.
 * @author Erik Martin
 * @version November 20, 2014
 */
public class AppletRunner extends JApplet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Called when this applet is loaded into the browser.
	 */
	public void init() {
		//Execute a job on the event-dispatching thread; creating this applet's GUI.
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					JLabel label = new JLabel("Hello World");
					add(label);
				}
			});
		} catch (Exception e) {
			System.err.println("createGUI didn't complete successfully");
		}
	}
	
}
