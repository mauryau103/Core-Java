package threadpractice;

class UserThread extends Thread{
	public void run() {
		System.out.println("this is user defined thread");
	}
}

public class ThreadOp {
	public static void main(String[] args) {
		System.out.println("Program Started....");
		int x= 56+34;
		System.out.println("Sum is "+x);
		//Thread....
		Thread thread=Thread.currentThread();
		String tnameString=thread.getName();
		System.out.println("current running thread is "+tnameString);
		
		thread.setName("MyMainThread");
		System.out.println("My new name of thread :" + thread.getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thread.getId());
		
		// going to start user thread
		
		System.out.println("Program ended....");
		UserThread userThread=new UserThread();
		userThread.start();
	}

}
