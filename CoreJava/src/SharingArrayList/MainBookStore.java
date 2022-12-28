package SharingArrayList;

import java.util.ArrayList;


public class MainBookStore {
	
	private ArrayList<Book> books;
	
	public MainBookStore() {
		books = new ArrayList<Book>();
	}
	
	public ArrayList<Book> getAllBooks(){
		
		return books;
	}
	
	public void add(Book object) {
		books.add(object);
	}
	
	
}
