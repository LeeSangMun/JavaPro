package days11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오전 11:22:15
 * @subject
 * @content
 */
public class Ex02_03 {
	public static void main(String[] args) {
		int[] m = {3,5,2,4,1};
		
		/*
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < m.length; i++) {
			list.add(m[i]);
		} // for
		System.out.println(list);
		*/
		
		List<Integer> list = IntStream.of(m).boxed().collect(Collectors.toList());
		System.out.println(list);
		
	}
}
