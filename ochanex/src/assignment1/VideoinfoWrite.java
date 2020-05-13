package assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Vector;

public class VideoinfoWrite {

	private String title;
	private String barcodenum;
	private String director;
	private String openyear;
	private boolean isRental;
	private Member borrower;

	public VideoinfoWrite() throws IOException {
		VideoCode sn = new VideoCode();

		title = sn.getTitle();
		barcodenum = sn.getBarcodenum();
		director = sn.getDirector();
		openyear = sn.getOpenyear();

		Writer yy = new FileWriter("./비디오정보", true);
		yy.write(title + "∞");
		yy.write(barcodenum + "∞");
		yy.write(director + "∞");
		yy.write(openyear + "∞\n");
		yy.flush();
		yy.close();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		title = title;
	}

	public String getBarcodenum() {
		return barcodenum;
	}

	public void setBarcodenum(String barcondenum) {
		barcodenum = barcondenum;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		director = director;
	}

	public String getOpenyear() {
		return openyear;
	}

	public void setOpenyear(String openyear) {
		openyear = openyear;
	}
	public void returned(){
		borrower = null;
		isRental = false;
	}

}

//		File fin = new File("./database.txt");
//		if(fin.exists()) {
//			BufferedReader ib = new BufferedReader(new FileReader(fin));
//			String line = null;
//			while((line = ib.readLine()) !=null) {
//				line = line.trim();
//			}
