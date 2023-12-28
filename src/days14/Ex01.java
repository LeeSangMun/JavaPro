package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오전 8:53:14
 * @subject	생성자
 * @content
 */
public class Ex01 {
	String message;
	
	// 생성자 선언
	public Ex01() {
		System.out.println("> Ex01 디폴트 생성자.");
		message = "안녕";
	}
	
	public Ex01(String message) {
		System.out.println("> Ex01 1 생성자.");
		this.message = message;
	}
	
	public static void main(String[] args) {
		/*
		 * 생성자
		 * 1. 일종의 메서드이다. (생성자 메서드)
		 * 2. 메서드명이 클래스명하고 같아야함
		 * 3. 리턴자료형을 사용하지 않는다. return문 x
		 * 4. 매개변수가 없는 생성자를 기본(default)생성자라 한다.
		 * 5. 접근지정자 사용 가능, 기타 제어자는 사용하지 않음
		 * 6. 생성자는 인위적으로 호출할 수 없다.
		 * 		호출 되는 시기 : 객체 생성할 때 자동으로 호출
		 * 7. 생성자 역할 : 객체 생성할 때 -> 생성자 호출 -> 필드 초기화
		 * 8. 생정자는 오버로딩이 가능(중복 선언)
		 * 9. 클래스 선언 시 생성자를 1개라도 선언하지 않으면 
		 * 		컴파일러가 자동으로 디폴트 생성자를 추가 후 컴파일 한다.
		 * 10. 디폴트 생성자를 선언하지 않고 생성자를 오버로딩할 때 주의할 점.
		 * 11. 생성자는 상속되지 않는다.
		 */
		
		// The constructor Ex01() is undefined
		Ex01 obj = new Ex01();
		// The constructor Ex01(String) is undefined
//		Ex01 obj = new Ex01("원하는 메시지");
		System.out.println(obj.message);
	}
}
