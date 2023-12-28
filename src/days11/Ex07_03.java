package days11;

import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오후 3:39:01
 * @subject
 * @content
 */
public class Ex07_03 {
	public static void main(String[] args) {
		/*
		int[][][] m = new int[2][3][4];
		
		// 1. 배열의 크기
		System.out.println(m.length);			// 면 크기
		System.out.println(m[0].length);		// 행 크기
		System.out.println(m[1].length);		// 행 크기
		System.out.println(m[0][0].length);	// 열 크기
		System.out.println(m[0][1].length);
		System.out.println(m[0][2].length);
		System.out.println(m[1][0].length);
		System.out.println(m[1][1].length);
		System.out.println(m[1][2].length);
		*/
		
		// 3차원 배열의 초기화
		int[][][] m = {
				{
					{1,2,3,4},
					{5,6,7,8}
				},
				{
					{9,10,11,12},
					{13,14,15,16}
				}
		};
		
		dispM(m);
	}

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d ", i,j,k,m[i][j][k]);
				} // for
				System.out.println();
			} // for
			System.out.println();
		} // for
	}
}
