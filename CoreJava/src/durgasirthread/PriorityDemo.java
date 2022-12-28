package durgasirthread;


public class PriorityDemo extends Thread {
	//Every thread have some priority given by JVM or by normla user
//	Range: 1-10
	//Thread.MIN_Priority=....1
	//Thread.Max_priority ....10
	//Thread.Norm_priority ....5
	
//is any thread have same priority then it is dependent on sheduler whose behaviour is vendor dependent. with some algorithm
	//first come first serve priority will be there
	//we can get and set priority of threag by methods
	// The default priority only for main method is 5.but for all the remaining thread the priotiy will be inheriting from parent to chile whatever priority thre for parenmt the same priority will be given to child.
	public void run()
	{
		System.out.println("child thread");
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());//5
		//Thread.currentThread().setPriority(9);
		PriorityDemo priorityDemo=new PriorityDemo();
		//priorityDemo.setPriority(MAX_PRIORITY);
		priorityDemo.start();
		//System.out.println(priorityDemo.getPriority());
		System.out.println("main Thread");
	}
}
