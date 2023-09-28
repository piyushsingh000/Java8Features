package AllJava8Featuress;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///AAj ki date...
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate mydate = LocalDate.of(2003,8,04);
		System.out.println(mydate);
		int dayOfMonth = mydate.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		//Local Time
		
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);

	}

}
