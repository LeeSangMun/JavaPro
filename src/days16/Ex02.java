package days16;

import days15.Employee;
import days15.Regular;
import days15.SalesMan;
import days15.Temp;

/**
 * @author sangmun
 * @date 2023. 8. 3. - 오전 10:29:01
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
//		Regular e1 = new Regular();
//		dispGetPay(e1);
		SalesMan e2 = new SalesMan();
		dispGetPay(e2);
//		Temp e3 = new Temp();
//		dispGetPay(e3);
	}

	public static void dispGetPay(Employee emp) {
		// instanceof 연산자를 쓸 때 실제 객체가 어떤 것인지 확인할 때에는
		// 위에서부터 자식클래스 먼저 체크해야한다.
		if (emp instanceof SalesMan) {
			System.out.println("> emp 객체는 SalesMan 타입이다.");
		} else if (emp instanceof Regular) {
			System.out.println("> emp 객체는 Regular 타입이다.");
		} else if (emp instanceof Temp) {
			System.out.println("> emp 객체는 Temp 타입이다.");
		}
	}

}
