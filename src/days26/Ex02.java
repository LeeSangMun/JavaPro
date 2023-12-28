package days26;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 9:46:50
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		String name = "임경재";
		int kor = 87, eng = 79, mat = 80;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 한 학생 정보를 student.txt 파일에 저장
		String fileName = ".\\src\\days26\\student.dat";
		try(DataOutputStream dos 
				= new DataOutputStream(new FileOutputStream(fileName))) {
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			dos.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
