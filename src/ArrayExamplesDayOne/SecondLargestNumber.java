package ArrayExamplesDayOne;
//17) Find 2nd Largest Number in an Array
public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {7,4,6,2,8,5,23,12};
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1.length;j++) {
				if(num1[i]<num1[j]) {
					int temp=num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
				}
			}
		}
		System.out.print("\nelements of an array after sorting ");
		for(int i=0;i<num1.length;i++) {
			
			System.out.print(" "+num1[i]);
		}
		System.out.print("\n Second largest element in the num1 array : "+num1[num1.length-2]);
	}

}
