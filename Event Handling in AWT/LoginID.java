import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class LoginID implements ActionListener
{
	JFrame f;
	JPanel p;
	JLabel name,password;
	JTextField t1,t2;
	JButton SignIn, Register;
	LoginID()
	{
	f = new JFrame("SignIn Page");
	p = new JPanel();
	name = new JLabel("Name");
	password = new JLabel("Password");
	t1=new JTextField(10);
	t2=new JTextField(10);
	SignIn=new JButton("SignIn");
	Register=new JButton("Register");
	f.add(p);
	p.add(name);
	p.add(t1);
	p.add(password);
	p.add(t2);
	p.add(SignIn);
	p.add(Register);
	SignIn.addActionListener(this);
	Register.addActionListener(this);
	f.setVisible(true);
	f.pack();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		  String name=t1.getText();
		  String pass=t2.getText();
		if(ae.getSource()==SignIn)
		{
			 if(name.equals("admin")&&pass.equals("pass@123"))
			  {
                JOptionPane.showMessageDialog(null,"Name is:=="+name+"\t pass:=="+pass);
			  	System.out.println("name");
			  }
			  else
			  {
			  	JOptionPane.showMessageDialog(null,"Invalid user"+name+"\t pass:=="+pass);
			  }
          p.setBackground(Color.red);
		}
		if(ae.getSource()==Register)
		{
          p.setBackground(Color.cyan);
          t1.setText(name.toUpperCase());
          t2.setText("");
		}
	}
	public static void main(String p[])
	{
	 new LoginID();
	}
}