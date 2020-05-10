package assignment1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSet {
	Date date = new Date();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd일 hh.mm.ss");
	String today = df.format(date);
}

