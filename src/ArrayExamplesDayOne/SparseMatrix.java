package ArrayExamplesDayOne;
//28) Java Program to determine whether a given matrix is a sparse matrix
public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sparse[][]={{0,4,0,8},{1,0,0,2},{0,0,5,0},{6,0,0,0},{0,3,9,0}};
		int count_zero=0,count_num=0,n=5,m=4;
		//int size=sparse.length+
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				System.out.print("  "+sparse[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for (int j = 0; j < m; j++) {
				if(sparse[i][j]==0) {
					count_zero++;
				}
				else {
					count_num++;
				}
			}
		}
		if(count_zero>count_num) {
			System.out.println("it is a sparse amtrix");
		}
		else {
			System.out.println("it is not a sparse amtrix");
			
		}
		
	
	}

}
