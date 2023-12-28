package days15;

/**
 * @author sangmun
 * @date 2023. 8. 2. - 오전 11:39:48
 * @subject
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		Point center = new Point(50, 50);
		int r = 10;
		Circle c = new Circle(center, r);
		c.color = "red";
		// Shape 부모클래스로 부터 물려받은 draw() 메서드 수정
		// 재정의 함수 == 오버라이딩
		// 중복 함수 == 오버로딩
		c.draw();
		
		System.out.println("-".repeat(30));
		Point[] p = {
			new Point(1,1),
			new Point(20,40),
			new Point(10, 5)
		};
		Triangle t = new Triangle(p);
		t.draw();
		
		System.out.println("-".repeat(30));
	}
}

class Shape {
	String color = "black";
	
	// 메서드 면적메서드(), 둘레메서드
	void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}
}

/*
class Circle {
	int x;
	int y;
	int r;
	
	public Circle() {
		
	}
	
	Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	void draw() {
		
	}
}
*/

class Circle extends Shape {
	Point center;
	int r;
	

	public Circle() {
		this(new Point(0,0), 0);
	}
	
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	// @ 애노테이션(annotation)
	@Override
	void draw() {
//		System.out.printf("[color=%s, center=(%d,%d)]\n", 
//				this.color, this.center.x, this.center.y);
		System.out.printf("[color=%s, center=%s]\n", 
				this.color, this.center.getXY());
		
	}
	
}

// 삼각형
// 정의 : 한 평면상에 있고 일직선상에 없는 3개의 점 A,B,C를
// 		2개의 쌍으로 하여 선분을 연결하여 이루어진 도형
class Triangle extends Shape {
	Point[] p = null;
	
	public Triangle(Point[] p) {
		this.p = p;
	}

	@Override
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s]\n",
				this.p[0].getXY(), this.p[1].getXY(), this.p[2].getXY());
	}
}

// 자바는 컴파일러가 자동으로 extends Object 상속
class Point {
	int x, y;
	public Point() {
		this(0,0);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return String.format("(%d,%d)", this.x, this.y);
	}
}


