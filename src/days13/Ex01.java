package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오전 8:47:23
 * @subject	12일차 복습
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		int [][] m = new int[5][5];
		
		fillM(m);
	}

	private static void fillM(int[][] m) {
		for (int i = 0, n=1; i < m.length-1; i++) {
			for (int j = 0; j < m[i].length-1; j++) {
				m[i][j] = n++;
				m[i][4] += m[i][j];
				m[4][j] += m[i][j];
				m[4][4] += m[i][j];
			} // for
		} // for
	}
}