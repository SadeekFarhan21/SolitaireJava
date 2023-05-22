
import java.awt.*;
import javax.swing.*;

public class Card {
	
	public static String cardBackFileName = "back001", cardOutlineFilename = "bottom01";
	public static String directory = "cards", extension = ".gif";
	private Image im;
    private int value;
    private String suit;

    public Card(int value, Suit suit){
        this.value = value;
        switch(suit){
            case Clubs:
                this.suit = "c";
                break;
            case Spades:
                this.suit = "s";
                break;
            case Diamonds:
                this.suit = "d";
                break;
            case Hearts:
                this.suit = "h"; 
        }
    }
	
    @Override
    public String toString(){
        return value + " of" + suit;
    }


    public static Image getCardOutline(){
        ImageIcon ii = new ImageIcon(Card.class.getResource(directory + "/" + cardOutlineFilename + extension));
		Image image = ii.getImage();
		return image;
    }


	public static Image getCardBack() {
		ImageIcon ii = new ImageIcon(Card.class.getResource(directory + "/" + cardBackFileName + extension));
		Image image = ii.getImage();
		return image;
	}
}
