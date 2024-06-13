package LamdaExpressions;
//Lambda Expression with  Parameter
//@FunctionalInterface
interface intern{
	 String name(String nam) ;	
}

interface intern1{
	int name1(int n);
	
}
public class Example3 {
	public static void main(String[] args) {  
		intern i=(nam)->{
			return "hello"+ nam;
		};
		System.out.println(i.name(" naveen"));
		
		intern1 i2=(n)->{
			return n;
		};
		System.out.println("value of n : "+i2.name1(10));
		
	}
}
