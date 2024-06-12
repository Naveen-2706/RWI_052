package ArrayExamplesDayOne;
//4) Java Program to print the duplicate elements of an array
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {6,5,6,8,6,2,5,1,4,1,7,6,3,2,7,4,9};
		System.out.print("elements of an array are : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		System.out.print(" \n");
		for(int i=0;i<array.length+1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j] ){
					System.out.println("redundncy element at index "+j+"  and the redundant value is :  "+array[j]);
					break;
				}
			}
		}
	
	}

}
