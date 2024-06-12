package abstraction;
abstract class demo{
	abstract void op1();
	public void op2() {}
}
public class AbstractExample extends demo{

	public void op1() {
		System.out.println("method op1");
	}
	public void op2() {
		System.out.println("method op2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d= new AbstractExample();//upcasting
		
		d.op1();
		d.op2();
	}

}


