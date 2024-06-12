package swap;
class swap{
	int temp;
	public void method(int a,int b) {
		System.out.print("before swapping\n a="+a+" and b="+b+"\n");
		temp=a;
		a=b;
		b=temp;
		System.out.print("after swapping\n a="+a+" and b="+b+"\n");
	}
}
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap s=new swap();
		s.method(10,20 );
	}
}
