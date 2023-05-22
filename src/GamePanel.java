// Libraries for the program
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
	
	
	// Variables
	private static int DECK_OFFSET = 500;
	protected static int XShift = 80;
	private static Deck deck;
	private static Waste waste;
	
	// Constructor
	public GamePanel() {
		super.setLayout(null);
		initializePiles();
	}
	

	private void initializePiles(){
		deck = new Deck(DECK_OFFSET, 20);
		add(deck);
		waste = new Waste(DECK_OFFSET - XShift, 20);
		add(waste);
	}
	
	// Methods
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}