package multithreadingpoc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CpuIntensiveOp {
	public static void main(String[] args) {
		
		//get count of available cores
		int coreCount = Runtime.getRuntime().availableProcessors();
		//System.out.println(coreCount);
		//jitna core hai utna hi thread threapool me dala ja raha hai
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		//Now submit the task for execution
		for(int i =0 ; i<100;i++) {
			service.execute(new CpuIntensiveTask());
		}
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
	}
	static class CpuIntensiveTask implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			//Some Cpu Intensive opereations
			System.out.println("Thread Name : "+Thread.currentThread().getName());
		}
		
	}

}
