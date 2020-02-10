package co.grandcircus02062020;

import java.util.Scanner;

public class Al extends Player {
	// Random player
	public Al() {
		super("Al");
	}
	
	@Override
	public Roshambo generateRoshambo() {
		int choice = (int) ((Math.random() * 3) + 1);
		switch (choice) {
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		default:
			return Roshambo.SCISSORS;
		}
	}
	
	public Roshambo generateRoshambo(Scanner scnr) {
		//empty method to satisfy contract, need scnr method to meet lab requirements
		return Roshambo.ROCK;
	}
}
