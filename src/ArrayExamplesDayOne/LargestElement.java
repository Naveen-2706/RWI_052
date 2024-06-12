package ArrayExamplesDayOne;
//9) Java Program to print the largest element in an array
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,3,99,34,76,12,98};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.print("\nlargest element in the array : "+arr[arr.length-1]);
	}

}
