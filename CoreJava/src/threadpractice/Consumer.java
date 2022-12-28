package threadpractice;

public class Consumer extends Thread{
	Company c;
	
	public Consumer(Company c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}
	public void run()
	{
		while(true)
		{
			this.c.consume_item();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
