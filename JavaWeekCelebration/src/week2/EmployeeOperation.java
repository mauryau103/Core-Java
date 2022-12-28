package week2;

import java.time.temporal.Temporal;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
1.Sort List of String objects in Ascending order using Java 8 Stream APIs
2.Sort List of String objects in Descending order using Java 8 Stream APIs
3.Sort List of Employee objects in Ascending order using Java 8 Stream APIs
4.Sort List of Employee objects in Descending order using Java 8 Stream APIs
*/
public class EmployeeOperation {
	
	public static void main(String[] args) {
		
		List<String> mList = new ArrayList<>();
		mList.add("Banana");
		mList.add("Orange");
		mList.add("Apple");
		mList.add("Watermelon");
		mList.add("JackFruit");
		mList.add("Mango");
		mList.add("DragonFruit");
		
		System.out.println("ArrayList without sorting : " + mList);
		//Ascending Order
		//Collections.sort(mList);
		//System.out.println("ArrayList sorted using collection.sort() : "+ mList);
		
		//1.Sort List of String objects in Ascending order using Java 8 Stream APIs
		//using comparataor.naturalorder
		List<String> shortedList = mList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("Shorted List using Comaparator.naturalorder() and java8 : "+shortedList);
		//using comparator method of comparable.
		List<String> shortedList2 = mList.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("shorted list using compareto method of comparable in sorted java 8 :" + shortedList2);
		//using simple sorted and then collect it inside the list
		List<String> shortedList3 = mList.stream().sorted().collect(Collectors.toList());
		System.out.println("shorted using simple sorted : " + shortedList3);
		
		//2.Sort List of String objects in Descending order using Java 8 Stream APIs
		//using comparator.reverseorder();
		List<String> sortedList4 = mList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("sorted descending list in reverseorder using comparator.reverseorder : "+ sortedList4);
		//using compareto method but just reverse the comparision
		List<String> shortedList5 = mList.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println("shorted in descending using compareto reverse comparision : "+shortedList5);
		
		//3.Sort List of Employee objects in Ascending order using Java 8 Stream APIs
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10,"Umesh",1800L));
		employees.add(new Employee(23,"Aashu",1500L));
		employees.add(new Employee(67,"Shubham",2500L));
		employees.add(new Employee(98,"Kumar",800L));
		employees.add(new Employee(8,"Vishwas",6900L));
		
		System.out.println(employees);
		
		//sorting list of employees in asc order with salary using comparable -->compareto method
		
		List<Employee> employeeSortedList = employees.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
		System.out.println(employeeSortedList);
		
		//sorting list of employee in asc using comparator.comparingLong
		
		List<Employee> employeeSortedList2 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(employeeSortedList2);
		
		
	}

} 	
