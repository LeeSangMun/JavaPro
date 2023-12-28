package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오전 11:27:03
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// String[] -> ArrayList 변환
		String[] nameArr = {"송해영", "유희진", "임경재", "정하영"};
		
		// [1]
		/*
		ArrayList list = new ArrayList();
		for (int i = 0; i < nameArr.length; i++) {
			list.add(nameArr[i]);
		} // for
		System.out.println(list);
		*/
		
		// [2]
		List list = Arrays.asList(nameArr);
		System.out.println(list);
		ArrayList list2 = new ArrayList(Arrays.asList(nameArr));
		System.out.println(list2);
		
		
		// ArrayList -> String[] 변환
		
		
	}

}
