package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오전 11:18:52
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		// truncat 절삭
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);
		*/
		
		/*
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		
		LocalDateTime dt = LocalDateTime.of(d, t);
		
		LocalDateTime dt2 = d.atTime(t);
		
		LocalDateTime dt3 = t.atDate(d);
		*/
		
		// LocalDateTime -> LocalDate 변환
		// LocalDateTime -> LocalTime 변환

		LocalDateTime dt = LocalDateTime.now();
		LocalDate d = dt.toLocalDate();
		LocalTime t = dt.toLocalTime();
	}

}
