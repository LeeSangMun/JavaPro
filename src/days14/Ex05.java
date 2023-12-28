package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오전 11:39:44
 * @subject	this 예약어 설명
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		/*
		 * 1. this의 정의 : 객체 자기 자신의 주소값을 가지는 참조변수
		 * 2. this 3가지 용도
		 * 		1) 멤버를 가리킬 때의 this
		 * 			예) this.필드명	this.메서드명
		 * 				public Point(int x, int y) {
		 * 					this.x = x;
		 * 					this.y = y;
		 * 				}
		 * 		2) 생성자에서 또 다른 생성자를 호출할 때의 this
		 * 
		 * 		3) 단독으로 사용될 때의 this		: 리턴값, 매개변수
		 * 			
		 */
		
//		Point p1 = new Point(1,2);
//		p1.printPoint();
//		
//		Point p2 = new Point(100, 200);
//		p2.printPoint();
		
//		Point p3 = new Point(30);
//		p3.printPoint();
		
		Point p4 = new Point(10, 20);
		p4.offsetPoint(100).printPoint();
	}
}
