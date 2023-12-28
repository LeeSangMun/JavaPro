package days20;

import java.util.Date;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오전 10:49:15
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		Date today = new Date();
		Date sday = new Date(2023-1900, 7-1, 13, 9, 0, 0);
		
		//long diff = today.getTime() - sday.getTime();
		
		dispDiffDays(sday, today);
		
		/*
		System.out.println(diff + "ms");
		System.out.println(diff/1000 + "s");
		System.out.println(diff/(1000*60) + "m");
		System.out.println(diff/(1000*60*60) + "h");
		System.out.println(diff/(1000*60*60*24) + "d");
		*/
		
		// ??일 ??시간 ??분 ??초 ??밀리세컨드
	}

	public static void dispDiffDays(Date sday, Date today) {
		long diff = today.getTime() - sday.getTime();
		long 몫 = diff/(1000*60*60*24);
		System.out.printf("%dd-", 몫);
		diff %= (1000*60*60*24);
		
		몫 = diff/(1000*60*60);
		System.out.printf("%dh-", 몫);
		diff %= (1000*60*60);
		
		몫 = diff/(1000*60);
		System.out.printf("%dm-", 몫);
		diff %= (1000*60);
		
		몫 = diff/(1000);
		System.out.printf("%ds-", 몫);
		diff %= (1000);
		
		몫 = diff/1;
		System.out.printf("%dms\n", 몫);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		dispDiffDays(sday, new Date());
	}

}
