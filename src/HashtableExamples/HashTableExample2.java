package HashtableExamples;

import java.util.Hashtable;
import java.util.Map;

class Book{
	int id,quantity;
	String book_name,author;
	public Book(int id, int quantity, String book_name, String author) {
		//super();
		this.id = id;
		this.quantity = quantity;
		this.book_name = book_name;
		this.author = author;
	}	
}
public class HashTableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> ht=new Hashtable<Integer,Book>();
		
		Book b1=new Book(110,2,"C","Dennis Ritche");
		
		ht.put(1, b1);
		
		for (Map.Entry<Integer, Book> entry : ht.entrySet()) {
			Integer key = entry.getKey();
			Book val = entry.getValue();
			
			System.out.println("Key : "+key);
			System.out.println("Details : "+" id :"+val.id+" quantity :"+val.quantity+" book name :"+val.book_name+" Author :"+val.author);		
		}
	}

}
