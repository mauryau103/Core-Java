package durgasirthread;

public class RunnableDemo implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("child thread");
		
	}
public static void main(String[] args) {
	RunnableDemo runnableDemo=new RunnableDemo();
	Thread thread= new Thread(runnableDemo);
	Thread thread2= new Thread(runnableDemo);
	thread.start();
	
	System.out.println("main thread");
}


}
