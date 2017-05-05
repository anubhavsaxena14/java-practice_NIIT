class yah
{
	static int a;
	void get()
	{

	System.out.println("Value is:=="+a);
	}
	public static void main(String h[])
	{
	yah aa=new yah();
	yah bb=new yah();
    aa.a=900;
	aa.get();
	bb.get();
	new yah().a=1234;
	aa.get();
	bb.get();
	System.out.println(aa.a);
	}
}