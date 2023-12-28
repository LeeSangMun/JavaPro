package days02;


/**
 * @author sangmun
 * @date 2023. 7. 14. - 오전 10:21:34
 * @subject	지역변수
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		
		
		// {} 영역(범위) 연산자
		{
			char grade = 'A';
			System.out.printf("등급 : '%c'", grade);
		}
		
		//grade cannot be resolved to a variable
		//System.out.printf("등급 : '%c'", grade);
	}
}
