package ExceptionHandling;

public class ThrowVsThrows {
	static void m1(int i)throws ArithmeticException{
		int j=i/0;
		System.out.println("value of j : "+j);
		throw new ArithmeticException("throwing arihmetic exception using throw keyword");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1(-4);
		}catch (ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
	}

}
