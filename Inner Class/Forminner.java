import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Forminner
{
	JFrame f;
	JPanel p;
	JLabel MobileNo,City;
	JTextField t1,t2;
	JButton  mb,ct;
	Forminner()
	{
	f = new JFrame("Form Page");
	p = new JPanel();
	MobileNo = new JLabel("MobileNo");
	City = new JLabel("City");
	t1=new JTextField(10);
	t2=new JTextField(10);
	mb=new JButton("MobileNo");
	ct=new JButton("City");
	f.add(p);
	p.add(MobileNo);
	p.add(t1);
	p.add(City);
	p.add(t2);
	p.add(mb);
	p.add(ct);
	mb.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
            p.setBackground(Color.cyan);
		}
	});
	ct.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
            p.setBackground(Color.green);
		}
	});
	f.setVisible(true);
	f.pack();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public  static void main(String m[])
	{

     new Forminner();
	}
	}