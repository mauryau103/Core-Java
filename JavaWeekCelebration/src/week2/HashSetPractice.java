package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;





public class HashSetPractice {
	public static void main(String[] args) {
		// Declaring a HashSet
	    HashSet<String> hashset = new HashSet<String>();
	    // Add elements to HashSet
	    hashset.add("Pear");
	    hashset.add("Apple");
	    hashset.add("Orange");
	    hashset.add("Papaya");
	    hashset.add("Banana"); 
	    
	    //GEt Iterator
	    Iterator<String> iterator = hashset.iterator();
	    //show hashet elements
	    System.out.println("HashSet Contains : ");
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	     
	    //Hashet to List
	    List setList = new ArrayList<>(hashset);
	    System.out.println(setList);
	    
	    //hashet to treeset
	    //1.using simple constructor off treeset
	    Set treeSet = new TreeSet<>(hashset);
	    System.out.println(treeSet);
	    
	    //2.using add all method
	    Set treeSet2 = new TreeSet<>();
	    treeSet2.addAll(treeSet);
	    System.out.println(treeSet2);
	    
	    //hashet to array
	    
	    String[] array = new String[hashset.size()];
	    hashset.toArray(array);
	    //print
	    for(String str2:array) {
	    	System.out.println(str2);
	    }
	    
	   /* Hashet and CopyOnWriteArraySet */
	    
	    HashSet<String> hsobj = new HashSet<String>();
	    hsobj.add("Alive is awesome");
	    hsobj.add("Love Yourself");
	    System.out.println(hsobj);
	    System.out.println("Hashet object output :" + hsobj);
	    
//	    Iterator<String> iterator2 = hsobj.iterator();
//	    while(iterator2.hasNext()) {
//	    	hsobj.add("umesh");
//	    	System.out.println(iterator2.next());
//	    }
	    
	    CopyOnWriteArraySet<String> coponwrtobj = new CopyOnWriteArraySet<String>();
	    coponwrtobj.add("Alive is awesome");
	    coponwrtobj.add("Love Yourself");
	    System.out.println("CopyOnWriteArraySet Object output :"+coponwrtobj);
 	    
	    Iterator<String> iterator2 = coponwrtobj.iterator();
	    while(iterator2.hasNext()) {
	    	coponwrtobj.add("umesh");
	    	System.out.println(iterator2.next());
	    }
	    System.out.println(coponwrtobj);
	}

}
