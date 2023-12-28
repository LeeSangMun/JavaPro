package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오후 3:29:30
 * @subject
 * @content
 */
public class Ex10_02 {
	String name = "익명"; // 명시적 초기화
	int age;					
	boolean gender;
	static double rate;
	
	// 클래스 초기화 블럭
	// 객체 생성과 상관없이 프로그램이 시작할 때 한번 static 초기화 블럭이 실행됨
	static {
		
	}
	
	// 인스턴스 초기화 블럭
	// 오버로딩된 생성자에서 중복되는 초기화 코딩이 있다면 
	// 그 중복 초기화 코딩을 인스턴스 초기화블럭으로
	// 따로 선언할 때 사용하는 블럭이다.
	{
		
	}
	
	// 생성자를 이용해서 초기화
	public Ex10_02() {
		this.name = "홍길동";
		this.age = 10;
	}
	
	public static void main(String[] args) {
		/*
		 * 필드(멤버변수) 초기화 방법
		 * 1) 명시적 초기화
		 * 2) 생성자
		 * 3) 초기화 블럭
		 * 			(1) 인스턴스 초기화 블럭	- 인스턴스변수 초기화
		 * 			(2) 클래스 초기화 블럭	- 클래스 변수 초기화
		 */
	}
}
