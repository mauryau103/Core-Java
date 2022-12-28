package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
public static void main(String[] args) {
	
	
	//create a list and filter all even numbers from list.
	List<Integer> list1=List.of(2,3,50,21,22,65);
//	list1.add(12); we can not add element in list because it is immutuable
	System.out.println(list1);
	
	
	
	//without stream
	List<Integer> listeven=new ArrayList<>();
	
	for(Integer i:list1)
	{
		if(i%2==0) {
			listeven.add(i);
		}
	}
	
	System.out.println(listeven);
	
	//above codes are called bolylor lates code kyu ki wo bhut bada hai isliye use boyler plate code bolte hai
	
	//Now by using stream api
	
	Stream<Integer> stream =list1.stream();
	List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(newList);
	
}
}
