package threadpractice;

// by using Runnable interface

class ImplementThread implements Runnable{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("Value of i is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Thread1{
	public static void main(String[] args) {
		ImplementThread implementThread= new ImplementThread();
		
		Thread thread = new Thread(implementThread);
		Thread2 t2=new Thread2();
		t2.start();
		thread.start();
		System.out.println(thread.getName());
	}
	
}
