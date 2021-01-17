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
	Scann sc = new Scann();
	

	
	public void actionPerfomed(ActionEvent event){
		System.out.println("OK");
		//String tmp = field.getText();
		//sc.takeLine(tmp);
	}
	
	public void go(){
		JFrame frame = new JFrame();
		//  text pole
		JTextField field = new JTextField(100);
		field.setText("Your's virajenie");
		System.out.print(field.getText());
		field.selectAll();
		//field.requestFocus();
		frame.getContentPane().add(BorderLayout.NORTH, field);
		
		//JTextArea text = new JTextArea(10, 20);
		//frame.getContentPane().add(BorderLayout.CENTER, text);
		
		
		//  knopka
		JButton button = new JButton("Do it!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setSize(100, 10);
		
		button.addActionListener(this);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		//frame.getContentPane().add(button);
		//frame.getContentPane().add(field);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
