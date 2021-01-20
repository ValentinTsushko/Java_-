package grafical_calc;

import java.awt.*;
import javax.swing.*;

public class graf extends JPanel{
	JPanel panel1;
    //public JPanel go(String funk) {
	public JPanel go() {
		int x = 0;
		int y = 0;
		panel1 = new JPanel();
        Graphics2D g2;
		
		for(int i = (int)(-1 * 2 * Math.PI); i <= (int)(2 * Math.PI); i++){
			x = i;
			y = (int)Math.sin(36 * x + x);

			g2.setColor(Color.red);
			g2.fillOval(x, y, 9, 10);
			panel1.paint(g2);
			super.paintComponent(g2);
		}
		
		panel1.setBackground(Color.black);
        //frame.setContentPane(panel1);
		//frame.getContentPane().add(BorderLayout.EAST, panel);
		return panel1;

}
}
