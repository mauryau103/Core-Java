package week1.java8features.lambdaexpression;

public class LambdaImpl{
	
	public static void main(String[] args) {
		System.out.println("My System Starts");
		
		FunctionalOneImpl functionalOneImpl = new FunctionalOneImpl();	
		System.out.println(functionalOneImpl.play(4, 5));
		
		FunctionalOne functionalOne = new FunctionalOneImpl();
		System.out.println(functionalOne.play(5, 8));
		
		FunctionalOne functionalOne2= new FunctionalOne() {
			
			@Override
			public int play(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		System.out.print(functionalOne2.play(5, 9));
		
		FunctionalOne functionalOne3 = (a,b)->{
			System.out.println("Hello guys");
			return a+b;
		};
		System.out.println(functionalOne.play(1,2));
	}

}
