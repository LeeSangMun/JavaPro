package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오후 2:25:11
 * @subject
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int[] score = {80,95,50,85,45,65,10,100};
		
		// [1]
		/*
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		} // for
		*/
		
		// int[] -> ArrayList -> TreeSet 변환
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(score).boxed().collect(Collectors.toList());
		
		TreeSet<Integer> ts = new TreeSet<Integer>(list);
//		TreeSet<Integer> ts = Arrays.stream(score).boxed().collect(Collectors.toCollection(TreeSet::new));
		
		
		System.out.println(ts);
		
		// 1) 75보다 큰 점수를 얻어와서 출력
		System.out.println(ts.tailSet(75, false)); // 지정한 값보다 큰 값의 객체들을 반환
		// 2) 50보다 작은 점수를 얻어와서 출력
		System.out.println(ts.headSet(50));
		// 3) 50~75 사이의 점수를 얻어와서 출력
		System.out.println(ts.subSet(50, false, 75, false));
	}

}
