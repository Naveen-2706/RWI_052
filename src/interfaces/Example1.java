package interfaces;
interface One{
	void op1();
}

interface Two{
	void op1();
}
interface Three extends One,Two{
	void op1();
}
class  Four implements Three{
	public void op1() {
		System.out.println("op1");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four f=new Four();
		f.op1();
	}

}
