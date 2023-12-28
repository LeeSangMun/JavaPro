package days05;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오전 11:27:28
 * @subject
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		
		// 문제. 한 라인에 10개씩 출력
		// enter 누르면 10개씩 출력
		// 행 번호 추가
		// ASCII 256가지
		
		try(Scanner sc = new Scanner(System.in)) {
			for(int i=1; i<=256/10+1; i++) {
//				System.out.printf("%d-%c\n", i, (char)i);
				sc.nextLine();
				if(sc.hasNextLine()) {
					System.out.print(i + ":");
					for(int j=(i-1)*10; j<=(i-1)*10+9; j++) {
						System.out.printf("[%c]", (char)j);
					}
				}
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
//		for(int i=0, lineNumber=1; i<256; i++) {
//			if(i%10 == 0) {
//				System.out.printf("%d : ", lineNumber++);
//			}
//		}
		
	}
}
