package ru.vad.round;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ru.vad.actionlistener.ButtonListener;

public class Round {

	

	Graphics2D g2;

	JFrame frame;

	private static int              x= 395;// on round point x

	private static int              y=188;// on round point y

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Round.x = x;
	}

	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		Round.y = y;
	}

	public void frontend() {

		frame = new JFrame();		
		JButton left = new JButton("<");

		JTextField text_deg = new JTextField(4);
		JTextField rad_txt = new JTextField(4);
		
		left.addActionListener(new ButtonListener(frame,left,getX(),getY()));
		
		
		frame.setLayout(new BorderLayout());

		JLabel deg = new JLabel("Градусы");
		JLabel rad = new JLabel("Радианы");

		Choice all_trigeometry = new Choice();

		JPanel for_value = new JPanel();

		JPanel for_round = new JPanel() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -6861349270142981947L;

			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g2 = (Graphics2D) g;
				
				for (int i = 0; i < 500; i = i + 20) {
					g2.setColor(Color.LIGHT_GRAY);
					g2.drawLine(i, 500, i, 0);
					g2.drawLine(500, i, 0, i);

				}
				g2.setColor(Color.BLACK);
				g2.drawOval(100, 50, 300, 300);
				g2.drawLine(430, 190, 70, 190);
				g2.drawLine(250, 380, 250, 10);
				g2.fillRect(x,y, 10, 10);// x=395 y=188

			}
		};

		for_value.add(left);
		for_value.add(deg);
		for_value.add(text_deg);
		for_value.add(rad);
		for_value.add(rad_txt);	
		for_value.add(all_trigeometry);

		all_trigeometry.add("sin");
		all_trigeometry.add("cos");
		all_trigeometry.add("tg");

		frame.add(for_value, "South");
		frame.add(for_round,"Center");
		for_value.setBackground(Color.lightGray);
		for_round.setBackground(Color.white);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Round Pi");
		frame.setLocation(500, 400);
		frame.setSize(500, 500);

	}
	
	//
	// static public double sinn(double sin) {
	// return sin = Math.sin(sin * Math.PI / 180);
	// }
	//
	// static public double cosn(double cos) {
	// return cos = Math.cos(cos * Math.PI / 180);
	// }
	//
	// static public double tgen(double tg) {
	// return tg = Math.tan(tg * Math.PI / 180);
	// }

}
