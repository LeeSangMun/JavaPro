package days08;

import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 4:31:18
 * @subject	로또 (3)
 * @content
 */
public class Ex09_03 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		fillLotto(lotto);
		
		printLotto(lotto);
	}

	public static void fillLotto(int[] lotto) {
		int index = 0;
		int lottoNumber = (int)(Math.random()*45) +1;
		lotto[index++] = lottoNumber;
		
		while (index <= 5) {
			lottoNumber = (int)(Math.random()*45) +1;
			
			// 중복이 되면 true, 중복되지 않으면 false
			if(!isDuplicateLotto(lotto, lottoNumber, index)) 
				lotto[index++] = lottoNumber;
		}
	}

	public static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if(lotto[i] == lottoNumber) {
				return true;
			}
		} // for
		
		return false;
	}

	public static void printLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=%d\n", i, lotto[i]);
		} // for
	}
}
