package week1;

class Overriden{
	
	protected void mymeth() {
		System.out.println("This is mymeth");
	}
}

public class MethodOverriding2 extends Overriden{
	
	protected void mymeth() {
		System.out.println("This is mymeth inside main class");
	}
public static void main(String[] args) {

	Overriden overriden2 = new MethodOverriding2();
	overriden2.mymeth();
	
}
}
