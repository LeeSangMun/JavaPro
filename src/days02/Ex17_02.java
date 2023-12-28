package days02;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 14. - 오후 5:28:41
 * @subject	br
 * @content	Scanner 클래스
 */
public class Ex17_02 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학을 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		//홍길동님은 국:89 영:78 수:56 총점:? 평균:? 이다.
		
		String name = "";
		byte kor, eng, math;
		short total;
		double mean;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 국어 영어 수학 입력 > ");
		Scanner sc2 = new Scanner(sc.next()).useDelimiter(",");
		
		name = sc2.next();
		kor = sc2.nextByte();
		eng = sc2.nextByte();
		math = sc2.nextByte();
		
		
		total = (short)(kor + eng + math);
		mean = total / 3.0;
		
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다.", name, kor, eng, math, total, mean);
	}
}
