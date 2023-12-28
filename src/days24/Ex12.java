package days24;

import java.util.ArrayList;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 3:48:07
 * @subject
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		// [와일드 카드]
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		/*
		Juice juice = Juicer.makeJuice(fruitBox);
		juice = Juicer.makeJuice(appleBox);
		juice = Juicer.makeJuice(grapeBox);
		*/
		
		// makeJuice 메서드를 제네릭 메서드로 선언
		// 호출 방법
		Juicer.<Apple>makeJuice(appleBox);
		Juicer.makeJuice(appleBox);
		
		// [제네릭 메서드]
		// - 메서드의 선언부에 제네릭 타입이 선언된 메서드
		// - 형식
		// pulbic static <T> Juice makeJuice(FruitBox<T> box) {
		//
		// }
		
	}

}

class Fruit {

	@Override
	public String toString() {
		return "Fruit";
	}
	
}

class Apple extends Fruit {

	@Override
	public String toString() {
		return "Apple";
	}
	
}

class Grape extends Fruit {
	
	@Override
	public String toString() {
		return "Grape";
	}

}

class Box05<T> {
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item) {
		this.list.add(item);
	}
	
	int size() {
		return this.list.size();
	}
	
	T get(int i) {
		return this.list.get(i);
	}
	
	@Override
	public String toString() {
		return this.list.toString();
	}
	
}

class FruitBox<T extends Fruit> extends Box05<T> {
	
}

// 매개변수를 과일박스를 주면
// 쥬스를 만들어서 반환하는 기능이 있는 쥬스 클래스
class Juice {}

class Juicer {
//	static Juice makeJuice(FruitBox<? super Fruit> box) { // Fruit과 그 조상들
//	static Juice makeJuice(FruitBox<?> box) { // 모든 타입 가능
	/*
	static Juice makeJuice(FruitBox<? extends Fruit> box) { // 와일드 카드
		return new Juice();
	}
	*/
	
	// 위의 일반 메서드를 제네릭 메서드로 변경
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) { 
		return new Juice();
	}
	
	// Erasure of method makeJuice(FruitBox<Grape>) is the same as another method in type Juicer
	// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
	/*
	static Juice makeJuice(FruitBox<Fruit> box) {
		return new Juice();
	}
	
	static Juice makeJuice(FruitBox<Apple> box) {
		return new Juice();
	}
	
	static Juice makeJuice(FruitBox<Grape> box) {
		return new Juice();
	}
	*/
}