package days03;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 17. - 오후 3:44:28
 * @subject	두 문자열 비교
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> 비교할 이름을 입력 ? ");
		
		String name2 = sc.next();
		
		// 디버깅
		System.out.printf("[%s]\n", name2);
		
//		System.out.println(name1 == name2);
		
		// (암기) 두 문자열을 비교할 때는 equals() 사용
		System.out.println(name1.equals(name2));
		// 대소문자 구분하지 않고 문자열 비교
		System.out.println("abcd".equalsIgnoreCase("ABCD"));
	}
}
