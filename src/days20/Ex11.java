package days20;

/**
 * @author sangmun
 * @date 2023. 8. 9. - 오후 3:31:52
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		 * java.time 패키지에 날짜,시간 클래스
		 * 1. java.time : 날짜, 시간 다루는 핵심 클래스 제공
		 * 		ㄴ java.time.chrono 		: 표준(ISO)이 아닌 달력 시스템을 위한 클래스 제공
		 * 		ㄴ java.time.format 		: 형식화, 파싱 클래스 제공
		 * 		ㄴ java.time.temporal	: 날짜, 시간의 필드와 단위(unit) 클래스 제공
		 * 		ㄴ java.time.zone			: 시간대 클래스 제공
		 * 
		 * 		Temporal, TemporalAdjuster 인터페이스를 구현
		 *       
		 * 2. java.time : 날짜, 시간 다루는 핵심 클래스 제공
		 * 		1) 날짜 : LocalDate
		 * 		2) 시간 : LocalTime
		 * 		3) 날짜 + 시간 : LocalDateTime
		 * 		4) 날짜 + 시간 + 시간대 : ZonedDateTime
		 * 
		 * 3. new 연산자로 객체 생성 x -> now(), of() 메서드 사용
		 * 
		 * 4. 날짜와 날짜 사이의 간격 : Period
		 * 		시간과 시간 사이의 간격 : Duration
		 * 		TemporalAmount 인터페이스 구현
		 * 
		 * 5. 날짜와 시간의 단위를 정의해 놓은 것이
		 * 		ㄴ Temporal[Unit] 인터페이스
		 * 		ㄴ ChronoUnit 클래스
		 * 
		 * 6. 년, 월, 일 등의 날짜와 시간의 필드를 정의해 놓은 것이 
		 * 		ㄴ TemporalField 인터페이스
		 * 		ㄴ ChronoField 클래스
		 * 		
		 * 7. 특정 필드(년,월,일,시간,분...등) 가져오기
		 * 		getXXX()
		 * 		get(필드)
		 * 
		 * 8. 특정 필드 수정
		 * 		with(), plus(), minus()
		 * 
		 */
		
	}

}
