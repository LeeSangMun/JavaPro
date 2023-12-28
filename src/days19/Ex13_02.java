package days19;

import java.util.Date;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오후 4:18:12
 * @subject	달력 그리기
 * @content
 */
public class Ex13_02 {

	public static void main(String[] args) {
		int year = 2023;
		int month = 8;
		
		int dayOfWeek = getDayOfWeek(year, month, 1);
		int lastDay = getLastDay(year, month);
		
		System.out.println(dayOfWeek + " / " + lastDay);
		
		
		Date d = new Date(year-1900, month-1, 1);
		int date = d.getDate() - dayOfWeek;
		d.setDate(date);
//		System.out.println(d.toLocaleString());
		Date today = new Date();
		Date temp = new Date(today.getYear(), today.getMonth(), today.getDate());
		
		for (int i = 1; i <= 42; i++) {
//			 // System.out.println( d.toLocaleString());
			int m = d.getMonth() + 1;
			int date2 = d.getDate();
			System.out.printf(m != month ? "(%d)\t" : (d.compareTo(temp) == 0 ? "[%d]\t" : "%d\t"), d.getDate());
			if (i % 7 == 0)
				System.out.println();
			date = d.getDate() + 1;
			d.setDate(date);
		} // for
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, date);
		return d.getDay();
	}

	private static int getLastDay(int year, int month) {
		Date d = new Date(year-1900, month, 1);
		int date = d.getDate() - 1;
		d.setDate(date);
		return d.getDate();
	}
}
