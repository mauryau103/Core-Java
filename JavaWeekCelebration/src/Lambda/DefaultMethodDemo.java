package Lambda;

interface I{
	public void m1();
	public void m2();
	//no need to implement in all classes 
	//if you want you can override it
	//it doesn't effect implemented classes
	default void m3() {
		System.out.println("Interface Default Method");
	}
}
interface I2{
	//we can't take object class method implementation as a default method override in interface.
	
//	default int @Override
//	int hashCode();
	
	//down wala allowed hai
//	static int hashcode() {
//		return 0;
//	}
	public int hashcode();
}

class Test5 implements I{

	@Override
	public void  m1() {
		// TODO Auto-generated method stub
		System.out.println("I am in m1 deifined in T1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	//we can overridde default method 
	public void m3() {
		System.out.println("Overriden default method");
	}
	
	
}

class Test6 implements I{

	@Override
	public void m1() { 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}

class Test7 implements I2{

	@Override
	public int hashcode() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class DefaultMethodDemo {
public static void main(String[] args) {
	
	Test5 t5 = new Test5();
	t5.m1();
	t5.m3();

	
}
}
