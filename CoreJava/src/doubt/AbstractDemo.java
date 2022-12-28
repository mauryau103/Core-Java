package doubt;

abstract class Calculate{
	
	abstract int multiply(int a, int b);
}

interface A{
	void umesh();
	
}

public class AbstractDemo extends Calculate{

	public static void main(String[] args) {
		int result=new Calculate() {
			
			@Override
			int multiply(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		}.multiply(21, 22);
		System.out.println(result);
		
	}

	@Override
	int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}
