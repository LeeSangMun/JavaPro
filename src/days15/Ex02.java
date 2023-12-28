package days15;

/**
 * @author sangmun
 * @date 2023. 8. 2. - 오전 11:14:52
 * @subject	클래스들 간의 관계
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		/*
		 * [상속 (inheritance)]
		 * 1. 상속 ? 기존의 클래스를 재사용하여 새로운 클래스로 작성하는 것
		 * 2. 상속 장점
		 * 		- 코드 재사용 -> 생산성 향상, 유지보스 용이
		 * 3. 상속 선언 형식
		 * [접근지정자][기타제어자] class 새클래스명 extends 슈퍼클래스(기존클래스) {}
		 * 
		 * 4.	기존클래스 = 부모클래스, 상위클래스, super클래스, 기초클래스
		 * 		새로운 클래스 = 자식 클래스, 하위 클래스, sub클래스, 파생클래스
		 * 
		 * 5. 예) Point 클래스 : 좌표를 관리하는 기능이 구현된 클래스
		 */
	}
}

class Point2D {
	int x;
	int y;
	
	public Point2D() {}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2D {
	int z;
	
	public Point3D() {
		
	}

	public Point3D(int x, int y, int z) {
		// this.x = x;
		// this.y = y;
		super(x, y); // 부모의 생성자 호출
		this.z = z;
	}
}