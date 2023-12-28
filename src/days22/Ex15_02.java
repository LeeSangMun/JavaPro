package days22;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오후 4:43:34
 * @subject
 * @content
 */
public class Ex15_02 {
	public static void main(String[] args) {
		
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		gameNumber = scanner.nextInt(); // 3

		ArrayList lottos = new ArrayList();

		LinkedHashSet lotto = null;
		for (int i = 0; i < gameNumber; i++) {
			lotto = new LinkedHashSet();
			Ex15.fillLotto(lotto);
			lottos.add(lotto);
		} // for

		// 출력
		for (int i = 0; i < gameNumber; i++) {
			lotto = (LinkedHashSet) lottos.get(i);
			System.out.printf("%d게임 : ", i + 1);
			Ex15.dispLotto(lotto);
		} // for

		
		
//		LinkedHashSet lotto = new LinkedHashSet();
//		
//		try(Scanner sc = new Scanner(System.in)) {
//			System.out.print("> 게임 횟수 입력 ? ");
//			int count = sc.nextInt();
//			
//			for (int i = 0; i < count; i++) {
//				Ex15.fillLotto(lotto);
//				Ex15.dispLotto(lotto);
//			} // for
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}