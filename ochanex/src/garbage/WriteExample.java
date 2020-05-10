package garbage;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("/home/ochan/ex/test1.db");
		
		byte a = 10;
		byte b = 10;
		byte c = 10;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
		
	}
	
}
