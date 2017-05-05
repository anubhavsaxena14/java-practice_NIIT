import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class slogin  implements ActionListener
{
	JFrame f;
	JPanel p;
	JLabel name,pass;
	JTextField t1,t2;
	JButton Login,Register;
	slogin()
	{
	f=new JFrame("Login Page");
	p=new JPanel();
	name=new JLabel("Name");
	pass=new JLabel("Password");
	t1=new JTextField(10);
	t2=new JTextField(10);
	Login=new JButton("LOg");
	Register=new JButton("Reg");
	/*f.setLayout(new FlowLayout());
	f.add(name);
	f.add(t1);
	f.add(pass);
	f.add(t2);
	f.add(Login);
	f.add(Register);*/
	f.add(p);
	p.add(name);
	p.add(t1);
	p.add(pass);
	p.add(t2);
	p.add(Login);
	p.add(Register);
	Login.addActionListener(this);
	Register.addActionListener(this);
	f.setVisible(true);
	f.pack();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Login)
		{
          p.setBackground(Color.cyan);
		}
		if(ae.getSource()==Register)
		{
          p.setBackground(Color.green);
		}
	}
	public static void main(String p[])
	{
	 new slogin();
	}
}
