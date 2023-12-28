package days05;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오전 10:46:45
 * @subject
 * @content
 */
public class Ex02_02 {
	public static void main(String[] args) {
		// char -> String 변환
		// 1) 'a' + ""
		// 2) String.valueOf('a');
		// 3) Character.toString('a');
		
		// String -> char 
		String name = "kenik";
		// 1. 원하는 위치의 한 문자를 얻어오고 싶다.
		// 문자열.charAt(인덱스);
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));
//		System.out.println(name.charAt(3));
		
		// 2. 문자열 길이
		// 문자열.length()
		int len = name.length();
		for(int i=0; i<len; i++) {
			System.out.println(name.charAt(i));
		}
		
		// 지금까지 배운 문자열 다루는 메서드
		// 1. split()
		// 2. length()
		// 3. charAt()
		// 4. valueOf()
		// 5. toString()
		// 6. toCharArray()
		// 7. matches()
	}
}
