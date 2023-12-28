package days19;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

/**
 * @author sangmun
 * @date 2023. 8. 8. - 오전 11:29:12
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가";
		byte[] bytes = str.getBytes("utf-8");
		/*
		 * for (int i = 0; i < bytes.length; i++) {
		 *  	System.out.printf("[%02X]:", bytes[i]); 
		 * } // for System.out.println();
		 */
		printByteArr(bytes);	// 한글 한 문자 : 3byte로 처리됨 // utf-8
		// "가" - > 3바이트 UTF-8 byte[] -> "가"
		String s = new String(bytes, "UTF-8");
		System.out.println(s);
		
		
		bytes = str.getBytes("euc-kr");
		printByteArr(bytes);	// 한글 한 문자 : 2byte로 처리됨 // euc-kr
		
		s = new String(bytes, "euc-kr");
		System.out.println(s);
	}

	private static void printByteArr(byte[] bytes) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		for (int i = 0; i < bytes.length; i++) {
			sj.add(String.format("%02X", bytes[i]));
		} // for
		System.out.println(sj.toString());
	}

}
