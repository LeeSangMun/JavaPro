package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오전 11:54:10
 * @subject Vector
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [Vector]
		// ArrayList 동일
		// Vector 	멀티스레드에 안전(동기화 처리)
		// ArrayList	멀티스레드에 안전x
		Vector v = new Vector();
		v.addElement("김호영"); // add() 동일
		v.add("김성준");
		v.add("이지현");
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.trimToSize();
		System.out.println(v.capacity());
		
		v.setSize(5);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.get(0);
		v.elementAt(0);
		
		// [반복자]와 [열거자]의 차이점
		// The returned iterator is [fail-fast].
		// [반복자]는 실행중 다른 것에 의해 수정되었을 때 예외를 발생
		// [열거형]은 실행중 다른 것에 의해 수정되었어도 모름
		Iterator ir = v.iterator(); 
		
		
		// 열거자를 돌려줌
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			System.out.println(name);
		}
		
//		String removedName = (String)v.remove(0);
//		System.out.println(v);
		
		// 벡터안에 null 요소제거한 나머지 요소를 출력
		v.removeIf(s -> s == null);
//		v.removeIf(Objects::isNull);
		//                메서드 참조
		v.forEach(System.out::println);
		
		// v.clear();
		// v.clone();
		
		// v.firstElement(); // v.get(0);
		// v.lastElement(); // v.get(v.size()-1);
		
		// v.insertElementAt("임경재", 1); // v.add(1, "임경재");
		
		List subList = v.subList(0, 2);
		System.out.println(subList);
		
	}

}
