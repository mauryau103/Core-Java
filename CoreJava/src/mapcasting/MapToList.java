package mapcasting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapToList {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "Umesh");
	map.put(2, "Rahul");
	map.put(3, "Karan");
	map.put(4, "Sameer");
	map.put(5, "Siddhesh");
	map.put(6, "vimlesh");
	
	System.out.println(map);
	
//	ArrayList<Integer> KeyarrayList=new ArrayList<>(map.keySet());
//	ArrayList<String> valueArrayList=new ArrayList<>(map.values());
	
//	System.out.println(KeyarrayList);
//	System.out.println(valueArrayList);
//	
	System.out.println("----------------------------");
	List<Map.Entry<Integer, String>> singleList = map.entrySet()
	        .stream()
	        .collect(Collectors.toList());
	        
	System.out.println("Single list: " + singleList);
	System.out.println(singleList.get(1).getClass());
	Set<Map.Entry<Integer, String>> singleset= map.entrySet().stream().collect(Collectors.toSet());
	System.out.println(singleset);
	/*
	1.Convert Map to List of Map.Entry<K,V>
	2.Convert Map to List using Two Lists
	3.Collectors.toList and Stream.map()
	4.Stream.filter() and Stream.sorted()
	5.Stream.flatMap()
	*/
	
	
	
}
}
