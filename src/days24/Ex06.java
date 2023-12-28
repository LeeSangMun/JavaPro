package days24;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 2:09:26
 * @subject
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		// 익명 클래스
		// 1. 클래스 이름 x
		// 2. 사용 형식
		//		부모타입 객체명 = new 부모타입(매개변수...) {
		//			@Override 재정의함수 구현
		//		};
		// 		부모타입 = 클래스, 인터페이스
		
		// 3. 자식 클래스가 재사용하지 않고, 오로지 해당 필드의 초기값으로만 사용할 경우일 때 사용
		// 4. 부모타입으로 필드나 변수를 선언하고, 자식 객체를 초기값으로 대입할 경우
		
		Sample s = new Sample();
		System.out.println(s);
	}
}

class Sample {}