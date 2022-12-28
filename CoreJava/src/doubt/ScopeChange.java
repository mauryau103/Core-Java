package doubt;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class X{
	public int i=9;
	 
}

class Z extends X{
	void my() {
		Z z = new Z();
		
		System.out.println(z.i);
	}
}
class P{
	final static String nameString;
	
	static {
		nameString="UMESH";
	}
	public P() {
		// TODO Auto-generated constructor stub
		
	}
	 void method() {
		System.out.println("i am inside p method");
	}
	 public static final void  main(String[] args) {
		
	}
	 public static void main(int[] args) {
		
	}
}
class C extends P {
	String aaString;
	 void method(){
		System.out.println("i am inside c method");
		
	}
	 public static void main(int[] args) {
		
	}
		
	
}
public class ScopeChange {
	
	public static final void main(String[] args) {
		
		P p= new C();
		p.method();
		
		
	}
	
	public static final void main(int[] args) {
		
	}
	
	
}
