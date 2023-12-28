package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오전 11:13:51
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 주민등록번호가 같으면 동일한 사람이다.
		Person p1 = new Person("111", "홍길동");
		Person p2 = new Person("111", "홍길둥");
		
		// 3) Object.toString()
		// 		days18.Person@be11
		// 		패키지명.클래스명@해시코드의 16진수 값
		System.out.println(p1.toString());
		System.out.println(p2);
		
		// Object -> equals() 메서드를 오버라이딩 해야함
//		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}

class Person implements Cloneable {
	String rrn;
	String name;
	
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj;
			return this.rrn.equals(p.rrn);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}

	@Override
	public String toString() {
		// return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("Person [rrn=%s, name=%s]", this.rrn, this.name);
	}

	/*
	@Override
	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
		Object obj = null;
		obj = super.clone();
		return obj;
	}
	*/
	
	// 공변 반환타입(convariant return type) 추가
	// 오버라이딩 할 때 조상 메서드의 반환타입을 자식클래스 타입으로 변경이 가능하다.
	@Override
	public Person clone()  {
		Person p = null;
		try {
			p = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
	
}