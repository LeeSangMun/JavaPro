package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오전 11:02:40
 * @subject	
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		// [private 필드 선언]
		
		// 1. 왜 private으로 선언했는가?
		// 2. 이유
		// 		1) 유효한 값만을 필드가 사용.
		//		2) 필드를 읽기전용, 쓰기전용
		// 3. 방법
		//		getter, setter
		Person p1 = new Person(true);
		
		p1.setAge(20);
		System.out.println(p1.getAge());
		
		// 접근지정자를 사용해서 은닉화
		// The field Person.name is not visible
		/*
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = true;
		*/
	}
}

// The public type Person must be defined in its own file
//public class Person {
// 다른 패키지에서는 사용할 클래스 x
/*
class Person {
	
}
*/
