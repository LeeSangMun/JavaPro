package days09;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author sangmun
 * @date 2023. 7. 25. - 오후 2:47:38
 * @subject
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		/*
		int year, month;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("> 년도 월 입력 ? ");
			year = sc.nextInt();
			month = sc.nextInt();
			
			printCalendar(year, month);
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		for(int y=2020; y <= 2023; y++) {
			for (int i = 1; i <= 12; i++) {
				printCalendar(y, i);		
			} // for
		}
	}

	public static void printCalendar(int year, int month) {
		
		// 1. 1일이 무슨 요일인지
		// 2. 마지막날까지 며칠인지
		
		// 일(0) ~ 토(6)
		int dayOfWeek = getDayOfWeek(year, month, 1);
		int lastDay = getLastDay(year, month);
		
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		System.out.println("-".repeat(60));
		String week = "일월화수목금토";
		for(int i=0; i<week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i)); 
		}

		System.out.println();
		System.out.println("-".repeat(60));
		
		// 1일 날짜 앞의 공백 찍는 for문
		for(int i=0; i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastDay; i++) {
			System.out.printf("\t%2d", i);
			if((i+dayOfWeek) % 7 == 0) System.out.println();
		}
		
		/*
		for(int i=1, n = dayOfWeek; i<=lastDay; i++, n++) {
			System.out.printf("\t%2d", i);
			if(n%7 == 6) {
				System.out.println();
			}
		}
		*/
		
		System.out.println();
		System.out.println("-".repeat(60));
		
	}
	
	// 무슨 요일인지 반환
	private static int getDayOfWeek(int year, int month, int day) {
		// 총 날짜 수
		int totalDays = getTotalDays(year, month, day);
		int dayOfWeek = totalDays%7;
		System.out.println("일월화수목금토".charAt(dayOfWeek));
		return dayOfWeek;
	}

	private static int getTotalDays(int year, int month, int day) {
		int totalDays = 0;
		
		/*
		for(int i=1; i<year; i++) {
			totalDays += days08.Ex05.isLeapYear(year) ? 366 : 365;	
		}
		*/
		
		totalDays += (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		for(int i=1; i<month; i++) {
			totalDays += getLastDay(year, i);
		}
		
		totalDays += day;
		
		return totalDays;
	}

	public static int getLastDay(int year, int month) {
		int lastDay;
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		lastDay = months[month-1];
		if(month == 2 && days08.Ex05.isLeapYear(year)) lastDay++;
		
		return lastDay;
	}

	// [1]
	/*
	public static int getLastDay(int year, int month) {
		int lastDay = 0;
		
		switch(month) {
		case 2:
			lastDay = days08.Ex05.isLeapYear(year) ? 29 : 28;
			break;
		case 4: case 6: case 9: case 11:
			lastDay = 30;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31;
			break;
		}
		
		return lastDay;
	}
	*/
	
	// [2]
}
