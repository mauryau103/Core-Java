package week1;
import java.util.*;
public class GenericDemo {
	public static void main(String[] args) {
		
		//This is generic type means it is typesaftey
		//compile time checking
		List<String> list = new ArrayList<>();
		list.add("UMesh");
		list.add("LCWD");
		System.out.println(list);
		
		//now below given list is not a type safety
		//non type safety
		List list2 = new ArrayList();
		list2.add("Good");
		list2.add(2);
		System.out.println(list2);
		
		
	}

}
