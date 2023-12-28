package days10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오전 10:32:00
 * @subject
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		getTotalDays(2023, 7, 1);
	}
	
	private static int getDayOfWeek(int year, int month, int day) {
		// 날짜, 시간 기능(일, 함수, 메서드) 구현된 클래스
		// Date, Calendar
		// LocalDate, LocalTime, LocalDateTime
		
		LocalDate d = LocalDate.now();
		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek w = d.getDayOfWeek();
		w.getValue();
		
		return w.getValue() % 7;
	}
	
	private static int getTotalDays(int year, int month, int day) {
		LocalDate startDate = LocalDate.of(1, 1, 1);
		LocalDate endDate = LocalDate.now();
		
		int totalDays = (int)startDate.until(endDate, ChronoUnit.DAYS) + 1;	// 일 수
//		startDate.until(endDate, ChronoUnit.MONTHS);	// 개월수
//		startDate.until(endDate, ChronoUnit.YEARS);	// 년수
		
		System.out.println(startDate);
		System.out.println(endDate);
		
		return totalDays;
	}
	
	private static int getLastDay(int year, int month) {
		LocalDate d = LocalDate.of(year, month, 1);
		
		// 그 달의 총 날 수를 매개변수로 줌 즉 with()함수로 마지막날로 세팅
		LocalDate lastDate = d.withDayOfMonth(d.lengthOfMonth());
		
		return lastDate.getDayOfMonth();
	}
}
