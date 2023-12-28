package days26;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 10:10:36
 * @subject	SequenceInputStream
 * @content	하나의 파일 용량이 너무 커서 여러 개의 파일로 분리했다고 가정하면
 * 					그 분리된 파일을 읽어와야 할 때 사용한다.
 * 					여러 개의 입력스트림을 연속적으로 연결해서 하나의 스트림으로 데이터를 처리할 수 
 * 					있는 바이트스트림
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		byte[] a = {1,2,3};
		byte[] b = {4,5,6};
		byte[] c = {7,8,9};
		ByteArrayInputStream bais1 = new ByteArrayInputStream(a);
		ByteArrayInputStream bais2 = new ByteArrayInputStream(b);
		ByteArrayInputStream bais3 = new ByteArrayInputStream(c);
		
		// [1]
		/*
		SequenceInputStream sis = new SequenceInputStream(bais1, bais2);
		SequenceInputStream sis2 = new SequenceInputStream(sis, bais3);
		*/
		
		// [2]
		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(bais1);
		v.add(bais2);
		v.add(bais3);
		Enumeration<ByteArrayInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		int code;
		while ((code = sis.read()) != -1) {
			System.out.println(code);
		}
		
	}

}
