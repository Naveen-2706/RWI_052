package inheritanceconcepts;
class one{
	int a=10;
	public void op() {
		System.out.print("\n value of variable a in class one:"+a);
	}
}
class two extends one{
	int b=20;
	public void op1() {
		super.op();
		System.out.print("\n value of variable b in class two:"+b);
	}
}
public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\n SINGLE LEVEL INHERITANCE");
		two t=new two();
		//t.op();
		t.op1();
	}

}
