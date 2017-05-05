import java.util.*;
class user
{
	String name,city;
	int phone;
	user(String a,String b,int c)
	{
	 name=a;
	 city=b;
	 phone=c;
	}
public String toString()
{
	 return name+"::"+city+"::"+phone;
}
}
class userdemo
{
  public static void main(String h[])
  {
  LinkedList<user>uu=new LinkedList<user>();
   
   uu.add(new user("amit","kota",23456));
   uu.add(new user("ajay","surat",256));
   uu.add(new user("deepak","london",3456));
   uu.add(new user("sarvesh","nimmach",123456));
   uu.add(new user("nitin","noida",2789));
   uu.add(new user("sattu","banglure",56));
   System.out.println(uu);
   System.out.println("size:=="+uu.size());
   System.out.println(uu.remove(2));
   System.out.println(uu);
   System.out.println("size:=="+uu.size());
   System.out.println(uu.get(3));


  }	
}