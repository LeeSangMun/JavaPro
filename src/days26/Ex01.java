package days26;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 8:59:39
 * @subject	DataInputStream/DataOutputStream
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		String name = "임경재";
		int kor = 87, eng = 79, mat = 80;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 한 학생 정보를 student.txt 파일에 저장
		String fileName = ".\\src\\days26\\student.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n"
					, name, kor, eng, mat, tot, avg, gender);
			bw.append(data);
			bw.flush();
			System.out.println(data);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
