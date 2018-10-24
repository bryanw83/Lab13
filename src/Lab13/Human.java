package Lab13;

import java.util.Scanner;

public class Human extends Player {

	private Scanner scnr;

	@Override
	public Roshambo generateRoshambo() {
		scnr = new Scanner(System.in);
		String userInput = Validator.getString(scnr, "Rock, Paper or Scissors? (R/P/S) ");
		if (userInput.equalsIgnoreCase("r")) {
			return Roshambo.ROCK;
		} else if (userInput.equalsIgnoreCase("p")) {
			return Roshambo.PAPER;
		} else if (userInput.equalsIgnoreCase("s")) {
			return Roshambo.SCISSORS;
		} else {
			return null;
		}
	}

}
