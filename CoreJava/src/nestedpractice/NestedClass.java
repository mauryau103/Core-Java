package nestedpractice;

class Java_outer_Class{
	public Java_outer_Class() {
		// TODO Auto-generated constructor stub
		System.out.println("I am inside outer class");
	}
	 class Java_inner_Class{
		
		 Java_inner_Class() {
			// TODO Auto-generated constructor stub
			System.out.println("I am innner class");
		}
		int salary=21;
		void display() {
			System.out.println(salary);
		}
	}
}

interface MyInterface{
	class Myclass{
		
	}
}
public class NestedClass {
	public static void main(String[] args) {
		Java_outer_Class java_outer_Class = new Java_outer_Class();
		 
	}


}
