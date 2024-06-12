package ArrayExamplesDayOne;

//1) Java Program to copy all elements of one array into another array
public class CopyAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {6,3,8,2,9,5,4,8};
		int arr2[]= new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.print("elements of array 1 : ");
		for(int j=0;j<arr1.length;j++) {
			System.out.print(" "+arr1[j]);
		}
		System.out.print("\nelements of array 2 : ");
		for(int j=0;j<arr2.length;j++) {
			System.out.print(" "+arr2[j]);
		}
		
		
		
	}

}
