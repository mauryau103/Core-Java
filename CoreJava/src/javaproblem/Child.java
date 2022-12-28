package javaproblem;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent{

	public Child() {
		//super("yuvraj", 23);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
//		Parent parent=new Parent("Rahul", 23);
//		System.out.println(parent.toString());
		List<Integer> myList=new ArrayList<>();
		
		myList.add(23);
		myList.add(34);
		myList.add(56);
		myList.add(78);
		myList.add(80);
		
		
	System.out.println(myList);
	
	myList.stream().forEach(System.out::println);
	//myList.stream().forEach(Sy);
	}
}
