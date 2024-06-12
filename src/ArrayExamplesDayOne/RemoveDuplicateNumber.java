package ArrayExamplesDayOne;

import java.util.Arrays;

//21) Remove Duplicate Element in an Array
public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,5,7,3,5,7,2,9};
		int temp[]= new int[arr.length],count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]==arr[i+1]) {
					count++;
					temp[i]=arr[i];
					
				}
				//System.out.print(" "+temp);
			
			//System.out.print(" "+arr[i]);
		}
		
		for (int j :temp) {
			
			System.out.print(" "+temp[j]);
		}
	}

}
