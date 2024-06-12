package ArrayExamplesDayOne;
//24) Print Odd and Even Number from an Array
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {7,3,5,2,8,9,10,44,32,76,98,12,53,69};
		System.out.println("Even Numbers from Array");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.print(" "+ar[i]);		
			}
		}
		System.out.println("\nOdd Numbers from Array");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2!=0) {
				System.out.print(" "+ar[i]);		
			}
		}
	}

}
