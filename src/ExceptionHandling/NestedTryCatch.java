package ExceptionHandling;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		
		try {
			int a[]=new int[5];
			a[3]=5/5;
			try {
				String s=null;
				System.out.println(s.length());
			}catch (NullPointerException n) {
				System.out.println(n);
			}
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}

	}

}
