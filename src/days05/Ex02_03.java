package days05;

/**
 * @author sangmun
 * @date 2023. 7. 19. - 오전 11:06:57
 * @subject
 * @content
 */
public class Ex02_03 {
	public static void main(String[] args) {
		// 1) 직접 배열 선언 후 for문 사용
		/* 
		String name = "kenik";
		
		// String -> char[] 변환
		char[] nameArr = new char[name.length()];
		
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = name.charAt(i);
		} // for
		*/
		
		// 2) 
		String name = "kenik";
		char[] nameArr = name.toCharArray();
		System.out.println(nameArr);
	}
}
