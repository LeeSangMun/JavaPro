package days15;

/**
 * @author sangmun
 * @date 2023. 8. 2. - 오후 4:34:35
 * @subject
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		// 1) 문제점
		// 	Employee e1 = new Regular();
		// 	Employee e1 = new SalesMan();
		// 	Employee e1 = new Temp();
		//	e1.getPay();
		// Employee 에 getPay() 추가
		
		/*
		 * [다형성] - 여러 가지 형태를 가질 수 있는 능력
		 */
		
		// Cannot instantiate the type Employee
//		Employee emp1 = new Employee("이상문", "서울 강남구", "010-1234-1234", "2023.12.12");
		
		/*
		Regular emp2 = new Regular("이", "서울", "010-1234-1234", "2021.03.21", 4000000);
		
		SalesMan emp3 = new SalesMan("ㅇ", "경기도", "010-1234-1234", "2021.03.12", 500000, 20, 70000);
		Temp emp4  = new Temp("ㅇ", "서울", "010-2319-3422", "2020.01.01", 20, 250000);
		*/
		
		/*
		Employee[] emps = new Employee[3];
		emps[0] = new Regular("이", "서울", "010-1234-1234", "2021.03.21", 4000000);
		emps[1] = new SalesMan("ㅇ", "경기도", "010-1234-1234", "2021.03.12", 500000, 20, 70000);
		emps[2] = new Temp("ㅇ", "서울", "010-2319-3422", "2020.01.01", 20, 250000);
		*/
		
		Employee[] emps = {
				new Regular("이", "서울", "010-1234-1234", "2021.03.21", 4000000),
				new SalesMan("ㅇ", "경기도", "010-1234-1234", "2021.03.12", 500000, 20, 70000),
				new Temp("ㅇ", "서울", "010-2319-3422", "2020.01.01", 20, 250000)
		};
		
		for (int i = 0; i < emps.length; i++) {
			dispGetPay(emps[i]);
		} // for
		
	}
	
	public static void dispGetPay(Employee emp) {
		System.out.println(emp.getPay());
	}
}
