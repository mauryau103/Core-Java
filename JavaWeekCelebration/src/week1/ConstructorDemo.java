package week1;
class I{
	I(){
		System.out.println("default constructor of I Class");
	}
	I(int i , int j){
		System.out.println("param constructor of I class");
	}
}
class J extends I{
//	J(){
//		System.out.println("default constructor of J Class");
//	}
	J(int i , int j){
		//super(2,3);
		System.out.println("param constructor of J class");
	}
}
public class ConstructorDemo {
public static void main(String[] args) {
	
	I i = new J(1,2);
	//J j = new J(1,2);
	
//	I i = new J();
	
//	I i = new I();
//	J j = new J();
	}
}
