import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;


public class VideoTitle {
	private String year;
	private String title;
	private String director;
		
	public VideoTitle(){
		this.setVideoTitle();
	}
	
	public void setVideoTitle(){//���� Ÿ��Ʋ ������
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("���� ���� �⵵�� �Է��ϼ��� : ");
			year = in.readLine();
			System.out.print("���� ������ �Է��ϼ��� : ");
			title = in.readLine();
			System.out.print("���� ������ �Է��ϼ��� : ");
			director = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.print("���� ������ ����");
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
