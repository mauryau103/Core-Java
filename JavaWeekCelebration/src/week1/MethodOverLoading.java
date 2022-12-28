package week1;


/*In method overloading we can overload any method by changing its parameter and increase some argument.
 */

class Over{
	protected Integer mymethod(int a,int b){
		System.out.println("I am in my method ");
		return a+b;
	}
	//overriding method by just changing the parameter type
	public Integer mymethod(Integer b,Integer c) {
		
		System.out.println("I am in overloaded method by just changing the parameter type");
		
		return b+c;
		
	}
}

public class MethodOverLoading {
	
	public static void main(String[] args) {
		
		Over over = new Over();
		
		System.out.println(over.mymethod(3, 4));
		
		System.out.println(over.mymethod(1, 3));
				
	}

}
