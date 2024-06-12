package comparable_vs_comparator;

import java.util.ArrayList;
import java.util.Collections;

//import java.io.
class Emp implements Comparable<Emp>{
	int emp_id;
	String emp_name;
	float salary;
	Emp(int emp_id,String emp_name,float salary){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
	}
	public int compareTo(Emp e) {
		if(salary==e.salary) {
			return 0;
		}
		else if (salary>e.salary) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> em=new ArrayList<Emp>();
		em.add(new Emp(52,"Naveen",2500f));
		em.add(new Emp(51,"karthik",3000f));
		em.add(new Emp(913,"jathin",3500f));
		
		Collections.sort(em);
		for(Emp e:em) {
			System.out.println(e.emp_id+" "+e.emp_name+" "+e.salary);		}
	}

}
