package days22;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 3:48:39
 * @subject	Comparable 인터페이스 : 기본 정렬 기준을 구현
 * 					Comparator 인터페이스 : 다른 기준으로 정렬하고자 할 때 사용
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		String[] names = {"이지현", "김호영", "임경재", "유희진"};
		System.out.println(Arrays.toString(names));
		// Arrays.sort(names);
		// System.out.println(Arrays.toString(names));
		
		// 내림 차순
//		Arrays.sort(names, new StringDescendingComparator());
		
		// 대소문자 구분하지 않고 오름차순으로 정렬
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(names));
	}

}

class StringDescendingComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}