package doubt;

import java.io.FileNotFoundException;
import java.io.IOException;
//public protected default private
class DemoParent{
	 void method() throws IOException {
		System.out.println("I am in demoparent method");
	}
}
class DemoChild extends DemoParent{
	protected void method() throws FileNotFoundException {
		System.out.println("I am in demochild method");
	}
}
public class Overridedemo {

	
	public static void main(String[] args) throws IOException {
		DemoParent demoParent= new DemoChild();
		demoParent.method();
	}
	
}
