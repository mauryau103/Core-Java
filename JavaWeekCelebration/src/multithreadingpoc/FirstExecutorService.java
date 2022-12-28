package multithreadingpoc;



public class FirstExecutorService {
public static void main(String[] args) {
	Thread thread1 = new Thread(new Task());
	thread1.start();
	System.out.println("Thread Name main : "+Thread.currentThread().getName());
	
	
}
static class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
	  
}
}
