package collectionpractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetIterator {
public static void main(String[] args) {
	
	HashSet<Object> hashSet=new HashSet<>();
	hashSet.add("Umesh");
	hashSet.add(19);
	hashSet.add(2002);
	hashSet.add("Maurya");
	hashSet.add(16);
	hashSet.add(04);
	hashSet.add(2002);
	
	System.out.println(hashSet);
	
//	1. Iterate the HashSet using iterator.
	Iterator<Object> iterator=hashSet.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
//	2. Iterate the HashSet using for each loop.
	for(Object object:hashSet) {
		System.out.println(object);
	}
	

	
}
}
