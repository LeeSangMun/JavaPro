package days11;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오후 3:33:21
 * @subject	
 * @content
 */
public class Ex07_02 {
	public static void main(String[] args) {
		/*
		int[][] m = new int[2][4];
		
		// 1. 배열의 크기
		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(m[1].length);
		*/
		
		// 2차원 배열의 초기화
		/*
		int[][] m = new int[][] {
			{1,2,3,4},
			{5,6,7,8}
		};
		*/
		
		int[][] m = {
			{1,2,3,4},
			{5,6,7,8}
		};
		dispM(m);
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			} // for
			System.out.println();
		} // for 
	}
}
