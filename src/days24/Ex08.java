package days24;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 2:53:16
 * @subject	1. 제네릭 클래스
 * 					2. 제네릭 메서드
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// [제네릭 클래스]
		/*
		Box box1 = new Box();
//		box1.setItem(100);
//		box1.setItem("홍길동");
		box1.setItem(3.14);
		System.out.println(box1.getItem());
		*/
		
		// String -> 대입된 타입
//		Box<String> box = new Box<>();
		
		// 
		Box box = new Box();
		box.item = "XX";
		
		
		// 형변환 사용 (불편한 점)
//		System.out.println((int)box1.getItem());
//		System.out.println((String)box1.getItem());
	}

}

// [제네릭 클래스 선언]
// 용어 정리
// 1) Box 	- 원시 타입(raw type)
// 2) T		- 타입 변수 또는 타입 매개변수
// 3) Box<T> - 제네릭 클래스, 'T의 Box'
class Box<T> {
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}

/*
class Box {
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
}
*/

/*
class Box {
	double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
}
*/

/*
class Box {
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
}
*/

/*
class Box {
	int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
}
*/