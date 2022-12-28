package SharingArrayList;
/*
 * This class will add elements to 
 * a shared list that is created with an Arraylist.
 */

import java.util.List;

public class Write {
	
	private List <String> list;
	
	//Now receive a shared list inside the constructor
	Write(List<String> list){
		this.list=list;
		
	}
	
//add items
	public void addItem(String Item) {
		this.list.add(Item);
	}
}
