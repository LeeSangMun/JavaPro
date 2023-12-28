package days01;


/**
 * @author sangmun
 * @date 2023. 7. 13. - 오후 3:36:31
 * @subject 자바의 변수와 상수
 * @content 1. 변수, 상수 개념 설명
 * 				  2. 변수 선언 형식
 * 				  3.
 */
public class Ex03 {
	public static void main(String[] args) {
		/*
		 * 1. 변수(variable)
		 * 		1) 변하는 수(수학 의미)
		 * 		2) 메모리상의 값을 저장하는 공간(프로그램 언어)
		 * 
		 * 2. 상수(const)
		 * 		1) 변하지 않는 수
		 * 		2) 메모리상의 값을 저장하는 공간(프로그램 언어)
		 * 
		 * [선언 형식] 1. 클래스 2. 함수(메서드)
		 * 3. 변수 선언 형식
		 * 		자료형 변수명[=초기값];
		 * 		자료형 == 데이터 타입
		 * */
		
		// 4. 실습
		// ; 세미콜론 명령라인 종결
		// 이상문 cannot be resolved to a variable
		// 문자열(문자의 나열) "문자열"
		// 한 문자 ' '
		// System.out.println(이상문);
		
		
		//이름을 저장하는 문자열변수 선언
		String name = "이상문"; // = 대입 연산자
		System.out.println(name);
		
		//Duplicate local variable name
//		String name = "이상문"; // = 대입 연산자
//		System.out.println(name);
	}
}
