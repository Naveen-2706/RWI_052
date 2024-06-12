package interfaces;
//multiple inheritance
interface Ac{
	void on();
	void off();
}
interface Engine{
	void on();
	void off();
}

interface Music{
	void on();
	void off();
}
class AC_Implementation implements Ac{
	public void on() {
		System.out.println("AC mode : ON");
	}
	public void off() {
		System.out.println("AC mode : OFF");
	}
}
class Engine_Implementation implements Engine{
	public void on() {
		System.out.println("Engine mode : ON");
	}
	public void off() {
		System.out.println("Engine mode : OFF");
	}
}
class Music_Implementation implements Music{
	public void on() {
		System.out.println("Music mode : ON");
	}
	public void off() {
		System.out.println("Music mode : OFF");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ac a=new AC_Implementation();
		a.on();
		a.off();
		Engine e=new Engine_Implementation();
		e.on();
		e.off();
		 Music m=new Music_Implementation();
		 m.on();
		 m.off();
		
	}

}
