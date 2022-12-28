package week1;


class A{
	
}
class B extends A{
	
}
class C extends B{
	
}

public class MethodOverLoading2 {

	static void overloadedMethod(A a) {						
		System.out.println("One");
	}
	static void overloadedMethod(B b) {
		System.out.println("Two");
	}
	static void overloadedMethod(C c) {
		System.out.println("Three");
	}
	static void overloadedMethod(Object obj) {
		System.out.println("Four");
	}
	public static void main(String[] args) {
		C c = new C();
		overloadedMethod(c);
	}
}
