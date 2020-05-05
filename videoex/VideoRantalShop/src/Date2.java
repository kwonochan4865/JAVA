
import java.util.Calendar;
public class Date2 {
	public Date2() {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int mon = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DAY_OF_MONTH);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
			System.out.print(year+"년 " + mon+"월 " + day+"일 " + hour+"시 " + min+"분 " + sec+"초");
		

	}
}
