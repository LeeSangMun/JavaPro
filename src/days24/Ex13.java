package days24;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 4:47:30
 * @subject
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		// [원시타입과 제네릭 타입 간의 형변환]
		// - 경고만 발생시키고 자동으로 사용가능하다
		// - <T> 없으면 Object 타입으로 컴파일된다.
		Box05<String> box1 = new Box05<>();
		Box05 box2 = new Box05();
		
	}

}
