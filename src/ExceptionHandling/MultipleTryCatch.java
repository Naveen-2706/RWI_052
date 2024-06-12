package ExceptionHandling;

public class MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= new int[3];
			a[2]=10/0;
			
			a[20]=10;
			
			String str=null;
			System.out.println(str.length());
			
			String s="naveen";
			int i=Integer.parseInt(s);
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException : "+ae);
		} 
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException : "+a);
		}
		catch (NullPointerException ne) {
			
			System.out.println("NullPointerException : "+ne);
		}
		catch (NumberFormatException n) {
			System.out.println("NumberFormatException : "+n);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception : "+e);
		}
		finally {
			System.out.println("finally block");
		}
		
		
	}

}
