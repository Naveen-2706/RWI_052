package SearchingAlgorithms;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("LINEAR SERACH ALGORITHM");
		System.out.print("\nENTER SIZE OF AN ARRAY");
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		System.out.print("\nENTER "+size+"  elements : ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("\nARRAY ELEMENTS : ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
					
				if(arr[i]>=arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		System.out.println("\nARRAY ELEMENTS AFTER SORTING : ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\nENTER TARGET ELEMENT : ");
		int target=in.nextInt();
		int target_found=0;
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i])
			{
				target_found=1;
				System.out.println("\ntarget element found at index : "+(i));
				break;
				}
		}
		if(target_found==0)
		 {
			System.out.println("\ntarget element not found ");	
		}
	}
}
