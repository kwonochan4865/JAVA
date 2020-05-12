package garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class xxxx {
	public static Vector<String> vc = new Vector<String>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
		String line = br.readLine();
		String save;		
		String[] word = line.split("∞");
		for (int i = 0; i < word.length; i++) {
			vc.add(word[i]);
		} System.out.println(vc);
}
}