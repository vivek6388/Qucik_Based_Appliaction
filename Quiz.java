package Quiz;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Quiz extends JFrame implements ActionListener{
	JButton next,lifeline,submit;
	public static int count=0;
	JLabel qno,question;
	public static int ans_given=0;
	public static int score=0;
	String  q[][]=new String[10][5];						//for question
	String pa[][]=new String[10][1];
	String qa[][]=new String[10][2];      // answere ko check karne ke lia shi hai ki nhi
	JRadioButton opt1,opt2,opt3,opt4;
	public static int timer=15;
	
	ButtonGroup options;
	String username;

	public Quiz(String username) {
		this.username=username;
		
		setBounds(100,20,1100,650);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("quiz.jpg"));
		JLabel l1=new JLabel(i1);
		l1.setBounds(0, 0, 1100, 280);
		add(l1);
		
		 qno=new JLabel(" ");
		qno.setFont(new Font (" ",Font.PLAIN,15));
		qno.setBounds(30, 350, 40, 20);
		add(qno);
		
		 question=new JLabel(" ");
		question.setFont(new Font (" ",Font.PLAIN,15));
		question.setBounds(100, 350, 640, 20);
		add(question);
		
		
		
		
		q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        
        
        
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
		
		
		
		
	 opt1=new JRadioButton("  ");
		opt1.setBounds(120, 400, 700, 30);
		opt1.setFont(new Font (" ",Font.PLAIN,18));
		opt1.setBackground(Color.white);
		add(opt1);
		

		
		

		 opt2=new JRadioButton(" ");
		opt2.setBounds(120, 440, 700, 30);
		opt2.setFont(new Font (" ",Font.PLAIN,18));
		opt2.setBackground(Color.white);
		add(opt2);
		

	opt3=new JRadioButton(" ");
		opt3.setBounds(120, 480, 700, 30);
		opt3.setFont(new Font (" ",Font.PLAIN,18));
		opt3.setBackground(Color.white);
		add(opt3);
		

		opt4=new JRadioButton(" ");
		opt4.setBounds(120, 520, 700, 30);
		opt4.setFont(new Font (" ",Font.PLAIN,18));
		opt4.setBackground(Color.white);
		add(opt4);
		
		
	 options =new ButtonGroup();
		options.add(opt1);
		options.add(opt2);	options.add(opt3);	options.add(opt4);
		
		 next=new JButton("Next ");
		next.setFont(new Font(" ",Font.PLAIN,22));
		next.setBackground(new Color(30,144,255));
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		next.setBounds(850, 440, 200, 30);
		add(next);
		
		lifeline=new JButton("50-50  LifeLine ");
		lifeline.setFont(new Font(" ",Font.PLAIN,22));
		lifeline.setBackground(new Color(30,144,255));
		lifeline.setForeground(Color.WHITE);
		lifeline.addActionListener(this);
		lifeline.setBounds(850, 480, 200, 30);
		add(lifeline);
		
		
		
		submit=new JButton("submit");
		submit.setFont(new Font(" ",Font.PLAIN,22));
		submit.setEnabled(false);							//submit button disable karne ke lia
		submit.setBackground(new Color(30,144,255));
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setBounds(850, 520, 200, 30);
		add(submit);
		
		start(0);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next)
		{
			repaint();
			opt1.setEnabled(true);	opt2.setEnabled(true);	opt3.setEnabled(true);	opt4.setEnabled(true);
			
			ans_given=1;
			if(options.getSelection()==null)
			{
				pa[count][0]="";
			}
			else 
			{
				pa[count][0]=options.getSelection().getActionCommand();
			}
			
			if(count==8)			//logic use kiya eight question ke lia kyo ki ab next button show nhi karni chahiya
			{
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			
			
			count++;    //++ kiya kyoki next quest ke lia move karuga
			start(count);
		}
		else if(e.getSource()==submit)
		{ans_given=1;
			if(options.getSelection()==null)
			{
				pa[count][0]="";			//user ke answere store hoge ya per
			}
			else 
			{
				pa[count][0]=options.getSelection().getActionCommand();
			}
			
			
			for(int i=0;i<pa.length;i++)
			{
				if(pa[i][0].equals(qa[i][1]))
				{
					score+=10;
				}
				else 
				{
					score+=0;
				}
			}
			this.setVisible(false);
			new Score(username,score).setVisible(true);
		}
		
		else if(e.getSource()==lifeline)

		{
			if(count==2||count==4||count==6||count==8||count==9)
			{
				opt2.setEnabled(false);
				opt3.setEnabled(false);
			}
			else 
			{
				opt1.setEnabled(false);
				opt4.setEnabled(false);
			}
			lifeline.setEnabled(false);
		}
	}
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		String time="Timer Left - "+timer +" seconds";
		g.setColor(Color.RED);
		g.setFont(new Font(" ",Font.BOLD,18));
	
		
		if(timer>0)
		{
			g.drawString(time, 880, 400);
		}
		else
		{
			g.drawString("Times Up !!", 880, 400);
		}
		timer--;
		
		try
		{Thread.sleep(1000);
			repaint();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(ans_given==1)					//logic use kiya next question ke time ke lia
		{
			ans_given=0;										//time ko next questuion ke timer vapas bhi tho set kana padega
			timer=15;
		}
		
		else if(timer<0)
		{
			timer=15;
			opt1.setEnabled(true);	opt2.setEnabled(true);	opt3.setEnabled(true);	opt4.setEnabled(true);
			if(count==8)			//logic use kiya eight question ke lia kyo ki ab next button show nhi karni chahiya
				
			{
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			if(count==9)
			{
				if(options.getSelection()==null)
				{
					pa[count][0]="";			//user ke answere store hoge ya per
				}
				else 
				{
					pa[count][0]=options.getSelection().getActionCommand();
				}
				
				
				for(int i=0;i<pa.length;i++)
				{
					if(pa[i][0].equals(qa[i][1]))
					{
						score+=10;
					}
					else 
					{
						score+=0;
					}
				}
				this.setVisible(false);
				new Score(username,score).setVisible(true);
			}
			else
			{
				if(options.getSelection()==null)
				{
					pa[count][0]="";			//user ke answere store hoge ya per
				}
				else 
				{
					pa[count][0]=options.getSelection().getActionCommand();
				}
				count++;
				start(count);
			}
		}
	}
	public void start(int count)					//intinal value set karega
	{
		qno.setText(""+(count+1)+".");
		question.setText(q[count][0]);
		opt1.setLabel(q[count][1]);
		opt1.setActionCommand(q[count][1]);
		opt2.setLabel(q[count][2]);
		opt2.setActionCommand(q[count][2]);
		opt3.setLabel(q[count][3]);
		opt3.setActionCommand(q[count][3]);
		opt4.setLabel(q[count][4]);
		opt4.setActionCommand(q[count][4]);
		options.clearSelection();
	}

	public static void main(String[] args) {
		new Quiz("").setVisible(true);
		

	}
	

}
