package multi.bouncy;

import java.awt.Color;

public class Ball implements Comparable<Ball>{
	int x = 0;
	int y = 0; // Current ball position
	int dx = (int) (Math.random() * 9); // Increment on ball's x-coordinate
	int dy = (int) (Math.random() * 9); // Increment on ball's y-coordinate
	int radius = (int) (Math.random() * ( 20 - 2)) + 2;; // Ball radius
	int blueAndRed = (int) (Math.random() * 204);
	Color color = new Color(blueAndRed, (int) (Math.random() * (255-179) + 179) , blueAndRed);
	
	@Override
	public int compareTo(Ball o) {
		// TODO Auto-generated method stub
//		return radius - o.radius; //o - the ball with which we compare the first one
		//public int compareTo(Ball o) {
			if (radius > o.radius)
				return -1;
			else if (radius < o.radius)
				return 1;
			else
				return 0;
		}
	}
	
