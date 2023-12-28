package days25;

import java.util.Date;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오전 11:22:06
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [어노테이션(Annotation)]
		/*
		 * 1. 사전적 의미 : 주석
		 * 2. 프로그램의 소스 코드 안에 다른 프로그램을 위한 미리 약속된 형식을 포함시킨 것
		 * 3. jdk에서 기본적으로 제공하는 어노테이션을 "표준 어노테이션"이라고 한다.
		 * 4. 표준 어노테이션 -> 컴파일러(다른 프로그램)
		 * 5. 표준 어노테이션
		 * 		1) @Override : 컴파일러에게 오버라이딩한 메서드임을 알려준다.
		 * 		2) @@SuppressWarnings : 컴파일러의 특정 경고 메시지가 나타나지 않게 사용함
		 * 		3) @Deprecated : 앞으로 없어질 생성자, 필드를 알려줌
		 * 		4) @FunctionalInterface : 함수형 인터페이스
		 * 		5) @SafeVarargs : 제네릭 타입의 가변인자에 사용되다.
		 * 		6) @Native : native 메서드에서 참조되는 상수 앞에 붙인다.
		 * 
		 * 		메타 어니테이션 : 어노테이션에 사용되는 어노테이션
		 * 			7) @Target
		 * 			8) @Documented
		 * 			9) @Inherited
		 * 			10) @Retention
		 * 			11) @Repeatable
		 */
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		
		Date d = new Date();
	}

	@Override
	public String toString() {
		return "Ex04 []";
	}
	
}


