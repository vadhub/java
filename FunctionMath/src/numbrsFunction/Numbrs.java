package numbrsFunction;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Numbrs {

	// functions
	public int parab(int x, int n) {
		int y = x * x + n;
		return y;
	}

	public int pryam(int x, int n) {
		int y1 = x / n;
		return y1;
	}

	public double sinus(double x, double n) {
		double y2 = Math.sin(n)+Math.sin(x);
		return y2;
	}

	public void arr() {

		// list formul

		String stn1 = "y=x^2+n";
		String stn2 = "y=x/n";
		String stn3 = "sin(a+x)";
		String consider = "consider";

		// list Dots

		ArrayList<Integer> listDotsY = new ArrayList<Integer>();
		ArrayList<Integer> listDotsX = new ArrayList<Integer>();

		JFrame frame = new JFrame("Function");
		JFrame rez = new JFrame();

		Choice ch = new Choice();

		// add formul

		ch.add(stn1);
		ch.add(stn2);
		ch.add(stn3);
		ch.add(consider);

		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		JTextArea txt = new JTextArea(10, 6);
		txt.setBackground(Color.lightGray);

		// font - shrift

		Font f = new Font("SERIF", 10, 20);
		txt.setFont(f);

		JTextField corX = new JTextField(10);
		JTextField corN = new JTextField(10);

		JLabel label = new JLabel("Enter X");
		JButton btn1 = new JButton("consider");

		frame.setLayout(new BorderLayout());
		rez.setLayout(new FlowLayout());

		panel2.add(txt);

		panel.add(label);
		panel.add(corX);
		panel.add(btn1);

		panel3.add(ch);
		panel3.add(corN);

		frame.add(panel, "North");
		frame.add(panel3, "South");

		rez.add(panel2);

		rez.setSize(200, 50);
		rez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 400);
		frame.pack();

		rez.pack();
		rez.setLocation(300, 400);

		corX.setText("Enter here");
		corN.setText("Enter here");
		
		corX.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent mr) {
				corX.setText("");
			}
		});
		
		corN.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent mr) {
				corN.setText("");
			}
		});

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// function x^2

				if (ch.getSelectedIndex() == 0) {

					int num1 = Integer.parseInt(corX.getText());
					int num2 = Integer.parseInt(corN.getText());
					int x2 = parab(num1, num2);
					listDotsY.add(x2);
					listDotsX.add(num1);

				} else if (ch.getSelectedIndex() == 1) {

					// function x/n

					int num1 = Integer.parseInt(corX.getText());
					int num2 = Integer.parseInt(corN.getText());
					int x2 = pryam(num1, num2);
					listDotsY.add(x2);
					listDotsX.add(num1);

				} else if (ch.getSelectedIndex() == 2) {

					Double num1 = Double.parseDouble(corX.getText());
					Double num2 = Double.parseDouble(corN.getText());
					Double x2 = sinus(num1.intValue(), num2.intValue());					
					listDotsY.add(x2.intValue());
					listDotsX.add(num1.intValue());

				} else if (ch.getSelectedIndex() == 3) {

					txt.setText("   x || y" + "\n");

					for (int i = 0; i < listDotsY.size(); i++) {
						String str = Double.toString(listDotsY.get(i));
						String str2 = Double.toString(listDotsX.get(i));

						txt.append(str2 + " || " + str);
						txt.append("\n");

					}
					rez.setVisible(true);

					listDotsX.removeAll(listDotsX);
					listDotsY.removeAll(listDotsY);
				}

				corX.setText(null);
				corN.setText(null);

			}
		});

	}
}
