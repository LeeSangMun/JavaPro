package days08;

import java.util.Random;

/**
 * @author sangmun
 * @date 2023. 7. 24. - 오후 3:02:50
 * @subject	로또
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		// 로또 6/45
		// 1~45 정수를 6개 출력.
//		Random r = new Random();
//		r.nextInt(45) + 1
		for (int i = 1; i <= 6; i++) {
			int lottoNumber = (int)(Math.random()*45) +1;
			System.out.println(lottoNumber);
		} // for 
		
		
	}
}
