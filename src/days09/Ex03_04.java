package days09;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오후 12:45:50
 * @subject
 * @content
 */
public class Ex03_04 {
	public static void main(String[] args) {
		String rrn = "980823-1065511";
		boolean checkSum = checkRRN(rrn);
		
		if (checkSum) {
			System.out.println("올바른 주민등록번호");
		} else {
			System.out.println("잘못된 주민등록번호");
		}
	}
	
	private static boolean checkRRN(String rrn) {
		int total = 0;

		int[] m = { 2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5 };
		for (int i = 0; i <= 12; i++) {
			total += (rrn.charAt(i) - '0') * m[i];
		}

		int check = (11 - total % 11) % 10;

		int ㅍ = rrn.charAt(13) - '0';

		return ㅍ == check;
	}
}
