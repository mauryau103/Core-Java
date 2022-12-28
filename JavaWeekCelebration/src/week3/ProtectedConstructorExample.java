package week3;

import java.io.IOException;

import exceptiondemo.ProtectedConstructorException;

public class ProtectedConstructorExample extends ProtectedConstructorException {
	
	public ProtectedConstructorExample() throws IOException {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ProtectedConstructorException protectedConstructorException = new ProtectedConstructorExample();
	}

}
