package SharingArrayList;

import java.util.ArrayList;

//Create a new book store and import all the 
//book list from main book store.
public class NewBookStore {

	private ArrayList<Book> books;

	public void getAllBooksFromMainStore(ArrayList<Book> list) {
		// first syntax
		this.books = list;
		// Second syntax
		// this.books = (ArrayList<Book>) list.clone();

	}

	public void printBooks() {
		for (Book b : this.books) {
			System.out.println(b.getName() + " " + b.getId());
		}
	}
}
