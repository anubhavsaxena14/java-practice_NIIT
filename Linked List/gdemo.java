import java.util.*;
class gdemo
{
	 public static void main(String j[])
	 {
	 LinkedList ab=new LinkedList();
	 int sum=0;
	 ab.add(1);
	 ab.add(2);
	 ab.add(3);
	 ab.add(4);
	 ab.add(5);
	 ab.add(6);
	 System.out.println(ab);
	 for(Object r:ab)
	 {
	 	System.out.println(r);
	 	sum=sum+Integer.parseInt(r.toString());
	 }

System.out.println("sum is:=="+sum);

	 }
}