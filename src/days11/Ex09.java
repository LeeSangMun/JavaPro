package days11;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 27. - 오후 4:42:19
 * @subject	로또 예제 활용
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 로또 게임 횟수 입력 ? ");
		int count = sc.nextInt();
		
		int[][] lotto = new int[count][6];
		fillLotto(lotto);
		
		printLotto(lotto);
	}

	public static void fillLotto(int[][] lotto) {	
		for(int i=0; i<lotto.length; i++) {
			int index = 0;
			for(int j=0; j<lotto[i].length; j++) {
				int lottoNumber = (int)(Math.random()*45) +1;	
				if(!isDuplicateLotto(lotto, lottoNumber, index, i)) 
					lotto[i][index++] = lottoNumber;
				else j--;
			}
		}
		
	}

	public static boolean isDuplicateLotto(int[][] lotto, int lottoNumber, int index, int count) {
		for (int i = 0; i < index; i++) {
			if(lotto[count][i] == lottoNumber) {
				return true;
			}
		} // for
		
		return false;
	}

	public static void printLotto(int[][] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d 게임]\t\t[%2d][%2d][%2d][%2d][%2d][%2d]",
					i+1, lotto[i][0], lotto[i][1], lotto[i][2],
					lotto[i][3], lotto[i][4], lotto[i][5]);
			System.out.println();
		} // for
	}
}
