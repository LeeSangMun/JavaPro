package days24;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 2:22:35
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String[] names = {"이지현", "김호영", "임경재", "유희진"};
		System.out.println(Arrays.toString(names));
		
		// 내림 차순
//		Arrays.sort(names, new StringDescendingComparator());
		
		/*
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		Arrays.sort(names, c);
		*/
		
		/*
		Arrays.sort(names, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		
		Arrays.sort(names, (o1, o2) -> o2.compareTo(o1));
		
		// 대소문자 구분하지 않고 오름차순으로 정렬
//		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(names));
	}

}

/*
class StringDescendingComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
*/