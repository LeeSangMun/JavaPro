package days21;

import java.time.LocalTime;

/**
 * @author sangmun
 * @date 2023. 8. 10. - 오전 11:10:56
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		/*
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		System.out.println(t.getNano());
		System.out.println(t.get(ChronoField.MILLI_OF_SECOND));
		*/
		
		// 30분 후 몇 시?
		
//		t = t.plusMinutes(30);
//		t = t.minusMinutes(30);
		
		// 1시간 30분 후 ? 
		t = t.plusMinutes(90);
		System.out.println(t);
	}

}
