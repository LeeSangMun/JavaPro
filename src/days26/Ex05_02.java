package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 11:13:20
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		int[] score = {
				1, 100, 90, 90,
				2, 70, 90, 100, 
				3, 100, 100, 100,
				4, 70, 60, 80,
				5, 70, 90, 100
		};
		
		String name = ".\\src\\days26\\score.dat";
		String mode = "rw";
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			for (int i = 0; i < score.length; i++) {
				long fp = raf.getFilePointer();
				System.out.printf("> 현재 파일포인터 : %d - [%d]\n", fp, score[i]);
				raf.writeInt(score[i]);
			} // for
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		
		
		// 모든 학생의 번호, 국, 영, 수 성적 정보를 출력
		
		int no = 0, kor = 0, eng = 0, mat = 0, tot = 0;
		double avg = 0;
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			int 학생수 = score.length/4;
			for (int i = 0; i < 학생수; i++) {
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor + eng + mat;
				avg = (double)tot/3;
				System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n",
						no, kor, eng, mat, tot, avg);
			} // for
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		
		// [문제]
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			long pos = 16*2+3*4;
			raf.seek(pos);
			System.out.println(raf.getFilePointer());
			raf.writeInt(20);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek(16*2);
			no = raf.readInt();
			kor = raf.readInt();
			eng = raf.readInt();
			mat = raf.readInt();
			tot = kor + eng + mat;
			avg = (double) tot / 3;
			System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", no, kor, eng, mat, tot, avg);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
