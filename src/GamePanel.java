// Libraries for the program
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
	
	
	// Variables
	private static Deck deck;
	
	
	// Constructor
	public GamePanel() {
		super.setLayout(null);
		deck = new Deck(500, 20);
		add(deck);
	}
	
	
	// Methods
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}