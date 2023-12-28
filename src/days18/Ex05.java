package days18;

/**
 * @author sangmun
 * @date 2023. 8. 7. - 오후 12:01:09
 * @subject
 * @content
 */
class Ex05 {

	public static void main(String[] args) {
		// Object.getClass() - 객체의 클래스 정보를 담고 있는 Class 인스턴스를 반환하는 메서드
		
		Person p1 = new Person("111", "홍길동");
		Class cls = p1.getClass();
		
		System.out.println(cls.getName()); // days18.Person
		System.out.println(cls.getSimpleName()); // Person

	}

}
