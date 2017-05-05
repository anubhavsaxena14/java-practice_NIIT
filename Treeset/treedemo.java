import java.util.*;
class treedemo
{
	public static void main(String p[])
	{
     TreeSet<Integer>pp=new TreeSet<Integer>();
     pp.add(67);
     pp.add(123);
     pp.add(-6);
     pp.add(56);
     pp.add(-123);
     pp.add(-1);
     pp.add(-1);
     System.out.println(pp);
     TreeSet<String>t=new TreeSet<String>();
     for(String k:p)
     {
     	t.add(k);
     }
System.out.println(t);
	}
}