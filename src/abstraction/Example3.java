package abstraction;
abstract class B{
	abstract int roi();
}
class BOB extends B{
	int roi() {
		return 10;
	}
}
class IOB extends B{
	int roi() {
		return 7;
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new BOB();
		System.out.println("rate of interest in bank BOB : "+b.roi()+"%");
		b=new IOB();
		System.out.println("rate of interest in bank IOB : "+b.roi()+"%");
		
	}

}
