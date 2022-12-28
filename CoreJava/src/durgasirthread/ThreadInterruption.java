package durgasirthread;

class MyThread2 extends Thread{
	public void run() {
		
			try {
				for(int i=0;i<5;i++) {
					System.out.println("i am lazy thread:"+i);
				Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("I got interrupted");
			}
		
	}
}
public class ThreadInterruption{
	
	public static void main(String[] args) {
		MyThread2 thread2=new MyThread2();
		thread2.start();
		thread2.interrupt();
		System.out.println("end of main thread");
	}
	

}
