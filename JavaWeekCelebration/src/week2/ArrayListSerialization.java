package week2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSerialization {
	
public static void main(String[] args) {
	
	//ArrayList object creation
	List<String> list = new ArrayList<>();
	
	//Adding elements to the arraylist
	list.add("Boston");
	list.add("Dallas");
	list.add("New York");
	
	System.out.println(list);
	
	try {
		//used for writing the data inside file
		FileOutputStream fileOutputStream = new FileOutputStream("inputfile");
		//used to serialize an object--that is present in list to show proper data in file
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		//the list will be written inside the file in serialzed format
		objectOutputStream.writeObject(list);
		objectOutputStream.close();
		fileOutputStream.close();
	}
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}
