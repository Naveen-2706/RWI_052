package ArrayExamplesDayOne;
//25) Transpose matrix
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arrayone= {{21,3,42,7},{2,1,6,2},{6,2,3,12},{33,21,42,11}}; 
		//int[][]arraytwo= {{5,21,2,7},{10,12,21,9},{9,10,5,1},{3,8,6,5}};
		int[][] transpose_array = new int[arrayone.length][arrayone.length];
		System.out.println("matrix before transpose");
		for(int i=0;i<arrayone.length;i++) {
			for (int j=0;j<arrayone.length;j++) {
				System.out.print("  "+arrayone[i][j]);
				
			}
			System.out.println();
		}
		for(int i=0;i<arrayone.length;i++) {
			for (int j=0;j<arrayone.length;j++) {
				transpose_array[i][j]=arrayone[j][i];
			}
		}
		System.out.println("matrix after transpose");
		for(int i=0;i<arrayone.length;i++) {
			for (int j=0;j<arrayone.length;j++) {
				System.out.print("  "+transpose_array[i][j]);
				
			}
			System.out.println();
		}
		
		
	}

}
