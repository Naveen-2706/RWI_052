package ArrayExamplesDayOne;
//15) Java Program to sort the elements of an array in descending order
public class SortArrayElementsInDesec {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {8,3,6,5,1,5,34,32,59};
		System.out.print("\nelements of an array before sorting ");
		for(int i=0;i<num1.length;i++) {
			
			System.out.print(" "+num1[i]);
		}
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1.length;j++) {
				if(num1[i]>num1[j]) {
					int temp=num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
				}
			}
		}
		System.out.print("\nelements of an array in ascending order ");
		for(int i=0;i<num1.length;i++) {
			
			System.out.print(" "+num1[i]);
		}
		
	}
}
