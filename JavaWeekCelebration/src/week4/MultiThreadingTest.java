package week4;

public class MultiThreadingTest {


	public static void method1() {
		System.out.println("static void method1");
	}

	public synchronized static void method2() {
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("static synchronized void method2");
		}
	}

	public static synchronized void method3() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("static synchronized void method3()");
		}
	}

	public void method4() {
		System.out.println("method4");
	}

	public void method5() {
		System.out.println("method5");
	}

	public synchronized void method6() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("synchronized void method6");
		}
	}

	public synchronized void method7() {
		System.out.println("synchronized void method7");
	}




}
