package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 12:42:22
 * @subject	add() / set() / roll() 차이점
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 2023, 8
		Calendar c  = new GregorianCalendar(2023, 8-1, 1);
		// 하루 전
		
		/*
		c.set(Calendar.DATE, 0); // 7.31
		c.set(Calendar.DATE, -1); // 7.30
//		c.set(Calendar.DATE, 10);
//		c.set(Calendar.DATE, 32);
		*/
		
		/*
		c.add(Calendar.DATE, -1); // 2023-07-31
		c.add(Calendar.DATE, 1);
		*/
		
//		c.roll(Calendar.DATE, -1); // 2023-08-31

		
		System.out.println(Ex05.getPatternDate(c, "yyyy-MM-dd"));
		
	}

}
