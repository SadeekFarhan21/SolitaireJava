import java.awt.*;
import javax.swing.*;

public class Solitaire extends JFrame {
	
	// Variables for the program
	static protected GamePanel gamePanel;
	public static final int PANEL_WIDTH = 640, PANEL_HEIGHT = 500;
	
	// Constructor
	public Solitaire() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamePanel = new GamePanel();
		gamePanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		add(gamePanel);
		pack();
	}
	
	// Methods
	public static void main(String[] args) {
		new Solitaire().setVisible(true);
	}
}
