package days15;

import java.io.IOException;

/**
 * @author sangmun
 * @date 2023. 8. 2. - 오후 12:29:58
 * @subject
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		// 단일 상속
		// 다중 상속 : 자바는 다중 상속 x
		
		/*
		 * 오버라이딩 주의사항
		 * 1. 정의 : 부모클래스로부터 상속받은 메서드를 재정의 하는 것
		 * 2. override 사전적의미 == overwrite == 위에 덮어쓰다.
		 * 3. 오버라이딩의 조건
		 * 		1) 메서드명 수정 x
		 * 		2) 매개변수 수정 x
		 * 		3) 리턴탑이 동일 x
		 * 		4) 접근지정자는 부모의 접근지정자 범위보다 같거나 넓어야 한다.
		 * 		5) 부모의 메서드보다 많은 수의 예외를 선언할 수 없다.
		 * 		6) 인스턴스 메서드 <-> static 메서드 변경 x
		 */
	}
}

class Parent {
	public int print(String n, int a) throws IOException, NullPointerException {
		return 100;
	}
}

class Child extends Parent {
	// Cannot reduce the visibility of the inherited method from Parent
	// The method print(String) of type Child must override or implement a supertype method
	@Override
	public int print(String n, int a) throws IOException, NullPointerException {
		return 200;
	}
}
