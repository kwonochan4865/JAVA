package assignment1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class VideoinfoRead {
	private static String title;
	private static String barcodenum;
	private static String director;
	private static String openyear;
	static Vector<VideoParent> vp = new Vector<VideoParent>(4);
	public static void main(String [] args) throws IOException {
//		VideoCode vc = new VideoCode();
//		title = vc.getTitle();
//		barcodenum = vc.getBarcodenum();
//		director = vc.getDirector();
//		openyear = vc.getOpenyear();
		System.out.println(vp.capacity());
	BufferedReader br = new BufferedReader(new FileReader("./database.txt"));	
	String line = br.readLine();
	for(int i =0; i<4; i++) {	
		String[] word = new String[4];
	word = line.split("∞");
	vp.get(i).title = word[0];
	vp.get(i).barcodenum = word[1];
	vp.get(i).director = word[2];
	vp.get(i).openyear = word[3];
	System.out.println(vp.get(i).title);
	} 
	}

/////////////////////////////////////////////////////getter and setter
	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		VideoinfoRead.title = title;
	}

	public static String getBarcodenum() {
		return barcodenum;
	}

	public static void setBarcodenum(String barcodenum) {
		VideoinfoRead.barcodenum = barcodenum;
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
