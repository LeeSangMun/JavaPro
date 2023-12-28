package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오전 11:05:56
 * @subject	Object 클래스
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [Object 클래스]
		// 모든 클래스의 최상위 부모클래스
		// 필드 x
		// 메서드 11개 존재
		
		Item item1 = new Item(10);
		Item item2 = new Item(10);
		
		System.out.println(item1.equals(item2));
		
		Item item3 = item1; // 클래스 복사
		System.out.println(item1.equals(item3));
		
		// boolean Object.equals() 
		// 즉,동일한 객체 인스턴스 참조하는지 true/false 반환하는 메서드
	}

}

class Item {
	int value;
	Item(int value) {
		this.value = value;
	}
}
