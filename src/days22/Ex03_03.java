package days22;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오전 10:16:39
 * @subject	21일차 복습
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("박정호");
		list.add("이상문");
		list.add("이주영");
		list.add("정하영");
		list.add("이동현");
		list.add("주강민");
		
		// 팀에서 "이"씨 팀원만 삭제
		
		list.removeIf((s) -> ((String) s).startsWith("이"));
		System.out.println(list);
	}

	void dispList(ArrayList list) {
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
	}
}
