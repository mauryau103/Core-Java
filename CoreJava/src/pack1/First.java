package pack1;

class Practice{
protected String nameString="Umesh";
	static int x=10;
	 static void defaultclass() {
		System.out.println("I in default class");
	}
}

public class First  {
	
public static void main(String[] args) {
	Practice practice=new Practice();
Practice.defaultclass();
System.out.println(practice.nameString);
System.out.println(Practice.x);
  
}
}
