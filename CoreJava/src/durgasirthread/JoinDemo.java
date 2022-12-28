package durgasirthread;



class MyThread extends Thread{
	
	Thread thread ;
	public MyThread(Thread currentThread) {
		thread =currentThread;
	}

	public void run() {
		System.out.println("again ");
		for(int i=0;i<5;i++) {
			System.out.println("Seethe Thread");
			
			try {
				thread.join();
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class JoinDemo {
	public static void main(String[] args) {
		MyThread t=new MyThread(Thread.currentThread());
		t.start();
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Rama Thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
