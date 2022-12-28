package collectionpractice;
//Write a program to traverse (or iterate) ArrayList?

import java.util.ArrayList;
import java.util.List;




public class TraverseLoop {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
		 
		 ls.add(12);
		 ls.add(56);
		 ls.add(11);
		 ls.add(39);
		 ls.add(98);
		 ls.add(99);
		 ls.add(43);
		 
		 
		 System.out.println(ls);
		 System.out.println("Using advanced for loop");
		 
		 for(Integer num:ls) {
			 System.out.println(num);
		 }
	}
	
 
 
 

}
