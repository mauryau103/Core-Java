package week1;

import java.util.Optional;

public class OptionalClassDemo {
	
	
	  
	
	public static Optional<String> getName(){
		 String name="durgesh";
		 return Optional.ofNullable(name);
		 
		 
	}
	
public static void main(String[] args) {
	
	String string=null; 
	
//	if(string==null) {
//		System.out.println("This is null object");
//	}
//	else {
//		System.out.println(string.length());
//	}
//	
	
	/*now this above code we can do by using optional and we can get optional class by there static methods*/
	
	 Optional<String> optional=  Optional.ofNullable(string);
	 System.out.println(optional.isPresent());
//	 System.out.println(optional.get());
	 System.out.println(optional.orElse("No value in this object"));
	 
	Optional<String> nameOptional= getName();
	System.out.println(nameOptional.orElse("null return"));
	 
}
}
