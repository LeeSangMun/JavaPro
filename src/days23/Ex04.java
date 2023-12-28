package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오후 12:23:04
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		// a U b 합집합
		// a - b 차집합
		// a ∩ b 교집합
		
		// 1) a U b 합집합 1,2,3,4,5,6,7,8
		/*
		ArrayList<Integer> hab = new ArrayList<>();
		hab.addAll(a);
		Iterator<Integer> ir = b.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			if(!a.contains(i)) {
				hab.add(i);
			}
		}
		System.out.println(hab);
		*/
		
		HashSet<Integer> hab = new HashSet<>();
		hab.addAll(a);
		hab.addAll(b);
		System.out.println(hab);
		
		// 2) a - b 차집합
		/*
		HashSet<Integer> cha = new HashSet<>(a);
		Iterator<Integer> ir = cha.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			if(b.contains(i)) ir.remove();
		}
		*/
		
		/*
		HashSet<Integer> cha = new HashSet<>();
		HashSet<Integer> kyo = new HashSet<>();
		Iterator<Integer> ir = a.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			if(!b.contains(i)) cha.add(i);
			else kyo.add(i);
		}
		*/
		
		
		HashSet<Integer> cha = new HashSet<>();
		cha.addAll(a);
		cha.removeAll(b);
		System.out.println(cha);
		
		// 3) a ∩ b 교집합
		HashSet<Integer> kyo = new HashSet<>(a);
		kyo.addAll(a);
		kyo.removeAll(cha);
//		a.removeAll(cha);
		System.out.println(kyo);
	}

}
