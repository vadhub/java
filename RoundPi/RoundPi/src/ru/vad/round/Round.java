package ru.vad.round;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Round extends JFrame {

	public void frontend() {
		JButton cons = new JButton("consider");

		JTextField text_deg = new JTextField(4);
		JTextField rad_txt = new JTextField(4);

		setLayout(new BorderLayout());

		JTextField input = new JTextField(4);

		JLabel deg = new JLabel("�������");
		JLabel rad = new JLabel("�������");

		Choice all_trigeometry = new Choice();

		JPanel for_value = new JPanel();
		JPanel for_round = new JPanel();

		for_value.add(deg);
		for_value.add(text_deg);
		for_value.add(rad);
		for_value.add(rad_txt);
		for_value.add(all_trigeometry);

		for_round.add(input);
		for_round.add(cons);

		all_trigeometry.add("sin");
		all_trigeometry.add("cos");
		all_trigeometry.add("tg");		

		add(for_value, "North");
		add(for_round, "South");

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Round Pi");
		setLocation(500, 400);
		pack();
		
		

		class listener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (all_trigeometry.getSelectedIndex() == 0) {					
					double f = sinn(Double.parseDouble(input.getText()));
					double r = (double) Math.round(f*10000)/10000;
					text_deg.setText(Double.toString(r));
										
				} else if (all_trigeometry.getSelectedIndex() == 1) {
					
					double f = cosn(Double.parseDouble(input.getText()));
					double r = (double) Math.round(f*10000)/10000;
					text_deg.setText(Double.toString(r));						
					
				} else if (all_trigeometry.getSelectedIndex() == 2) {
					
					double f = tgen(Double.parseDouble(input.getText()));
					double r = (double) Math.round(f*10000)/10000;
					text_deg.setText(Double.toString(r));				
					
				}
			}

		}
		
		cons.addActionListener(new listener());

	};

	static public double sinn(double sin) {
		return sin = Math.sin(sin*Math.PI/180);
	}

	static public double cosn(double cos) {
		return cos = Math.cos(cos*Math.PI/180);
	}

	static public double tgen(double tg) {
		return tg = Math.tan(tg*Math.PI/180);
	}

}
