package days15;

// 임시직
public class Temp extends Employee {
	private int days; // 근무일수
	private int dayOfDay; // 하루 일당
		
	public Temp() {
		super();
		System.out.println("> Temp 디폴트 생성자 호출됨.");
	}

	public Temp(String name, String addr, String tel, String hiregate, int days, int dayOfDay) {
		super(name, addr, tel, hiregate);
		this.days = days;
		this.dayOfDay = dayOfDay;
		System.out.println("> Temp 6 생성자 호출됨.");
	}
	
	public int getPay() {
		return this.days * this.dayOfDay;
	}
	
	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 근무일수:%d, 하루일당:%d\n",
				this.getName(), this.getAddr(), this.getTel(), this.getHiregate(), this.days, this.dayOfDay);
	}
}
