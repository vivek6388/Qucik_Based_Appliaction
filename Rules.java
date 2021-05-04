
package Quiz;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener {	//implement kiya event performe ke lia
	
	JButton b1,b2;
	String username;
	
	
	Rules(String username)						//username back se ayage ga
	{
		this.username=username;
		setBounds(100,100,800,580);								//left right top buttom
		getContentPane().setBackground(Color.WHITE);			
		setLayout(null);
		
		JLabel l1=new JLabel("Welcome "+username +"  to Simple Minds");
		l1.setForeground(new Color(30,144,255));
		l1.setFont(new Font("",Font.BOLD,28));
		l1.setBounds(50,20,800,30);//kam thabhi karega jab layout null hoga
		
		add(l1);
		
		
		JLabel l2=new JLabel("");
		l2.setFont(new Font(" ",Font.PLAIN,20));
		l2.setBounds(20, 80, 1000, 450);
		l2.setText("<html>"
				+
				"1.you are trained."+"<br><br>"+
				"2.Do not unecessary."+"<br><br>"+
				"3.You may have lot of option. "+"<br><br>"+
				"4.Crying is allowed but please."+"<br><br>"+
				"5.Only a fool asks and a wise."+"<br><br>"+
				"6.Do not get nervous if you."+"<br><br>"+
				"7.Brace youself."+"<br><br>"+
				
				
				
				"<html>"
				);	
		
		
		
	b1=new JButton("Back");
		b1.setBounds(250, 480, 100, 30);
		b1.setBackground(new Color(30,144,255));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		

	 b2=new JButton("Start");
		b2.setBounds(400, 480, 100, 30);
		b2.setBackground(new Color(30,144,255));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		add(l2);
		
		
		
		
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			this.setVisible(false);
			new SimpleMinds().setVisible(true);
		}
		else if(e.getSource()==b2)
		{
			new Quiz(username).setVisible(true);
		}
		
	}

	public static void main(String []a)
	{
		new Rules("");
	}
	
}
