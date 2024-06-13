package LamdaExpressions;
interface Drawable{
	public void draw();
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int width=10;
		Drawable d=()->{
			int width=10;
			System.out.println("Lamda Expressions example");
			System.out.println("width : "+width);
		};
		d.draw();
	}

}
