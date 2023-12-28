package days15;

// 영업직 사원 클래스
public final class SalesMan extends Regular {
	private int sales;	// 판매량
	private int comm;	// 커미션
	
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨");
	}

	public SalesMan(String name, String addr, String tel, String hiredate, int basePay,  int sales, int comm) {
		super(name, addr, tel, hiredate, basePay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> Salesman 7 생성자 호출됨");
	}
	
	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본금:%d, 판매량:%d, 커미션:%d\n", 
				getName(), getAddr(), getTel(), getHiregate(), getBasePay(), this.sales, this.comm );
	}

	public int getPay() {
		return super.getPay() + this.sales * this.comm;
	}
}

//The type Child cannot subclass the final class SalesMan
/*
class Child extends SalesMan {
	
}
*/