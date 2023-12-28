package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오전 11:44:12
 * @subject	
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		// [접근지정자]
		// 1. 클래스 앞에 접근지정자
		//		1) public			: 패키지 내부,외부 어디서든 상속과 참조 가능
		// 		2) default		: 패키지 내부에서만 상속과 참조 가능
		
		// 			독립적인 클래스로 선언할 때는 사용할 수 없는 접근지정자이다.
		// 			(내부 클래스(중첩 클래스)로 선언할 때 사용할 수 있다.)
		//		3) private		: 같은 파일 내에서만 상속, 참조 가능
		//		4) protected	: default + 패키지 외부에서는 상속만 가능
		// 1-2.	클래스 앞에 기타제어자
		//			abstract	- 추상 클래스
		// 			final		- 최종 클래스
		//			static 	- 중첩 클래스를 선언할 때만 사용
		
		// 2. 멤버(필드, 메서드) 접근지정자
		//		1) public
		// 		2) default
		//		3) private
		//		4) protected
		
		
		// Tv 클래스와 Ex04클래스는 같은 패키지 안에 있다.
		Tv tv1 = new Tv();
		System.out.println(tv1.channel);
	}
}
