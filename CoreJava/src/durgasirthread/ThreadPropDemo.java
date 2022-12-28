package durgasirthread;

public class ThreadPropDemo extends Thread{
public static void main(String[] args) {
	
	System.out.println(Thread.currentThread().getName());
	ThreadPropDemo threadPropDemo=new ThreadPropDemo();
	System.out.println(threadPropDemo.getName());
	Thread.currentThread().setName("Umesh Thread");
	System.out.println(Thread.currentThread().getName());
	threadPropDemo.setName("Asshu Thread");
	System.out.println(threadPropDemo.getName());
	
	
}
}
