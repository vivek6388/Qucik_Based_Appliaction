package Quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class SimpleMinds extends JFrame implements ActionListener {
	
	JButton b1,b2;JTextField t1;
	
	SimpleMinds()
	{
		setBounds(100,100,1100,500);	//yaha posito screen ke hisab se				//location ka size and last ka do size ke lia
		
		getContentPane().setBackground(Color.white);
		setLayout(null);			//apna layout use karne ke lia
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));	//with respect to frame
		JLabel l1=new JLabel(i1);					//image ko dalne ke lia
		l1.setBounds(0,0,550,500);
		add(l1);
		
		
		JLabel l2=new JLabel("Simple Minds");
		l2.setFont(new Font(" ",Font.BOLD,30));
		l2.setForeground(Color.blue);
		l2.setBounds(750,40,500,50);
		add(l2);
		

		JLabel l3=new JLabel("Enter your name");
		l3.setFont(new Font(" ",Font.BOLD,30));
		l3.setForeground(Color.blue);
		l3.setBounds(800,120,300,70);
		add(l3);
		
	 t1=new JTextField();
		l3.setFont(new Font("",Font.BOLD,20));
		t1.setBounds(750,180,300,40);
		add(t1);
		
		
	 b1=new JButton("Rules");
		b1.setBounds(750,270,100,25);
		b1.setBackground(new Color(30,144,254));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this); 				// Event ke lia
		add(b1);
		
	 b2=new JButton("Exit");
		b2.setBounds(900,270,100,25);
		b2.setBackground(new Color(30,144,254));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
	String 	name=t1.getText();
	this.setVisible(false);
	new Rules(name);
	}
	else {
		System.exit(0);
	}
		
	}
	public static void main(String[] args) {
		new SimpleMinds();
		
	}

	

}
