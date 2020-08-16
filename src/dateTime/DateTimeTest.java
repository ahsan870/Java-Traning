package dateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeTest {
public static void main(String []atgs) {
	//Demonstration of new time API (java 1.8)
	//local date 
	
	
	//post -> "bsdjhbsjfujsd + date;
	LocalDate date = LocalDate.now();
	
	//System.out.println("Current Date " + date);
	System.out.println("----------Local Date---------------------");
	
	System.out.println("Good morning \nDate " +date);
	
	
	//local time
	LocalTime time = LocalTime.now();
	System.out.println("Local time " + time);
	System.out.println("----------Local Time---------------------");
	System.out.println("Good morning \nDate " +time);
	
	//local date and time
	LocalDateTime current = LocalDateTime.now();
	System.out.println("Local Date Time "+ current);
	System.out.println("----------Local Date Time---------------");
	//date and time format
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");
	
	String formaterDateTime = current.format(format);
	
	
	System.out.println("In formatter mannner " + formaterDateTime);
	
	System.out.println("----------Local Date Time formatter---------------");
	//Demonstration of month
	Month month = current.getMonth();
	System.out.println("Month Name "+ month);
	
	int day = current.getDayOfMonth();
	int hour = current.getHour();
	int year = current.getDayOfYear();
	int minute = current.getMinute();
	int second = current.getSecond();
	
	System.out.println("Month "+ month + " Day "+ day+ " Hour " + hour +" Minute "+ minute + " second "+ second);
	System.out.println(year);
	
	LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2019).withMonth(11).withHour(8);
	System.out.println("Speific Date (we set it our self )" +specificDate);
	// current Zone
	
	
	
	System.out.println("----------Zone---------------");
	
	ZonedDateTime zoned = ZonedDateTime.now();
	System.out.println("The Current Zone is "+zoned.getZone());
	
	ZoneId tokyo = ZoneId.of("Asia/Tokyo");
	ZonedDateTime  tokyoZone =zoned.withZoneSameInstant(tokyo);
	System.out.println("Tokoyo time zone is "+tokyoZone);
	
	ZoneId bd = ZoneId.of("Asia/Dhaka");
	ZonedDateTime  bdZone =zoned.withZoneSameInstant(bd);
	System.out.println("Bangladesh time zone is "+bdZone);
	
	System.out.println("Use of simpleDateFormat Class ");
	String patt = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patt); //SimpleDateFormat(patt);
	String formatSime = simpleDateFormat.format(new Date());
	
	System.out.println(formatSime);
	
}
}
