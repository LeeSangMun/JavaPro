package days26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 8:59:39
 * @subject	DataInputStream/DataOutputStream
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;
		
		// 한 학생 정보를 student.txt 파일에 저장
		String fileName = ".\\src\\days26\\student.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = br.readLine();
			String pattern = "{0},{1},{2},{3},{4},{5},{6}";
			MessageFormat mf = new MessageFormat(pattern);
			Object[] objs = mf.parse(line);
			
			String[] s = Arrays.asList(objs).toArray(String[]::new);
			name = s[0];
			kor = Integer.parseInt(s[1]);		
			eng = Integer.parseInt(s[2]);		
			mat = Integer.parseInt(s[3]);		
			tot = Integer.parseInt(s[4]);		
			avg = Double.parseDouble(s[5]);		
			gender = Boolean.parseBoolean(s[6]);		
			
			/*
			name = objs[0].toString();
			kor = Integer.parseInt(objs[1].toString());			// object가 널이면 예외발생
			eng = Integer.parseInt(String.valueOf(objs[2]));	// object가 널이면 null문자 반환
			mat = Integer.parseInt(objs[3].toString());
			tot = Integer.parseInt(objs[4].toString());
			avg = Double.parseDouble(objs[5].toString());
			gender = Boolean.parseBoolean(objs[6].toString());
			*/
			
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n"
					, name, kor, eng, mat, tot, avg, gender);
			System.out.println(data);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
