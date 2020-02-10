package co.grandcircus02062020;

import java.util.Scanner;

public class TheRock extends Player {
	
	public TheRock () {
		super("Dwayne");
	}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	public Roshambo generateRoshambo(Scanner scnr) {
		//empty method to satisfy contract, need scnr method to meet lab requirements
		return Roshambo.ROCK;
	}

}
