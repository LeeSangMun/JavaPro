package days15;

// [사원 클래스]
// 모든 사원들이 공통적으로 가져야할 멤버(필드, 메서드)를 구현한 클래스
// 추상메서드가 1개라도 있다면 불완전한클래스이고,
// 객체를 생성할 수 없고
// 추상클래스
// abstract class
public abstract class Employee {
	private String name;	// 사원명
	private String addr;  	// 주소
	private String tel	;	// 연란처
	private String hiregate;
	public Employee() {
		System.out.println("> Eployee 디폴트 생성자 호출됨.");
	}
	public Employee(String name, String addr, String tel, String hiregate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiregate = hiregate;
		System.out.println("> Eployee 4 생성자 호출됨.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHiregate() {
		return hiregate;
	}
	public void setHiregate(String hiregate) {
		this.hiregate = hiregate;
	}
	
	// 사원들의 정보를 출력하는 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n",
				this.name, this.addr, this.tel, this.hiregate);
	}
	@Override
	public String toString() {
		return String.format("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s",
				this.name, this.addr, this.tel, this.hiregate);
	}
	
	/*
	public  int getPay() {
		return 0;
	}
	*/
	
	// This method requires a body instead of a semicolon
	// body {} 몸체가 구현이 안된 불완전한 메서드
	// 추상 메서드
	// abstract 키워드 붙인다.
	public abstract int getPay();
}
