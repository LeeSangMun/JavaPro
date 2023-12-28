package days09;

import java.text.DecimalFormat;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오전 11:05:28
 * @subject
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		// 주민등록번호
		// 1. 주민등록번호 RRN
		// 2. 생년월일, 나이, 성별, 내국인/외국인, 검증
		String rrn = "890123-1700001";
		
		String birthDay = getBirth(rrn);
		
		System.out.println(birthDay);
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
