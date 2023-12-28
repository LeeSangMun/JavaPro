package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오전 11:29:58
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// jdk 1.1 Calendar (추상)클래스 - 날짜, 시간
//		Calendar c = new GregorianCalendar();
		// BuddhistCalendar - 태국에서 사용하는 캘린더
		
		Calendar c = Calendar.getInstance();
		//c.add();
		//c.clear()
		
		// 년
		System.out.println(c.get(Calendar.YEAR));
		// 월
		System.out.println(c.get(Calendar.MONTH)+1);
		// 일
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		// 시간
		System.out.println(c.get(Calendar.HOUR));					// 12(0~11)
		System.out.println(c.get(Calendar.HOUR_OF_DAY));	// 24(0~24)
		// 분
		System.out.println(c.get(Calendar.MINUTE));
		// 초
		System.out.println(c.get(Calendar.SECOND));
		// 밀리세컨드
		System.out.println(c.get(Calendar.MILLISECOND));
		// 요일
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println( "일월화수목금토".charAt(c.get(Calendar.DAY_OF_WEEK)-1));
		
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		
	}

}
