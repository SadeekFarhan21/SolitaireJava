import javax.swing.*;
import java.awt.*;

public class Pile extends JPanel {
    protected int x, y;

    public Pile(int x, int y){
        super.setLocation(x, y);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(0, 0, this.getWidth(), this.getHeight());
    }
}
