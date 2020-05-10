package chapter14.stream;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample7 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test7.txt");

		char a = 'A';
		char b = 'B';
		char c = 'C';

		writer.write(a);
		writer.write(b);
		writer.write(c);

		writer.flush();
		writer.close();
	}
}