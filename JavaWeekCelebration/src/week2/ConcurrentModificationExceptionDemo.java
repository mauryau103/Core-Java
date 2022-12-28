package week2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("helloo");
		
		
		List<Integer> mylist = new ArrayList<>();
		
		mylist.add(12);
		mylist.add(35);
		mylist.add(67);
		
		System.out.println(mylist);
		
		
		Iterator<Integer> itr = mylist.iterator();
		
		while(itr.hasNext()) {
			
			mylist.add(89);
			
			System.out.println(itr.next());
		}
	}

}
