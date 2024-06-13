package LamdaExpressions;
//Lambda Expression using Foreach Loop
import java.util.ArrayList;
import java.util.List;

public class LamExpForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> l=new ArrayList<Character>();
		l.add('N');
		l.add('A');
		l.add('V');
		l.add('E');
		l.add('E');
		l.add('N');
		
		l.forEach(
			(n)->System.out.println(n)
		);
	}

}
