package days20;

import java.util.Calendar;
import java.util.Date;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 12:23:56
 * @subject
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		// Date -> Calendar 변환
		Date today = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(today);
	}

}
