package ExceptionHandling;

public class ThrowKeyword {
	public void m(int age) {
		
			if(age>0&&age>18) {
				System.out.println("eligible to vote");
			}
			else {
				throw new ArithmeticException("enter age as positive integer");
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowKeyword tk=new ThrowKeyword();
		tk.m(-5);
	}

}
