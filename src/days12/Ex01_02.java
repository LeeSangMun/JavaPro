package days12;

/**
 * @author sangmun
 * @date 2023. 7. 28. - 오전 10:05:09
 * @subject	
 * @content
 */
public class Ex01_02 {
	public static void main(String[] args) {
		int[][] m = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		dispM(m);
		
		int[] n = new int[m.length*m[0].length];
		
		// 0 00
		// 1 01
		// 2 02
		// 3 03
		// 4 10
		// 5 11
		// 6 12
		// 7 13
		/*
		for (int i = 0; i < n.length; i++) {
			n[i] = m[i/4][i%4];
		} // for
		*/
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i*m[0].length+j] = m[i][j];
			} // for
		} // for
		
		dispN(n);
	}

	private static void dispN(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d]", n[i]);
		} // for
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
