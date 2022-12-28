package exceptiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

import week3.ThrowsDemo;

public class HandleUserDefined {

public static void main(String[] args) throws UserDefinedException {
	
	
	
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Your age");
	int age = scanner.nextInt();
	
//	final ArrayList<String> arrayList = new ArrayList<>();
//	arrayList.add("Umesh");
//	 List<String> immutablelist = Collections.unmodifiableList(arrayList);
//	immutablelist.add("Kurla");
//	System.out.println(immutablelist);
//	System.out.println(arrayList);
	//inta=12;
	
	
	
	
		if(age<3) {		
			throw new UserDefinedException("Age can not be less than 0");
		
	} 
	
	
}
}
