package week1;

public class StringAll {
	
public static void main(String[] args) {
	
	String str1 ="Umesh";
	String str2="Umesh";
	System.out.println(str1==str2);
	
	String str3 = new String("Umesh");
	
	System.out.println(str1==str3); //refrence check karta hai
	System.out.println(str1.equals(str2)); //value check karta haii
	System.out.println(str1.equals(str3));
	
	
	StringBuffer stringBuffer = new StringBuffer(str1);
	StringBuffer stringBuffer2 = new StringBuffer("Umesh");
	//System.out.println(stringBuffer.append(stringBuffer2));
	System.out.println(stringBuffer);
	System.out.println(stringBuffer2);
	System.out.println(stringBuffer.reverse());
	StringBuilder stringBuilder = new StringBuilder("Hello");
	System.out.println(stringBuilder);
	stringBuilder.append("All");
	System.out.println(stringBuilder);
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.charAt(2));
	
	System.out.println("______________________________");
	
	String s1 = "abc";
	System.out.println(s1);
	
	String s2 = new String("abc");
	System.out.println(s2);
	
	String s3 = new String("foo");
	System.out.println(s3);
	
	String s4 = s1.intern();
	System.out.println(s4);
	
	String s5 = s2.intern();
	System.out.println(s5);
	
	System.out.println("________________________________");
	
	System.out.println(s3==s4);
	System.out.println(s1==s5);
	
	
}
}
