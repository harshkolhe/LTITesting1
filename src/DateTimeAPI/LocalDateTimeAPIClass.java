package DateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class LocalDateTimeAPIClass {

	public static void main(String[] args) {
		
		//get current date
		LocalDate date =LocalDate.now();
		System.out.println("Current Date is: "+date);
		
		//return current time
		LocalTime time =LocalTime.now();// return time in 24 hrs format
		LocalTime t= time.minusHours(12);
		System.out.println("Current time is: "+time);
		
		DateTimeFormatter format1=DateTimeFormatter.ofPattern("HH:mm:ss");
		String formatedtime=t.format(format1);
		System.out.println(formatedtime);
		
		//return current date and time
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Current date and time is :"+dt);
		
		//to format datetime
		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = dt.format(format);
		System.out.println("formated date & time is: "+formatedDateTime);
		
		//get months days and seconds
		Month month= dt.getMonth();
		int day = dt.getDayOfMonth();
		DayOfWeek dayofweek = dt.getDayOfWeek();
		int sec = dt.getSecond();
		
		System.out.println("Month is: "+month+" day is "+day+" dayofweek is: "+dayofweek+" seconds "+sec);
		
		//specify the date
		LocalDate d=LocalDate.of(2022, 1, 26);
		System.out.println("Republic Day is: "+d.getDayOfWeek());
		
		LocalDateTime specifyDate=dt.withDayOfMonth(26).withYear(2022);
		System.out.println(specifyDate);
		

	}

}
