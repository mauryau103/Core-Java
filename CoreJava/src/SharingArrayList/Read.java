package SharingArrayList;

import java.util.List;

/*
 * Read class will read elements form a shared list
 */
public class Read {
	
	private List<String> list;
	
	public Read( List<String> list) {
		// TODO Auto-generated constructor stub
		this.list=list;
		
	}
	
	public void readItem() {
		for(String item:list) {
			System.out.println(item.toString());
		}
	}
}
