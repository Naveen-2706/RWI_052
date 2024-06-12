package inheritanceconcepts;
class Main{
	public void method1() {
		System.out.print("\nmethod1 of class one");
	}
}
class sub1 extends Main{
	public void method2() {
		System.out.println("\nmethod2 of class one");
	}
	
}
class sub2 extends sub1{
	public void method3() {
		System.out.println("\nmethod3 of class THREE");
	}
	
}
class sub3 extends Main{
	public void method4() {
		System.out.println("\nmethod4 of class FOUR");
	
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HYBRID INHERITANCE");
		sub3 f=new sub3();
		f.method1();
		f.method4();
		
		sub2 t=new sub2();
		t.method1();
		t.method2();
		t.method3();
	}

}
