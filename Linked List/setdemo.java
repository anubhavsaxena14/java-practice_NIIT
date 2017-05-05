import java.util.*;
class setdemo
{
	 public static void main(String k[])
	 {
     Set ss=new HashSet();
     ss.add(1);
     ss.add("good");
     ss.add("45");
     ss.add(8.9);
     ss.add("good");
     ss.add(23);
     ss.add('a');
     System.out.println(ss);
     System.out.println("Size is:=="+ss.size());
     //System.out.println(ss.remove("good"));
     System.out.println(ss.contains("good"));

 System.out.println(ss);
     System.out.println("Size is:=="+ss.size());
     ss.clear();
    System.out.println(ss);
     System.out.println("Size is:=="+ss.size()); 

	 }
}