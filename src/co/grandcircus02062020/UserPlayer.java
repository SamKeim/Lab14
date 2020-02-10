package co.grandcircus02062020;

import java.util.Scanner;

public class UserPlayer extends Player {

	public UserPlayer(String setName) {
		super(setName);
	}

	@Override
	public Roshambo generateRoshambo(Scanner scnr) {
		int userChoice = Validator.getInt(scnr, "Please choose [1] Rock, [2] Paper, or [3] Scissors.\n", 1, 3);
		switch (userChoice) {
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		default:
			return Roshambo.SCISSORS;
		}
	}	
	
	public Roshambo generateRoshambo() {
		//empty method to satisfy contract, need scnr method to meet lab requirements
		return Roshambo.ROCK;
	}


}
