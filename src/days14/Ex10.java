package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오후 3:21:04
 * @subject	변수 초기화
 * @content
 */
public class Ex10 {
	double avg;
	static double rate;
	
	public static void main(String[] args) {
		/*
		 * 1. 변수 초기화 ? 변수를 선언하고 처음으로 값을 할당하는 것
		 * 2. 지역 변수는 반드시 초기해야 사용할 수 있다.
		 * 3. 인스턴스 변수
		 * 		클래스 변수는 초기화 하지 않으면 각 자료형의 기본값으로 초기화되어져 있다.
		 * 
		 * 		double				0.0 또는 0.0d
		 * 		int, byte, short 	0
		 * 		long 					0L
		 * 		float					0.0f
		 * 		참조변수				null
		 * 		char					'\u0000'
		 *	 	boolean				false
		 */
		
		System.out.println(Ex10.rate);
		Ex10 obj = new Ex10();
		System.out.println(obj.avg);
	}
}
