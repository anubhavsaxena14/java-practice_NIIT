class base
{
	base(int r)
	{
		this();
	System.out.println("parameter is:=="+r);
	}
	base()
	{
		System.out.println("in default");
	}
}
class derived extends base
{
	 derived()
	 {
	 	super(800);
	 System.out.println("in derived default");
	 }
	 public static void main(String j[])
	 {
	 new derived();
	 }
}