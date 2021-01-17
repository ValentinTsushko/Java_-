package grafical_calc;

import java.awt.*;
import javax.swing.*;

public class graf{
	//JFrame frame = new JFrame();
	JPanel panel1;
    public JPanel go() {
        //frame.setBounds(0, 0,40,50);
        //frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel(){
            Graphics2D g2;

            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g2 = (Graphics2D)g;
                g2.setColor(Color.red);
                g2.fillOval(20, 20, 9, 10);
            }
        };
		panel1.setBackground(Color.black);
        //frame.setContentPane(panel1);
		//frame.getContentPane().add(BorderLayout.EAST, panel);
		return panel1;
    }
}
