package days22;

import java.util.ListIterator;
import java.util.Vector;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 3:34:37
 * @subject
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		// ListIterator - Iterator에 양방향으로 조회기능이 추가된 반복자
		// List 구현한 클래스에만 사용 가능
		
		Vector v = new Vector();
		v.add("유희진");
		v.add("임경재");
		v.add("김호영");
		v.add("이지현");
		
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println("> 역 방향으로 진행하자~~");
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
		}
	}

}
