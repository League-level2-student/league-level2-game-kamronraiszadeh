import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * first class would be a class displaying the rules and how to play then space bar to start (copy and paste league invaders)
 * person running class includes arrow keys 
 * obstacles class some on the ground and some in the air
 * class at end where it tells u ur score
 */
public class Tylerstache {
	public static final int WIDTH=500;
	public static final int HEIGHT = 800;
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JTextField t = new JTextField();
	
	

void setup (){
	f.setSize(WIDTH,HEIGHT);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}