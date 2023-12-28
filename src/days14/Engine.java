package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오후 4:32:18
 * @subject
 * @content
 */
public class Engine {
	int speed;
	
	void moreFuel(int fuel) {
		this.speed += fuel * 0.05;
//		this.speed = this.speed +  fuel * 0.05;
	}
	
	void lessFuel(int fuel) {
		this.speed -= fuel * 0.05;
	}
	
	void stop() {
		this.speed = 0;
	}
}
