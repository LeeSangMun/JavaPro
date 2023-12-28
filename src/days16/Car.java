package days16;

public class Car {
	String name;
	String gearType;
	int door;
	
	private Engine engine;
	
	Car() {
		
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
