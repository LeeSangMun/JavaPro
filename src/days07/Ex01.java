package days07;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오전 9:01:11
 * @subject
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		// 1. 구구단 가로 출력
		/*
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d=%d ", i, j, i*j);
			} // for
		} // for
		*/
		
		// 2. 구구단 세로 출력
		/*
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%dx%d=%02d\t", j, i, i*j);
			} // for
			System.out.println();
		} // for
		*/
		
		// 3. 별찍기
		
		// 이등변삼각형
		/*
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3-i-1; j++) {
				System.out.print("_");
			} // for
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // for
		*/
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i+j >= 4 && j-i <= 2) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			} // for
			System.out.println();
		} // for
	}
}
