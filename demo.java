import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;
//import pac.*;

public class demo implements ActionListener
{
	JTextField j1,j2,j3,j4;		
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3;
	
	demo()
	{
		JFrame f=new JFrame();
		j1=new JTextField();
		j1.setBounds(150,20,100,20);

		j2=new JTextField();
		j2.setBounds(150,60,100,20);
		
		j3=new JTextField();
		j3.setBounds(150,90,100,20);
		
		j4=new JTextField();
		j4.setBounds(150,120,100,20);

		l1=new JLabel("Enter Value of Amount");
		l1.setBounds(10,10,100,40);

		l2=new JLabel("Enter Value of Rate");
		l2.setBounds(10,50,100,40);

		l3=new JLabel("Enter value of Month");
		l3.setBounds(10,80,100,40);
		
		l4=new JLabel("Answer");
		l4.setBounds(10,120,100,40);
		
		b1=new JButton("Click");
		b1.setBounds(100,150,100,40);
		b1.addActionListener(this);
		
		
		
		f.add(l1);
		f.add(j1);
		f.add(b1);
		
		f.add(l2);
		f.add(j2);
		
		f.add(l3);
		f.add(j3);
		
		f.add(l4);
		f.add(j4);
		
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
		{
			String s1=j1.getText();
			String s2=j2.getText();
			String s3=j3.getText();

		
			
			double a=Double.parseDouble(s1);
			double b=Double.parseDouble(s2);
			double c=Double.parseDouble(s3);
			
			double y,z;
			
			y=b/1200;
			z=c*12;

			double p;
			if(e.getSource()==b1)
			{
				p=(a*y*Math.pow(1+y,z))/(Math.pow(1+y,z)-1);
				
			}
			
			else
			{
				p=0;
			}

			String s4=String.valueOf(p);
			j4.setText(s4);
		}
	public static void main(String args[])	
	{
		new demo();
		
		//xyz a=new xyz();

		//a.sum(10,20);
		//a.sub(20,10);
		
	}
	
}