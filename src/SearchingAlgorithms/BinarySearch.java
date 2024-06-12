package SearchingAlgorithms;
import java.util.Scanner;
public class BinarySearch {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("enter size of array\n");
		int size=in.nextInt();
		
		int arr[]=new int[size];
		System.out.print("enter array elements \n");
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		System.out.print(" array elements before sorting\n");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print(" array elements after sorting\n");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.print("enter target element ");
		int target=in.nextInt();
		int low=0;
		int high=size-1;
		int mid=(low+high)/2;
		int flag=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.print("element found "+target);
				flag=1;
				break;
			}
			else if(target<arr[mid]){
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		if(flag==0) {
			System.out.print("element not found "+target);
		}
		
	}
}
