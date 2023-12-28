package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sangmun
 * @date 2023. 7. 14. - 오후 4:43:42
 * @subject
 * @content
 */
public class Ex17 {
	public static void main(String[] args) throws IOException {
		// 이름, 국어, 영어, 수학을 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		//홍길동님은 국:89 영:78 수:56 총점:? 평균:? 이다.
		
		String name = "";
		byte kor, eng, math;
		short total;
		double mean;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 입력 > ");
		name = br.readLine();
		System.out.print("국어 점수 입력 > ");
		kor = Byte.parseByte(br.readLine());
		System.out.print("영어 점수 입력 > ");
		eng = Byte.parseByte(br.readLine());
		System.out.print("수학 점수 입력 > ");
		math = Byte.parseByte(br.readLine());
		
		total = (short)(kor + eng + math);
		mean = total / 3.0;
		
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다.", name, kor, eng, math, total, mean);
	}
}
