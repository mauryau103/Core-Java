package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;

class Constr3{
	protected Constr3() throws FileNotFoundException{
		// TODO Auto-generated constructor stub
	}
}
class Constr4 extends Constr3{
	Constr4() throws IOException{
		
	}
}
public class ProtectedConstructorException {
	
	protected ProtectedConstructorException() throws IOException{
		
	}

}
