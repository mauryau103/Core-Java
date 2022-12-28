package javaproblem;

public class Parent {
	
	String nameString;
	int age;
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	public Parent(String nameString,int age) {
		// TODO Auto-generated constructor stub
		this.nameString=nameString;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Parent [nameString=" + nameString + ", age=" + age + "]";
	}


}
