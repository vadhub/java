package Run;

import java.awt.*;

import javax.swing.*;

public class g {
	public void m(){
	JFrame frame=new JFrame("Test");
    frame.setBounds(0, 0,400,500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel contentPane = new JPanel(){
        Graphics2D g2;

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g2=(Graphics2D)g;
            g2.setColor(Color.orange);
            int[] yPoints = new int[7];
			int[] xPoints = new int[7];
			int nPoints = 7;
			g2.drawPolygon(xPoints, yPoints, nPoints);
			
			
    };
    };
    
    frame.setContentPane(contentPane);
}
}
