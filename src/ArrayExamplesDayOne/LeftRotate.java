package ArrayExamplesDayOne;
import java.util.*;
public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,4,6,1,2,5};
		Scanner s=new Scanner(System.in);
		System.out.println("enter an integer : ");
		int n=s.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(n==a[i]) {
				System.out.println(a[i]);
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if(n==a[i]) {
				a[i-1]=n;
			}
			System.out.println(" index : "+i+" "+a[i]);
		}
	}

}
