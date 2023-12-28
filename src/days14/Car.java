package days14;

/**
 * @author sangmun
 * @date 2023. 8. 1. - 오후 4:35:00
 * @subject
 * @content
 */
public class Car {
	String name;
	String gearType;
	int door;
	
	private Engine engine;
	
	Car() {
		engine = new Engine();
	}
	
	public Car(Engine e) {
		engine = e;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}
}
