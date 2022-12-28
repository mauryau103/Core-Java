package Lambda;

interface Interf2{
	public static void m1(){
		System.out.println("Interface static method");
	}
}
//implements Interf2
public class SttaicMethodDemo {
	
public static void main(String[] args) {
	/*Interface static method should be called using interface name only*/
	Interf2.m1(); //this is correct
	/*Interface static method is not available by default in there impplemeted class*/
	//SttaicMethodDemo.m1(); //--Throws eror
	//m1(); //--Throws eror
	SttaicMethodDemo staticMethodDemo=new SttaicMethodDemo();
	//staticMethodDemo.m1(); //--Throws eror
}
}
  