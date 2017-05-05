class  one
{ 
	int a=700;
  void get()
   {
   System.out.println("in one get:=="+a);
   }	
}
class over extends one
{
  int a=900;
	void get()
	{
	System.out.println("in over get method:=="+super.a+"\t"+a);
	super.get();
	}
	public static void main(String p[])
	{
	over ov=new over();
	ov.get();
	}
}