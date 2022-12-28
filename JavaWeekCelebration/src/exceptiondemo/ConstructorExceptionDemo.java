package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;

class Constr1{
 Constr1() throws IOException {
		// TODO Auto-generated constructor stub
	}
}
class Constr2 extends Constr1{
	public Constr2() throws IOException,FileNotFoundException {
		
	}
}
public class ConstructorExceptionDemo {

}
