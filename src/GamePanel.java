import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {

    private static Deck deck;

    public GamePanel(){
        super.setLayout(null);
        deck = new Deck(500, 20);
        add(deck);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}