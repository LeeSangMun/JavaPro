package days22;

import java.time.LocalDateTime;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오전 10:46:35
 * @subject	21일차 복습
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		LocalDateTime surveyStartDate = LocalDateTime.of(2023, 8, 10, 9, 0, 0);
		LocalDateTime surveyEndDate = LocalDateTime.of(2023, 8, 15, 18, 0, 0);
		LocalDateTime now = LocalDateTime.now();
		
		/*
		now.isAfter();
		now.isBefore();
		now.isEqual();
		now.compareTo();
		*/
		
		if(now.isBefore(surveyStartDate) || now.isAfter(surveyEndDate)) {
			System.out.println("투표 기간 x");
		} else {
			System.out.println("투표 기간 0");
		}
	}

}
