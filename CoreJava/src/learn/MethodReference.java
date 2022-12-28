package learn;

/*Method Reference
 * generally we use method reference to refer method of functional interface.
 * It is compact and easy form of lambda expression 
 * eachtime when we are using a lambda expression to just refeering a method we can replace our lambda expression just with method referneces
 * __________-Types Of Method References____
 * 1. Reference to a static method  --- ContainingClass::staticMethodName
 * 2.Reference to an instance method
 * 3.Reference to a Constructor
 * */

interface Sayable{
	void say();
	
}
interface Provider{
	public Stud getStudent();
}

interface Messagable{
	
	Stud {
		
	}
}

class Stud{
	
	public Stud() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating object of student class");
	}
	
	public void display() {
		System.out.println("I am student");
	}
}

public class MethodReference {
	
	public static void saySomething() {
		System.out.println("Heeloo this is static method which is call by interface method reference.");
		
	}
	public void printInstance() {
		System.out.println("I am instance method and called by method reference using functional interface");
	}
	public static void main(String[] args) {
		
		
		Sayable sayable = ()->{
			System.out.println("Heello i am in say method implemetation");
		};
		
		/*Now abhi humne normal lambda expression se interface ke method ko implement kiya yaha pe.....but lets say there is condition kii..
		 * I want to use the existing method on that same interface call.. okk basically jo hum log ye uper lambda me body diye hai wo nahi chahiye pahle
		 * se difined data chahiye soo here we use method reference.*/
		sayable.say();
		
		/*This is Static method call*/
		Sayable sayable1 = MethodReference::saySomething;
		sayable1.say();
		
		/*Reffering Non-Static method name*/
		MethodReference methodReference = new MethodReference();		
		Runnable runnable = methodReference::printInstance;
		Thread d1 = new Thread(runnable);
		d1.start();
		
		/*We are overriding the functional interface methods soo keep in mind to place the same argument */
		/*Using Constructor Reference*/
		
		Provider provider=()->{
			return new Stud();
		};
		Stud stud = provider.getStudent();
		stud.display();
		
		/*using constructor reference*/
		
//		Provider provider2 :: new;
//		Stud stud2 = provider2.getStudent();
//		stud2.display();
	}
}
