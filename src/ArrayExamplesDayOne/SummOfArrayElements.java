package ArrayExamplesDayOne;
//12) Java Program to print the sum of all the items of the array
public class SummOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,7,5,2,3,19};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
		}
		System.out.print("sum of all the items of the array : "+sum);
	}

}
