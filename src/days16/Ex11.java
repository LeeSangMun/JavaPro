package days16;

/**
 * @author sangmun
 * @date 2023. 8. 3. - 오후 2:46:11
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// [default 메서드]
		// 인터페이스에 새로운 추상메서드를 추가해야하는 부담감이 있음
		
		
		// 1) 여러 인터페이스를 구현하면 디폴트 메서드 충돌.
		//		=> 충돌 나는 디폴트 메서드를 오버라이딩하면 해결
		// 2) 조상클래스의 메서드와 디폴트 메서드 충돌
		// 		=> 디폴트 메서드는 무시가 된다.
	}

}

interface IA {
	default void testXX() {
		
	}
}

interface IB extends IA {
	
}

interface IC extends IB {
	
}

interface ID extends IC {
	
}