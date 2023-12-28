package days04;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오전 11:43:17
 * @subject	
 * @content	
 */
public class Ex04 {
	public static void main(String[] args) {
		// 국어 점수를 kor 변수에 입력받아서 
		// 등급을 출력
		try(Scanner sc = new Scanner(System.in);) {
			System.out.println("> 국어 점수 입력 ? ");
			int kor = sc.nextInt();
			char grade = '가';
			
			//중첩 if문
			if (0 <= kor && kor <= 100) {
				if (90 <= kor) {
					System.out.println("수");
				}
				if (80 <= kor) {
					System.out.println("우");
				}
				if (70 <= kor) {
					System.out.println("미");
				}
				if (60 <= kor) {
					System.out.println("양");
				}
				if (60 > kor) {
					System.out.println("가");
				}
			} else {
				System.out.println("국어 점수 입력 잘못 !!!");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
