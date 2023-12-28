package days08;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오전 8:45:43
 * @subject 7일차 복습 및 Scanner 오류
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		// System.in은 실행프로그램에서 하나만 생성됨
		// 해결은 Scanner 객체는 하나만 공유해서 사용하자
		// https://hannamedia.tistory.com/26
		try(Scanner scanner = new Scanner(System.in)) {		
			int kor = getScore(scanner, "국어");
			
			// 국어점수의 등급을 출력
			char grade = getGrade(kor);
			System.out.printf("> kor=%d, grade=%c\n", kor, grade);
			
//			int eng = getScore(scanner, "영어");
//			int mat = getScore(scanner, "수학");
//			System.out.printf("> kor=%d, eng=%d, mat=%d\n", kor, eng, mat);
		} catch(Exception e) {
			e.printStackTrace();
		}


//		System.out.println(getGrade(50));
//		System.out.println(getScore());
//		System.out.println(sum(1, 2, 3));
//		System.out.println(toUpperCase('c'));

		/*
		 * int firTerm = 1; int secTerm = 1; int nextTerm = 0; int sum = firTerm +
		 * secTerm;
		 * 
		 * System.out.printf("%d+%d+", firTerm, secTerm);
		 * 
		 * for(int i=0; i<8; i++) { nextTerm = firTerm + secTerm; System.out.printf(i ==
		 * 7 ? "%d" : "%d+", nextTerm); sum += nextTerm; firTerm = secTerm; secTerm =
		 * nextTerm; }
		 * 
		 * System.out.printf("=%d\n", sum);
		 */
	}

	public static int getScore(Scanner sc, String subject) {
//		int n = 0;

//		try(Scanner sc = new Scanner(System.in)) {
//			while(true) {
//				System.out.printf("> 정수(0~100)를 입력하세요 ? ");
//				n = sc.nextInt();
//				if(0 <= n && n <= 100) {
//					break;
//				}
//				System.out.println("잘못 입력 하셨습니다. ");
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}

		int score = 0;
		boolean flag = false;
		String inputData;
		String regex = "100|[1-9]?\\d";

		/*
		try (Scanner sc = new Scanner(System.in)) {
			do {
				if (flag) {
					System.out.print(">> 점수 입력 잘못(0~100)");
				}
				System.out.print("> 점수 입력하세요 ? ");
				inputData = sc.next();
				flag = true;
			} while (!inputData.matches(regex));

			score = Integer.parseInt(inputData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/

		
//		Scanner sc = new Scanner(System.in);
		do {
			if (flag) {
				System.out.print(">> 점수 입력 잘못(0~100)");
			}
			System.out.printf("> %s점수 입력하세요 ? ", subject);
			inputData = sc.next();
			flag = true;
		} while (!inputData.matches(regex));

		score = Integer.parseInt(inputData);
		
		
		return score;
	}

	public static char getGrade(int score) {
		switch (score / 10) {
		case 10:
		case 9:
			return '수';
		case 8:
			return '우';
		case 7:
			return '미';
		case 6:
			return '양';
		}

		return '가';
	}

	public static int sum(int... arr) {
		int sum = 0;

		for (int n : arr) {
			sum += n;
		}

		return sum;
	}

	public static char toUpperCase(char ch) {
		return Character.toUpperCase(ch);
	}
}
