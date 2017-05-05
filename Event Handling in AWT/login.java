import java.awt.*;
class login
{
	Frame f;
	Panel p;
	Label name,pass;
	TextField t1,t2;
	Button Login,Register;
	login()
	{
	f=new Frame("Login Page");
	p=new Panel();
	name=new Label("Name");
	pass=new Label("Password");
	t1=new TextField(10);
	t2=new TextField(10);
	Login=new Button("LOg");
	Register=new Button("Reg");
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
	f.setVisible(true);
	}
	public static void main(String p[])
	{
	 new login();
	}
}
