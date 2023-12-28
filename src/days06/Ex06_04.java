package days06;


/**
 * @author sangmun
 * @date 2023. 7. 20. - 오후 3:06:50
 * @subject	구구단 4단씩 세로로 출력 (나중에 풀 것)
 * @content
 */
public class Ex06_04 {
	public static void main(String[] args) {
		// 3단씩 세로로
		// [2][3][4]
		// [5][6][7]
		// [8][9]
		for (int k = 1; k <= 3; k++) {
//			for (int dan = 3*k-1; dan <=3*k+1 && dan != 10; dan++) {
			for (int dan = 3*k-1; dan <=3*k+1 && dan < 10; dan++) {
//				if(dan != 10)
				System.out.printf("  [%d]단\t", dan);
			} // for
			System.out.println();
			for (int i = 1; i <= 9; i++) {
				for(int dan = 3*k-1; dan <= 3*k+1 && dan < 10; dan++) {
					System.out.printf("%dx%d=%02d\t", dan, i, dan*i);
				}
				System.out.println();
			} // for
			System.out.println();
		} // for
		
		/*
		for (int k = 1; k <= 2; k++) {
			for (int i = 4*k-2; i <=4*k+1; i++) {
				System.out.printf("  [%d]단\t", i);
			} // for
			System.out.println();
			for (int i = 1; i <= 9; i++) {
				for(int dan = 4*k-2; dan <= 4*k+1; dan++) {
					System.out.printf("%d*%d=%02d\t", dan, i, dan*i);
				}
				System.out.println();
			} // for
			System.out.println();
		} // for
		*/
	}
}
