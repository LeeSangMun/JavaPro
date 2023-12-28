package days04;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오후 5:28:51
 * @subject
 * @content
 */
public class Ex11 {
	public static void main(String[] args) {
		// 1. 배열 정의
		// 2. 배열 선언 형식
		// 3. 배열 크기 
		
//		int[] m = new int[5];
//		m[0] = 5;
//		m[1] = 3;
//		m[2] = 6;
//		m[3] = 2;
//		m[4] = 4;
		
		int[] m = { 5, 3, 6, 2, 4 };
		
		for(int i=0; i<m.length; i++) {
			System.out.printf("m[%d]=%d\n", i, m[i]);
		}
	}
}
