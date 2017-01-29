package Test;

import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class choice {
	public void cho() {
		JFrame frame = new JFrame();
		Choice c = new Choice();
		JButton bt = new JButton("enter");
		Choice c1 = new Choice();

		int[] in = new int[10];

		for (int i = 0; i < in.length; i++) {
			int f = in[i] = i;
			String str = Integer.toString(f);
			c.add(str);
		}

		String str = "x^2";
		String str1 = "1/2";

		c1.add(str);
		c1.add(str1);
		c1.add("x+2");

		frame.setLayout(new GridLayout());

		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (c1.getSelectedIndex() == 0) {
					
					JOptionPane.showMessageDialog(frame, str);
					
				} else if (c1.getSelectedIndex() == 1) {
					
					JOptionPane.showMessageDialog(frame, str1);
				} else if(c1.getSelectedIndex()== 2){
					JOptionPane.showMessageDialog(frame, c1.getItem(2));
				}
				System.out.println(c1.getSelectedIndex());
			}
		});

		frame.add(c1);
		frame.add(bt);
		frame.setSize(300, 300);
		frame.setLocation(500, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
