package switchstatement;
import java.util.Scanner;
public class SwitchStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age,authentication;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your name : ");
		name=in.nextLine();
		System.out.println( "\n"+name + "  please enter your age :");
		age=in.nextInt();
		if(age>=18) {
			authentication=1;
		}
		else {
			authentication=0;
		}
		switch(authentication) {
		case 0 : {
			System.out.print("you are minor,not eligible to vote");
			break;}
		case 1:{
			System.out.print("you are eligible to vote");
			break;}
		
		default : System.out.print("");
		}
		
		
	}
}
