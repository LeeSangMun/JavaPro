package days23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오전 8:59:30
 * @subject	22일차 복습
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		int n = 5; // 로또 게임 횟수
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<>();
		LinkedHashSet<Integer> lotto = null;
		
		int lottoNumber;
		for (int i = 0; i < n; i++) {
			lotto = new LinkedHashSet<>();
			while (lotto.size() < 6) {
				lottoNumber = (int)(Math.random()*45) + 1;
				lotto.add(lottoNumber);
			}
			
			lottos.add(lotto);
		} // for
		
		ArrayList<Integer> sList = null;
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator();
		int no = 1;
		while (ir.hasNext()) {
			lotto = ir.next();
			sList = new ArrayList<>(lotto);
			Collections.sort(sList);
			
			Iterator<Integer> ir2 = sList.iterator();
			System.out.printf("%d게임 : ", no++);
			while (ir2.hasNext()) {
				lottoNumber = ir2.next();
				System.out.printf("[%02d]", lottoNumber);
			}
			System.out.println();
		}
	}
}
