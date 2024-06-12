package abstraction;
interface One{
	void m1();
	void m2();
	void m3();
	
}
abstract class Two implements One{
	public void m1() {
		System.out.println("m1");
	}
}

class Three extends Two{
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o=new Three();
		o.m1();
		o.m2();
		o.m3();
	}

}
