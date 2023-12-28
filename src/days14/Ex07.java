package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오후 2:13:07
 * @subject	[static 키워드] 필드, 메서드, 클래스
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
		// 우리반 -> 기업은행 -> 보통 예금
		// Save 클래스 선언 : 저축
		
		/*
		Save s1 = new Save("이상문", 1000 ,0.04);
		Save s2 = new Save("이상문", 1500 ,0.04);
		Save s3 = new Save("이상문", 34500 ,0.04);
		Save s4 = new Save("이상문", 5000 ,0.04);
		Save s5 = new Save("이상문", 21000 ,0.04);
		
		s1.dispSvae();
		s2.dispSvae();
		s3.dispSvae();
		s4.dispSvae();
		s5.dispSvae();
		*/
		
		/*
		// 클래스 배열 선언
		Save[] ss = new Save[5];
		
		ss[0] = new Save("이상문", 1000 ,0.04);
		ss[1] = new Save("이상문", 1500 ,0.04);
		ss[2] = new Save("이상문", 34500 ,0.04);
		ss[3] = new Save("이상문", 5000 ,0.04);
		ss[4] = new Save("이상문", 21000 ,0.04);
		*/
		
		/*
		Save[] ss = {
				new Save("이상문", 1000 ,0.04),
				new Save("이상문", 1500 ,0.04),
				new Save("이상문", 34500 ,0.04),
				new Save("이상문", 5000 ,0.04),
				new Save("이상문", 21000 ,0.04)
		};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].dispSvae();
		} // for
		*/
		
		// 모든 사람의 이자율 동일
		// Save 객체가 생성될 때 마다 rate 필드는 x
		// Save클래스 당 1개만 rate 필드 생성해서 모든
		// 인스턴스가
		
		// 인스턴스 변수 - 객체명.필드명, 객체명.메서드명
		// 클래스 변수 - 클래스명.static필드
//		System.out.println(Save.rate);
		
		// 1. rate 이자율 왜 static 필드로 선언했나요?
		// 2. 정적 메서드 언제 사용하나요?
		//		1) static 필드를 사용하기 위해서
		//		2) 
		
		System.out.println(Save.getRate());
		Save.setRate(0.08);
	}
}
