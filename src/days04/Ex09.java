package days04;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 18. - 오후 3:27:04
 * @subject
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		// 국어점수 입력받아 수우미양가 등급 출력 switch문으로
		Scanner sc = new Scanner(System.in);
		System.out.print("> 점수 입력");
		int kor = sc.nextInt();
		char grade = '가';
		
		switch(kor / 10) {
//			case 10, 9:  // JDK 14~
			case 10: case 9:
				grade = '수';
				break;
			case 8:
				grade = '우';
				break;
			case 7:
				grade = '미';
				break;
			case 6:
				grade = '양';
				break;
		}
		
		System.out.printf("등급=%c", grade);
	}
}
