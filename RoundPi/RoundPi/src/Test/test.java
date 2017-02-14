package Test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test {
	public void fr() {
		JFrame frame = new JFrame();
		JPanel for_round = new JPanel() {

			int[] ae = new int[300];

			protected void paintComponent(Graphics g) {
				Graphics2D g2;
				super.paintComponent(g);
				g2 = (Graphics2D) g;
				g2.setColor(Color.black);
				Polygon p = new Polygon();
//				p.addPoint(100,150);
//				p.addPoint(200,150);
//				p.addPoint(100,100);			
				g.drawPolygon(p);

			}

		};
		frame.setLayout(new GridLayout());
		frame.setVisible(true);
		frame.getContentPane().add(for_round);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);

		frame.setLocation(400, 500);
	}
}
