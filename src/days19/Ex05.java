package days19;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오후 12:03:29
 * @subject	Math 클래스
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// static 필드와 static 메서드를 가짐
		// 수학 관련 메서드
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.random());
		System.out.println(Math.max(2, 4));
		System.out.println(Math.min(2, 4));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.abs(-100));
		System.out.println(Math.sqrt(4));
		
		// 올림(절상), 내림(절삭), 반올림		
		System.out.println(Math.ceil(2.0));
		System.out.println(Math.ceil(2.179));
		System.out.println(Math.ceil(2.579));
		System.out.println(Math.ceil(2.979));
		
		System.out.println(Math.floor(2.179));
		System.out.println(Math.floor(2.579));
		System.out.println(Math.floor(2.979));
		
		System.out.println(Math.round(2.179));
		System.out.println(Math.round(2.579));
		System.out.println(Math.round(2.979));
		
		// Math 클래스			// 최대 성능을 얻기 위해서
		// 							JVM이 설치된 OS의 메서드를 호출해서 처리
		//							문제점 : OS가 다르면 결과는 다르게 나올 수 있다.
		// StrictMath 클래스	// 성능은 포기하더라도 OS마다 동일한 결과값을 나오게 하기위해 사용하는 클래스
		
		
	}

}
