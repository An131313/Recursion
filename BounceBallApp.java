package multi.bouncy;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;

public class BounceBallApp {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("J:\\.Projects\\EDITED PICTURES\\green Rowan.jpg"));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.WHITE);
		frame.setSize(1024, 800);
		BallControl ballControl = new BallControl();
		ballControl.setBackground(Color.BLACK);
		frame.getContentPane().add(ballControl);
		frame.setTitle("Bouncy");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
