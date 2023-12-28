package days22;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 12:47:10
 * @subject	LinkedList
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		// [LikedList]
		// 1. 배열
		// 		장점	(1) 읽기 성능이 가장 빠르다.
		//		단점	(1) 배열크기x, 삽입, 삭제 무지 속도 느리다.
		//		메모리상에 동일한 자료형으로 연속적으로 놓이게 한것
		
		// 2. 링크드리스트
		//		특징 - 비연속적
		//		(1) ArrayList, Vector + [E]lement(요소)
		// 		(2) 노드(Node)
		//			각 노드들은 연결되어져 있다.
		//		단방향 환형 링크드리스트
		//		양방향 환형 링크드리스트
		Node node1 = new Node();
		node1.value = 10;
		
		
		Node node2 = new Node();
		node2.value = 20;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.value = 30;
		node2.next = node3;
		
		Node node4 = new Node();
		node4.value = 40;
		node3.next = node4;
		
		// 노드 2와 노드 3 사이에 노드 5를 삽입
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		node5.next = node3;
		
		// node3 삭제
		node5.next = node4;
		
		// node4 삭제
		node5.next = null;
	}
}


class Node {
	int value;
	Node next = null;	// 다음 노드의 주소를 참조
	// Node prev = null;	// 이전 노드의 주소를 참조
}