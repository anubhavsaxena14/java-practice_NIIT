class outer
{
	private int a;
	void get(int e)
	{
	  System.out.println("outer class:=="+a+"\t"+e);
	   inner ab=new inner();
	   ab.b=900;
	   ab.set(700);
	}
	private void display()
	{
		 System.out.println("in display value:=="+a);
	}
	/*static class inner
	{
	static  int b;
	 static void set(int w)
	 {
	 System.out.println("Inner class:=="+b+"\t"+w);
	 }*/
      class inner
	  {
	    int b;
	  void set(int w)
	  {
	   System.out.println("Inner class:=="+b+"\t"+w);
	   a=12345;
	   display();
	   }
	}
	public static void main(String p[])
	{
	  outer oo=new outer();
	   oo.a=890;
	   oo.get(400);
	 //  inner ii=new inner();
	   //ii.b=600;
	   //ii.set(4556);
	 outer.inner  po=new outer().new inner();
	 po.b=56778;
	 po.set(500);
	}
}