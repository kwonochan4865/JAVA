import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;


public class VideoTitle {
	private String year;
	private String title;
	private String director;
		
	public VideoTitle() throws IOException{
		this.setVideoTitle();
	}
	
	public void setVideoTitle() throws IOException{//비디오 타이틀 생성자
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("비디오 개봉 년도를 입력하세요 : ");
			year = in.readLine();
			System.out.print("비디오 제목을 입력하세요 : ");
			title = in.readLine();
			System.out.print("비디오 감독을 입력하세요 : ");
			director = in.readLine();
/**
 * 밑에는 메소드로 한 번에 묶어서 처리할 것들임
 */
		Writer yy = new FileWriter("./database.txt", true);
		this.year = year;
		this.title = title;
		this.director = director;
		yy.write(year+  "∞");
		yy.write(title + "");
		yy.write(director + "∞");
		yy.flush();
		yy.close();
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
		String temp = br.readLine();
		System.out.println(temp);
//		File fin = new File("./database.txt");
//		if(fin.exists()) {
//			BufferedReader ib = new BufferedReader(new FileReader(fin));
//			String line = null;
//			while((line = ib.readLine()) !=null) {
//				line = line.trim();
//			}
//		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.print("비디오 생성중 오류");
			e.printStackTrace();
		}			

	}
		
	public void setYear(String year){
		this.year = year;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setDirector(String director){
		this.director = director;
	}
	
	public String getYear(){
		return this.year;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getDirector(){
		return this.director;
	}	
}
