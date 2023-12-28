package days21;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오전 10:30:18
 * @subject	20일차 복습
 * @content
 */
public class Ex04 {

	public static void main(String[] args) throws ParseException {
		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";
		
		int no;
		String name;
		String addr;
		
		String pattern = "번호:{0},이름:{1},주소:{2}";
		
		MessageFormat mf = new MessageFormat(pattern);
		
		Object[] objArr = mf.parse(source);
		no = Integer.parseInt(objArr[0].toString());
		name = objArr[1].toString();
		addr = objArr[2].toString();
		
		System.out.println(no + " " + name + " " + addr);
	}

}
