package co.grandcircus02062020;

import java.util.Scanner;

public class BattleRoyale {
	public static void main(String[] args) {
		// Declare variables
		Scanner scnr = new Scanner(System.in);
		Player Dwayne = new TheRock();
		Player Al = new Al();
		Roshambo opponentRoshambo = Roshambo.ROCK;
		String userName = "";
		String userOpponent = "";
		int userChoice = 0;
		boolean exitCase = false;
		boolean userWins = false;

		// Welcome procedure
		System.out.println("Welcome to Roshambo!");
		System.out.println("Please enter your name:");
		userName = scnr.next();
		scnr.nextLine();
		Player user = new UserPlayer(userName);
		System.out.println("Thank you for joining us " + user.getName() + ".");
		
		// Playing the game
		do {  
			// Choose opponent
			userChoice = Validator.getInt(scnr, "Please choose your oponent:\n1. Dwayne\n2. Al\n", 1, 2);
			switch (userChoice) {
			case 1:
				System.out.println("Your opponent is: Dwayne");
				userOpponent = "Dwayne";
				opponentRoshambo = Dwayne.generateRoshambo();
				break;
			case 2:
				System.out.println("Your opponent is Al");
				userOpponent = "Al";
				opponentRoshambo = Al.generateRoshambo();
			}
			
			// Play and output roshambo
			Roshambo userRoshambo = user.generateRoshambo(scnr);
			System.out.println("You have chosen: " + userRoshambo);
			System.out.println(userOpponent + " has chosen: " + opponentRoshambo);

			// Declare winner
			userWins = playRoshambo(userRoshambo, opponentRoshambo);
			if (userWins) {
				System.out.println("You have won!");
			} else {
				System.out.println(userOpponent + " has won.");
			}
			
			// Ask to go again
			System.out.println("Would you like to play again " + userName);
			Validator valid = new Validator();
			exitCase = !(valid.yesOrNo(scnr));
		} while(!exitCase);
		System.out.println("Thank you, goodbye.");
	}
	
	
	// Decision for winner
	public static boolean playRoshambo(Roshambo user, Roshambo opponent) {
		boolean userWins = true;
		if (user.equals(Roshambo.ROCK) && opponent.equals(Roshambo.SCISSORS)) {
			userWins = true;
		} else if (user.equals(Roshambo.ROCK) && opponent.equals(Roshambo.PAPER)) {
			userWins = false;			
		} else if (user.equals(Roshambo.PAPER) && opponent.equals(Roshambo.ROCK)) {
			userWins = true;			
		} else if (user.equals(Roshambo.PAPER) && opponent.equals(Roshambo.SCISSORS)) {
			userWins = false;			
		} else if (user.equals(Roshambo.SCISSORS) && opponent.equals(Roshambo.PAPER)) {
			userWins = true;			
		} else if (user.equals(Roshambo.SCISSORS) && opponent.equals(Roshambo.ROCK)) {
			userWins = false;			
		}
		return userWins;
	}

}
