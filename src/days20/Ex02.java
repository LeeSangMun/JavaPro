package days20;

import java.util.Date;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오전 10:14:43
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
	}

	public static boolean isEqualsDate(Date d1, Date d2) {
		//int index = d1.toLocaleString().lastIndexOf(".");
		
		//String s1 = d1.toLocaleString().substring(0, index);
		//String s2 = d2.toLocaleString().substring(0, index);
		
		d1.setHours(0);
		d1.setMinutes(0);
		d1.setSeconds(0);
		
		d2.setHours(0);
		d2.setMinutes(0);
		d2.setSeconds(0);
		
		return d1.toLocaleString().equals(d2.toLocaleString());
	}
	
}
