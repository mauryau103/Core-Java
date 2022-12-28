package learn;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String,Integer> courses=new HashMap<>();
		
		courses.put("Core Java", 4000);
		courses.put("Basic Python", 3500);
		courses.put("spring", 8000);
		
		System.out.println(courses);
		courses.forEach((e1,e2)->{
			System.out.println(e1+"=>"+e2);
		});
	}
}
