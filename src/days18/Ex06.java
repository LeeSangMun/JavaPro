package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 12:07:20
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// clone()
		Person p1 = new Person("111", "홍길동");
		Person p1Clone;
		
		p1Clone = p1.clone();
		System.out.println(p1Clone);
		/*
		try {
			// [clone() 오버라이딩 불편한 점]
			// 다운캐스팅을 해야되는 불편한 점이 있음
			p1Clone = (Person)p1.clone();
			System.out.println(p1Clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		*/
		
		// 스레드 관련
		/*
		p1.notify();
		p1.notifyAll();
		p1.wait();
		p1.wait();
		p1.wait();
		*/
		
		// p1.finalize() 객체가 소멸될 때 할 거
	}

}
