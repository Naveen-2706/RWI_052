package LinkedListExamples;
import java.util.Iterator;
import java.util.LinkedList;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l= new LinkedList<String>();
		l.add("sri");
		l.add("varun");
		l.add("karthik");
		l.add("zaheer");
		l.add("shiva");
		l.add(0,"naveen");
		System.out.println();
		System.out.println("Elements in the LinkedList");
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.print(" "+i.next());
		}
		
		l.addFirst("cm");
		l.addLast("pm");
		System.out.println();
		System.out.println("\nlist elements after adding vaules at first and last");
		for (String string : l) {
			System.out.print(" "+string);
		}
		
		String del=l.remove(4);
		System.out.println();
		System.out.println("\ndeleted element from list : "+del);
		System.out.println("\nlist elements after deleting an element : ");
		for (String string : l) {
			System.out.print(" "+string);
		}
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("ram");
		l1.add("sita");
		
		System.out.println();
		System.out.println("\n linked list l1 elements :");
		for (String string : l1) {
			System.out.print(" "+string);
		}
		
		System.out.println();
		l.addAll(l1);
		System.out.println("\n Adding all elements of L1 to L list");
		for (String string : l) {
			System.out.print(" "+string);
		}
		LinkedList<String> l2= new LinkedList<String>();
		l2.add("maruthi");
		l2.add("laxman");
		l1.addAll(1, l2);
		System.out.println();
		System.out.println("\n after adding L2 elemenst to L List");
		for (String string : l) {
			System.out.print(" "+string);
		}
		
		System.out.println();
		System.out.println("\n removing all the elements of L2 from L");;
		l.removeAll(l1);
		for (String string : l) {
			System.out.print(" "+string);
		}
		
		l.removeFirst();
		l.removeLast();
		l.remove("zaheer");
		l.remove(3);
		System.out.println();
		System.out.println("\nElements in list after removing elements \n  at first,last,element_value and with index");
		for (String string : l) {
			System.out.print(" "+string);
		}	
		System.out.println();
		l.addAll(l2);
		l.removeFirstOccurrence(l2);
		for (String string : l) {
			System.out.print(" "+string);
		}	
		
		System.out.println();
		
	}

}
