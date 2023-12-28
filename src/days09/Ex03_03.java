package days09;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오후 12:45:50
 * @subject
 * @content
 */
public class Ex03_03 {
	public static void main(String[] args) {
		// 주민등록번호(rrn)
		// 1. 생년월일
		// 2. 성별, 세기, 내국인/외국인
		// 3. 세는나이, 만나이
		// 4. 주민번호검증
		
		// ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		
		String rrn = "980823-1065511";
		boolean checkSum = checkRRN(rrn);
		
		if (checkSum) {
			System.out.println("올바른 주민등록번호");
		} else {
			System.out.println("잘못된 주민등록번호");
		}
	}
	
	private static boolean checkRRN(String rrn) {
	      // String rrn = "830412-1700001";
	      // 2가지 : char charAt(0)        -> int
	      //         String substring(0,1) -> int
	      int total = 0;
	      int ㄱ = rrn.charAt(0) - '0';  // '8' -> 8
	      //int ㄴ = Integer.parseInt(rrn.substring(1, 2) );  // "3" -> 3
	      int ㄴ = rrn.charAt(1) - '0';  // '8' -> 8 
	      int ㄷ = rrn.charAt(2) - '0';  // '0' -> 8
	      int ㄹ = rrn.charAt(3) - '0';  // '8' -> 8
	      int ㅁ = rrn.charAt(4) - '0';  // '8' -> 8
	      int ㅂ = rrn.charAt(5) - '0';  // '8' -> 8
	      //                  6             '-'
	      int ㅅ = rrn.charAt(7) - '0';  // '8' -> 8
	      int ㅇ = rrn.charAt(8) - '0';  // '8' -> 8
	      int ㅈ = rrn.charAt(9) - '0';  // '8' -> 8
	      int ㅊ = rrn.charAt(10) - '0';  // '8' -> 8
	      int ㅋ = rrn.charAt(11) - '0';  // '8' -> 8
	      int ㅌ = rrn.charAt(12) - '0';  // '8' -> 8
	      total += ㄱ*2 + ㄴ*3 + ㄷ *4 + ㄹ*5 + ㅁ*6 + ㅂ*7 + ㅅ*8 + ㅇ*9 + ㅈ*2 + ㅊ*3+ ㅋ*4+ㅌ*5;
	      int check = 11 - total % 11;
	      if(check==10) check=0;
	      else if( check==11) check=1;
	      
	      int ㅍ = rrn.charAt(13) - '0';
	      
	      return ㅍ == check;
	   }
	
	// 내가 한 거
	/*
	// 2,3,4,5,6,7,8,9,2,3,4,5
	public static boolean checkRRN(String rrn) {
		int[] unit = {2,3,4,5,6,7,8,9,2,3,4,5};
		int result = 0;
		rrn = rrn.replace("-", "");
		
		for(int i=0; i<rrn.length() - 1; i++) {
			int sub = rrn.charAt(i) - '0';
			result += sub * unit[i];
		}
		
		result = 11 - result%11;
		int lastNum = rrn.charAt(rrn.length()-1) - '0';
		
		return lastNum == result%10 ;
	}
	*/
}
