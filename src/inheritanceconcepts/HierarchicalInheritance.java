package inheritanceconcepts;
class mainclass{
	public void m1() {
		System.out.println("method1 in mainclass ");
	}
}
class subclass1 extends mainclass{
	public void m2() {
		System.out.println("method2 in subclass1 ");
	}
}
class subclass2 extends mainclass{
	public void m3() {
		System.out.println("method3 in subclass2 ");
	}
}
class subclass3 extends mainclass{
	public void m4() {
		System.out.println("method4 in subclass3 ");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass3 s3=new subclass3();
		s3.m1();//accessing mainclass method
		s3.m4();//accessing method m4 in same class
		
		
	}

}
