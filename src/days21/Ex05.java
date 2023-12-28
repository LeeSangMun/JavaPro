package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오전 10:49:29
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 날짜와 시간 비교
		// isAfter(), isBefore(), isEquals()
		
		// 오늘이 생일 ? 
		// 1999.8.10
		
		// 2023.8.10
		
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1999, 8, 10);
		
		birth = birth.with(ChronoField.YEAR, today.getYear());
		
		System.out.println(birth);
		System.out.println(today.isEqual(birth));
		System.out.println(today.isBefore(birth));
		System.out.println(today.isAfter(birth));
		System.out.println(today.compareTo(birth));
	}

}
