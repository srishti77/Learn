package DS;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
	public static void main(String s[]) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		try {
			Date date = dateFormat.parse("2019-03-26T00:00:00.000-07:00");
			
			System.out.println("Date String::"+ date.toLocaleString());
			System.out.println(date.getTime());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
