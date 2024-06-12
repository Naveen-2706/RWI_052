package ArrayExamplesDayOne;
//22) Add Two Matrices
public class AddTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arrayone= {{3,8,6,5},{2,1,6,2},{10,12,21,9},{33,21,42,11}}; 
		int[][]arraytwo= {{45,21,33,22},{65,32,43,12},{29,43,53,15},{21,31,42,37}};
		int[][] resultarray = new int[arrayone.length][arraytwo.length];
		for(int i=0;i<arrayone.length;i++) {
			for (int j=0;j<arraytwo.length;j++) {
				resultarray[i][j]=arrayone[i][j]+arraytwo[i][j];
			}
		}
		System.out.println("Addition of two matrices");
		for(int i=0;i<arrayone.length;i++) {
			for (int j=0;j<arraytwo.length;j++) {
				System.out.print("  "+resultarray[i][j]);
				
			}
			System.out.println();
		}
		
		
		
	}

}
