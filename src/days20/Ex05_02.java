package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 12:09:09
 * @subject	날짜, 시간 정보를 사용자가 원하는 형식 출력.
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// SimpleDateFormat 형식화 클래스
		
		String pattern = "yyyy.MM.dd a hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		/*
		System.out.println(sdf.format(new Date()));
		*/
		
		// Calendar -> Date 형 변환
		
		// [1]
//		Date today = new Date(c.getTimeInMillis());
		Calendar c = Calendar.getInstance();
		System.out.println(sdf.format(c.getTime()));
	}

}
