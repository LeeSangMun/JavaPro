package days15;

/**
 * @author sangmun
 * @date 2023. 8. 2. - 오후 2:40:24
 * @subject
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		// [1]
		/*
		Employee emp1 = new Employee("이상문", "서울 강남구", "010-1234-1234", "2023.12.12");
	
		emp1.dispEmpInfo();
		System.out.println(emp1.toString());
		System.out.println(emp1);
		*/
		
		// [2]
		/*
		Regular emp2 = new Regular("이", "서울", "010-1234-1234", "2021.03.21", 4000000);
		emp2.dispEmpInfo();
		System.out.println(emp2);
		*/
		
		// [3]
		/*
		// [상속 조건]
		// Employee - Regular 클래스들간의 자동형변환
		// 부모클래스 emp2 = new 자식클래스
		// 업캐스팅
		Employee emp2 = new Regular("이", "서울", "010-1234-1234", "2021.03.21", 4000000);
		emp2.dispEmpInfo();
		// [업캐스팅 - 문제점]
		// emp2.getPay();
		
		// Type mismatch: cannot convert from Employee to Regular
		// 다운캐스팅
		Regular emp = (Regular) emp2;
		*/
		
		// Type mismatch: cannot convert from Employee to Regular
		// java.lang.ClassCastException
//		Regular emp2 = (Regular) new Employee("이상문", "서울 강남구", "010-1234-1234", "2023.12.12");
		
		/*
		// [4]
		Employee emp3 = new SalesMan("ㅇ", "경기도", "010-1234-1234", "2021.03.12", 500000, 20, 70000);
		emp3.dispEmpInfo();
		System.out.println(emp3.getPay());
		*/
		
		/*
		// [5]
		Employee emp4  = new Temp("ㅇ", "서울", "010-2319-3422", "2020.01.01", 20, 250000);
		emp4.dispEmpInfo();
		System.out.println(emp4.getPay());
		*/
		
	}
}
