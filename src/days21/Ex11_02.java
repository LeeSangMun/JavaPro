package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오후 2:11:30
 * @subject
 * @content
 */
public class Ex11_02 {

	public static void main(String[] args) {
//		String source = "2023-08-10";
		String source = "2023년 08월 10일 (목)";
		String pattern = "yyyy년 MM월 dd일 (E)";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDate d = LocalDate.parse(source, dtf);
		System.out.println(d);
		
		LocalTime t = LocalTime.parse("12:23:43");
		System.out.println(t);
	}

}
