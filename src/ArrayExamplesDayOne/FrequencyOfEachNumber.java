package ArrayExamplesDayOne;
//2) Java Program to find the frequency of each element in the array

public class FrequencyOfEachNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {6,3,8,2,5,1,3,8,2,6,9,9,5,4,8};
		int freq=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr1[j] ){
					freq++;
					
				}
			}
		}
		if(freq>0) {
			System.out.print("freq of num "+freq);
		}
	}

}
