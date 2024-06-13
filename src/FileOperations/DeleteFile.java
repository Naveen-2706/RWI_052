package FileOperations;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f4=new File("D:\\sts\\Day8\\src\\FileOperations\\demo1.txt");
		
		if (f4.delete()) {
			System.out.println(f4.getName()+" file is deleted successfully");
		} else {
			System.out.println(f4.getName()+" file does not exists");
		}
	}

}
