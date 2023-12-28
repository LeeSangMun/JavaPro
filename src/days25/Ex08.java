package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 8. 17. - 오후 4:21:00
 * @subject	[메모리 스트림]
 * @content	주로 다른 곳에 입,출력하기 전에
 * 					메모리 상에 데이터를 임시로 저장할 목적을 사용하는 스트림
 * 
 * 					- Byte, Char, String
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {
		byte[] buf = {0,1,2,3,4,5,6,7,8,9};
		
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int code;
		while ((code = bais.read()) != -1) {
			System.out.println(code);
			baos.write(code);
		}
		
		byte[] outbuf = baos.toByteArray();
		System.out.println(Arrays.toString(outbuf));
		
		bais.close();
		baos.close();
	}

}
