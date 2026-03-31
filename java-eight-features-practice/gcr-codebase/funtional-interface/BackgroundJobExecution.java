//no ip no return value
public class BackgroundJobExecution {
	public static void main(String[] args)
	{
		Runnable backgroundTask=()->
		{
			System.out.println("Background job started");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("background job completed");
		};
		
		Thread t=new Thread(backgroundTask);
		t.start();
		System.out.println("main thread continues execution..");
	}

}
