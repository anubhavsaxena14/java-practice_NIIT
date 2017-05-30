class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("childs thread start ");
		for(int i=1;i<=5;i++)
		{
			System.out.println("child "+i);
		}
		System.out.println("childs thread Stop ");
	}
	
}
class MyThread2Test3
{
	public static void main(String a[])
	{
		System.out.println("main thread start ");
		MyThread m1 = new MyThread();
		Thread t=new Thread(m1);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main"+i);
					
		}
		System.out.println("main thread start ");
	}
}