package garbage;

public class xxxx {

	try {
	System.out.print("비디오 제목을 입력하세요 : ");
	title = in.readLine();
	System.out.print("비디오 개봉 년도를 입력하세요 : ");
	getBarcodenum() = in.readLine();
	System.out.print("비디오 개봉 년도를 입력하세요 : ");
	year = in.readLine();
	System.out.print("비디오 감독을 입력하세요 : ");
	director = in.readLine();
}
}catch (	IOException e)
{
// TODO Auto-generated catch block
System.err.print("비디오 생성중 오류");
e.printStackTrace();
}

}

///////////////////////////////////////// Getter and Setter
public void setYear(String year) {
this.year = year;
}

public void setTitle(String title) {
this.title = title;
}

public void setDirector(String director) {
this.director = director;
}

public String getYear() {
return this.year;
}

public String getTitle() {
return this.title;
}

public String getDirector() {
return this.director;
}
}
}
