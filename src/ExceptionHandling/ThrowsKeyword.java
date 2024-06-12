package ExceptionHandling;

public class ThrowsKeyword {
	
	static String name(String n)throws NullPointerException {
		System.out.println(n.length());
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThrowsKeyword ts=new ThrowsKeyword();
		try {
			//ts.name(null);
			name(null);
		} catch (NullPointerException e) {
			System.out.println("Exception : "+e);		
		}
	}

}
