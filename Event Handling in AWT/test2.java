import java.awt.*;
import java.awt.event.*;
class test2 implements MouseMotionListener,MouseListener
{
	Frame f;
	Label a;
	TextField tf;
	test2()
	{
		f=new Frame("Mouse Event");
		a=new Label("Demo event");
		tf=new TextField(10);
		f.add(a,BorderLayout.NORTH);
		f.add(tf,BorderLayout.SOUTH);
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.setVisible(true);
		f.setSize(400,400);
	}
	public void mouseMoved(MouseEvent me)
	{
		int a=me.getX();
		int b=me.getY();
		//tf.setText(a+"\t"+b);

	}
	public void mouseDragged(MouseEvent me)
	{
		int a=me.getX();
		int b=me.getY();
		f.setBackground(new Color(0,a,b));
	}

	public void mouseClicked(MouseEvent me)
	{
		tf.setText("mouse clicked");
	}
	public void mousePressed(MouseEvent me)
	{
		//int a=me.getXint b=me.getY();
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}
	public void mouseEntered(MouseEvent me)
	{
		tf.setText("mouse Entered");
	}
	public void mouseExited(MouseEvent me)
	{
		tf.setText("mouse Exited");
	}
	public static void main(String pm[])
	{
		new test2();
	}
}