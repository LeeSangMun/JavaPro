package days15;

// [정규직] 사원클래스
public class Regular extends Employee {
	private int basePay; // 기본급

	public Regular() {
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}
	
	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		super(name, addr, tel, hiredate);
		// The field Employee.name is not visible
		// this.name = name;
		this.basePay = basePay;
		System.out.println("> Regular 5 생성자 호출됨.");
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo(); // 부모의 멤버들을 가리킬때의 super
		System.out.printf(", 기본금:%d\n", this.basePay);
		*/
		
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본금:%d\n", getName(), getAddr(), getTel(), getHiregate(), this.basePay );
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", 기본금:%d", this.basePay);
	}
	
	public int getPay() {
		return this.basePay;
	}
}
