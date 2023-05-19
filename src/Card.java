import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Card {
    public static String cardBackFilename = "back001";
    public static String directory = "", extension = ".gif";
    private Image im;
    private String suit;
    private int value;

    public Card(int value, Suit suit){
        this.value = value;
        switch(suit){
            case Clubs:
                this.suit = "c";
                break;
            case Diamonds:
                this.suit = "d";
                break; 
            case Spades:
                this.suit = "s";
                break;
            case Hearts:
                this.suit = "d";
        }
    }

    @Override
    public String toString(){
        return value + " " + suit;
    }

    public static Image getCardBack(){
        ImageIcon ii = new ImageIcon(
            Card.class.getResource(directory + "/" + cardBackFilename + extension)
        );
        Image image = ii.getImage();
        return image;
    }
}
