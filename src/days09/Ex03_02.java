package days09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오전 11:38:41
 * @subject
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {
		String rrn = "990123-1700001";
		
		// 주민등록번호 -> 나이
		int age = 0;
		
		// 세는나이	countingAge
		age = getCountingAge(rrn);
		System.out.println("> 세는 나이 : " + age);
		
		// 만 나이		AmericanAge
		age = getAmericanAge(rrn);
		System.out.println("> 만 나이 : " + age);
		
	}

	public static int getAmericanAge(String rrn) {
		int americanAge = getCountingAge(rrn) - 1;
		
		// 1)
		// 생일 1.23 -> 123
		// 오늘 7.25 -> 725
		// 오늘(725) - 생일(123) >= 0 생일이 지남
			
		// [1] Calendar 클래스 이용
		/*
		int birthMMdd = Integer.parseInt(getBirth(rrn).substring(4).replace(".", ""));
		Calendar c = Calendar.getInstance();
		int thisMonth = c.get(Calendar.MONTH);
		int thisDay = c.get(Calendar.DATE);
		int thisMMdd = thisMonth * 100 + thisDay;
		
		boolean flag = thisMMdd - birthMMdd >= 0;
		int americanAge = getCountingAge(rrn) - 1 + (flag ? 0 :-1);
		*/
		
		// [2] Date 클래스 이용
		/*
		Date d = new Date();
		int thisMonth = d.getYear() + 1;
		int thisDay = d.getDate();
		int thisMMdd = thisMonth * 100 + thisDay;
		*/
		
		// [3] SimpleDateFormat
		Date d = new Date();
		String pattern = "MMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		int thisMMdd = Integer.parseInt(sdf.format(d));
		
		/*
		int americanAge = getCountingAge(rrn) - 1;
		
		int birthMonth = Integer.parseInt(getBirth(rrn).split("[.]")[1]);
		int birthDay = Integer.parseInt(getBirth(rrn).split("[.]")[2]);

		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c2.set(2023, birthMonth-1, birthDay);
		if(c.compareTo(c2) == 1) {
			return americanAge - 1;
		}
		*/
		
		return americanAge;
	}

	public static int getCountingAge(String rrn) {
		// 올해 년도
		// 생일 년도
		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.YEAR);
		
		/*
		Date d = new Date();
		int thisYear = d.getYear() + 1900;
		*/
		
		int myBirth = Integer.parseInt(getBirth(rrn).substring(0, 4));
		
		return thisYear - myBirth + 1;
	}

	// 생일을 돌려주는 함수
	public static String getBirth(String rrn) {
		int  year = Integer.parseInt(rrn.substring(0, 2));
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));
		System.out.printf("%d.%d.%d\n", year, month, day);
		
		int ㅅ = getGender(rrn);
		
		int centry = 1800;
		switch(ㅅ ) {
		case 1: case 2: case 5: case 6:
			centry = 1900;
			break;
		case 3: case 4: case 7: case 8:
			centry = 2000;
			break;
		case 9: case 0:
			centry = 1800;
			break;
		}
		
		year = centry + year;
		String birthDay = String.format("%d.%d.%d", year, month, day);
		
		return birthDay;
	}
	
	public static int getGender(String rrn) {
//		return Integer.parseInt(rrn.substring(7, 8)); 
		return rrn.charAt(7) - '0';
	}
}
