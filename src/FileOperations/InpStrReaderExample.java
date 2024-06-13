package FileOperations;

import java.io.IOException;
import java.io.InputStreamReader;

public class InpStrReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (InputStreamReader i=new InputStreamReader(System.in)){
			System.out.println("Enter text :");
			int letters=i.read();
			
			while(i.ready()) {
				System.out.println((char) letters);
				letters=i.read();
				
			}
			i.close();
			System.out.println();
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
