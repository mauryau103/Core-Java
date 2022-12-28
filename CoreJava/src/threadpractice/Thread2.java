package threadpractice;

//by extending Thread class
public class Thread2 extends Thread{
	synchronized public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println("Another thread = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
