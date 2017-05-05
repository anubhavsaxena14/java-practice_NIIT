class base
{
	int s;
	void sum(int a. int b)
	{
	s = a + b;
	return s;
	}
}
class first extends base
{
	int m;
	void mul(int a, int b)
	{
		m = a*b;
		return m;
	} 
	public static void main()
	{
		first ff = new first();
		System.out.println("Multiplication:="+ff.mul()\t"Addition:="+ff.sum());
		ff.mul();

	}
}