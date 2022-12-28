package mapcasting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Umesh");
		map.put(2, "Rahul");
		map.put(3, "Karan");
		map.put(4, "Sameer");
		map.put(5, "Siddhesh");
		map.put(6, "vimlesh");
		
		System.out.println(map);
		
		ArrayList<Integer> KeyarrayList=new ArrayList<>(map.keySet());
		ArrayList<String> valueArrayList=new ArrayList<>(map.values());
		
	
//		int i = 0;
//		Map<Integer, String> result1 = valueArrayList.stream().collect(
//                Collectors.toMap(5, valueArrayList.stream().forEach((e)->System.out.println(e))));
//
//        System.out.println("Result 1 : " + result1);
		
		Map<String, String> res1 = new HashMap<>();
	}

}
