package assignment1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import assignment1.VideoParent;

public class VideoinfoExample1 {
	public static String line;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
		line = br.readLine();
	List<VideoParent> personinfo = new ArrayList<VideoParent>();
		String save = line;
	String[] word;
			word = save.split("∞");
	for(int i =0; i<word.length; i++) {	
		System.out.println(word);
		
		
		
		VideoinfoRead.Input();
	}
	}
}
