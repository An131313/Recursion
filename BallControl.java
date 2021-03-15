package multi.bouncy;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class BallControl extends JPanel {
	private BallPanel ballPanel = new BallPanel();
	private JButton jbtSuspend = new JButton("Suspend");
	private JButton jbtResume = new JButton("Resume");
	private JButton jbtAdd = new JButton("+1");
	private JButton jbtSubtract = new JButton("-1");
	private JScrollBar jsbDelay = new JScrollBar();

	public BallControl() {
		// Group buttons in a panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		jbtSuspend.setBackground(Color.GREEN);
		panel.add(jbtSuspend);
		jbtResume.setBackground(Color.GREEN);
		panel.add(jbtResume);
		jbtAdd.setBackground(Color.GREEN);
		panel.add(jbtAdd);
		jbtSubtract.setBackground(Color.GREEN);
		panel.add(jbtSubtract);
		ballPanel.setBackground(Color.BLACK);
		// Add ball and buttons to the panel
		ballPanel.setBorder(new LineBorder(Color.GREEN));
		jsbDelay.setValue(90);
		jsbDelay.setForeground(Color.BLACK);
		jsbDelay.setBackground(Color.GREEN);
		jsbDelay.setOrientation(JScrollBar.HORIZONTAL);
		ballPanel.setDelay(jsbDelay.getMaximum());
		setLayout(new BorderLayout());
		add(jsbDelay, BorderLayout.NORTH);
		add(ballPanel, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		// Register listeners
		jbtSuspend.addActionListener(new Listener());
		jbtResume.addActionListener(new Listener());
		jbtAdd.addActionListener(new Listener());
		jbtSubtract.addActionListener(new Listener());
		jsbDelay.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				ballPanel.setDelay(jsbDelay.getMaximum() - e.getValue());
			}
		});
	}

	class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jbtSuspend)
				ballPanel.suspend();
			else if (e.getSource() == jbtResume)
				ballPanel.resume();
			else if (e.getSource() == jbtAdd)
				ballPanel.add();
			else if (e.getSource() == jbtSubtract)
				ballPanel.subtract();
		}
	}
}
