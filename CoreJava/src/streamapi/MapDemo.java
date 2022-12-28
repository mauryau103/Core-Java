package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
public static void main(String[] args) {
	List<String> names=List.of("Aman","Ankit","Abhinav","Durgesh");
//filter	
List<String> newName=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
System.out.println(newName);
//map
List<Integer> number=List.of(23,4,2,5,7,4);
List<Integer> newNumbers= number.stream().map(i->i*i).collect(Collectors.toList());
System.out.println(newNumbers);
}
}
