package days07;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오전 11:18:38
 * @subject
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		int com, user;
		String regex = "[1-3]";
		String inputData = "";
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int failureNumber = 0; // 실패 횟수 저장 변수
		
		do {
			if(flag) {
				failureNumber++;
				System.out.printf("> [알림 %d] 입력잘못(1~3)!!!\n", failureNumber);
				if(failureNumber == 5) {
					System.out.println("\t [5번] 실패했기에 프로그램 종료!!!");
//					return;
					System.exit(-1);
				}
			}
			System.out.print(" > user 가위(1), 바위(2), 보(3) 선택 ? ");
			// 입력값에 대한 유효성 검사
			inputData = sc.next();
			flag = true;
		} while(!inputData.matches(regex));
		
		user = Integer.parseInt(inputData);
		System.out.println(user);
	}
}
