package days20;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 4:15:04
 * @subject
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
//		LocalDate d = LocalDate.of(2023, 8, 9);
//		LocalDate d = LocalDate.ofYearDay(2023, 365);
		System.out.println(d);
		
		// 년
		System.out.println(d.getYear());
		System.out.println(d.get(ChronoField.YEAR));
		
		// 월
		Month eMonth = d.getMonth();
		System.out.println(eMonth);
		int month = d.getMonthValue();
		System.out.println(month);
		System.out.println(d.get(ChronoField.MONTH_OF_YEAR));
		
		// 일
		System.out.println(d.getDayOfMonth());
		System.out.println(d.get(ChronoField.DAY_OF_MONTH));
		
		LocalTime t = LocalTime.now();
		
		// 시간
		System.out.println(t.getHour());
		t.get(ChronoField.HOUR_OF_DAY); // (밤12==0)~23
		t.get(ChronoField.CLOCK_HOUR_OF_DAY); // 1~24(밤12==24)
		t.get(ChronoField.HOUR_OF_AMPM); // 0~11
		t.get(ChronoField.CLOCK_HOUR_OF_AMPM); // 1~12

		
		// 분
		System.out.println(t.getMinute());
		System.out.println(t.get(ChronoField.MINUTE_OF_HOUR));
		
		// 초
		System.out.println(t.getSecond());
		System.out.println(t.get(ChronoField.SECOND_OF_MINUTE));
		
		// 밀리세컨드
//		System.out.println(t.get);
		System.out.println(t.get(ChronoField.MILLI_OF_SECOND));
		
		// 요일
		System.out.println(d.getDayOfWeek());
		// Date 0(일)1(월)2(화)~6(토)
		// Calendar 1(일)2(월)3(화)~7(토)
		// LocalDate 1(월)2(화)~~~~ 6(토)7(일)

		System.out.println(d.get(ChronoField.DAY_OF_WEEK));
		
	}

}
