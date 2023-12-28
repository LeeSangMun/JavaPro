package days05;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오전 9:00:34
 * @subject
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		char ch = ' ';
		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("> 한 문자 입력 ? ");
			ch = sc.next().charAt(0);
			
			if('0' <= ch && ch <= '9') {
				System.out.println("숫자입니다.");
			} else if('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z') {
				System.out.println("대소문자입니다.");
			} else if("#$!%@".indexOf(ch) != -1) {
				System.out.println("특수문자입니다.");
			} else if((ch+"").matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
				System.out.println("한글입니다.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
