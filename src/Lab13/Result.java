package Lab13;

public class Result extends Player {

	public static void getResult(Roshambo input1, Roshambo input2) {

		if (input1.equals(input2)) {
			System.out.println("It's a tie!");
		} else if (input1.equals(Roshambo.ROCK)) {
			if (input2.equals(Roshambo.PAPER)) {
				System.out.println("Oooh, Paper wraps rock! Sorry! You Lost!");
			} else if (input2.equals(Roshambo.SCISSORS)) {
				System.out.println("Rock totally wrecks Scissors! You Win!");
			}

		} else if (input1.equals(Roshambo.PAPER)) {
			if (input2.equals(Roshambo.SCISSORS)) {
				System.out.println("Rats! Scissors cuts paper! Sorry! You lost!");
			} else if (input2.equals(Roshambo.ROCK)) {
				System.out.println(
						"Awesome! Paper wraps Rock like a lousy present marketed to hoplessly ignorant consumers in the 70's!!! You Win!");
			}
		} else if (input1.equals(Roshambo.SCISSORS)) {
			if (input2.equals(Roshambo.ROCK)) {
				System.out.println("Awww Nooo!! Rock breaks Scissors!! Sorry! You Lost!");
			} else if (input2.equals(Roshambo.PAPER)) {
				System.out.println("Sweet!!! Scissors cuts paper to shreds!! You Win!!!");
			}
		}

	}
	
	@Override
	public Roshambo generateRoshambo() {

		return null;
	}
}
