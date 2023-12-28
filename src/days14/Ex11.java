package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오후 4:12:57
 * @subject
 * @content
 */
public class Ex11 {
	public static void main(String[] args) {
		new Document();
		new Document("asdf.txt");
		new Document();
	}
}

// 문서
class Document {
	String fileName;
	static int count = 1;
	
	{
//		count++;
		System.out.println("인스턴스 초기화 블럭 실행...");
	}
	
	public Document() {
		// Cannot refer to an instance field count while explicitly invoking a constructor
		this(String.format("Noname%d.txt", count++));
		// Constructor call must be the first statement in a constructor
//		this(fileName);
	}
	
	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
	}
}
