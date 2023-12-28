package days23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author sangmun
 * @date 2023. 8. 14. - 오후 12:05:46
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// Set : LinkedHashSet 
		
		// 주민등록번호가 같으면 같은 객체   중복 x
		Set<Person> s = new LinkedHashSet<>();
		s.add(new Person("111111-1111111", "김호영", 23));
		s.add(new Person("222222-2222222", "박민석", 25));
		s.add(new Person("333333-3333333", "박정호", 28));
		
		System.out.println(s.size());
		
		s.add(new Person("222222-2222222", "박민석", 35));
		
		Iterator<Person> ir = s.iterator();
		while (ir.hasNext()) {
			Person p = ir.next();
			System.out.println(p);
		}
	}

}

class Person {
	String rrn;
	String name;
	int age;
	
	public Person() {
		super();
	}

	public Person(String rrn, String name, int age) {
		super();
		this.rrn = rrn;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + ", age=" + age + "]";
	}

	// hashCode
	// equals
	@Override
	public int hashCode() {
		return Objects.hash(rrn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(rrn, other.rrn);
	}
	
	
}