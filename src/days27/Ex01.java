package days27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author sangmun
 * @date 2023. 8. 18. - 오후 5:37:31
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		Child c = new Child();
		c.name = "홍길동";
		c.age = 20;
		
		String pathname = ".\\src\\days27\\Child.ser";
		try(FileOutputStream out = new FileOutputStream(pathname);
				ObjectOutputStream oos = new ObjectOutputStream(out)) {
			oos.writeObject(c);
			
			oos.flush();
			
			System.out.println("> c 객체를 직렬화 시켜서 oos파일로 저장완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// 2. 부모클래스 직렬화 x
//     자식클래스 직렬화 x
class Parent {
	String name;	// 부모의 멤버는 직렬화 대상에서 제외된다.
}

class Child extends Parent implements Serializable {
	int age;
	
	// 개발자가 직접 부모의 멤버를 직렬화 대상에 추가되도록 구현한다.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
//		in.defaultReadObject();
	}
}


/*
// 1. 부모를 직렬화할 수 있는 클래스
// 	   자식클래스는 자동으로 직렬화 가능한 클래스가 된다.
class Parent implements Serializable {
	String name;
}

class Child extends Parent {
	int age;
}
*/