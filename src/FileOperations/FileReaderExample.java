package FileOperations;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileReader fr=new FileReader("D:\\sts\\Day8\\src\\FileOperations\\filereader.txt")){
			int letters=fr.read();
			while (fr.ready()) {
				System.out.println((char)letters);
				letters=fr.read();			
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
