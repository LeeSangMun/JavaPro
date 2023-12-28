package days03;


/**
 * @author sangmun
 * @date 2023. 7. 17. - 오후 3:18:33
 * @subject
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
		char lowerCase, upperCase;
		lowerCase = 'x';
		
		//upperCase 변수에는 lowerCase의 대문자를 저장해서 출력
		upperCase = (char)(lowerCase - 32);
		System.out.printf("%c\n", upperCase);
		
		lowerCase = (char)(upperCase + 32);
		System.out.printf("%c\n", lowerCase);
		
		System.out.println('4' - '2');
	}
}
