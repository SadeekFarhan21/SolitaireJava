import javax.swing.*;
import java.util.*;

public class Pile extends JPanel {
	
	// Variables
	protected int x, y;
	protected Stack <Card> cards;
	
	// Constructor
	public Pile(int x, int y) {
		super.setLocation(x, y);
		cards = new Stack<>();
	}

	public void push(Card someCard){
		this.cards.push(someCard);
	}

	public boolean isEmpty(){
		return this.cards.isEmpty();
	}

}
