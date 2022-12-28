package Lambda;

//in lambda expression and all we are just overriding the existing method in our functional interface.  

public class MultiThreadingLambda {
	
	public static void main(String[] args) {
		
		//runnable interface is a Functional interface
		Runnable runnable = ()->{
			for(int i =0;i<10;i++) {
				System.out.println("child Thread - 1");
			}
		};
		//runnable.run(); //-- this will be work as normal method
		
		Thread thread = new Thread(runnable);
		thread.start(); // from this line the another thread will create and output will be jumbled between main thread and child thread
		
		Thread thread2 = new Thread(
				
				()->{
					for(int i =0;i<10;i++) {
						System.out.println("child Thread - 2");
					}
				}
				);
		
		for(int i =0;i<10;i++) {
			System.out.println("Main Thread-1");
		}
		thread2.start();
	}

}
