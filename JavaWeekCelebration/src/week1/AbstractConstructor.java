package week1;


abstract class MyAb{
	MyAb(){
		System.out.println("hii abs c");
	}
}

public class AbstractConstructor extends MyAb{
	
	public AbstractConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("hii class ab");
	}
public static void main(String[] args) {
	AbstractConstructor abs = new AbstractConstructor();
	
}
}
