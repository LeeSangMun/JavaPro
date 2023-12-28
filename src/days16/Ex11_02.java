package days16;

/**
 * @author sangmun
 * @date 2023. 8. 3. - 오후 3:09:12
 * @subject
 * @content
 */
public class Ex11_02 {

	public static void main(String[] args) {
//		Parseable.method1();
		String parsingFile = "hello.xml";
		String docType = "xml";
		
		Parseable parser = ParserManager.getParser(docType);
		parser.parse(parsingFile);
		parser.print();
		
	}

}

// 구문 분석
interface Parseable {
	void parse(String fileName);
	
	default void print() {
		System.out.println("각각 parser에서 각자의 인쇄기능 구현...");
	}
	
	static void method1() {
		System.out.println("기본 코딩...");
	}
}
 
class XMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println("> XML 파일 구문 분석 코딩....");
	}
	
}

class HTMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println("> HTML 파일 구문 분석 코딩...");
	}
	
}

class ParserManager {
	public static Parseable getParser(String docType) {
		if(docType.equals("xml")) {
			return new XMLParser();
		} else if(docType.equals("html")) {
			return new HTMLParser();
		} else {
			return null;
		}
	}
}