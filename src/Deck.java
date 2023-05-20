import java.awt.*;
import javax.swing.*;

public class Deck extends Pile {

	
	// Constructor
	public Deck(int x, int y) {
		super(x, y);
		super.setSize(72, 96);
		for(Suit suit : Suit.values()){
			for(int i = 1; i <= 13; ++i){
				Card card = new Card(i, suit);
				push(card);
				System.out.println("Pushed into deck " + card);
			}
		}
	}
	
	
	// Methods
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.WHITE);
		g2d.drawRect(0, 0, 72, this.getHeight());
		
		g.drawImage(Card.getCardBack(), 0, 0, 72, this.getHeight(), this);
	}	
}
