package doubt;

public class Doubt2 {
	void a(Object o)
	{System.out.println("I am object");}
	void a(String s){System.out.println("I am string");}
public static void main(String[] args) {
	Doubt2 doubt2 = new Doubt2();
	doubt2.a(doubt2);
}
}
