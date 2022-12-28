package learn;


//import util pakage[all classes]
import java.util.*;

public class StartCode {
		public static void main(String[] args) {
			System.out.println("Welcome to code java collection framewrok");
			
			/*creating collection
			 * 1} Type safe collection 
			 * 
			 * 2} u type safe 
			 */
			 //type safe collection
			ArrayList<String> names=new ArrayList<String>();
			names.add("umesh");
			names.add("Maurya");
			names.add("umesh");
			System.out.println(names);
			System.out.println(names.get(0));
			
			//Un type safe
			LinkedList list=new LinkedList();
			
			list.add("sachin");
			list.add("101");
			list.add(625.789);
			list.add(true);
			System.out.println(list);
			
			names.remove("umesh");
			System.out.println(names);
		System.out.println("SIZE = "+names.size());
		System.out.println(names.contains("Maurya"));
		System.out.println(names.isEmpty());
		
		
		Vector<String> vector = new Vector<>();
		vector.addAll(names);
		System.out.println(vector);
		
		System.out.println("___________________________________-");
		
		HashSet<Double> num=new HashSet<>();
		num.add(14.14);
		num.add(234.143);
		num.add(254.678);
		num.add(123.456);
		num.add(14.14);
		System.out.println(num);
		
		TreeSet<Double> tset= new TreeSet<>();
		tset.addAll(num);
		System.out.println(tset);
		
		}
		//
}

