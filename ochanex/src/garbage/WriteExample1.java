package garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WriteExample1 {

	public static void main(String[] args) {
		try {
			File fi = new File("/home/ochan/ex/example1.txt"); 
			FileReader fir = new FileReader(fi);
			int singlech = 0;
			while((singlech = fir.read()) != -1) {
				System.out.print((char)singlech);
			} 
			fir.close();
		} catch (FileNotFoundException e) {
	} catch(IOException e) {
		System.out.println(e);
	}
	}
}
