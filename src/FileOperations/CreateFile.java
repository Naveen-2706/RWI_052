package FileOperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f1=new File("D:\\sts\\Day8\\src\\FileOperations\\demoo.txt");
			if(f1.createNewFile()) {
				System.out.println("File "+f1.getName() +" is created successfully");
			}
			else if(f1.exists()){
				System.out.println(f1.getName()+" already exists");
			}
			else {
				System.out.println("file creation failed");
			}
		} catch (IOException ioe) {
			System.out.println("Exception : "+ioe);
		}
	}

}
