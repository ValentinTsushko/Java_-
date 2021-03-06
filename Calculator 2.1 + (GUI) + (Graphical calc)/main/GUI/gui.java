package GUI;

import java.io.*;
import plus.*;
import last.*;
import minus.*;
import Scanner.*;
import grafical_calc.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui implements ActionListener{
	JTextField field = new JTextField(100);
	JTextField field_funk = new JTextField(100);
	JTextField field_pred_a = new JTextField(100);
	JTextField field_pred_b = new JTextField(100);
	JTextArea text;
	JButton button_main;
	JButton button_right;
	JButton button_left;
	int right = 35;

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button_main){
				Scann sc = new Scann();
				System.out.println("OK");
				String tmp = field.getText();
				sc.takeLine(tmp);
				double t = sc.view_oper(sc);
				tmp = Double.toString(t);

				text.append("\n Ok \n");
				text.append(tmp);
				
				/*
				graf graf_function = new graf();
				tmp = field_funk.getText();
				graf_function.go(tmp);
				*/
		}
		else if(e.getSource() == button_right){
			right++;
		}
		else if(e.getSource() == button_left){
			right--;
		}
	}	
	
	public void go(){
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//  panelka
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		
		//  text pole
		field.setText("Your's virajenie");
		System.out.print(field.getText());
		field.selectAll();

		
		//  text pole dla funkciu
		field_funk.setText("Your's function");
		//System.out.print(field_funk.getText());
		field_funk.selectAll();
		//field_funk.setPreferredSize(new Dimension(100, 6));
		
		//  text pole dla predela a
		field_pred_a.setText("Your's limit a");
		//System.out.print(field_pred_a.getText());
		field_pred_a.selectAll();
		
		//  text pole dla predela b
		field_pred_b.setText("Your's limit b");
		//System.out.print(field_pred_b.getText());
		field_pred_b.selectAll();
		
		panel.add(field_funk);
		panel.add(field_pred_a);
		panel.add(field_pred_b);
		
		//  vivod texta
		text = new JTextArea(10, right);
		text.setLineWrap(true); // perenos text
		text.setPreferredSize(new Dimension(400, 400));
		panel.add(text);

		//  vivod
		JScrollPane scroller = new JScrollPane(text); //  peredaem obl. text
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//  knopka
		button_main = new JButton("Do it!");
		button_main.setSize(100, 10);
		button_main.addActionListener(this);
		
		button_left = new JButton("<---");
		button_left.setSize(100, 100);
		button_left.addActionListener(this);
		panel.add(button_left);
		button_left.setMargin(new Insets(10, 10, 10, 10));
		
		button_right = new JButton("--->");
		button_right.setSize(100, 100);
		button_right.addActionListener(this);
		panel.add(button_right);
		button_right.setMargin(new Insets(10, 10, 10, 10));
		

		//  otobrajenie
		graf g = new graf();
		JPanel panel1 = g.go();
		frame.getContentPane().add(BorderLayout.WEST, panel);
		frame.getContentPane().add(BorderLayout.NORTH, field);
		frame.getContentPane().add(BorderLayout.SOUTH, button_main);
		frame.getContentPane().add(BorderLayout.CENTER, panel1);
		frame.setSize(700, 350);
		frame.setVisible(true);
	}
}
