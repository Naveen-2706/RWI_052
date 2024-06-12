package HashsetExamples;

import java.util.HashSet;
import java.util.Iterator;
//while using Hashset,there is no need of using keys
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set= new HashSet<String>();
		
		set.add("naveen");
		set.add("ram");
		set.add("sita");
		set.add("naveen");
		set.add("sita");
		
		
		Iterator<String> i=set.iterator();
		System.out.println("\nset  elements using Iterator");
		
		while(i.hasNext()) {
				System.out.println(i.next());
		}
		System.out.println("\nset after removing the element");
		set.remove("naveen");
		System.out.println(set);
		
		
		
		HashSet<String> set1= new HashSet<String>();
		set1.add("naveen");
		set1.add("naveengoud");
		set1.add("k.naveen");
		set1.add("k.n.g");
		
		set.addAll(set1);
		
		System.out.println("\nupdated set elements");
		
		System.out.println(set);
		
		
		set.removeAll(set1);
		System.out.println("\nRemoving all the elements of set1 from  set :");
		
		System.out.println(set);
		
		set.removeIf(str->str.contains("sita"));
		System.out.println("\nusing removeIf() ,removing element 'sita' if it contains :");
		System.out.println(set);
		
		set.clear();//deleting all the elements of a set at a time
		
		
		System.out.println("\nElements of set : "+set);
		
		
	}

}
