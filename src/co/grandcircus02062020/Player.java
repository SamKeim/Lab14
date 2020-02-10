package co.grandcircus02062020;

import java.util.Scanner;

public abstract class Player {
	// Abstract class Player
	protected String name;
	
	public abstract Roshambo generateRoshambo();
	
	public abstract Roshambo generateRoshambo(Scanner scnr);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Player(String setName) {
		name = setName;
	}
	
}
