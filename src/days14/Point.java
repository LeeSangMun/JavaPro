package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오전 11:46:13
 * @subject
 * @content
 */
public class Point {
	private int x;
	private int y;
	
	public Point() {
		this(1);
		System.out.println("> Point 디폴트 생성자 호출됨 ...");
	}

	public Point(int x, int y) {
		System.out.println("> Point 2 생성자 호출됨 ...");
		// The assignment to variable x has no effect
		this.x = x;
		this.y = y;
	}
	
	public Point(int i) {
		this(i, i);
		System.out.println("> Point 1 생성자 호출됨 ...");
//		this.x = i;
//		this.y = i;
	}

	public void printPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
	/*
	public void offsetPoint(int n) {
		this.x += n;
		this.y += n;
//		return this;
	}
	*/
	
	public Point offsetPoint(int n) {
		this.x += n;
		this.y += n;
		return this;
	}
	
	// 두 좌표를 더해서 새로운 좌표를 반환하는 메서드 선언
	public Point plusPoint(Point p) {
		int x = this.x + p.x;
		int y = this.y + p.y;
		
		return new Point(x, y);
	}
}
