package ochanex;

import java.text.SimpleDateFormat;
import java.util.*;
public class Date1 {
	public static void main(String[] args) {
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd일 hh:mm:ss");
//		Date date = new Date();
//		String today = df.format(date);
//		System.out.println(today);

		SimpleDateFormat format1;
		format1 = new SimpleDateFormat("yyyy-MM-dd일 hh:mm:ss");
		Date today = new Date();
		System.out.println(format1.format(today));
	}
}
