package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//This is fail-fast - it means it throw an exception
public class ArrayLis {
	 
//Method 1: Using add() method

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("String 1");
		al.add("String2");
		
		for(String s1 : al) {
			System.out.println(s1);
		}
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("using stream api");
		
		al.stream().forEach(System.out::println);
		
		
	ArrayList<String> aList = new ArrayList() {{
		add("String1");
		add("String2");
		add("String3");
		
		
	}};
	
	//sort arraylist in ascending order
	//Program for Sorting String ArrayList
	ArrayList<String> countrieslist = new ArrayList<String>();
    countrieslist.add("USA");
    countrieslist.add("UK");
    countrieslist.add("India");
    countrieslist.add("Canada"); 
    
    /*Unsorted Countries List*/
    System.out.println("Countries List Before Sorting:");
    for(String counter: countrieslist){
        System.out.println(counter);
    }


    /* Sort ArrayList using 
       Collections.sort(list) method*/
    Collections.sort(countrieslist);
	
    /* Sorted Countries List*/
    System.out.println("Countries List After Sorting:");
    for(String counter: countrieslist){
       System.out.println(counter);
	
}
    //Sorting of ArrayList in Descending Order
    /*1. Using Collections.reverseOrder() method*/
    Collections.sort(countrieslist,Collections.reverseOrder());
    /* Sorted List in reverse order*/
    System.out.println("ArrayList in descending order:");
    for(String str: countrieslist){
       System.out.println(str);
    
	}
    
    /*Now lets see Sorting Arraylist using comapartor and comaparble*/
    
    ArrayList<Student> arraylist = new ArrayList<Student>();
    arraylist.add(new Student(111, "John", 23));
    arraylist.add(new Student(222, "Messi", 29));
    arraylist.add(new Student(333, "Ronaldo", 31));
    
    /*we will get error on the folloowing code due to object */
    Collections.sort(arraylist);
    
    //Sorting of ArrayList(Object) Using Comparable
    //Collections.sort(arraylist);

    for(Student str: arraylist){
   System.out.println(str);
    }
    
    //Convert HashSet To An ArrayList (List)
    
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Mango");
    hashSet.add("Banana");
    hashSet.add("Pear");

 // Showing HashSet elements
    System.out.println("Hashset conatins : " + hashSet);
    
    // Converting HashSet to ArrayList
    List<String> list = new ArrayList<String>(hashSet);

 // Showing ArrayList elements
    System.out.println("ArrayList contains :"+list);
    
  //Synchronize ArrayList In Java
    
    List<String> syncList = Collections.synchronizedList(new ArrayList<>());
    syncList.add("Umesh");
    syncList.add("Aashu");
    syncList.add("Ritik");
    syncList.add("Rahul");
    
    System.out.println("Synchronized ArrayList Iteration:");
    //normal syncronized iteration --- 
    
    Iterator<String> iterator2 = syncList.iterator();
    while(iterator2.hasNext()) {
    	//syncList.add("Kumari");
    	System.out.println(iterator2.next());
    }
    
    //synchrinized block iteration of synchronized list
    
    synchronized (syncList) {
		Iterator<String> iterator3 = syncList.iterator();
		while(iterator.hasNext()) {
			syncList.add("Kumari");//-- it doesnot throw any exception it behave as a failsafe synchronized list
			System.out.println(iterator3.next());
		}
		 System.out.println(syncList);
	}
   
    
	}
	
}