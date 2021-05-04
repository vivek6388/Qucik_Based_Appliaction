package Quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Score extends JFrame  implements ActionListener{
	
	
	Score(String username, int score)
	{
		setBounds(400,150,750,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("score.png"));
		Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(0, 200, 300, 250);
		add(l1);
		
		
		JLabel l2=new JLabel("Thank you "+ username +" for playing Simple minds");
		l2.setBounds(45, 30, 500, 30);
		l2.setFont(new Font(" ",Font.BOLD,20));
		add(l2);
		
		

		JLabel l3=new JLabel("Your Score is  "+score);
		l3.setBounds(450, 300, 400, 30);
		l3.setFont(new Font("Jokerman",Font.PLAIN,30));
		l3.setForeground(new Color(190,21,133));
		add(l3);
		
		
		JButton  b1=new JButton("Play Button");
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.setBounds(400, 370, 120, 30);
		add(b1);
	}
	public void actionPerformed(ActionEvent e) {
	
		this.setVisible(false);
		new SimpleMinds().setVisible(true);
	}


	public static void main(String[] args) {
		
		new Score("",0).setVisible(true);
	}


	
}
