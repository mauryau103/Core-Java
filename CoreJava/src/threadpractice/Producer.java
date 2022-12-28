package threadpractice;

public class Producer extends Thread{
	
	Company c;
	
	public Producer(Company c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}
	
	public void run()
	{	
		int i=1;
		while(true)
		{
			this.c.produce_item(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

}
