package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오전 11:27:03
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// ArrayList -> String[] 변환
		ArrayList list = new ArrayList();
		list.add("신종혁");
		list.add("고경림");
		list.add("이재영");
		
		// [1]
		/*
		String[] nameArr =  new String[list.size()];
		Iterator ir = list.iterator();
		int index = 0;
		while (ir.hasNext()) {
			String name = (String) ir.next();
			nameArr[index++] = name;
		}
		System.out.println(Arrays.toString(nameArr));
		*/
		
		// [2]
//		String[] nameArr = (String[]) list.toArray(new String[list.size()]);
		String[] nameArr2 = (String[]) list.toArray();
		System.out.println(Arrays.toString(nameArr2));
	}

}
