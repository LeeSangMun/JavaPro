package days04;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오후 3:12:28
 * @subject	switch
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		
		// key	: 변수, 수식
		// value	: 리터럴
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("> 정수입력 ? ");
			int n = sc.nextInt();
	
			String result = null;
			
			switch (n%2) {
			case 0:
				result = "짝수";
				break;
			case 1:
				result = "홀수";
				break;
			}
			System.out.println(result);
		} catch(Exception e) {
			
		}
		System.out.println("end");
	}
}
