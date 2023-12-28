package days22;

import java.util.Stack;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 2:42:30
 * @subject Stack과 Queue
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// [Stack Queue]
		
		/*
		 * Stack 
		 * LIFO 구조
		 * push(), pop()
		 * peek() // 요소만 확인
		 * empty()
		 * seach()
		 * 
		 * 스택 활용 : 웹브라우저 앞으로/뒤로가기
		 */
		
		Stack s = new Stack();
		s.push("유희진");
		s.push("임경재");
		s.push("김호영");
		s.push("이지현");
		
		System.out.println(s);
		/*
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		// java.util.EmptyStackException
		System.out.println(s.pop());
		*/
		
		/*
		while(!s.empty()) {
			System.out.println(s.pop());
		}
		*/
		
		/*
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		*/
		
		System.out.println(s.search("임경재"));
	}

}
