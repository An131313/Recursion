package multi.bouncy;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.PriorityQueue;

import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JPanel;

public class BallPanel extends JPanel {
	private int delay = 10;
	private PriorityQueue<Ball> list = new PriorityQueue<Ball>();
//	private ArrayList<Ball> list = new ArrayList<Ball>();
// Create a timer with the initial delay
	protected Timer timer = new Timer(delay, new TimerListener());

	private class TimerListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	public BallPanel() {
		setBackground(Color.BLACK);
		timer.start();
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				for(Ball nextBall : list) {
					// Ball nextBall = (Ball) list.get(j);
					double distance = BallPanel.distance( x, y, nextBall.x, nextBall.y);
					
					if(nextBall.radius >= distance) {
						list.remove(nextBall);
						break;
					}
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	public void add() {
		list.add(new Ball());
	}

	public void subtract() {
		System.out.println("before removal:");
		for(Ball ball : list) {
			System.out.println(ball.radius);
		}
		
		if (list.size() > 0)
			list.remove(); // Remove the last ball
		
		System.out.println("after removal:");
		for(Ball ball : list) {
			System.out.println(ball.radius);
		}
	
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Ball ball : list) {
			//Ball ball = (Ball) list.get(i); // Get a ball
			g.setColor(ball.color); // Set ball color
			// Check boundaries
			if (ball.x < 0 || ball.x > getWidth())
				ball.dx = -ball.dx;
			if (ball.y < 0 || ball.y > getHeight())
				ball.dy = -ball.dy;
			// Adjust ball position
			ball.x += ball.dx;
			ball.y += ball.dy;
			g.fillOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);
		}
		
		ArrayList<Ball> ballsToRemove = new ArrayList<>();
		for (Ball ball : list) {//all
			//Ball ball = (Ball) list.get(i);
			for(Ball nextBall : list) {//int j = i + 1; j < list.size(); j++  every ball after the one on which we are now
				//Ball nextBall = (Ball) list.get(j);
				if (nextBall != ball && !ballsToRemove.contains(ball)) {
				int radiusSum = ball.radius + nextBall.radius;
				//System.out.println(radiusSum);
				double distance = BallPanel.distance(ball.x, ball.y, nextBall.x, nextBall.y);
				//System.out.println(distance);
				
				if(radiusSum >= distance) {
					ballsToRemove.add(nextBall);//doesn't remove them while going through the arrayLiast
				    ball.radius += nextBall.radius;
				    //System.out.println(ball.radius);
				}
				
			    }
		   }	
		}
		list.removeAll(ballsToRemove);
	}

	public static double distance( int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));//the distance between points
	}
	
	public void suspend() {
		timer.stop();
	}

	public void resume() {
		timer.start();
	}

	public void setDelay(int delay) {
		this.delay = delay;
		timer.setDelay(delay);
	}
}
