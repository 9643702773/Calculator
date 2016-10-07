import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Cal extends JFrame implements ActionListener
{
	JButton b[]=new JButton[24];
	JTextField tf;
	JFrame f;
	Panel p;
	String s1,s2,s3,s4,s5;
	int c,n;
	float f1,f2;
	Cal(String st)
	{
		int x=60,y=0;
		f=new JFrame(st);
		//f.setBackground(Color.blue);
		String sd[]={"e","CE","C","<=","÷","pi","7","8","9","x","!","4","5","6","-","^","1","2","3","+","n/`","0",".","="};
		for(int i=0;i<24;i++)
		{
			b[i]=new JButton(sd[i]);
			b[i].addActionListener(this);
			if((i%5!=0||i==0)&&i<21)
			{b[i].setBounds(20+x*(i%5),80+y,50,35);
			//b[i].setBackground(Color.gray);
			//b[i].setForeground(Color.white);
			}
			else if(i<21)
			{y+=45;
				b[i].setBounds(20+x*(i%5),80+y,50,35);
				//b[i].setForeground(Color.white);
				//b[i].setBackground(Color.gray);
			}
			else if(i==21)
				{b[i].setBounds(20+x*(i%5),80+y,110,35);
			//	b[i].setForeground(Color.white);
			//	b[i].setBackground(Color.gray);
			}
			else 
				{b[i].setBounds(20+x*((i+1)%5),80+y,50,35);
			//	b[i].setForeground(Color.white);
			//	if(i!=23)	b[i].setBackground(Color.gray);
			//	else		b[i].setBackground(Color.gray);	
			}
			f.add(b[i]);
		}
		Container c = f.getContentPane();
		//c.setBackground(Color.green);
		tf=new JTextField();
		f.add(tf);
		tf.setBounds(20,20,290,40);
		//tf.setBackground(Color.gray);
		//tf.setForeground(Color.white);
		f.setLayout(null);
		f.setSize(360,360);
		//f.pack();
		//ImageIcon icon = new ImageIcon("Cal.jpg");
		//f.setIconImage(icon.getImage());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[0])
		{
			tf.setText("2.71828");
		}
		if(e.getSource()==b[1])
		{
			tf.setText("");
		}
		if(e.getSource()==b[2])
		{
			s1="";
			s2="";
			tf.setText("");
		}
		if(e.getSource()==b[3])
		{
			s4=tf.getText();
			if(s4.length()!=0){
			s5=s4.substring(0,s4.length()-1);}
			tf.setText(s5);
		}
		if(e.getSource()==b[4])
		{
			s1=tf.getText();
			tf.setText("");
			c=1;
		}
		if(e.getSource()==b[5])
		{
			tf.setText("3.14159");
		}
		if(e.getSource()==b[6])
		{
			s3=tf.getText();
			s4="7";
			s5=s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b[7])
		{
			s3=tf.getText();
			s4="8";
			s5=s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b[8])
		{
			s3=tf.getText();
			s4="9";
			s5=s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b[9])
		{
			s1=tf.getText();
			tf.setText("");
			c=2;
		}
		if(e.getSource()==b[10])
		{
			s3=tf.getText();
			try{
			n=factorial(Integer.parseInt(s3));
			tf.setText(String.valueOf(n));}catch(Exception k){}
		}
		if(e.getSource()==b[11])
		{
			s3=tf.getText();
			s4="4";
			s5=s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b[12])
		{
			s3=tf.getText();
			s4="5";
			s5=s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b[13])
		{
			s3=tf.getText();
			s4="6";
			s5=s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b[14])
		{
			s1=tf.getText();
			tf.setText("");
			c=3;
		}	
		if(e.getSource()==b[15])
		{
			s1=tf.getText();
			tf.setText("");
			c=5;
		}	
		if(e.getSource()==b[16])
		{
			s3=tf.getText();
			s4="1";
			s5=s3+s4;
			tf.setText(s5);
		}	
		if(e.getSource()==b[17])
		{
			s3=tf.getText();
			s4="2";
			s5=s3+s4;
			tf.setText(s5);
		}	
		if(e.getSource()==b[18])
		{
			s3=tf.getText();
			s4="3";
			s5=s3+s4;
			tf.setText(s5);
		}	
		if(e.getSource()==b[19])
		{
			s1=tf.getText();
			tf.setText("");
			c=4;
		}	
		if(e.getSource()==b[20])
		{
			s1=tf.getText();
			tf.setText("");
			c=6;
		}	
		if(e.getSource()==b[21])
		{
			s3=tf.getText();
			s4="0";
			s5=s3+s4;
			tf.setText(s5);
		}	
		if(e.getSource()==b[22])
		{
			s3=tf.getText();
			int h=0;
			for(int i=0;i<s3.length();i++)
			{
				if(s3.charAt(i)=='.')
				h=2;
			}
			try{
				if(h!=2)
				{s4=".";
				s5=s3+s4;}
			}catch(Exception k){}
			tf.setText(s5);
		}	
		if(e.getSource()==b[23])
		{
			try{s2=tf.getText();
			if(c==1)
			{
				int g=Integer.parseInt(s2);
				try{
					if(g!=0){
				f1 = Float.parseFloat(s1)/Float.parseFloat(s2);
				tf.setText(String.valueOf(f1));}
					else	tf.setText("infinite");
				}catch(Exception d){}
			}
			if(c==2)
			{
				f1 = Float.parseFloat(s1)*Float.parseFloat(s2);
                		tf.setText(String.valueOf(f1));
			}
			if(c==3)
			{
				f1 = Float.parseFloat(s1)-Float.parseFloat(s2);
				tf.setText(String.valueOf(f1));
			}
			if(c==4)
			{
				f1 = Float.parseFloat(s1)+Float.parseFloat(s2);
				tf.setText(String.valueOf(f1));
			}
			if(c==5)
			{
				f1 = (float)Math.pow(Float.parseFloat(s1),Float.parseFloat(s2));
				tf.setText(String.valueOf(f1));
			}
			if(c==6)
			{
				f1 = (float)Math.pow(Float.parseFloat(s2),1/Float.parseFloat(s1));
				tf.setText(String.valueOf(f1));
			}}catch(Exception vv){}
		}	
	}
	public int factorial(int r)
	{
		int ft=1;
		for(int i=1;i<=r;i++)
		{
			ft=ft*i;
		}
		return ft;
	}
	
	public static void main(String... s)
	{
		Cal c = new Cal("Calculator");
	}
}