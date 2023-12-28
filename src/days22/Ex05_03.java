package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author sangmun
 * @date 2023. 8. 11. - 오전 11:06:45
 * @subject	21일차 복습
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		ArrayList<Person3> list = new ArrayList();
		list.add(new Person3("박정호", 23));
		list.add(new Person3("이상문", 21));
		list.add(new Person3("이주영", 29));
		list.add(new Person3("정하영", 20));
		list.add(new Person3("이동현", 30));
		list.add(new Person3("주강민", 27));
		
		System.out.println(list);
		
		list.sort(null);
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person3 p = (Person3) ir.next();
			System.out.println(p);
		}
	}

}

// 비교기 기능이 있는 Person3 클래스 선언
// Comparator 비교기 x
class Person3 implements Comparable {
	private String name;
	private int age;
	
	public Person3() {
		super();
	}
	
	public Person3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Person3 p = (Person3)o;
		
		return this.getName().compareTo(p.getName());
	}
	
	
}