package days15;

import days13.Tv;

/**
 * @author sangmun
 * @date 2023. 8. 2. - 오전 11:32:49
 * @subject
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 11;
		ctv.channelDown();
		System.out.println(ctv.channel);
		ctv.dispCaption("Hello World~");
		ctv.caption = true;
		ctv.dispCaption("Hi");
		
	}
}

class CaptionTv extends Tv {
	boolean caption; // 자막 기능 on/off
	
	void dispCaption(String text) {
		if(this.caption) {
			System.out.println(text);
		}
	}
}