 import java.util.Scanner; 
class exception1
{
	public static void main ( String ar[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);  
	    System.out.println("Enter first num  ");  
		a=sc.nextInt();  
	    System.out.println("Enter sec number   ");  
		b=sc.nextInt();  
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
		finally 
		{       
			System.out.println("procA's finally");     
		} 
		
			System.out.println("END");
	}
}	
	
  