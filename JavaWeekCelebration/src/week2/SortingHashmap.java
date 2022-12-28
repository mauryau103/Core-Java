package week2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class SortingHashmap {
	
	
public static void main(String[] args) {
	
	// Creating a HashMap of int keys and String values
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
 
    // Adding Key and Value pairs to HashMap
    hashmap.put(22,"A");
    hashmap.put(55,"B");
    hashmap.put(33,"Z");
    hashmap.put(44,"M");
    hashmap.put(99,"I");
    hashmap.put(88,"X");
 
    System.out.println("normal printing with sout : " + hashmap);
    
    System.out.println("Sorting with Iterator using keyset : ");
    
    Set<Integer> mySet = hashmap.keySet();
    Iterator<Integer> iterator = mySet.iterator();
   // Iterator<Integer> iterator2 = (Iterator<Integer>) hashmap.keySet();
    while(iterator.hasNext()) {
    	Integer mykeyInteger = iterator.next();
    	System.out.println("Key :"+mykeyInteger+" Value : "+hashmap.get(mykeyInteger));
    }
    //Sorting by keys
    System.out.println("sorting the hashmap by using TreeMap constructor " );
    TreeMap<Integer, String> treeMap = new TreeMap<>(hashmap);
    System.out.println("sorted tree map"+treeMap);
    
    //first get all the keys of the hashmap object
    // Getting all the keys of the HashMap object
    Set<Integer> keys = hashmap.keySet();
    
    // Iterating through the HashMap
    Iterator<Integer> it = keys.iterator();
    while (it.hasNext())
    {
        it.next();
        it.remove();
    }
    
    // Displaying the transformed HashMap object
    System.out.println("Updated HashMap: "+ hashmap);
   System.out.println(hashmap);
  
    

	
}
}
