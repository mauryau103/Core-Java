package Lambda;



interface Interf{
	
	public void add(int a,int b);
	
} 
//class Demo implements Interf{
//	//this is not required now 
//	public void m1() {
//		System.out.println("Hello...");
//	}
//}

//class Prac{
//	public Prac() throws IOException{
//		// TODO Auto-generated constructor stub
//	}
//}
//
//class prac2 extends Prac{
//	public prac2() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//}
public class Test{
	
	
public static void main(String[] args) {
	
//	Interf i = new Demo();
//	i.m1();
	
	Interf  interf = (a,b)->System.out.println("Hello....");
	interf.add(1,2);
	
}
}
