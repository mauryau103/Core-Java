package durgasirthread;

public class PreventThreadExecution extends Thread{
	//we can stop a thread execution by using the following methods 
	//yield(); -- pause the current executing thread to giving the chance of remaining waiting thread of same priority
	//but if all waiting threa dhave low priority or if there is no waiting threas then the same thread will be continued its execution
	//agar same priority me sare thread hai waiting me to kaun se threa dko firdst place milegat that thing we dont know
	//the thread which is yielded ...agar wo phir chance payega too wo depend karta hai ki shedular ke uper ki wo usko chance de ya na de
	//public static native void yield();.....Thread.yield()...Running to runnable
	//join(); --if thread wants to wait until completing some another thread then we use join().
	//sleep();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			
			System.out.println("child thread");
			Thread.yield();
		}
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		PreventThreadExecution pExecution= new PreventThreadExecution();
		pExecution.start();
		
		
		System.out.println("main thread");
	}
}
