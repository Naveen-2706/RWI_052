package LamdaExpressions;
//Lambda Expression with  NO Parameter
interface Sayable{  
    public String say();  
}  
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}

}
