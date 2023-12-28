package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sangmun
 * @date 2023. 7. 17. - 오후 5:18:50
 * @subject
 * @content
 */
public class Ex12 {
	public static void main(String[] args) throws IOException {
		String name = "";
		int kor, eng, math;
		int total;
		double mean;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> 이름,국어,영어,수학 입력 ? ");
		String inputData = br.readLine();
		
		
		// 구분자 콤마(,) 잘라내기
		String[] datas = inputData.split(",");
		
		name = datas[0];
		kor = Integer.parseInt(datas[1]);
		eng = Integer.parseInt(datas[2]);
		math = Integer.parseInt(datas[3]);
		
		total = kor + eng + math;
		mean = total / 3.0;
		
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다.", name, kor, eng, math, total, mean);
	}
}
