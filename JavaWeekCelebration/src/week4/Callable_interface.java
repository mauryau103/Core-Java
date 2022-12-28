package week4;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FirstThread extends Thread{
	
	public void run() {
		for(int i = 0;i <= 5;i++) {
			System.out.println("By extend --> "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}



}

class T2 implements Callable<Integer>{

	int i;
	
	
	public T2(int i) {
		super();
		this.i = i;
	}


	@Override
	public Integer call() throws InterruptedException {
		Thread.sleep(2000);
		for(int j = 0;j <= i;j++) {
			System.out.println("By impliments --> "+i + Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		return i;
	}

}

public class Callable_interface{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		List<Future<Integer>> flist = new ArrayList<>();
		for(int i = 0; i <= 4;i++) {
			Future<Integer> submit = ex.submit(new T2(i));
		}
		System.out.println("------------------------------");
		
		for (Future<Integer> future : flist) {
			future.get();
		}
		ex.shutdown();
		
		
	}
}

