package days12;

/**
 * @author sangmun
 * @date 2023. 7. 28. - 오전 10:18:32
 * @subject
 * @content
 */
public class Ex01_03 {
	public static void main(String[] args) {
		int[][] m = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		// 00 00
		// 01 01
		// 02 02
		// 03 03
		// 10 04
		// 11 05
		// 12 10
		// 13 11
		// 20 12
		// 21 13
		// 22 14
		// 23 15
		
		// 힌트 2차원 -> 1차원 -> 2차원
		int[][] n = new int[2][6];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
//				n[][] = m[i][j];
			} // for
		} // for
		
		dispM(n);
	}
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
	}
}
