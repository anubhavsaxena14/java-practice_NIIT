class op {
	int a = 2;
	
	op(){
	System.out.println("in op class:=="+a);
	}

}

class sum  extends op
{
	
	int a=24;
	sum(){
		super();
		System.out.println(a+"in sum class:=="+super.a);
	}

}

class sub extends sum 
{
int a=56;
 sub(){
 	super();
 	System.out.println(a+"in sub class:=="+super.a);
 }
public static void main(String args[])
{
	//op s1= new op();
	//sum s2= new sum();
	 new sub();
	
	System.out.println("in mail class");	
}
}

