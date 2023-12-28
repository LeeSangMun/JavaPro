package days22;

import java.util.LinkedList;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 2:24:33
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("김호영");
		list.add("이지현");
		list.add("김정주");
		
		System.out.println(list);
		
		list.addFirst("유희진");
		System.out.println(list);
		
		list.add(1, "임경재");
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.contains("김동현"));
		System.out.println(list.indexOf("김동현"));
		System.out.println(list.lastIndexOf("김동현"));
		
		// 김정주 -> 고경림
		int index = -1;
		if ( (index = list.indexOf("김정주")) != -1) {
			list.set(index, "고경림");
		}
		System.out.println(list);
		
		/* 비교					읽기		추가/삭제		비고
		 * 1. ArrayList		:	빠르다.		느리다.			순차적인 추가삭제 빠름
		 * 2. LinkedList	:	느리다.		빠르다.			데이터 많으면 많을수록 접근성은 떨어짐
		 */
	}

}
