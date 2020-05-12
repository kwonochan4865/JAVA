package assignment1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import assignment1.VideoParent;

public class VideoinfoRead1 {
	private static String title;
	private static String barcodenum;
	private static String director;
	private static String openyear;
	public static String line;

	public static void main(String [] args) throws IOException {
//		VideoCode vc = new VideoCode();
//		title = vc.getTitle();
//		barcodenum = vc.getBarcodenum();
//		director = vc.getDirector();
//		openyear = vc.getOpenyear();
//		
//		
		BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
		line = br.readLine();
	Vector<VideoParent> vp = new Vector<VideoParent>();
//	String[] word = new String[4];
		
	for(int i =0; i<4; i++) {	
		String[] word = new String[4];
	word = line.split("∞");
	vp.get(i).title = word[0];
	vp.get(i).barcodenum = word[1];
	vp.get(i).director = word[2];
	vp.get(i).openyear = word[3];
	System.out.println(vp.get(i));
	} 
	}

/////////////////////////////////////////////////////getter and setter
	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		VideoinfoRead1.title = title;
	}

	public static String getBarcodenum() {
		return barcodenum;
	}

	public static void setBarcodenum(String barcodenum) {
		VideoinfoRead1.barcodenum = barcodenum;
	}

	public static String getDirector() {
		return director;
	}

	public static void setDirector(String director) {
		director = director;
	}

	public static String getOpenyear() {
		return openyear;
	}

	public static void setOpenyear(String openyear) {
		openyear = openyear;
	}
}
