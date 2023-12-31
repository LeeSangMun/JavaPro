package days20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 3:46:21
 * @subject
 * @content
 */
public class Ex11_02 {

	public static void main(String[] args) {
		// java.time 핵심클래스
		
		// now()
		/*
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		*/
		
		// of()
		LocalDate ld = LocalDate.of(2015, 11,  23);
		System.out.println(ld);
		
		LocalTime lt = LocalTime.of(3, 20, 1);
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
	}

}
