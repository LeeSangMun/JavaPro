package days12;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 28. - 오전 10:45:57
 * @subject
 * @content
 */
public class Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] lottos;
		System.out.printf("> 로또 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		lottos = new int[gameNumber][6];	
		
		for (int i = 0; i < lottos.length; i++) {
			fillLotto(lottos[i]);			
		} // for
		
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d게임]", i+1);
			dispLotto(lottos[i]);
			System.out.println();
		} // for
	}

	public static void fillLotto(int[] lotto) {
		int index = 0;
		int lottoNumber = (int)(Math.random()*45) +1;
		lotto[index++] = lottoNumber;
		boolean flag = false;
		
		while (index <= 5) {
			flag = false;
			lottoNumber = (int)(Math.random()*45) +1;
			// 중복 확인
			for (int i = 0; i < index; i++) {
				if(lotto[i] == lottoNumber) {
					flag = true;
					break;
				}
			} // for
			
			if(!flag) lotto[index++] = lottoNumber;
		}
	}

	public static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]", lotto[i]);
		} // for
	}
}
