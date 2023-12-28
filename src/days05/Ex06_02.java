package days05;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 4:02:42
 * @subject
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {
		// 1~10 합

		// 두 정수 n, m 을 입력받아서
		// 두 정수 사이의 합을 출력
		Scanner sc = new Scanner(System.in);

		int sum = 0, n, m;
		System.out.print("> 정수 n m 입력 ? ");
		n = sc.nextInt();
		m = sc.nextInt();

		int min = Math.min(n, m);
		int max = Math.max(m, m);

		if(min % 2 == 0) {
			min++;
		}
		
		for (int i = min; i <= max; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d+", i);
				sum += i;
			}
		}
		
		// for -> while문 변경
		// 1)
		/*
		int i = min;
		while(i <= max) {
			sum += i;
			System.out.printf("%d+", i);
			i += 2;
		}
		*/

		// 2) 
		while(min <= max) {
			sum += min;
			System.out.printf("%d+", min);
			min += 2;
		}
		
		System.out.printf("=%d\n", sum);
	}
}
