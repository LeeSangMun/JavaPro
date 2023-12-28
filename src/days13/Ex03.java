package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오전 11:20:07
 * @subject
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		// 1. Tv 클래스 선언 - Tv.java
		// 2. Tv 객체 선언
		
		Tv tv1 = null;
		tv1 = new Tv(); 
		// 클래스 사용할 때 제일 많이 보는 예외
		// java.lang.NullPointerException
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
		tv1.channelUp();
		System.out.println("현재 채널 : " + tv1.channel);
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
		System.out.println("end");
	}
}
