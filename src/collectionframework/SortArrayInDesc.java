package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayInDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(4);
		a.add(34);
		a.add(47);
		a.add(49);
		a.add(14);
		a.add(40);
		a.add(74);
		
		System.out.println("ArrayList elements  : ");
		for (Integer integer : a) {
			System.out.print(" "+integer);
		}
		Collections.sort(a);
		System.out.println("\nArrayList elements after sorting : ");
		for (Integer integer : a) {
			System.out.print(" "+integer);
		}
		Collections.reverse(a);
		System.out.println("\nArrayList elements in reverse order : ");
		for (Integer integer : a) {
			System.out.print(" "+integer);
		}
		
		
	}

}
