package Test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Graf extends JFrame {

	public void paint(Graphics g) {

		int[] ar = new int[100];
//
//		int ii = ar[10];
//		g.drawArc(0, 0, ii, ii, ii, ii);
		
//		

		g.setColor(Color.RED);
		for (int x = 0; x < getWidth(); x++) {
			int y = (int) (10 * Math.sin(Math.sqrt(x)))+ getHeight()/2;
			g.fillOval(x, y, 2, 2);
		}
	}

}
