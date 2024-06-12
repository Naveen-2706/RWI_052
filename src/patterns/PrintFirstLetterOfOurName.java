package patterns;

public class PrintFirstLetterOfOurName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='N';
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				if(j==1||j==5||j==i) {
					System.out.print(c+" ");	
				}
				else {
					System.out.print(" ");
				}
				}
			System.out.println(" ");
	
	}
	}
}
