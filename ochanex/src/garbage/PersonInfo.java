package garbage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
public class PersonInfo {
	private static Object b;
	private static Object a;
	private static Object c;

	public static List<PersonInfo> readReader(Reader input) throws IOException {
		try {
	BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
	String line;
	
	List<PersonInfo> infolist = new ArrayList<PersonInfo>();
	while((line= br.readLine()) !=null) {
		String[] writeStr = line.split("∞");
		
		if(writeStr.length !=3) continue;
		PersonInfo personinfo = new PersonInfo();
		a = personinfo(writeStr[0]);
		b = personinfo.(Integer.parseInt(writeStr[1]));
		c = personinfo.(Integer.parseInt(writeStr[1]));

//	String temp = br.readLine();
//	System.out.println(temp);
		infolist.add(personinfo);
	}	
	return infolist;
		} finally {
			input.close();
		}
	}
}
