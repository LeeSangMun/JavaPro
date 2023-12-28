package days07;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오전 10:21:13
 * @subject 대문자 <-> 소문자 변환 메서드
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		/*
		System.out.println(Character.toUpperCase('y'));
		System.out.println(Character.toUpperCase('Y'));
		System.out.println(Character.toLowerCase('y'));
		System.out.println(Character.toLowerCase('Y'));
		
		System.out.println("aBc".toUpperCase());
		System.out.println("aBc".toLowerCase());
		*/
		
		int com, user;
		String regex = "[1-3]";
		String inputData = "";
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		do {
			if(flag) {
				System.out.println("> [알림] 입력잘못(1~3)!!!");
			}
			System.out.print(" > user 가위(1), 바위(2), 보(3) 선택 ? ");
			// 입력값에 대한 유효성 검사
			inputData = sc.next();
			flag = true;
		} while(!inputData.matches(regex));
		
		/*
		do {
			System.out.print(" > user 가위(1), 바위(2), 보(3) 선택 ? ");
			// 입력값에 대한 유효성 검사
			inputData = sc.next();
			if(inputData.matches(regex)) {
				break;
			}
			
			System.out.println();
		} while(true);
		*/
		
		user = Integer.parseInt(inputData);
		System.out.println(user);
	}
}
