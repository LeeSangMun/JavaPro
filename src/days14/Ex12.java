package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오후 4:28:50
 * @subject
 * @content
 */
public class Ex12 {
	public static void main(String[] args) {
		/*
		 * 클래스들간의 관계
		 * 1. has-a	관계
		 * 		2개의 클래스 선언
		 * 		Car 
		 * 		Engine
		 * 
		 * 
		 * 2. is-a 	관계(상속)
		 */
		
		Engine e = new Engine();
		// DI 2가지 방법
		// 1) 생성자 통해서 DI
		Car myCar = new Car(e);
		// 2) setter 통생서 DI
		myCar.setEngine(e);
		
		// java.lang.NullPointerException
		myCar.speedUp(20);
		int carSpeed = myCar.getEngine().speed;
		System.out.println(carSpeed);
	}
}