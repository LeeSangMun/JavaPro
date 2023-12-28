package days11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오전 10:45:51
 * @subject
 * @content
 */
public class Ex02_02 {
	public static void main(String[] args) {
		// 검색
		// 1. 순차검색
		// 2. 이진검색 + 정렬
		
		// int[] m = {3,5,2,4,1};
		// 배열을 사용하면 단점이 있었다.
		// 요소 추가, 삽입, 삭제 -> 배열크기가 자동으로 증가/감소 x
		
		// 컬렉션 클래스
		List<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(4);
		al.add(1);
		
		int index = al.indexOf(4);
		System.out.println(al);
	}
}
