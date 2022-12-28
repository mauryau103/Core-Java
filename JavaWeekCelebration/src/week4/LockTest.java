package week4;

public class LockTest {

	public static void main(String[] args) {
		
		
		MultiThreadingTest m=new MultiThreadingTest();

		Thread thread = new Thread(
				()->{
					synchronized (m) {
						//m.method6();
						MultiThreadingTest.method2();
					}
				}
				);
		Thread thread2 = new Thread(
				()->{
					synchronized (m) {
						//m.method6();
						MultiThreadingTest.method3();
					}
				}
				);
		
		
		thread2.start();
		thread.start();
	}
	
}
