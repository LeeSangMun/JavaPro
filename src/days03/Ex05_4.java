package days03;


/**
 * @author sangmun
 * @date 2023. 7. 17. - 오후 2:01:20
 * @subject	논리 연산자
 * @content	참/거짓
 * 					1) 일반 논리 연산자
 * 						ㄱ. &&	일반 논리 AND 연산자(논리곱)
 * 						ㄴ. ||		일반 논리 OR 연산자(논리합)
 * 						ㄷ. !		부정(NOT) 연산자
 * 					2) 비트 논리 연산자 & ^ | ~
 * 					
 */
public class Ex05_4 {
	public static void main(String[] args) {
		// 연산자 우선 순위
		// 산술 > 비교 > 논리 > 대입
		System.out.println(3<=5 && 10>1);
		System.out.println(3<=5 && 10<1);
		System.out.println(3>=5 && 10>1);
		System.out.println(3>=5 && 10<1);
		
		System.out.println(3<=5 || 10>1);
		System.out.println(3<=5 || 10<1);
		System.out.println(3>=5 || 10>1);
		System.out.println(3>=5 || 10<1);
		
		//The operator ! is undefined for the argument type(s) int
		//System.out.println(!3<=5);
		//단항 연산자가 우선순위가 더 높다
		System.out.println(!(3<=5));
	}
}
