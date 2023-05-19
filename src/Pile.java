import javax.swing.*;
import java.util.*;
// import java.awt.*;

public abstract class Pile extends JPanel {
    protected int x, y; // P
    protected Stack <Card> cards; // Stack of cards

    // Constructor for the Pile class
    public Pile(int x, int y){
        super.setLocation(x, y);
        cards = new Stack<>();
    }


    public Card pop(){
        try {
            return cards.pop();
        } catch(EmptyStackException ese){
            return null;
        }
        
    }

    public Card topCard(){
        if(!this.cards.isEmpty()){
            return this.cards.peek();
        }
        return null;
        
    }
    // Checks if the stack is empty
    public boolean isEmpty(){
        return this.cards.isEmpty();
    }

    // Adds a card to the stack
    public void push(Card someCard){
        this.cards.push(someCard);
    }

}
