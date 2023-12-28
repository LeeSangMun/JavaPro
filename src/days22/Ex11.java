package days22;

import java.util.PriorityQueue;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 3:29:21
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// PriorityQueue
		PriorityQueue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		System.out.println(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
