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
public class Ex05_02 {

	public static void main(String[] args) {
		ArrayList<Person2> list = new ArrayList<>();
		list.add(new Person2("박정호", 23));
		list.add(new Person2("이상문", 21));
		list.add(new Person2("이주영", 29));
		list.add(new Person2("정하영", 20));
		list.add(new Person2("이동현", 30));
		list.add(new Person2("주강민", 27));
		
		System.out.println(list);
		
		list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person2 p = (Person2) ir.next();
			System.out.println(p);
		}
	}

}

class Person2 {
	private String name;
	private int age;
	
	public Person2() {
		super();
	}
	
	public Person2(String name, int age) {
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
	
	
}