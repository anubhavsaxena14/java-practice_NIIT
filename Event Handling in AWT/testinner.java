import java.awt.*;
import java.awt.event.*;
class testinner
{
	Frame f;
	Label a;
	TextField tf;
	testinner()
	{
		f=new Frame("Mouse Event");
		a=new Label("Demo event");
		tf=new TextField(10);
		f.add(a,BorderLayout.NORTH);
		f.add(tf,BorderLayout.SOUTH);
		f.addMouseListener(new First());
		f.addMouseMotionListener(new Second());
		f.setVisible(true);
		f.setSize(400,400);
	}
	public class Second extends MouseMotionAdapter
	{
	
	public void mouseDragged(MouseEvent me)
	{
		int a=me.getX();
		int b=me.getY();
		f.setBackground(new Color(0,a,b));
	}
}
public class First extends MouseAdapter
{

	public void mouseClicked(MouseEvent me)
	{
		tf.setText("mouse clicked");
	}
	
	public void mouseEntered(MouseEvent me)
	{
		tf.setText("mouse Entered");
	}
	public void mouseExited(MouseEvent me)
	{
		tf.setText("mouse Exited");
	}
}
	public static void main(String pm[])
	{
		new testinner();
	}
}