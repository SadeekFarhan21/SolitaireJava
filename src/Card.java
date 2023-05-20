
import java.awt.*;
import javax.swing.*;

public class Card {
	
	public static String cardBackFileName = "back001";
	public static String directory = "cards", extension = ".gif";
	private Image im;
	
	public static Image getCardBack() {
		ImageIcon ii = new ImageIcon(Card.class.getResource(directory + "/" + cardBackFileName + extension));
		Image image = ii.getImage();
		return image;
	}
}
