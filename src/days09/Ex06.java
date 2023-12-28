package days09;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오후 4:48:31
 * @subject
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] m = new int[3];
		String [] menus = {"추가", "수정", "삭제", "검색", "조회", "종료"};
		int selectedNumber;
		
		while(true) {
			dispMenu(menus);
			selectedNumber = selectMenus(scanner);
			processMenus(selectedNumber);
		}
	}

	// 메뉴 출력
	public static void dispMenu(String[] menus) {
		System.out.println("[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\n", i+1, menus[i]);
		} // for
		
	}
	
	public static int selectMenus(Scanner scanner) {
		System.out.println("> 메뉴를 선택하세요 ? ");

		return scanner.nextInt();
	}
	
	public static void processMenus(int selectedNumber) {
		switch (selectedNumber) {
		case 1:
			System.out.println("배열에 요소 추가");
			break;
		case 2:
			System.out.println("배열에 요소 수정");
			break;

		case 3:

			break;

		case 4:

			break;

		case 5:

			break;

		case 6:
			exit();
			break;
		}
	}

	public static void exit() {
		System.out.println("\n\n 프로그램 종료합니다.~");
		System.exit(-1);
	}
}
