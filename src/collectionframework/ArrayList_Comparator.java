package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> lapiList=new ArrayList<>();
		
		Laptop l1=new Laptop("acer","aspire 5",47000,8);
		Laptop l2=new Laptop("dell","vostro",49000,7);
		Laptop l3=new Laptop("hp","pavalion",51000,9);
		Laptop l4=new Laptop("redmi","notebook",45000,6);
		
		
		lapiList.add(l1);
		lapiList.add(l2);
		lapiList.add(l3);
		lapiList.add(l4);
		
		System.out.println("List elements ");
		System.out.println(lapiList);
		
		System.out.println("Sorting the list as comparator");
		Collections.sort(lapiList,new RatingComparator());
		
		System.out.println(lapiList);
		System.out.println("Reversing the comparator sorting");
		Comparator<Laptop> com=Collections.reverseOrder(new RatingComparator());
		
		Collections.sort(lapiList,com);
		System.out.println("Reversed list elements:");
		System.out.println(lapiList);
	}

}
