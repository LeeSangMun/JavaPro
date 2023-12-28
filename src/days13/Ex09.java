package days13;

/**
 * @author sangmun
 * @date 2023. 7. 31. - 오후 2:46:08
 * @subject	클래스의 복사와 복제
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		// 클래스 복사(copy)
		
		// 클래스 복제(clone)
		// 얉은 복제, 깊은 복제
		
		Point p = new Point();
		p.x = 100;
		p.y = 200;
		
		// 클래스 복사
		Point pcopy = p;
		
		// 클래스 복제
		Point pclone = new Point();
		pclone.x = p.x;
		pclone.y = p.y;
	}
}
