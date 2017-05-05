interface one
{
	int x=90;
	void get();
	//void gone();
}
interface two
{
	String y="good afternoon";
   String  getName();

}
//interface three
interface three extends one,two
{
	int z=2345;
	void set();
}
//class inter implements one,two,three
class inter implements three
{
	public void get()
	{
		System.out.println("One is:=="+x);
	}
	public String getName()
	{
		System.out.println("two is:=="+y);
		return y.toUpperCase();
	}
	public void set()
	{
		System.out.println("three value is:=="+z);
	}
	public static void main(String p[])
	{
		  
		//inter dd=new inter();
		three dd=new inter();
		dd.get();
		System.out.println("Return is:=="+dd.getName());
        dd.set();
        System.out.println(x+"\t"+y+"\t"+z);
        //three tt=new three();
	}
}