package week3;



class TooYoungException extends RuntimeException{
	public TooYoungException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

class MyThrows{
	public MyThrows(){
		// TODO Auto-generated constructor stub
	}
	  void method1() {
		System.out.println("In method1 of mythrows");
	}
}
class MyThrows2 extends MyThrows{
	public MyThrows2(){
		// TODO Auto-generated constructor stub
	}
	  void method1() {
		System.out.println("In method1 of mythrows 2");
	}
}
public class ThrowsDemo{
	public static void main(String[] args)  {
		int age =16;
		if(age<20) {
			throw new TooYoungException("You are to young ");
		}
	}

}
