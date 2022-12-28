package multithreadingpoc;

public class SecondExecutorDemo {
	public static  void main(String[] args) {
		for(int i=0;i<10;i++) {
			Thread thread = new Thread(new Task());
			thread.start();
		}
		System.out.println("Thread Name Main: "+Thread.currentThread().getName());
	}
static class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name: "+Thread.currentThread().getName() );
	}
	
}
}
