package days26;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 10:05:33
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;
		
		// 한 학생 정보를 student.txt 파일에 저장
		String fileName = ".\\src\\days26\\student.dat";
		try(DataInputStream dis 
				= new DataInputStream(new FileInputStream(fileName))) {
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			avg = dis.readDouble();
			gender = dis.readBoolean();
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n"
					, name, kor, eng, mat, tot, avg, gender);
			System.out.println(data);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
