package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오후 4:50:13
 * @subject	
 * @content
 */
public class Ex12 {
	public static void main(String[] args) {
		/*
		 * 1. 클래스 앞에 붙는 접근지정자 설명
		 * 2. 멤버(필드, 메서드 ,생성자) 앞에 붙는 접근지정자 설명
		 * 		public		- 패키지 내부,외부 어디서나 접근 가능
		 * 		default		- 패키지 내부에서만 접근(참조) 가능
		 * 		protected	- default + 상속(다른패키지라도 상속 관계 참조 가능)
		 * 		private		- 클래스 내에서만 접근(참조) 가능
		 * 
		 * 3. 범위 public > protected > default > private
		 * 
		 * 참고) 지역변수는 접근지정자 사용 불가
		 */
		
		Time t = new Time();
		t.hour = 2;
		t.minute = 20;
		t.second = 59;
		
		// The field Time.milisecond is not visible
//		t.milisecond = 1999;
	}
}
