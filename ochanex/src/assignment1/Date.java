package assignment1;

import java.util.Calendar;

public class Date {
	public Date() {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int mon = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DAY_OF_MONTH);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		System.out.print(year + "-" + mon + "-" + day + "  " + hour + ":" + min + ":" + sec);
	}
}
