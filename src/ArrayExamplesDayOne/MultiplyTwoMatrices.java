package ArrayExamplesDayOne;
//23) Multiply Two Matrices
public class MultiplyTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arrayone= {{21,3,42,7},{2,1,6,2},{6,2,3,12},{33,21,42,11}}; 
		int[][]arraytwo= {{5,21,2,7},{10,12,21,9},{9,10,5,1},{3,8,6,5}};
		int[][] resultarray = new int[arrayone.length][arraytwo.length];
		for(int i=0;i<arrayone.length;i++) {
			for (int j=0;j<arraytwo.length;j++) {
				resultarray[i][j]=arrayone[i][j]*arraytwo[i][j];
			}
		}
		System.out.println("Multiplication of two matrices");
		for(int i=0;i<arrayone.length;i++) {
			for (int j=0;j<arraytwo.length;j++) {
				System.out.print("  "+resultarray[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
