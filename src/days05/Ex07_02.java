package days05;

import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 4:32:00
 * @subject	while문과 do~while문의 차이점
 * @content
 */
public class Ex07_02 {
	public static void main(String[] args) throws IOException {
		int i = 10;
		
		while (i < 2) {
			
		}
		
		do {
			System.out.println("B"); // 무조건 한번은 실행
		} while (i<2);
	}
}
