package ArrayExamplesDayOne;
//34) Java Program to find the sum of each row and each column of a matrix
public class SumOfEachRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]={ {6,3,2},
					  {1,3,5},
					  {7,9,11}};
		int rows=mat.length;
		int col=mat[0].length;
		int sum_row,sum_col;
		for (int i = 0; i < rows; i++) {
			sum_row=0;
			for (int j = 0; j < col; j++) {
				sum_row=sum_row+mat[i][j];
			}
			System.out.println("sum of Row "+(i+1)+" : "+sum_row);
		}
		for (int i = 0; i < col; i++) {
			sum_col=0;
			for (int j = 0; j < rows; j++) {
				sum_col=sum_col+mat[j][i];
			}
			System.out.println("sum of Columns "+(i+1)+" : "+sum_col);
		}
		
	}

}
