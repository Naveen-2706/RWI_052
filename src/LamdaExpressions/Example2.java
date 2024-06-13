package LamdaExpressions;
//Lambda Expression with  multiple Parameters
//with return keyword and without return keyword
interface add{
	 int add(int a,int b) ;
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add ad=(a,b)->(a+b);
		
		System.out.println("addition of a,b:"+ad.add(10,20));
		
		add ad1=(c,d)->{
			return c+d;
		};
		
		System.out.println("addition of c,d:"+ad1.add(30,20));
	}

}
