package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오전 11:52:30
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// [TemporalAdjusters 클래스]
		// 자주 사용되는 날짜, 시간 변경하는 메서드들을 미리 구현해 놓은 클래스
		// 예) 다음 년도의 첫 날
		//		다음 달의 첫 날
		//		올 해의 첫 날
		// 		이번 달의 첫 날
		//		올 해의 마지막 날
		//		이번 달의 마지막 날짜
		// 		다음 주 ?요일
		//		지난 ?요일
		// 		이번 달 n 번째 ? 요일
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		// 다음달의 첫 날
		System.out.println(d.with(firstDayOfNextMonth())); 
		// 이번달의 첫 날
		System.out.println(d.with(firstDayOfMonth())); 		
		// 이번달의 첫번째 월요일
		System.out.println(d.with(firstInMonth(MONDAY))); 
		// 지난 주 화요일
		System.out.println(d.with(previous(TUESDAY)));
		System.out.println(d.with(previousOrSame(TUESDAY)));
		// 다음 주 금요일 휴강
		System.out.println(d.with(next(FRIDAY)));
		System.out.println(d.with(nextOrSame(FRIDAY)));
		// 이번 달의 4번째 화요일
		System.out.println(d.with(dayOfWeekInMonth(4, TUESDAY)));
		
		// 3일 뒤에 만나자
		System.out.println(d.with(new DayAfter3일()));
	}

}

class DayAfter3일 implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		
		return temporal.plus(3, ChronoUnit.DAYS);
	}
	
}
