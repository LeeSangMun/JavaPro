package days12;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 28. - 오전 8:47:13
 * @subject	11일차 복습
 * @content
 */
public class Ex01 {
	
	// 00 01
	// 10 11
	// 20 21
	// 30 31
	// 40 41
	// 50 51
	
	// 00 0
	// 01 1
	// 10 2
	// 11 3
	// 20 4
	// 21 5
	public static void main(String[] args) throws IOException {
		int[] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[][] n = new int[6][2];
		
		
//		for (int i = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++) {
//				n[i][j] = m[i*2+j];
//			} // for
//		} // for
		
		for (int i = 0; i < m.length; i++) {
			n[i/2][i%2] = m[i];
		} // for
		
		System.out.println(Arrays.deepToString(n));
	}
}
