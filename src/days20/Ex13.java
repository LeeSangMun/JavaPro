package days20;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 4:48:40
 * @subject
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		// withXXX()
		/*
		d = d.withYear(2020);
		d = d.withMonth(5);
		d = d.withDayOfMonth(11);
		*/
		
		// with()
		d = d.with(ChronoField.YEAR, 2020);
		d = d.with(ChronoField.MONTH_OF_YEAR, 5);
		d = d.with(ChronoField.DAY_OF_MONTH, 11);
		
		System.out.println(d);
	}

}
