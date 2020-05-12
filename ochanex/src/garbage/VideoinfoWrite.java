package garbage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Vector;

import assignment1.VideoExample;

public class VideoinfoWrite {

	private String Title;
	private String Barcodenum;
	private String Director;
	private String Openyear;

	public VideoinfoWrite() throws IOException {
		VideoExample ve = new VideoExample();
//for(int i=0; i<ve.getvecEnroll().size(); i++) {	
		Title = ve.getvecEnroll().get(0).getTitle();
		Barcodenum = ve.getvecEnroll().get(0).getBarcodenum();
		Director = ve.getvecEnroll().get(0).getDirector();
		Openyear = ve.getvecEnroll().get(0).getOpenyear();
//}

		Writer yy = new FileWriter("./database.txt", true);
		yy.write(ve.getvecEnroll().get(0).getTitle() + "∞");
		yy.write(ve.getvecEnroll().get(0) + "∞");
		yy.write(ve.getvecEnroll().get(0) + "∞");
		yy.write(ve.getvecEnroll().get(0) + "∞");
		yy.flush();
		yy.close(); //입력값이 출력되지 않았던 이유는 배열로 받았기 때문임....
	}
}


//		File fin = new File("./database.txt");
//		if(fin.exists()) {
//			BufferedReader ib = new BufferedReader(new FileReader(fin));
//			String line = null;
//			while((line = ib.readLine()) !=null) {
//				line = line.trim();
//			}
