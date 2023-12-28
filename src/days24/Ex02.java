package days24;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오전 11:35:59
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [Properties +]
		Properties sysProp = System.getProperties();
		Enumeration<Object> en = sysProp.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = sysProp.getProperty(key);
			System.out.printf("%s : %s\n", key, value);
		}
	}

}
