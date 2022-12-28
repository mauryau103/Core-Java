package exceptionhandling;



class Calculation extends Exception{
	public Calculation() {
		System.out.println("Calculation class is instantiated");
	}
	public void add(int a,int b) {
		System.out.println("The sum is "+(a+b));
	}
}

public class HandleMe {
	public static void main(String[] args){
//		try {
//			System.out.println("Hello I am in try block");
//			throw new Calculation();
//			}
//		 catch (Calculation c) {
//			c.add(12, 13);
//			System.out.println("I am in catch block");
//			
//			
//		}
//		finally {
//			System.out.println("i am in finally block");
//		}
		
		String nameString="welcome";
		nameString.concat("Hii");
		System.out.println(nameString);
	}

}
