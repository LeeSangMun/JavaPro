package days07;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 21. - 오전 9:29:51
 * @subject
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		int row, col;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("> 행의 갯수를 입력하세요 ? ");
			row = sc.nextInt();
			col = row*2-1;
			
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= col; j++) {
					if(i+j >= row+1 && j-i <= row-1) {
						System.out.print("*");
					} else {
						System.out.print("_");
					}
				} // for
				System.out.println();
			} // for
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
