import java.awt.*;
import java.awt.event.*;
class   anninner
{
	Frame f;
	Label a;
	TextField tf;
	anninner()
	{
		f=new Frame("Mouse Event");
		a=new Label("Demo event");
		tf=new TextField(10);
		f.add(a,BorderLayout.NORTH);
		f.add(tf,BorderLayout.SOUTH);
		f.addMouseMotionListener(new MouseMotionAdapter()
	        {
	
	        public void mouseDragged(MouseEvent me)
	        {
		      int a=me.getX();
		       int b=me.getY();
		      f.setBackground(new Color(0,a,b));
	      }
});
		f.addMouseListener(new  MouseAdapter()
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
       });
		f.setVisible(true);
		f.setSize(400,400);
	}
	
	public static void main(String pm[])
	{
		new anninner();
	}
}