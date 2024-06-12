package HashtableExamples;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> h=new Hashtable<Integer,String> (); 
		h.put(12, "naveen");
		h.put(18, "karthik");
		h.put(15, "varun");
		h.put(25, "zaheer");
		h.put(35, "shiva");
		
		for(Map.Entry m:h.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		System.out.println("hash table ele : ");
		System.out.println(h);
		h.remove(18);
		System.out.println("After removing an ele");
		System.out.println(h);
		
		System.out.println();
		//getOrDefault()
		System.out.println(h.getOrDefault(18," element not found"));
		System.out.println(h.getOrDefault(15," element not found"));
		
			//putIfAbsent();
		h.putIfAbsent(20, "sri");
		System.out.println(h);
	}

}
