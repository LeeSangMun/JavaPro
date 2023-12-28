package days01;

/*
 * 자바 프로그램의 기본 구조
 * 1) package 선언문
 * 2) 자바는 객체지향적 프로그램언어이기 때문에
 * 		반드시 시작객체로 사용할 하나의 클래스가 선언이 되어 있어야 한다.
 * 		객체 == 개체 == Object == 클래스 == 물건 (동일한 의미)
 * 3) 자바 클래스 선언 형식 
 * 		[] 는 생략 가능
 * 		[접근지정자] [기타제어자] class 클래스명 {}
 * 4) 클래스명과 자바파일명은 반드시 동일해야 한다.
 * 5) 클래스명의 첫번째 문자는 반드시 대문자로 시작
 * 6) 시작객체에는 프로그램 시작/종료하는 기능을 하는 main함수(메서드)가 필요
 * 7) 자바에서 함수(메서드)를 선언 형식
 * 		[접근지정자][기타제어자] 리턴자료형 함수명([매개변수...]) {
 * 			//실행문
 * 			[return 리턴값;]
 * 		}
 */

/*
 * 단축기 정리
 * 단축기 목록 	  Ctrl + shift + L 
 * 실행 			  Ctrl + F11 	 	 
 * 자동 완성 		  Ctrl + Space 	  
 * 들여쓰기 		  Ctrl + A , Ctrl + I
 * 단일 행 주석처리 Ctrl + /
 * */

/*
 * 
 * */

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("이상문");
		System.out.println("김성준");
		System.out.println("이주영");
	} // main
} // Ex01 class