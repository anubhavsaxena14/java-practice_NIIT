class MyThread extends Thread
{
	public void run()
	{
		System.out.println("childs thread start ");
		for(int i=1;i<=5;i++)
		{
			System.out.println("child "+i);
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e )
			{
					e.printStackTrace();
			}
		}
		System.out.println("childs thread Stop ");
	}
	
}

class MyThread2Test2
{
	public static void main(String a[]) throws InterruptedException
	{
		System.out.println("main thread start ");
		MyThread t1= new MyThread();
		t1.start();
		for(int i=1;i<=5;i++)
		{
				System.out.println("main"+i);
				Thread.sleep(100);
		}
		System.out.println("main thread stop ");
	}
}