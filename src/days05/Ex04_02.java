package days05;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오후 2:14:42
 * @subject
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		// 1~10 합

		// 두 정수 n, m 을 입력받아서
		// 두 정수 사이의 합을 출력
		// 예) 2,5
		// 2+3+4+5=14
		Scanner sc = new Scanner(System.in);

		int sum = 0, n, m;
		System.out.print("> 정수 n m 입력 ? ");
		n = sc.nextInt();
		m = sc.nextInt();
		// 추가 문제 n이 m보다 더 클 경우
		// 2)
//		if(n > m) {
//			int temp = n;
//			n = m;
//			m = temp;
//		}
//		
//		for(int i=n; i<=m; i++) {
//			System.out.printf(i==m ? "%d" : "%d+", i);
//			sum += i;
//		}

		// 3)
		/*
		int min = n > m ? m : n;
		int max = n > m ? n : m;
		for (int i = min; i <= max; i++) {
			System.out.printf(i == m ? "%d" : "%d+", i);
			sum += i;
		}
		*/

		// 4) Math 클래스 이용
		int min = Math.min(n, m);
		int max = Math.max(m, m);
		for (int i = min; i <= max; i++) {
			System.out.printf(i == m ? "%d" : "%d+", i);
			sum += i;
		}

		System.out.printf("=%d\n", sum);
	}
}
