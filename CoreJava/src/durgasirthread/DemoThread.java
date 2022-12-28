package durgasirthread;

public class DemoThread extends Thread{
	public void start() {
		super.start();
		System.out.println("start method");
	}
	public void run() {
		
			System.out.println("run method");
			
		
	}
public static void main(String[] args) {
	
	DemoThread demoThread=new DemoThread();
	demoThread.start();
	
	System.out.println("main method");
	
	 
}
}
