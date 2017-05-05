import java.awt.*;
import java.awt.event.*;
class test implements MouseMotionListener
{
	Frame f;
	Label a;
	TextField tf;
	test()
	{
		f=new Frame("Mouse Event");
		a=new Label("Demo event");
		tf=new TextField(10);
		f.add(a,BorderLayout.NORTH);
		f.add(tf,BorderLayout.SOUTH);
		f.addMouseMotionListener(this);
		f.setVisible(true);
		f.setSize(300,300);
	}
	public void mouseMoved(MouseEvent me)
	{
		int a=me.getX();
		int b=me.getY();
		tf.setText(a+"\t"+b);

	}
	public void mouseDragged(MouseEvent me)
	{
		int a=me.getX();
		int b=me.getY();
		f.setBackground(new Color(0,a,b));
	}
	public static void main(String pm[])
	{
		new test();
	}
}