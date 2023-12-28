package days23;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오후 2:00:40
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [TreeSet]
		// 1. 중복 허용x, 순서 유지x
		// 2. 이진 검색 트리라는 자료 구조로 데이터를 저장
		// 3. 이진 검색 트리 - 검색, 정렬, 범위 검색하는 데 성능이 높다.
		// 4. 링크드리스트 처럼 노드가 서로 연결된 구조
		// 5. 최상위 노드 : 루트(root)노드
		//		부모 - 자식 노드 관계
		//		형제 노드 관계
		// 6. 트리노드
		//		class TreeNode {
		//			TreeNode left;
		//			Object element;
		//			TreeNode rigth;
		//		}
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		SortedSet<Integer> ss = ts.subSet(4, 7);
		System.out.println(ss);
		
		// 지정된값보다 큰 값을 가진 가장 가까운 값 반환
		System.out.println(ts.higher(1));
		System.out.println(ts.lower(4));
		// 지정된 값과 같은 객체를 반한
		// 지정된 값이 없으면 작은 값을 가진 객체중에 가장 가까운 값을 반환
		System.out.println(ts.floor(1));
		// 지정된 값이 없으면 큰 값을 가진 객체중에 가장 가까운 값을 반환
		System.out.println(ts.ceiling(3));
		
	}

}
