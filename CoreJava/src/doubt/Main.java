package doubt;

public class Main implements FirstInterface,SecondInterface{

	@Override
	public int myme(int a,int b) {
		// TODO Auto-generated method stub
		System.out.println("I am in secondinterface");
		return a+b;
	}
	@Override
	public double myme(float a, int b) {
		// TODO Auto-generated method stub
		System.out.println("I am in firstinterface");
		return a+b;
	}

	public static void main(String[] args) {
		Main main = new Main();
		int result=main.myme(2,3);
		System.out.println(result);
		
	}
	
}
