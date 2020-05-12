package assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Vector;

public class VideoinfoWrite {

	private static String Title;
	private String Barcodenum;
	private String Director;
	private String Openyear;

	public VideoinfoWrite() throws IOException {
		VideoCode sn = new VideoCode();
		Title = sn.getTitle();
		Barcodenum = sn.getBarcodenum();
		Director = sn.getDirector();
		Openyear = sn.getOpenyear();
		Writer yy = new FileWriter("./database.txt", true);
		yy.write(Title + "∞");
		yy.write(Barcodenum + "∞");
		yy.write(Director + "∞");
		yy.write(Openyear + "∞");
		System.out.println();
		yy.flush();
		yy.close();
	}

	public void boy() throws IOException {
	
	}

	public static String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getBarcodenum() {
		return Barcodenum;
	}

	public void setBarcodenum(String barcondenum) {
		Barcodenum = barcondenum;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getOpenyear() {
		return Openyear;
	}

	public void setOpenyear(String openyear) {
		Openyear = openyear;
	}

}

//		File fin = new File("./database.txt");
//		if(fin.exists()) {
//			BufferedReader ib = new BufferedReader(new FileReader(fin));
//			String line = null;
//			while((line = ib.readLine()) !=null) {
//				line = line.trim();
//			}
