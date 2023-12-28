package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오후 12:24:05
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 날짜 - 날짜 : Period
		// 시간 - 시간 : Duraion
		
		// between(),     until()
		// static메서드      인스턴스메서드
		
		// of(), with()
		// puls(), minus() 등등
		
		// 개강일  오늘
		LocalDate t = LocalDate.now();
		t.plusDays(1);
		LocalDate s = LocalDate.of(2023, 7 ,13);
		
		// 날짜 차
		Period p = Period.between(s, t);
		int year = p.getYears();
		System.out.println(year);
		
		long month = p.get(ChronoUnit.MONTHS);
		System.out.println(month);
		
		int day = p.getDays();
		System.out.println(day);
		
		// 시간 차
		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime tt = LocalTime.now();
		
		Duration d = Duration.between(st, tt);
		
		long ss = d.getSeconds();
//		System.out.println(d.get(ChronoUnit.HOURS));
		
	}

}
