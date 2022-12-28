package exceptiondemo;


import java.io.IOException;

interface KL{
	void p1() throws IOException;
}

public class Finallydemo implements KL{
	
	void play()
	{
		
	}
	
	void play2() {
		
	}
	
public static void main(String[] args){
	
	Finallydemo fdFinallydemo = new Finallydemo();
	
	
	try {
		String string = null;
		fdFinallydemo.p1();
		System.out.println(string.length()); //throw null pointer exception
		//System.out.println(10/0);
		
	} catch (NullPointerException e) {
		System.out.println("Null pointer Exception caught here");
		// TODO: handle exception
		//throw e; -- it is called as rethrowing an exception
	}
	finally {
		System.out.println("Inside finally");
		//return if I write retiurn here then outside statement are not reachable
		//return;
	}

	System.out.println("Outside Finaaly");
	
}

@Override
public void p1(){
	// TODO Auto-generated method stub
	System.out.println("hii");
	
}
}
