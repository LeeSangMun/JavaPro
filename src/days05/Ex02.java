package days05;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오전 10:30:33
 * @subject	6번 복습
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		// 한 문자 입력
		char one;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print(" > 한 문자 입력 ? ");
			// "a" -> 'a' 변환
			String inputData = sc.next();
			one = inputData.charAt(0);
			
			if ('0' <= one && one <= '9') {
				System.out.println("숫자");
			} else if ('A' <= one && one <= 'Z' || 'a' <= one && one <= 'z') {
				System.out.println("알파벳");
			} else if('가' <= one && one <= '힣') {
				System.out.println("한글");
			}	
			else if (one == '#' || one == '$' || one == '!' || one == '%' || one == '@') {
				System.out.println("특수문자");
			} else {
				System.out.println("X");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
