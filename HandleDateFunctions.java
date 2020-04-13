package JavaPrograms;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class HandleDateFunctions {

	public static void main(String[] args)throws Exception {
		
		LocalDate lod = LocalDate.now();
		System.out.println("Date Is : "+lod);
		
		LocalTime lot = LocalTime.now();
		System.out.println("Time Is : "+lot);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Date and Time Is : "+ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E,dd-MMM-yyyy");
		String formattedDate = lod.format(dtf);
		System.out.println("Formated Date Is : "+formattedDate);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Formatted Date Is :"+sdf.format(date));
		
		Date d = new Date();
		System.out.println("Date Is : "+d.toString());
		
		Calendar cal = Calendar.getInstance();
		System.out.println("TimeZone Is : "+cal.getTimeZone()+" Time Is: "+cal.getTime()); 
		
		int week = cal.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum Week in a month :"+week);
		
		int dayinyear = cal.getMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Maximum week in a month :"+dayinyear);
		
		int weekinyear = cal.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum week in a year : "+weekinyear);

	}

}
