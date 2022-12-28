package Lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

/*1.Functional Interface - only one method ex -- Runnable,Comparable,Callable
 * 2.Lambda Expression - no method name,no param data type , no return type ....etc.
 * 3.Lambda with anonymous class.
 * 4.Default Methods of interface
 * 5.Method Reference in method->static ,non static,Constructor,
 * 6.Stream Api 
 */


//functional Interface
interface FunctionalInterface1{
	void play();
}
interface secondfun{
	int sum(int a,int b);
}
interface DefaultMethodInterface{
	default void DisplayMod() {
		System.out.println("I am in default method of interface");
	}
}

//constructor reference
interface massageable{
	void getMassage(String s);
}
 class Message{
	public Message(String s) {
		// TODO Auto-generated constructor stub
		System.out.println(s);
	}
}

//Implemeting the Functional Interface
class FunctionalIntImpl implements FunctionalInterface1{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Hii i am in functional interface impl");
		
	}
	
	//Static Method Reference
	static void print1() {
		System.out.println("Inside static method print");
	}
	void nonprint() {
		System.out.println("Inside non static method");
	}
	
	
}

public class Lambda implements DefaultMethodInterface{
	
	public static void main(String[] args) {
		
		
		FunctionalIntImpl functionalIntImpl = new FunctionalIntImpl();
		functionalIntImpl.play();
		
		FunctionalInterface1 functionalInterface1= new FunctionalIntImpl();
		functionalInterface1.play();
		
		//annonymous class with functional interface
		FunctionalInterface1 functionalInterface12 = new FunctionalInterface1() {
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("I am in functional interface of annonymous class");
			}
		};
		functionalInterface12.play();
		
		//lambda expression with functional interface
		/*
		 * play(){
		 * sout();
		 * }
		 * 
		 */
		FunctionalInterface1 functionalInterface13 = ()->System.out.println("heelo lambda");
		functionalInterface13.play();
		
		secondfun secondfun = (a,b)->a+b;
		System.out.println(secondfun.sum(2, 3));
		
		Runnable runnable = ()->{
			System.out.println("I am in thread logic");
		};
		runnable.run();
		
		//default method of interface
		Lambda lambda = new Lambda();
		lambda.DisplayMod();
		
		
		//Method Reference
		//static
		FunctionalInterface1 functionalInterface14 = FunctionalIntImpl::print1;
		functionalInterface14.play();
		
		//nonstatic
		FunctionalIntImpl functionalIntImpl2 = new FunctionalIntImpl();
		FunctionalInterface1 functionalInterface15 = functionalIntImpl2::nonprint;
		functionalInterface15.play();		
		
		//constructor referencen --> method can override constructor by using constructor reference
		massageable massageable = Message::new;
		massageable.getMassage("Wassup this is constructor refernce");
	
		
		//Stream Api ---Easy hai -- Chindi Hai
		
		//Without Stream APi Program
		// create a list and elimeinate even numbers
		List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,8));
		
		List<Integer> arr = List.of(1,2,3,4,5,6);
		
		List<Integer>newarr = new ArrayList<>();
		for (Integer integer : arr) {
			if(integer%2 == 0) {
				newarr.add(integer);
			}
		}
		System.out.println(newarr);
		
		Stream<Integer> liStream = arr.stream();
		//List<Integer>evenList = liStream.filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(evenList);
		
		//liStream.filter(i->i%2==0).forEach(System.out::println);
		
		//List<Integer> squareList = arr.stream().map(i->i*i).collect(Collectors.toList());
		//System.out.println(squareList);
		
		liStream.sorted().forEach(System.out::println);
	}
	
	
	
}

