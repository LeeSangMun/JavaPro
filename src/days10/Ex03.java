package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오전 11:16:26
 * @subject	
 * @content	배열 단점 -> 컬렉션 클래스
 * 					1) 배열크기 자동 크기 증가/감소 x
 */
public class Ex03 {
	static int index = 0;
	static Scanner scanner = new Scanner(System.in);
	static char con = 'y';
	
	public static void main(String[] args) throws IOException {
		int[] m = new int[3];
		
		String [] menus = {"추가", "수정", "삭제", "검색", "조회", "종료"};
		int selectedNumber;
		
		while(true) {
			dispMenu(menus);
			selectedNumber = selectMenus(scanner);
			processMenus(selectedNumber, m);
		}
	}

	// 메뉴 출력
	public static void dispMenu(String[] menus) {
		System.out.println("[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\t", i+1, menus[i]);
		} // for
		System.out.println();
	}
	
	public static int selectMenus(Scanner scanner) {
		System.out.print("> 메뉴를 선택하세요 ? ");

		return scanner.nextInt();
	}
	
	public static void processMenus(int selectedNumber, int[] m) throws IOException {
		switch (selectedNumber) {
		case 1:
			// main함수 m 배열에 값을 입력받아 요소 추가
			add(m);
			break;
		case 2:
			System.out.println("배열에 요소 수정");
			break;

		case 3:

			break;

		case 4:

			break;

		case 5:
			// 배열의 모든 요소 조회
			list(m);
			break;

		case 6:
			exit();
			break;
		}
		
		stop();
	}
	
	public static void stop() {
		System.out.print("> 아무키나 누르면 계속합니다.");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void list(int[] m) {
		System.out.println("[5. 조회]");
		if(index == 0) {
			System.out.println("\t추가된 요소가 없습니다.");
			return;
		} 
		for(int i=0; i<index; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
		}
		System.out.println();
	}

	// m 배열에 요소를 추가하는 메서드
	public static void add(int[] m) throws IOException {
		System.out.println("[1. 추가]");
		
		do {
//			if(index == 3) break;
			if(index == m.length) {
				int[] temp  = new int[m.length+3];
				for (int i = 0; i < m.length; i++) {
					temp[i] = m[i];
				} // for
				System.out.println(Arrays.toString(temp));
				m = temp;
			}
			
			System.out.print("> 정수입력 ? ");
			int n = scanner.nextInt();
			m[index++] = n;
			System.out.print("\t 요소추가 계속할거냐 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while(Character.toUpperCase(con) == 'Y');
//		} while(Character.toUpperCase(con) == 'Y' && index < 3);
		
		System.out.println(Arrays.toString(m));
	}

	public static void exit() {
		System.out.println("\n\n 프로그램 종료합니다.~");
		System.exit(-1);
	}
}
