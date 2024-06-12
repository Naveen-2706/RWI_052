package ArrayExamplesDayOne;
//26) Java Program to subtract the two matrices
public class SubtractTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr_one= {{5,21,33,22},{65,32,43,12},{10,12,21,9},{33,21,42,11}}; 
		int[][]arr_two= {{31,8,6,5},{2,1,6,2},{29,43,53,15},{21,31,42,37}};
		int[][] resultarray = new int[arr_one.length][arr_two.length];
		for(int i=0;i<arr_one.length;i++) {
			for (int j=0;j<arr_two.length;j++) {
				resultarray[i][j]=arr_one[i][j]-arr_two[i][j];
			}
		}
		System.out.println("Subtraction of two matrices");
		for(int i=0;i<arr_one.length;i++) {
			for (int j=0;j<arr_two.length;j++) {
				System.out.print("  "+resultarray[i][j]);
			}
			System.out.println();
		}	
	}

}
