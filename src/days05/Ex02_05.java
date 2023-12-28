package days05;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 12:35:59
 * @subject
 * @content
 */
public class Ex02_05 {
	public static void main(String[] args) {
		// 한 문자 입력
		char one;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(" > 한 문자 입력 ? ");
			// "a" -> 'a' 변환
			String inputData = sc.next();

			String regex = "[#@$!]"; // [^] -> ^는 제외하고
			if (inputData.matches(regex)) {
				System.out.println("특수문자");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
