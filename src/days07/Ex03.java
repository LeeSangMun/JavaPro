package days07;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오전 9:46:07
 * @subject
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)
		int com, user;
		String[] opt = { "가위", "바위", "보" };
		char con = 'y';
		boolean flag = false;
		int count = 0;
		String inputData = "";
		String regex = "[1-3]";
		
		try (Scanner sc = new Scanner(System.in);) {
			do {	
//				System.out.print(" > user 가위(1), 바위(2), 보(3) 선택 ? ");
				// 입력값에 대한 유효성 검사
//				inputData = sc.next();
//				if(!s.matches("[1-3]")) { // [1-3]
//					System.out.println("잘못 입력하셨습니다.");
//					continue;
//				}
				do {
					if(flag) {
						System.out.printf("> [알림] 입력잘못(1~3)!!! %d회 입력잘못\n", ++count);
						if(count == 5) {
							System.out.println("end");
							System.exit(0);
						}
					}
					System.out.print(" > user 가위(1), 바위(2), 보(3) 선택 ? ");
					// 입력값에 대한 유효성 검사
					inputData = sc.next();
					flag = true;
				} while(!inputData.matches(regex));
				
				user = Integer.parseInt(inputData);
				com = (int) (Math.random() * 3) + 1;
				
				System.out.printf("> 컴퓨터:%s, 사용자:%s\n", opt[com - 1], opt[user - 1]);
				
				switch (user - com) {
				case 1:
				case -2:
					System.out.println("사용자 승리");
					break;
				case 2:
				case -1:
					System.out.println("컴퓨터 승리");
					break;
				default:
					System.out.println("무승부");
				}
				System.out.print("계속 하시겠습니까 ? ");
				con = (char)System.in.read();
				System.in.skip(System.in.available());
			} while(Character.toUpperCase(con) == 'Y');
			System.out.println("End");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
