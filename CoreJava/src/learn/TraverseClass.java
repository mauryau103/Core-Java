package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseClass {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Umesh");
		names.add("Maurya");
		names.add("Rahul");
		names.add("Kumar");
		names.add("Vimlesh");
		names.add("Jyoti");
		
		//For-Each Loop
		System.out.println("_____________(Iterable)For-Each Loop____________");
		for(String str:names) {
			System.out.println(str + "\t" + str.length()+"\t");
			//For reversing the string just use string buffer
			StringBuffer br=new StringBuffer(str);
			System.out.println(br.reverse());
		}
		
		System.out.println("_________Traversing Using Iterator__________");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			String next=itr.next();
			System.out.println(next);
		}
		System.out.println("_________Backward Traversal of collection:ListIterator__________");
		ListIterator<String> ltor=names.listIterator(names.size());
		
		while(ltor.hasPrevious())
		{
			String previous=ltor.previous();
			System.out.println(previous);
		}
		System.out.println("_________foreach() method__________");

		names.forEach(e->{
			System.out.println(e);
		});

		System.out.println("_______Sorting of element using TreeSet___________");
		TreeSet<String> set=new TreeSet<>();
		set.addAll(names);
		set.forEach(e->{
			System.out.println(e);
		});
	}
}
