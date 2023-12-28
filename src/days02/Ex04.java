package days02;


/**
 * @author sangmun
 * @date 2023. 7. 14. - 오전 10:35:42
 * @subject 두 기억공간의 값을 바꾸기
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		// 두 정수를 저장할 x, y 변수를 선언하고
		// 각각 10, 20 으로 초기화하고
		// 출력형식: > x=10, y=20 출력
		
		// 같은 자료형일 경우 콤마(,)연산자를 사용해 나열 가능
		int x = 10, y = 20, temp;
		System.out.println("교환 전 > x = " + x + ", y = " + y);
		
		// 프로그램 상에서 두 기억공간의 값을 교환하려면 
		// 반드시 동일한 자료형의 임시기억공간이 필요하다.
		temp = x;
		x = y;
		y = temp;
		System.out.println("교환 후 > x = " + x + ", y = " + y);
	}
}
