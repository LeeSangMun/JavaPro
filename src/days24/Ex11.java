package days24;

import java.util.ArrayList;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 3:48:07
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		// [제한된 제네릭 클래스]
		
		FruitBox<Fruit> box1 = new FruitBox<>();
		FruitBox<Apple> box2 = new FruitBox<>();
		FruitBox<Grape> box3 = new FruitBox<>();
		// Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> of the type FruitBox<T>
//		FruitBox<Toy> box4 = new FruitBox<>();
		*/
	}

}

/*
interface Eatable {}

class Fruit implements Eatable {

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

class Toy {
	
	@Override
	public String toString() {
		return "Toy";
	}
	
}

// 과일만을 담을 수 있는 제네릭 클래스로 제한해서 선언
class Box04<T> {
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

//class FruitBox<T extends Fruit> extends Box04<T> {
// Fruit 클래스의 자식클래스이고 Eatable 인터페이스도 구현
class FruitBox<T extends Fruit & Eatable> extends Box04<T> {
	
}
*/