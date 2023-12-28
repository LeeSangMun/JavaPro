package days04;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오후 12:20:58
 * @subject
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		// 국어 점수를 kor 변수에 입력받아서
		// 등급을 출력
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("> 국어 점수 입력 ? ");
			int kor = sc.nextInt();
			char grade = '가';

			// 중첩 if문
			if (0 <= kor && kor <= 100) {
				if (90 <= kor) {
					//System.out.println("수");
					grade = '수';
				} else if (80 <= kor) {
					//System.out.println("우");
					grade = '우';
				} else if (70 <= kor) {
					//System.out.println("미");
					grade = '미';
				} else if (60 <= kor) {
					//System.out.println("양");
					grade = '양';
				}
				System.out.printf("kor=%d(%c)", kor, grade);
			} else {
				System.out.println("국어 점수 입력 잘못 !!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
