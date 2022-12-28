package week2;

//sorting 

import java.util.HashMap;
import java.util.Map;

class Book{
	 int id; 
	String name;
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		
		Book book = (Book) obj;
		if(this.id == book.id) {
			return true;
		}
		return false;
	}
	
	
	
}
public class HashMapp {
	public static void main(String[] args) {
		
		HashMap<Book, Integer> map = new HashMap<Book, Integer>();
		Book b1 = new Book(1, "Akhilesh");
		Book b2 = new Book(3, "Akash");
		Book b3 = new Book(3, "Vimlesh");
		Book b4 = new Book(4, "Raju");
		Book b5 = new Book(5, "Akhil");
		
//		map.put(1, b1);		
//		map.put(2, b2);
//		map.put(2, b3);
//		map.put(4, b4);
//		map.put(5, b5);
		map.put(b2, 3);
		map.put(b3, 4);

		
		for(Map.Entry<Book, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());

		}

	}
}

