package days21;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오전 11:31:06
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 이번 달이 마지막 날짜 몇 일까지
		
		// Date
		/*
		Date d = new Date(2023-1900, 8, 1);
		d.setDate(d.getDate()-1);
		System.out.println(d.getDate());
		*/
		
		// Calendar
		/*
		Calendar c = Calendar.getInstance();
		System.out.println(c.getActualMaximum(Calendar.DATE));
		*/
		
		// LocalDate
//		String source = "2009-12-30";
//		LocalDate d = LocalDate.parse(source);
//		LocalDate today = LocalDate.now();
//		LocalDate first = today.withDayOfMonth(1);
//		System.out.println(first);
//		System.out.println(today.lengthOfMonth());
//		LocalDate lastDay = today.withDayOfMonth(today.lengthOfMonth());
//		System.out.println(lastDay);
		
		LocalDate ld = LocalDate.now();
		ld = ld.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(ld.getDayOfMonth());
	}

}
