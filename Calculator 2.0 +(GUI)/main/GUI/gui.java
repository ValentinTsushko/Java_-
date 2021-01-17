package GUI;

import java.io.*;
import plus.*;
import last.*;
import minus.*;
import Scanner.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui implements ActionListener{
	JTextField field = new JTextField(100);
	JTextArea text;

	public void actionPerformed(ActionEvent e){
		Scann sc = new Scann();
		System.out.println("OK");
		String tmp = field.getText();
		sc.takeLine(tmp);
		double t = sc.view_oper(sc);
		tmp = Double.toString(t);

		text.append("\n Ok \n");
		text.append(tmp);
	}	
	
	public void go(){
		JFrame frame = new JFrame();
		//  panelka
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		
		//  text pole
		field.setText("Your's virajenie");
		System.out.print(field.getText());
		field.selectAll();
		text = new JTextArea(10, 20);
		text.setLineWrap(true); // perenos text
		panel.add(text);
		
		//  vivod
		JScrollPane scroller = new JScrollPane(text); //  peredaem obl. text
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		
		//  knopka
		JButton button = new JButton("Do it!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setSize(100, 10);
		
		//  otobrajenie
		button.addActionListener(this);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.NORTH, field);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
