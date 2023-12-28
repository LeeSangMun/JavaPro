package days19;

import java.util.Date;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오후 3:26:05
 * @subject	날짜, 시간 클래스 + 형식화클래스
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// jdk 1.0 java.util.Date
		// jdk 1.1 java.util.Calendar
		//								ㄴ  GregorianCalendar
		
		// jdk 1.8 java.time 패키지 안에 여러 하위 패키지와 다양한 클래스 추가
		
		Date d = new Date();
		System.out.println(d);
		// GMT 그리니치 표준시, 세계 표준 시간
//		System.out.println(d.toGMTString());
//		System.out.println(d.toLocaleString());
		
		// 년
		System.out.println(d.getYear() + 1900);
		// 월
		System.out.println(d.getMonth() + 1);
		// 일
		System.out.println(d.getDate());
		// 시간
		System.out.println(d.getHours());
		// 분
		System.out.println(d.getMinutes());
		// 초
		System.out.println(d.getSeconds());
		// 밀리세컨드
		// *****
		System.out.println(d.getTime());
		// 요일
		System.out.println(d.getDay());
	}

}
