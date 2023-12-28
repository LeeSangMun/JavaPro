package days07;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오후 2:07:17
 * @subject
 * @content
 */
public class Ex07_02 {
	public static void main(String[] args) {
		// 2. 1+2+4+7+11+16+...+191 = ???
		// 20개 항까지의 합을 구해서 출력
		/*
		int term = 1; // term = 항
		int difference = 0; // 계차
		int sum = 0; // 총합

		for (int i = 1; i <= 20; i++) {
			term += difference;
			System.out.printf("%d+", term);
			sum += term;
			difference++;
		} // for
		System.out.printf("=%d\n", sum);
		*/
		
		// 수학 공식을 이용
		int term;
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			term = (int)(Math.pow(i, 2)-i)/2+1;
			System.out.printf("%d+", term);
		} // for
		

		// 내가 한 거
		/*
		 * int num =1; int sum = 1;
		 * 
		 * System.out.print(num + "+"); for (int i = 1; i <= 4; i++) {
		 * System.out.printf("%d+", num+=i); sum += num; } // for
		 * System.out.printf("=%d", sum);
		 */
	}
}
