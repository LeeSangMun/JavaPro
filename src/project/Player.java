package project;

import java.io.Serializable;

public class Player implements Serializable {
	private String name;
	
	public Player() {
		super();
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	
	
}
