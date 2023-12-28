package days10;

import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 26. - 오후 3:12:18
 * @subject
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		// 한 반에 STUDENT_COUNT명의 학생
		// 성적처리 (이름, 국,영,수,총,평,등수)
		// 1. 학생 정보 입력
		// 2. 총점, 평균
		// 3. 등수
		// 4. 학생 정보 출력
		// 5. 파일 저장 또는 DB 저장
		
		
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;
		
		
		
		final int STUDENT_COUNT = 30;
		// java.lang.NullPointerException
//		String[] names = null;
		String[] names = new String[STUDENT_COUNT];
		int[] kors = new int[STUDENT_COUNT];
		int[] engs = new int[STUDENT_COUNT];
		int[] mats = new int[STUDENT_COUNT];
		int[] tots = new int[STUDENT_COUNT];
		double[] avgs = new double[STUDENT_COUNT];
		int[] ranks = new int[STUDENT_COUNT];
		
		/*
		names[0] = "홍길동";
		System.out.println(names[0]);
		*/
		
		Scanner sc = new Scanner(System.in);
		int count = 0;		// 학생 수
		char con = 'y';	// 입력 여부
		
		System.out.print("> 이름, 국어, 영어, 수학 입력 ? ");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = (double)tot / 3;
		
		rank = 1;
		
		count++;
	}
}
