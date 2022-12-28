package streamapi;

import java.util.stream.Stream;

public class StreamObject {
public static void main(String[] args) {
	
	//stream Api - collection process
	//collection ke alawa hum group of object pe bhi stream use kar sakte hai like arrays
	
	String names[] = {"Durgesh","Umesh","Ankit","Divya","Uttam"};
	
	Stream<String> stream1=Stream.of(names);
	 
	stream1.forEach(e->{
		System.out.println(e);
	});
}
}
