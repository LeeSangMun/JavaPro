package days08;

import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 3:19:57
 * @subject	로또 (2)
 * @content
 */
public class Ex09_02 {
	public static void main(String[] args) {
		// 로또 6/45
		// 1~45 정수를 6개 출력.
		int[] lotto = new int[6];
		
		// 로또 채우기
		fillLotto(lotto);
		
		// lotto 배열을 출력
		printLotto(lotto);
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
//			else flag = !flag;
		}
		
		// 내가 한 것
		/*
		int index = 0;
		boolean flag = false;
		
		while(index < 6) {
			int lottoNumber = (int)(Math.random()*45) +1;
			for(int i=0; i<index; i++) {
				if(lottoNumber == lotto[i]) {
//					System.out.println("> 같은 번호 입니다.");
					flag = true;
					break;
				}
				flag = false;
			}
			
			if(!flag) {		
				lotto[index++] = lottoNumber;
				
			}
		}
		*/
	}

	public static void printLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=%d\n", i, lotto[i]);
		} // for
	}
}
