package garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class VideoinfoRead {
	public static String title;
	private static String barcodenum;
	private static String director;
	private static String openyear;
	public static String line;
	public static Vector<String> vc = new Vector<String>();
	public VideoinfoRead() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
		line = br.readLine();
		for (int i=0; i <word.length; i++) {
//		while((line= br.readLine()) !=null) {
		String[] word = line.split("∞");
		vc.add(word[0]);
//		}
		}
	}
}
