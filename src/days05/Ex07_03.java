package days05;

import java.io.IOException;
/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 4:35:21
 * @subject	foreach문
 * @content
 */
public class Ex07_03 {
	public static void main(String[] args) throws IOException {
		// 1. 정수 10개 저장할 배열 m을 선언
		// 2. 임의의 정수 (1~100)를 각 배열의 요소에 저장
		// 3. for문을 사용해서 각 요소를 출력.
		
		int[] m = new int[10];
		for(int i=0; i<m.length; i++) {
			m[i] = (int)(Math.random()*100) + 1;
		}
		
//		for(int i=0; i<m.length; i++) {
//			System.out.printf("m[%d]=%d\n", i, m[i]);
//		}
		
		for (int n : m) {
			System.out.println(n);
		}
	}
}
