package polymorphism;

class parent{
	void method() {
		System.out.print("executing method() in parent class");
	}
}
class child extends parent{
	void method() {
		System.out.print("executing method() in child class");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent p=new child();
//		p.method();
		child c=new child();
		c.method();
	}

}
