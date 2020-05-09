package chapter14.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample16 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(ReadLineExample16.class.getResource("language.txt").getPath());
		BufferedReader br = new BufferedReader(reader);

		while (true) {
			String data = br.readLine();
			if (data == null)
				break;
			System.out.println(data);
		}

		br.close();
	}
}
