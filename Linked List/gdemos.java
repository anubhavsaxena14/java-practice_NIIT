import java.util.*;
class gdemos
{
	 public static void main(String j[])
	 {
	 LinkedList <Integer>ab=new LinkedList<Integer>();
	 int sum=0;
	 ab.add(1);
	 ab.add(2);
	 ab.add(3);
	 ab.add(4);
	 ab.add(5);
	 ab.add(6);
	 System.out.println(ab);
	 for(int  r:ab)
	 {
	 	System.out.println(r);
	 	sum=sum+r;
	 }

System.out.println("sum is:=="+sum);
ArrayList <Double>a=new ArrayList<Double>();
	 
	 a.add(1.0);
	 a.add(2.0);
	 a.add(3.0);
	 a.add(4.0);
	 a.add(5.0);
	 a.add(6.0);
	 System.out.println(a);
      for(double dd:a)
      {
      	System.out.println("squre root of "+a+":=="+Math.sqrt(dd));
      }
	 }
}