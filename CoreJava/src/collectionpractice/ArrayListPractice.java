package collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add(5);
		list.add(15);
		list.add("umesh");
		list.add(98);
		list.add(67);
		list.add(45);
		list.add(89);
		
		System.out.println(list);
		
		if(list.contains("umsh")) {
			System.out.println("umesh was found in the list");
		}
		else {
			System.out.println("5 was not found in the list");
		}
	}

}
