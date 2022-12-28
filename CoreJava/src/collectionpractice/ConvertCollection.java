
package collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ConvertCollection {
	
	public static void main(String[] args) {
		
		List<String> strings=new ArrayList<>();
		strings.add("umesh");
		strings.add("aashu");
		strings.add("prabhakar");
		strings.add("shiv");
		strings.add("Shubham");
		//Write a program to convert List to Array
		System.out.println(strings);
		System.out.println(strings.getClass());
		
		System.out.println(strings.toArray());
		System.out.println(strings.getClass());
	}

}
