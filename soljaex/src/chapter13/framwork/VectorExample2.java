package chapter13.framwork;

import java.util.List;
import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		List<Board3> list = new Vector<Board3>();

		list.add(new Board3("제목1", "내용1", "글쓴이1"));
		list.add(new Board3("제목2", "내용2", "글쓴이2"));
		list.add(new Board3("제목3", "내용3", "글쓴이3"));
		list.add(new Board3("제목4", "내용4", "글쓴이4"));
		list.add(new Board3("제목5", "내용5", "글쓴이5"));
		list.add(new Board3("제목6", "내용6", "글쓴이6"));
		list.add(new Board3("제목7", "내용7", "글쓴이7"));
	}

}
