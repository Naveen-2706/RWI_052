package inheritanceconcepts;
class A{
	int i=34;
}
class B extends A{
	int j=55;
}
class C extends B{
	public void m2() {
		
	}
	//System.out.print(""+super.j);
	int k=95;
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		System.out.print("MULTI-LEVEL INHERITANCE");
		System.out.print("\naccessing value of i in class A,B,C through object of class C");
		System.out.print(" \ni="+c.i);
		System.out.print(" \nj="+c.j);
		System.out.print(" \nk="+c.k);
		
	}

}
