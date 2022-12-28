package SharingArrayList;

import java.util.ArrayList;
import java.util.List;

public class Sample {
public static void main(String[] args) {
	//use synchronized list to avoid exception
	
	List<String> list=new ArrayList<>();
	
	Write write=new Write(list);
	Read read = new Read(list);
	
	write.addItem("Mango");
	write.addItem("Apple");
	
	read.readItem();
}
}
