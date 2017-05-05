/*1.static function access only static variable where normal function can access static as well as normal variale.
static method/variale in same class can be access with there name where as static variable/function in different class can be access 
with ther class name.
3.static variable retain its value even a control is pass to another function.*/
/*class st
{
	 static int a;
	 static void get()
	 {
	 	System.out.println("value is:="+a);
	 }
	 static public void main(String p[])
	 {
       st ss=new st();
       ss.a=1234;
       ss.get();
	 a=890;
	 get();
	 System.out.println(second.getName());
	 second.name="good afternoon";
	 System.out.println(second.getName());
	 System.out.println(Math.pow(2,5));
	 }
	
	 
}
class second
{
	static String name="good morning";
	static String getName()
	{
		return name.toUpperCase();
	}
}*/
class st
{
	 int i;
	st()
	{
		i++;
	}
	int getCount()
	{
		return i;
	}
	public static void main(String h[])
	{
		st a=new st();
		System.out.println(a.getCount());
		st b=new st();
		System.out.println(b.getCount());
		st c=new st();
		System.out.println(c.getCount());
		st d=new st();
		System.out.println(d.getCount());
	}
}