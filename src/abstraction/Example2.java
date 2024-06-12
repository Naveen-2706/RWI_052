package abstraction;
abstract class Shape{
	abstract void m1();
}
class Rec extends Shape{
	public void m1(){
		System.out.print("\nrectangle");
	}
}
class Cir extends Shape{
	public void m1(){
		System.out.print("\nCircle");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s= new Rec();
		s.m1();
		s= new Cir();
		s.m1();
//		Cir c=new Cir();
//		c.m1();
	}

}
