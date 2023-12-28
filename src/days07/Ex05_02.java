package days07;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오전 11:45:22
 * @subject
 * @content
 */
public class Ex05_02 {
	public static void main(String[] args) {
		// 국어점수(kor)을 입력받아서
		// 0 <= kor <= 100
		// 올바른 국어점수, 잘못된 국어점수 출력
		
		String kor = "100";
//		String regex = "\\d{1,2}|100";
//		String regex = "100|[1-9]\\d|\\d";
		String regex = "100|[1-9]?\\d";
		System.out.println(kor.matches(regex));
		
		//내가 한 거
		/*
		int kor;
		String regex = "\\d{1}|\\d{2}|100";
		boolean flag = false;
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("> 국어점수 입력 ? ");
			kor = sc.nextInt();
			flag = (kor+"").matches(regex);
			System.out.printf("%d-%s 국어점수\n", kor, flag ? "올바른" : "잘못된");
		} catch(Exception e) {
			e.printStackTrace();
		}		
		*/
	}
}
