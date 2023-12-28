package days22;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오전 10:16:39
 * @subject	21일차 복습
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// remove() - 삭제한 요소를 반환
		
		// 김씨 regex "김.+"
	}

	void dispList(ArrayList list) {
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
	}
}
