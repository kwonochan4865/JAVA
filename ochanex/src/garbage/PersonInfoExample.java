package garbage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PersonInfoExample {

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
		PersonInfo pi = new PersonInfo();
		String temp = br.readLine();
		System.out.println(temp);
		
		
		

	}

}
