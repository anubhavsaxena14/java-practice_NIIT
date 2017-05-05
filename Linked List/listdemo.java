import java.util.*;
class  listdemo
{
	 public static void main(String k[])
	 {
     List ss=new LinkedList();
     ss.add(1);
     ss.add("good");
     ss.add("45");
     ss.add(8.9);
     ss.add("good");
     ss.add(23);
     ss.add('a');
     System.out.println(ss);
     System.out.println("Size is:=="+ss.size());
     System.out.println("Remove elements:=="+ss.remove(4));
     //System.out.println(ss.contains("good"));

     System.out.println(ss);
     System.out.println("Size is:=="+ss.size());
     //ss.clear();
     ss.add(5,"india");
    System.out.println(ss);
     System.out.println("Size is:=="+ss.size()); 

	 }
}