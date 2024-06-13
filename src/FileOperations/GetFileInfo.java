package FileOperations;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f2=new File("D:\\sts\\Day8\\src\\FileOperations\\demo.txt");
		if(f2.exists()) {
			System.out.println("File name :"+f2.getName());
			System.out.println("File can readable : "+f2.canRead());
			System.out.println("File can writeable : "+f2.canWrite());
			System.out.println("Absolute path of "+f2.getName()+" is : "+f2.getAbsolutePath());
			System.out.println("size of the file in bytes :"+f2.length());
			System.out.println("list of files : "+f2.list());
			//mkdir()-to make directory
			//delete()-to del a file
		}
		else {
			System.out.println("file does not exist.");
		}
	}

}
