package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오전 11:09:23
 * @subject
 * @content
 */
// Tv 클래스 선언
public class Tv {
// Illegal modifier for the class Tv; only public, abstract & final are permitted
// private class Tv {
	// 멤버
	// 멤버변수(필드)
	
	// 초기화 하지 않으면 각 자료형의 기본값으로 초기화 된다.
	// 멤버변수 선언형식 : [접근제어자][기타제어자] 자료형 필드명 [= 초기화];
	public String color;		// null
	public boolean power;	// false
	public int channel;		// 0
	
	// 멤버함수(메서드)
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
}
