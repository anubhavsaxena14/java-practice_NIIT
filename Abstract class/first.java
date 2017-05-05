class base
{
	int s;
	int sum(int a,int b)
	{
	s = a + b;
	return s;
	}
}
class first extends base
{
	int m;
	int mul(int a,int b)
	{
		m = a*b;
		 System.out.println(sum(67,56));
		return m;
	} 
	public static void main(String args[])
	{
		first ff = new first();
		System.out.println("Multiplication:="+ff.mul(5,10) +"Addition:="+ff.sum(5,10));

	}
}