package FileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("D:\\sts\\Day8\\src\\FileOperations\\writetofile.txt");
			fw.write("FileWriter");
			//fw.append(" Example");
			fw.close();
			System.out.println("content added to a file");
			//System.out.println("content appended to a file");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
