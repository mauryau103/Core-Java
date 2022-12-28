package week1;

class FirstClass{
	
	FirstClass fun() {
		System.out.println("Hi I am in FirstClass");
		return new CovarientType();
	}
	
}

public class CovarientType extends FirstClass {
	
	CovarientType fun() {
		System.out.println("Hi I am in CovarientType Class");
		return this;
	}
	
	public static void main(String[] args) {
		 
		CovarientType covarientType = new CovarientType();
		covarientType.fun();
		
		FirstClass firstClass = new FirstClass();
		firstClass.fun();
		
		FirstClass firstClass2 = new CovarientType();
		firstClass2.fun();	
		
	} 

}
