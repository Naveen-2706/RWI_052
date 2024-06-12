package ArrayExamplesDayOne;
//29) Java Program to determine whether two matrices are equal
public class EqualMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr1= {{31,8,6,5},{2,1,6,2},{29,43,53,15},{21,31,42,37}};
		int[][]arr2= {{31,8,6,5},{2,1,6,2},{29,43,53,15},{21,31,42,37}};
		boolean flag=true;

//		if(arr1==arr2) {
//			System.out.println("matrices are equal");
//		}
//		else {
//			System.out.println("matrices are not equal");
//		}
	      int  row1 = arr1.length;    
	       int  col1 = arr1[0].length;    
	            
	        //Calculates the number of rows and columns present in the second matrix    
	    
	       int    row2 = arr2.length;    
	       int  col2 = arr2[0].length;    
	            
	        //Checks if dimensions of both the matrices are equal    
	        if(row1 != row2 || col1 != col2){    
	            System.out.println("Matrices are not equal");    
	        }    
	        else {    
	            for(int i = 0; i < row1; i++){    
	                for(int j = 0; j < col1; j++){    
	                  if(arr1[i][j] != arr2[i][j]){    
	                      flag = false;    
	                      break;    
	                  }    
	                }    
	            }    
	                
	            if(flag)    
	                System.out.println("Matrices are equal");    
	            else    
	                System.out.println("Matrices are not equal");    
	        }    
	    }    
	
		
		
	}


		
