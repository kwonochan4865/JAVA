package garbage;

import java.text.SimpleDateFormat;
import java.util.List;
public class DateExample {

	public static void main(String[] args) {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM.dd");
		df.format(Settings.getDate());
	}
	public static void List() {
		Settings date = new Settings();
	}
}
