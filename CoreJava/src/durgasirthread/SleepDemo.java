package durgasirthread;

//if a thread do not want to perform any operation then we sholud go for sleep
//also we can interrupt a thread while the thread is sleeping or waiting by using interrupt().
public class SleepDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("M");
		Thread.sleep(1000);
		System.out.println("A");
		Thread.sleep(1000);
		System.out.println("U");
		Thread.sleep(1000);
	}

}
