package days24;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 3:22:47
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// [제네릭스의 제한]
		
	}

}

class Box02<T> {
	// 1) 제네릭 클래스에서는 정적 필드 선언 x
	// static T item2;
	
	// 2) static 메서드의 매개변수로 T 타입 사용할 수 없다.
	/*
	static int compare(T t1, T t2) {
		return 0;
	}
	*/
	
	// 3) T 타입의 배열은 선언할 수 있다.
	T[] itemArr;
	
}