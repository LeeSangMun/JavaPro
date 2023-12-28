package days24;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오전 11:47:03
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// Collections
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		Collections.rotate(list, 2);
		System.out.println(list);
		
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.fill(list, -1);
		System.out.println(list);
		
//		Collections.copy(null, null);
//		Collections.replaceAll(null, null, null)
	}

}
