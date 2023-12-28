package days27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author sangmun
 * @date 2023. 8. 21. - 오전 9:09:18
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days27\\Child.ser";
		try(FileInputStream in = new FileInputStream(pathname);
				ObjectInputStream ois = new ObjectInputStream(in)) {
			Child c = (Child)ois.readObject();
			
			System.out.println(c.name);
			System.out.println(c.age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
