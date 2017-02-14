package ru.vad.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import ru.vad.round.Round;

public class ButtonListener implements ActionListener {

	JFrame fr = new JFrame();
	JButton btn = new JButton();

	int x;
	int y;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			
			if(y<=48){				
				x = (int) (x-y*Math.PI/180);
				y = y + 10;
			}else if(y>48){
				x = (int) (x -y*Math.PI/180);
				y = y - 10;
			}

			Round.setX(x);
			Round.setY(y);

			fr.repaint();

			System.out.println(Round.getX() + " " + Round.getY());

		}
	}

	public ButtonListener(JFrame fr, JButton btn, int x, int y) {
		this.fr = fr;
		this.btn = btn;

		this.x = x;
		this.y = y;
	}

}
