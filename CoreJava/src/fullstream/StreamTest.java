package fullstream;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.security.auth.x500.X500Principal;



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
public class StreamTest {
public static void main(String[] args) {
	
	Student student1=new Student(
			"Jayesh",
			20,
			new Address("1234"),
	 		Arrays.asList(new MobileNumber("1233"),new MobileNumber("1234")));
	Student student2=new Student(
			"Khyati",
			20,
			new Address("1235"),
			Arrays.asList(new MobileNumber("1111"),new MobileNumber("3333")));
	Student student3=new Student(
			"Jason",
			20,
			new Address("1236"),
			Arrays.asList(new MobileNumber("3333"),new MobileNumber("4444")));
	
	List<Student> students = Arrays.asList(student1,student2,student3);
	
	System.out.println(students);
	
	/*
	 * Get student with exact match name "jayesh"
	 * when we have to get whole object as a return then we use Optional class*/
	
	Optional<Student> stud = students.stream().filter(student -> student.getName().equals("Jayesh")).findFirst();
	System.out.println(stud.isPresent() ? stud.get().getName():"Not Found");
	System.out.println("___________________");
	
	/*
	 * Get student with matching address "1235"
	 * */
	
	Optional<Student> stud2 = students.stream().filter(student -> student.getAddress().getZipcode().equals("1235")).findFirst();
	System.out.println(stud2.isPresent() ? stud2.get().getName():"Not Found");
	System.out.println(stud2);
	System.out.println("___________________");
	
	/*
	 * Get all student having mobile numbers 3333
	 * */
	List<Student> stud3 = students.stream().filter(student -> student.getMobileNumbers().stream().anyMatch(x->Objects.equals(x.getNumber(),"3333"))).collect(Collectors.toList());
	System.out.println(stud3);
	
	String result1 = stud3.stream().map(std-> std.getName()).collect(Collectors.joining(",","[","]"));
	System.out.println(result1);
	System.out.println("___________________");
	
	/*****************************************************
    Get all student having mobile number 1233 and 1234
    *****************************************************/
	
	List<Student> stud4 = students.stream().filter(student -> student.getMobileNumbers().stream().allMatch(x->Objects.equals(x.getNumber(), "1233") ||  Objects.equals(x.getNumber(), "1234"))).collect(Collectors.toList());
	System.out.println(stud4);
	
	String result2 = stud4.stream().map(std-> std.getName()).collect(Collectors.joining(",","[","]"));
	System.out.println(result2);
	
	/*****************************************************
    Convert List<students> to String
   *****************************************************/
	
	String result3 = students.stream().map(Student::getName).collect(Collectors.joining(",","[","]"));
	System.out.println(result3);
	System.out.println("--------------------");
	 
    /*****************************************************
     Change the case of List<String>
    *****************************************************/
	
	List<String> nameList = students.stream().map(stude->stude.getName()).toList();
	System.out.println(nameList);
	
	nameList.stream().map(String::toUpperCase).forEach(System.out::println);
	 System.out.println("--------------------");
	 /*****************************************************
     Sort List<String>
     *****************************************************/
	 nameList.stream().sorted().forEach(System.out::println);
	 
	 students.forEach(s->System.out.println(s.getName()));
}
}
