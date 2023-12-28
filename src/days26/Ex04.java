package days26;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오전 10:29:21
 * @subject	PrintStream 
 * @content	데이터를 기반 출력용 스트림
 * 					다양한 형태로 출력할 수 있는 메서드가
 * 					오버로딩되어져 있는 스트림클래스이다.
 */
public class Ex04 {

	public static void main(String[] args) {
		InputStream is = System.in;
		PrintStream ps = System.out;
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");
		
		System.err.println("F");
	}

}
