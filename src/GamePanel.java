import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel {
	JPanel p = new JPanel();
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont;
	Font somethingFont;
	Timer frameDraw;


	GamePanel(){
	titleFont = new Font("Arial", Font.PLAIN, 48);
	somethingFont = new Font("Arial", Font.PLAIN, 30);
	frameDraw = new Timer(1000/60,this);
	frameDraw.start();
}
}