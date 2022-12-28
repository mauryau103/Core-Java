package multithreadingpoc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOIntensive {
public static void main(String[] args) {
	
	//basically this is simple one
	
	
	//create a thread pool of more size so that extra thread will be there for another tasks
	ExecutorService executorService = Executors.newFixedThreadPool(100);
	
	for(int i=0;i<100;i++) {
		executorService.execute(new IOTask());
	}
	System.out.println("Thread Name: " + Thread.currentThread().getName());
	
}
static class IOTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//some IO Task is Running
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
	
}
}
