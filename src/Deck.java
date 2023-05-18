import java.awt.*;

public class Deck extends Pile {
    public Deck(int x, int y){
        super(x, y);
        super.setSize(72, 96);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.WHITE);
        g2d.drawRect(0, 0, 72, this.getHeight());

    }
}