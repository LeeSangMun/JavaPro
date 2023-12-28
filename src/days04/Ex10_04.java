package days04;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오후 5:11:11
 * @subject
 * @content
 */
public class Ex10_04 {
	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)

		int com, user;
		String[] opt = { "가위", "바위", "보" };

		try (Scanner sc = new Scanner(System.in);) {
			System.out.print(" > user 가위(1), 바위(2), 보(3) 선택 ? ");
			// 입력값에 대한 유효성 검사
			user = sc.nextInt();
			com = (int) (Math.random() * 3) + 1;

			System.out.printf("> 컴퓨터:%s, 사용자:%s\n", opt[com - 1], opt[user - 1]);

			switch (user - com) {
			case 1: case -2:
				System.out.println("사용자 승리");
				break;
			case 2: case -1:
				System.out.println("컴퓨터 승리");
				break;
			default:
				System.out.println("무승부");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
