import java.awt.*;
class abc 
{
	Frame f;
	Button b1,b2;
	abc()
	{
	f = new Frame("in abc");
	b1=new Button("First");
	b2=new Button("second");
	f.add(b1,BorderLayout.NORTH);
	f.add(b2,BorderLayout.WEST);
	f.setSize(200,200);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
	new abc();
	}
}