package days12;

/**
 * @author sangmun
 * @date 2023. 7. 28. - 오전 11:40:46
 * @subject	
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		int[][] m = new int[5][5];
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("[" + i + "," + j + "]");
//			} // for
//			System.out.println();
//		} // for
		
//		fillM(m);
//		fillM02(m);
//		fillM03(m);
		
//		fillM04(m);
//		fillM05(m);
//		fillM06(m);
		
		// 마방진
		magicSquare(m);
		
		
		dispM(m);
	}


	// 마방진
	private static void magicSquare(int[][] m) {
		// 마방진 조건
		// 1) 첫 번째 행의 가운데 열 = 1
		// 2) 행 감소, 열 증가 반복적으로 처리
		// 출력삾이 5의 배수라면 행만 증가
		// 3) 행 < 0 이면  가장큰행값으로 바꿈
		// 4) 열 5열 이면 가장작은열값으로 바뀜 
//		int n = 1;
//		int row=0, col = 2;
//		while(n <= 25) {
//			m[row][col] = n;
//			
//			dispM(m);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			if(n%5==0) {
//				row++;
//			}
//			else {
//				row--; col++;
//				if(col == 5) col=0;
//				else if(row == -1) row=4;
//			}
//			n++;
//		}
		
		int x = 0, y = 2, n =1;
		while(n <= 25) {
			m[x][y] = n++;
			if(n % 5 == 0) {
				x++;
			} else {
				x = (--x == -1 ? 4 : x);
				y = (++y == 5 ? 0 : y);
			}
		}
	}

	private static void fillM06(int[][] m) {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][j] = 
//			} // for
//		} // for
//		
//		
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][i%2==0 ? j : 4-j] = i*5+j+1;
//			} // for
//		} // for
	}
	
	
	// 00 00 1
	// 01 01 2
	// 02 10 3
	// 03 02 4
	// 04 11 5
	// 10 20 6
	// 11 03 7
	// 12 12 8
	// 13 21 9
	// 14 30 10
	
	// 00 1
	// 01 2
	// 02 4
	// 03 7
	// 04 11
	// 10 3
	// 11 5
	
	private static void fillM05(int[][] m) {
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][j] = 
//			} // for
//		} // for
//		
//		
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][i%2==0 ? j : 4-j] = i*5+j+1;
//			} // for
//		} // for
		
		int count = 0;
		int number = 1;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i + j == count) {
					m[i][j] = number++;
				}
			} // for
		} // for
		count++;


	}

	// 00 00
	// 01 01
	// 02 02
	// 03 03
	// 04 04
	// 10 14
	// 11 13
	// 12 12
	// 13 11
	// 14 10
	// 20 20
	// 21 21
	// 22 22
	// 23 23
	// 24 24
	// 30 34
	// 31 33
	// 32 32
	// 33 31
	// 34 30
	private static void fillM04(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = i%2==0 ? i*5+j+1 : i*5+5-j;
			} // for
		} // for
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][i%2==0 ? j : 4-j] = i*5+j+1;
			} // for
		} // for
		
	}


	private static void fillM03(int[][] m) {
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[4-j][i] = i*5+j+1;
			} // for
		} // for
		*/
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5-i + 5*j;
			} // for
		} // for
	}

	private static void fillM02(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j] = i*5+j+1;
			} // for
		} // for
	}

	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = i*5+j+1;
			} // for
		} // for
	}

	public static void dispM(int[][] m) {
		System.out.println("\n\n\n\n");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
	}
}
