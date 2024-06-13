package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f3=new File("D:\\sts\\Day8\\src\\FileOperations\\writetofile.txt");
			Scanner s=new Scanner(f3);
			
			
			while(s.hasNext()) {
				String data=s.next();
				System.out.println(data);
			}
			s.close();	
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
