package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Get student with exact match name "jayesh"
//Get student with matching address "1235"
//Get all student having mobile numbers 3333.
//Get all student having mobile number 1233 and 1234
//Create a List<Student> from the List<TempStudent>
//Convert List<Student> to List<String> of student name
//Convert List<students> to String
//Change the case of List<String>
//Sort List<String>
//Conditionally apply Filter condition, say if flag is enabled then.

public class StreamDemo {
	
	
public static void main(String[] args) {
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(1,"umesh",1200L));			
	list.add(new Employee(2,"aashu",1300L));
	list.add(new Employee(3,"Pushakr",3400L));
	
	System.out.println(list);
	
	List<Employee> list2=list.stream().filter(s->s.getSalary()<1300L).collect(Collectors.toList());
	System.out.println(list2);
	
	
	list.stream().sorted((o1,o2)->o2.getName().compareTo(o1.getName())).forEach(System.out::println);
}

}
