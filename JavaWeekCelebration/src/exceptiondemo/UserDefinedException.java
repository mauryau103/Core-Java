package exceptiondemo;

public class UserDefinedException extends Exception {
String errorMessage;

public UserDefinedException(String errorMessage)
{
	super(errorMessage);
	this.errorMessage = errorMessage;
	
}

}
