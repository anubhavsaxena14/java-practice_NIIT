class stblock
{
	static int a;
	static String b;
	static  void get()
	{
     System.out.println(a+"\t"+b);
	  }
	  static
	  {
	a=56;
	b="good morning";
	get();
     } 
	//intilized block

     {
      System.out.println("in intilized block");

     }
     stblock()
     {
     	System.out.println("in constructor");
     }
public static void main(String j[])
{
	new stblock();
	new stblock();
}
}