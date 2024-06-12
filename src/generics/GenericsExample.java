package generics;
import java.util.ArrayList;
import java.util.Iterator;

//Before generics, we can store any type of objects in the collection, i.e., non-generic. 
//Now generics force the java programmer to store a specific type of objects.
public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al =new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		
		//al.add("naveen");//compile time error
		
//		String s=(String) al.get(0);
		int s= al.get(0);
		System.out.println("to the variable s ,the value is assiging by Arraylist obj with index 0 is: "+s); 
//		Before Generics, we need to type cast.
//		After Generics, we don't need to typecast the object. 
		
		
		System.out.println("elements in list are : "); 
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
