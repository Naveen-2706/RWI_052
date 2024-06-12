package ArrayExamplesDayOne;
//6) Java Program to print the elements of an array in reverse order
public class PrintElementsInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {4,7,9,6,8,3,6,2,5,1};
		int num2[]= new int[num.length];
//		for(int i=num.length;i>=0;i--) {
//			System.out.print(" "+num[i]);
//		}
		int size=num.length;
		for(int i=size-1;i>=0;i--) {
			System.out.print(" "+num[i]);
		}
//		for(int i=0;i<size+1;i++) {
//			num2[i]=num[size-i];
//		}
//		
//		for(int i=0;i<num2.length;i++) {
//			System.out.print(" "+num2[i]);
//		}
		
		
		
//		for(int i=0;i<25;i++) {
//			System.out.print(num[size-1]);
//			size--;
//		}
	
	}

}
