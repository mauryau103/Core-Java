package collectionpractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMappractice {
	
	public static void main(String[] args) {
		Map<String, Integer> friendsMap= new HashMap<>();
		
		friendsMap.put("Umesh", 20);
		friendsMap.put("Suvankar", 16);
		friendsMap.put("Ankit", 80);
		friendsMap.put("aakash", 65);
		
		//Collections.reverse(friendsMap);
		System.out.println(friendsMap);
		//1. Iterating or looping Map Using keySet() and foreach loop
		
//		for(String key : friendsMap.keySet()) {
//			System.out.println("key: "+ key +" value: " + friendsMap.get(key) );
//		}
//		 
		//2. Iterating or looping Map Using keySet() and iterator
		
//		Set<String> keySet=friendsMap.keySet();
//		Iterator<String> keyIterator=keySet.iterator();
//		while(keyIterator.hasNext()) {
//			String keyString=keyIterator.next();
//			System.out.println("Key: "+keyString+" value: "+friendsMap.get(keyString));
//		}
		
		//3. Iterating or Looping Map in Java using entrySet() and for each Loop
		
//		Set<Map.Entry<String, Integer>> entries=friendsMap.entrySet();
//		
//		for(Map.Entry entry:entries) {
//			System.out.println("key: "+entry.getKey()+" Values: "+entry.getValue());
//		}
		
		//4. Iterate or loop hashmap using entryset() and Java Iterartor
		
		Set<Map.Entry<String, Integer>> entries=friendsMap.entrySet();
		
		Iterator<Entry<String, Integer>> keyIterator=entries.iterator();
		
		while(keyIterator.hasNext()) {
			Entry<String, Integer> keyString=keyIterator.next();
			System.out.println("Key : "+keyString.getKey()+" Value: "+keyString.getValue());
		}
		
		
		
	}

}
