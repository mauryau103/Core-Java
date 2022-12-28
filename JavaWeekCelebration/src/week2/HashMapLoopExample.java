package week2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/*
1. for-each loop
2. keyset() iterator
3. entrySet() and for loop
4. entrySet() and java iterator
*/

public class HashMapLoopExample {
	public static void main(String[] args) {
		//creating  a hashmap of string keys and string values
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("first", "Umesh");
		hashMap.put("second", "Aashu");
		//simple sout
		System.out.println(hashMap);
		System.out.println("Iterating or looping map using foreach loop");
		//iterating or looping using keyset() method
		
		for(String key:hashMap.keySet()) {
			System.out.println("Key: "+key+" value: "+hashMap.get(key));
		}
		//iterating using keyset and iterator
		
		Set<String> mySet = hashMap.keySet();
		Iterator<String> iterator = mySet.iterator();
		while(iterator.hasNext()) {
			String keyString = iterator.next();
			System.out.println("key: "+keyString+"value : "+hashMap.get(keyString));
		}
		//iterating through entryset and for loop
		
		Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
		for(Map.Entry entry : entrySet) {
			System.out.println("Key: "+entry.getKey()+" value: "+entry.getValue());
		}
		
		//iterate hashmap using entrySet() and java iterator
		
		Set<Map.Entry<String, String>> entrySet2 = hashMap.entrySet();
		Iterator<Map.Entry<String, String>> entryIterator = entrySet2.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry entry = entryIterator.next();
			System.out.println("Key : "+entry.getKey());
			System.out.println("Value : "+entry.getValue());
		}

		
	}

}
