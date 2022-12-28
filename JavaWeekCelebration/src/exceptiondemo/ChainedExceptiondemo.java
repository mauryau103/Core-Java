package exceptiondemo;

public class ChainedExceptiondemo {
public static void main(String[] args) {
	try {
		//creating an exception
		NumberFormatException exception = new NumberFormatException("Exception");
		//setting a cause of the exception
		exception.initCause(new NullPointerException("This is actual cause of the exception"));
		throw exception;
	} catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println(e);  //displaying the exception
		System.out.println(e.getCause()); //getting the actual cause of the exception
	}
}
}
