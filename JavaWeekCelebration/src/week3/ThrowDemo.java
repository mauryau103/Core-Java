package week3;



public class ThrowDemo{
	
	public static int m1()  {
		try {
			//System.out.println(10/0);	
			System.out.println("try");
			throw new Exception("My exception");
			//return 77;
		} catch (Exception e) {
			// TODO: handle exception
			//throw new ArithmeticException("you are dividing by zero /0");
			System.out.println("catch");
			return 11;
			
		}
		finally {
			System.out.println("finally");
			return 2;
		}
	}
	
	public static void main(String[] args){	
		
		//throw new ThrowDemo();
		System.out.println(m1());
		
		
	}

}
