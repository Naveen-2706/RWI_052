package ArrayListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("ram");
		al.add("sita");
		al.add("laxman");
		al.add("Marithi");
		System.out.println("Elements in the list : ");
		
		for(String name:al) {
			System.out.println(name);
		}
		System.out.println("After sorting : ");
		//al.sort(null);
		Collections.sort(al);
		for(String name:al) {
			System.out.println(name);
		}
		
		al.add(2,"bharath" );
		System.out.println("arraylist after adding a value using index");
		for(String name:al) {
			System.out.println(name);
		}
		
		String rem=	al.remove(3);
		System.out.println("deleted value from arraylist "+rem);
		
		System.out.println("arraylist after deleting a value ");
		for(String name:al) {
			System.out.println(name);
		}
		
		int size=al.size();
		System.out.println("Size of arry list "+size);
		
		System.out.println("Non-Generic Arraylist");
		ArrayList<Object> al1=new ArrayList<>();
		al1.add("string value");
		al1.add(4);
		al1.add('N');
		al1.add(null);
		al1.add(23.4);
		for(Object name:al1) {
			System.out.println(name);
		}
		
	}

}
