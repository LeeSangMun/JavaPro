package days22;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 3:12:45
 * @subject	Queue
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 * [Queue]
		 * offer(), poll()		peek()
		 * FIFO 구조
		 * Collection 인터페이스를 상속받은 인터페이스
		 */
		
//		Queue q = new LinkedList();
		Deque q = new LinkedList();
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		
		q.offerFirst("홍길동");
//		q.pollFirst();
//		q.pollLast();
		System.out.println(q);
		
		while(!q.isEmpty()) {
			String name = (String)q.remove();
			System.out.println(name);
		}
		
	}

}
