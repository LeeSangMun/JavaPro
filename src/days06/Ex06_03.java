package days06;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오후 2:15:24
 * @subject
 * @content
 */
public class Ex06_03 {
	public static void main(String[] args) {
		/*
		for (int dan = 2; dan < 9; dan++) {
			for (int i = 1; i < 9; i++) {
				System.out.printf("%dx%d=%02d ", dan, i, dan*i);
			} // for
			System.out.println();
		} // for
		*/
		
		// 세로로 구구단 출력
		for(int i=2; i<=9; i++) {
			System.out.printf("  [%d]단\t", i);
		}
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%dx%d=%02d\t ", dan, i, dan*i);
			} // for
			System.out.println();
		} // for
	
	}
}
