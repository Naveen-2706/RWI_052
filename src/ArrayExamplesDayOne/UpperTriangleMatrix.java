package ArrayExamplesDayOne;
//31) Java Program to display the upper triangular matrix
public class UpperTriangleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]= {{4,8,2,6},{1,3,5,7},{9,5,8,6},{2,6,1,3}};
		int rows=4;
		int col=4;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col ; j++) {
				if(i>j) {
					System.out.print(" "+0);
				}
				else {					
					System.out.print(" "+ar[i][j]);
				}
			}
			System.out.println();
		}
	}

}
