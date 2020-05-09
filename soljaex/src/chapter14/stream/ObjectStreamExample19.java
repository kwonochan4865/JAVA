package chapter14.stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.*;

public class ObjectStreamExample19 {

	public static void main(String[] args) throws Exception {
		writeList(); // List를 파일에 저장
		List<Board20> list = readList(); // 파일에 저장된 List읽기
////////////////////////////////////////////////////////////////////////// List 내용을 모니터에 출력	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board20 board : list) {
			System.out.println(board.getBno() + "\t"  + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriter() + "\t" + sdf.format(board.getDate()));
		}
//////////////////////////////////////////////////////////////////////////////////////////
	}

	public static void writeList() throws Exception {
		List<Board20> list = new ArrayList<>(); // List 생성

		list.add(new Board20(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board20(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board20(3, "제목3", "내용3", "글쓴이3", new Date())); // list에 Board 객체 저장

		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close(); // 객체 출력 스트림을 이용해서 list 출력
	}

	public static List<Board20> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board20> list = (List<Board20>) ois.readObject();
		return list; // 객체 입력 스트림을 이용해서 list 읽기
	}
}
