abstract class shape
{
	shape()
	{
		System.out.println("in shape");
		
	}
abstract double area(double a,double b);
String getValue(String h)

{
return h;
}
abstract void get();
}
class circle extends shape
{
	public double area(double a,double b)
	{
		return Math.PI*a*b;
	}
	void get()
	{
		 System.out.println("in circle get");
	}
}
class triangle extends shape
{
	protected double area(double x,double y)
	{
		return (0.5*x*y);
	}
	void get()
	{

	}
}

class abc 
{
 public static  void main(String p[])
{
	  shape cc=new circle();
 //circle  cc=new circle();
 triangle t=new triangle();
 System.out.println("Area of circle is:=="+cc.area(5,6));
 System.out.println("Area of triangle:=="+t.area(7,8));
 System.out.println(cc.getValue("circle one"));
 	System.out.println(t.getValue("triangle one"));
cc.get();
}
}