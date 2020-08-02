import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
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
	void updateMenuState() {  
		
	}
	void updateGameState() {  
		
	}
	void updateEndState()  { 
		
	}

void drawMenuState(Graphics g) {  
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, Tylerstache.WIDTH, Tylerstache.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("GAME", 25, 100);
	g.setFont(somethingFont);
	g.setColor(Color.YELLOW);
	g.drawString("Press Enter to Start", 100, 400);
	g.setFont(somethingFont);
	g.setColor(Color.YELLOW);
	g.drawString("Press Space to See Instructions", 50, 600);
}
void drawGameState(Graphics g) {  
	
	
	
}
void drawEndState(Graphics g)  {
	g.setColor(Color.RED);
	g.fillRect(0, 0, Tylerstache.WIDTH, Tylerstache.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("GAME OVER", 25, 100);
	g.setFont(somethingFont);
	g.setColor(Color.YELLOW);
	g.drawString("You Killed Enemies", 50, 400);
	g.setColor(Color.YELLOW);
	g.drawString("Press Enter to Restart", 50, 600);
	
}
public void paintComponent(Graphics g){
	if(currentState == MENU){
	    drawMenuState(g);
	}else if(currentState == GAME){
	   drawGameState(g);
	}else if(currentState == END){
	    drawEndState(g);
	}
	

}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}