package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오후 3:28:30
 * @subject
 * @content
 */
public class Ex11 {
	
	// 한 학생의 성적 관리 Student 클래스 선언
	public static void main(String[] args) throws IOException {
		// 한 반에 STUDENT_COUNT명의 학생
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;

		final int STUDENT_COUNT = 30;

		Student[] students = new Student[STUDENT_COUNT];
		
		Scanner sc = new Scanner(System.in);
		int count = 0; // 학생 수
		char con = 'y'; // 입력 여부
		int no = 1;
		
		do {
			System.out.print("> 이름, 국어, 영어, 수학 입력 ? ");
//			name = sc.next();
			name = getName();			
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot / 3;

			rank = 1;

			students[count] = new Student();
			
			students[count].no = no++;
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;
			students[count].rank = rank;
			
			count++;
			System.in.skip(System.in.available());

			System.out.print("> 학생 입력 계속 ?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		for (int i = 0; i < count; i++) {
			students[i].printStudentInfo();
		} // for
	}

	public static String getName() {
		Random rnd = new Random();
		char[] nameArr = new char[3];
		for(int i=0; i<nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1) + '가');
		}
		
		return new String(nameArr);
	}

	public static int getScore() {
		return (int)(Math.random()*101);
	}
}
