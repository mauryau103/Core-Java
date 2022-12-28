package Lambda;

import java.util.ArrayList;


import java.util.Collections;
import java.util.Comparator;

class Employee5{
	public String name;
	public int id;
	
	public Employee5(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Employee5() {
		super();
	}

	@Override
	public String toString() {
		return "Employee5 [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}

class MyComparator implements Comparator<Employee5>{

	@Override
	public int compare(Employee5 o1, Employee5 o2) {
		// TODO Auto-generated method stub
		if(o1.id<o2.id) {
			return 1;
			
		}
		else if(o1.id>o2.id) {
			return -1;
			
		}
		else {
			return 0;
		}
		
	}
}

public class LambdaCollection {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(25);
		list.add(5);
		list.add(30);
		list.add(0);
		list.add(15);
		list.add(7);
		System.out.println(list);
		//normal sorting is done  via sort method
		Collections.sort(list);
		
		System.out.println(list);
		
		
		ArrayList<Employee5> l=new ArrayList<>();
		l.add(new Employee5("Durga",8765));
		l.add(new Employee5("Sunny",2134));
		l.add(new Employee5("Durga",7653));
		l.add(new Employee5("Durga",9865));
		l.add(new Employee5("Durga",1234));
		
		//now using lambda expression
				//descending order 
				Collections.sort(l,new MyComparator());		
		
		System.out.println(l);
		//ternary operator
		Collections.sort(l,(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);
		
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		
		Collections.sort(l,Comparator.comparing(Employee5::getId));
		
		
		System.out.println(l);
		
		//how to find second highest salary of employee on the basis of employee id.
		//Collections.sort(l,(e1,e2));
		
		
		Collections.sort(l,Comparator.comparing(Employee5::getId).reversed());
		System.out.println(l.get(1));
	}

}


