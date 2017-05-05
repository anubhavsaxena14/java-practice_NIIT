abstract class base
{
	abstract void get();	
	void abc()
	{
	System.out.println("This is abstract class");

	}
}
class sub extends base
{
	void get()
	{
	int a = 5;
	System.out.println("This is sub class"+a);
	}	
	/*void abc()
	{
	System.out.println("This is sub class");
	}*/
	public static void main(String j[])
	{
		sub ss = new sub();
		ss.get();
		ss.abc();
	}
}
