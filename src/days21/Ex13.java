package days21;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오후 2:41:44
 * @subject
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		// 1. ArrayList
		// - 가장 많이 사용되는 컬렉션 클래스
		// - List 인터페이스를 구현한 클래스
		// 		(순서 o, 중복 허용 o)
		// - 배열 요소(Element)
		// - 배열 단점 -> ArrayList
		String[] names = new String[3];
		names[0] = "주강민";
		names[1] = "정하영";
		names[2] = "임경재";
		System.out.println(names.length);
		// java.lang.ArrayIndexOutOfBoundsException
//		names[3] = "이지현";
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("정하영")) {
				System.out.println(names[i]);
			}
		} // for
		
//		ArrayList list = new ArrayList();
		ArrayList list = new ArrayList(3);
		
		list.add("주강민");
		list.add("정하영");
		list.add("임경재");
		System.out.println(list.size());
		list.add("이지현");
		
		System.out.println(list.contains("정하영"));
		int index = list.indexOf("정하영");
		if(index != -1) {
			System.out.println(list.get(index));
			list.remove(index);
			list.add(index, "홍길동");
		} else {
			System.out.println("없음");			
		}
		
		System.out.println(list);
		
//		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		// iterator() *** 반복자를 반환하는 메서드
		// 요소를 반복적으로 처리할 수 있다.
		Iterator ir =  list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
	}

}
