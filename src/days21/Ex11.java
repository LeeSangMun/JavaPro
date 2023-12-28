package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오후 12:44:34
 * @subject	DateTimeFormatter 형식화 클래스
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		// 2023/8/10 요일 시간:분:초.밀리세컨드
		String pattern = "yyyy/MM/dd E hh:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println(dtf.format(dt));
	}

}
