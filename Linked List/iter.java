import java.util.*;
class iter
{
	public static void main(String h[])
	{
	LinkedList<String>pp=new LinkedList<String>();
	pp.add("one");
	pp.add("two");
	pp.add("three");
	pp.add("four");
	pp.add("five");
	System.out.println(pp);
	Iterator iv=pp.iterator();
	while(iv.hasNext())
	{
		System.out.println(iv.next());
	}
	ListIterator ip=pp.listIterator();
	System.out.println("\n List iterator");
	while(ip.hasNext())
		{
			System.out.println(ip.next());
	    }
	    System.out.println("\n Reverse List iterator");
	while(ip.hasPrevious())
		{
			System.out.println(ip.previous());
	    }
	}
}