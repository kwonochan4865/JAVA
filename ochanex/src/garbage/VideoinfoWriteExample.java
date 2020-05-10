package garbage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VideoinfoWriteExample {

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		String a = br.readLine();
		System.out.println(a);
	}
}
