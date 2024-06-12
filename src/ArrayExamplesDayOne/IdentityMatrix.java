package ArrayExamplesDayOne;
//27) Java Program to determine whether a given matrix is an identity matrix
public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		int[][] matrix= {{0,8,6,5},{2,0,6,2},{29,2,0,15},{21,31,42,0}};
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				
				System.out.print("  "+matrix[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<matrix.length;i++) {
			if(matrix[i][i]==0) {
				flag++;
				//System.out.println("matrix is an identity matrix");
				//break;
			}
			else {
				System.out.println("matrix is not an identity matrix");
				break;
			}
		}
		if(flag==matrix.length) {
			System.out.println("matrix is an identity matrix");
			
		}
	}

}
