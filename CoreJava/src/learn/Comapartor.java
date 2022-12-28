package learn;

import java.util.ArrayList;
import java.util.Collections;

public class Comapartor {
public static void main(String[] args) {
	
	ArrayList<Emp> emps=new ArrayList<>();
	emps.add(new Emp("Umesh", "8654378900", 12) );
	emps.add(new Emp("Vimlesh", "8654378800", 10) );
	emps.add(new Emp("Aashu", "8654378897", 45) );
	System.out.println(emps);
	System.out.println("*****Sorting is done EmPId");
	Collections.sort(emps,new IdComparator());
	System.out.println(emps);
	System.out.println("******************************");
	
	ArrayList<Emp> emps1=new ArrayList<>();
	emps1.add(new Emp("Rahul", "865456000", 22));
	emps1.add(new Emp("Sidhhesh","8657868800",9));
	emps1.add(new Emp("Akshat", "7864378897", 54));
	
	System.out.println(emps1);
	System.out.println("*****Sorting is done EmPName");
	Collections.sort(emps1,new NameComparator());
	System.out.println(emps1);
	System.out.println("******************************");
	
	
	//Comparable
	
	
	
}
}
