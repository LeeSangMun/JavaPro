package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오후 3:30:15
 * @subject
 * @content
 */
public class Ex14_03 {

	public static void main(String[] args) {
		ArrayList team1 = new ArrayList();
		// System.out.println(team1.size());
		String t1 = "이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 ";
		t1 = t1.replaceAll("\\(팀장\\)", "");
		String[] t1Arr = t1.split("\\s*,\\s");
		for (int i = 0; i < t1Arr.length; i++) {
			team1.add(t1Arr[i]);
		} // for
//		System.out.println(team1);
		
		
		ArrayList team2 = new ArrayList();
		team2.add("박민석");
		team2.add("유희진");
		team2.add("고경림");
		
		ArrayList team3 = new ArrayList();
		team3.add("박정호");
		team3.add("이상문");
		team3.add("이주영");
		
		ArrayList class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		
		System.out.println(class5);
		
		// iterator()
		Iterator ir = class5.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
//			System.out.println(name);
		}
		
		System.out.println(class5.containsAll(team1));
		
		// class5 - 이름 오름차순으로 정렬
		ArrayList class5Clone = (ArrayList)class5.clone();
		System.out.println(class5Clone);
		class5Clone.removeAll(team1);
		
		// 2조 + 3조
		System.out.println(class5Clone);
		
		// 이름 순으로 오름차순 정렬
		// 정렬할 때 기준이 되는 comparator
		
		
//		class5Clone.sort(new Class5Comparator());
//		Collections.sort(class5Clone);
//		class5Clone.sort(Comparator.naturalOrder());
		class5Clone.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(class5Clone);
	}

}
