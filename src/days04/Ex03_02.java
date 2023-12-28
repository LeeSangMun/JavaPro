package days04;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오전 11:26:32
 * @subject
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("> 정수입력 ? ");
			
			int n = sc.nextInt();
			
//			if(n%2 == 0) {
//				System.out.printf("n=%d 짝수", n);
//			}
//			
//			if(n%2 != 0) {
//				System.out.printf("n=%d 홀수", n);
//			}
			
			String result = "짝수";
			/*
			if (n%2 == 0) {
//				System.out.printf("n=%d 짝수", n);
				result = "짝수";
			} else {
//				System.out.printf("n=%d 홀수", n);
				result = "홀수";
			}
			*/
			
			if (n%2 != 0) {
//				System.out.printf("n=%d 짝수", n);
				result = "홀수";
			}
			System.out.printf("n=%d %s", n, result);
		} catch(Exception e) {
			
		}
	}
}
