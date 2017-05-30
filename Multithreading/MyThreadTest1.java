class MyThreadTest1
{
	public static void main(String s[])
	{
		
		Thread t= Thread.currentThread();
		System.out.println("Name is  "+t.getName());	
		System.out.println("Priority is  "+t.getPriority());	
		System.out.println(t);
		
		t.setName("Yogi");
		t.setPriority(t.MAX_PRIORITY);
		
		System.out.println("Name is  "+t.getName());	
		System.out.println("Priority is  "+t.getPriority());	
		System.out.println(t);
		
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e )
			{
					System.out.println(e);
			}
			System.out.println("\t\t\t"+i);
		}
		
		
		
	}
	
}