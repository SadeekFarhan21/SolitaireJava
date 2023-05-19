import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Card {
    public static String cardBackFilename = "back001";
    public static String extension = ".gif";
    private Image im;
    private String suit;
    private int value;
    private int rank;

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
        this.rank = value;
    }

    @Override
    public String toString(){
        return value + " " + suit;
    }

    public static Image getCardBack(){
        ImageIcon ii = new ImageIcon(
            Card.class.getResource("/" + cardBackFilename + extension)
        );
        Image image = ii.getImage();
        return image;
    }

    public int getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }


    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Card card = (Card) o;
        if(value != card.value){
            return false;
        }
        return suit.equals(card.suit);



    }
}
