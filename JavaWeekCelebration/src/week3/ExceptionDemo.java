package week3;



public class ExceptionDemo {
//	public static int methodOne() {
//		try {
//			System.out.println(10/0);
//			System.exit(0);
//			//return 777;
//		}
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//			return 888;
//		}
//		finally {
//			return 999;
//		}
//	}
	
	public static String test() throws Exception{
		try {
			
			System.out.println("try");
			throw new Exception();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch block");
			return "return catch";
		}
		finally {
			System.out.println("finally");
			return "Return in finally";
		}
	}
		
	
public static void main(String[] args) throws Exception {
	//System.out.println(methodOne());
	//System.out.println(10/0);
//	try {
//		System.out.println(10/0);
//	} catch (ArithmeticException e) {
//		// TODO: handle exception
//		System.out.println(10/0);
//	}
//	finally {
//		String string = null;
//		System.out.println(string.length());
//	}
	
	System.out.println(ExceptionDemo.test());
}
}
