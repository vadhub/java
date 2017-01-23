package numbrsFunction;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Numbrs {

	// function
	public double num(double x) {
		double y = x * x;
		return y;
	}

	public void arr() {

		ArrayList<Double> listDotsY = new ArrayList<Double>();
		ArrayList<Double> listDotsX = new ArrayList<Double>();

		JFrame frame = new JFrame("Function");
		JFrame rez = new JFrame();
		JFrame graf = new JFrame();

		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JTextArea txt = new JTextArea(10, 6);
		txt.setBackground(Color.lightGray);
		// font - shrift
		Font f = new Font("SERIF", 10, 20);
		txt.setFont(f);

		JTextField corX = new JTextField(10);

		JLabel label = new JLabel("Enter X");
		JButton btn1 = new JButton("consider");
		JButton btngraf = new JButton("create Function");

		frame.setLayout(new FlowLayout());
		rez.setLayout(new FlowLayout());

		panel2.add(txt);

		panel.add(label);
		panel.add(corX);
		panel.add(btn1);
		panel.add(btngraf);

		graf.setSize(300, 300);
		graf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graf.setLocation(700, 500);

		frame.add(panel);
		rez.add(panel2);

		rez.setBackground(Color.LIGHT_GRAY);
		rez.setSize(200, 50);
		rez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setBackground(Color.black);
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 400);
		frame.pack();

		rez.pack();
		rez.setLocation(300, 400);

		// create graf

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel contentPane = null;
				if (!corX.getText().equals("c")) {

					contentPane = new JPanel() {
						Graphics2D g2;

						protected void paintComponent(Graphics g) {
							super.paintComponent(g);
							g2 = (Graphics2D) g;
							g2.setColor(Color.orange);
							for (int i = 0; i < listDotsX.size(); i++) {
								Double xP = listDotsX.get(i);
								Double yP = listDotsY.get(i);
								g.setColor(Color.BLUE);
								g.fillRect(xP.intValue(), yP.intValue(), 4, 4);
								System.out.println(listDotsX.get(i));
							}
						};
					};

					Double num1 = Double.parseDouble(corX.getText());
					Double x2 = num(num1);
					listDotsY.add(x2);
					listDotsX.add(num1);
					graf.add(contentPane);

				} else if (corX.getText().equals("c")) {

					txt.setText("   x || y" + "\n");

					for (int i = 0; i < listDotsY.size(); i++) {
						String str = Double.toString(listDotsY.get(i));
						String str2 = Double.toString(listDotsX.get(i));

						txt.append(str2 + " || " + str);
						txt.append("\n");

						rez.setVisible(true);
					}

					listDotsX.removeAll(listDotsX);
					listDotsY.removeAll(listDotsY);
				}
				corX.setText(null);

			}
		});

		btngraf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				graf.setVisible(true);

			}
		});

	}
}
