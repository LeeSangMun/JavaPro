package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 12:05:00
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 1) 2015 5 1 무슨 요일인지?
		// 2) 2015 5 몇 일까지?
		
		// [1]
		/*
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy.MM.dd";
		//System.out.println(getPatternDate(new Date(), pattern));
		System.out.println(getPatternDate(c, pattern));
		
		c.set(2015, 5-1, 1);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		*/
		
		// [2]
		Calendar c = new GregorianCalendar(2015, 5-1, 1);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.getActualMaximum(Calendar.DATE));
	}
	
	/*
	public static String getPatternDate(Date d, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(d);
	}
	
	public static String getPatternDate(Calendar c, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(c.getTime());
	}
	*/
	public static String getPatternDate(Object obj, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		if(obj instanceof Date) {
			Date d = (Date)obj;
			return sdf.format(d);
		} else if(obj instanceof Calendar) {
			Calendar c = (Calendar)obj;
			return sdf.format(c.getTime());
		}
		return null;
	}
}
