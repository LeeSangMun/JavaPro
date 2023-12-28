package days03;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		//java.util.IllegalFormatConversionException: d != java.lang.String
		//System.out.printf("%d\n", "홍길동");
		
		Calendar c = Calendar.getInstance();
		
		System.out.printf("%1$tm %1$te %1$tY\n", c);
	}
}
