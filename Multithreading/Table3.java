//block

class Table3{  
  
 void printTable(int n){  
   synchronized(this){//synchronized block  
     for(int i=1;i<=5;i++){  
      System.out.println(n*i);  
      try{  
       Thread.sleep(400);  
      }catch(Exception e){System.out.println(e);}  
     }  
   }  
 }//end of the method  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table3 t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table3 t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class TestSynchronizedBlock1{  
public static void main(String args[]){  
Table3 obj = new Table3();//only one object  
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
} 