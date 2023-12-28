package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오후 2:09:57
 * @subject
 * @content
 */
public class Point {
	// 필드
	public int x, y;
	
	public Point() {
		
	}
	
	public Point(int i, int j) {
		x = i;
		y = j;
	}

	// 메서드
	public void dispXY() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
	// 리턴자료형이 Point 클래스의 참조타입.
	public Point plusPoint(Point p) {
		Point p2 = new Point();
		p2.x = p.x + 10;
		p2.y = p.y + 20;
		
		return p2;
	}
	
	// 오버로딩
	public Point plusPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
		
		Point p2 = new Point();
		p2.x = x + 10;
		p2.y = y + 20;
		
		return p2;
	}
}
