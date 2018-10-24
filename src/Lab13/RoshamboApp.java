package Lab13;

import java.util.Scanner;
import java.util.Random;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Player user = new Human();
		Player com1;
		Roshambo userValue;
		Roshambo comValue;
		String userName;
		String userCont = null;
		int userWin = 0;
		int userTie = 0;
		int userLoss = 0;

		System.out.println("Welcome to the dog-eat-dog world of ROSHAMBO!");
		System.out.println();
		userName = Validator.getString(scnr, "What's your name?: ");
		user.setName(userName);
		System.out.println();

		do {

			String userChoice = Validator.getString(scnr, "Ok, " + userName
					+ ", would you like to play against the 'Really....Really Nerdy Folks' or the 'Not Quite as Nerdy but Still....Yeah's? (a/b) \n");
			if (userChoice.equalsIgnoreCase("a")) {
				com1 = new Dummy();
				userValue = user.generateRoshambo();
				comValue = com1.generateRoshambo();
				System.out.println();
				System.out.println("You chose: " + userValue);
				System.out.println();
				System.out.println("Your opponent chose " + comValue);
				System.out.println();
				if (userValue.equals(comValue)) {
					System.out.println("It's a tie!");
					userTie = userTie + 1;
				} else if (userValue.equals(Roshambo.ROCK)) {
					if (comValue.equals(Roshambo.PAPER)) {
						System.out.println("Oooh, Paper wraps rock! Sorry! You Lost!");
						userLoss = userLoss + 1;
					} else if (comValue.equals(Roshambo.SCISSORS)) {
						System.out.println("Rock totally wrecks Scissors! You Win!");
						userWin = userWin + 1;
					}

				} else if (userValue.equals(Roshambo.PAPER)) {
					if (comValue.equals(Roshambo.SCISSORS)) {
						System.out.println("Rats! Scissors cuts paper! Sorry! You lost!");
						userLoss = userLoss + 1;
					} else if (comValue.equals(Roshambo.ROCK)) {
						System.out.println(
								"Awesome! Paper wraps Rock like a lousy present marketed to hoplessly ignorant consumers in the 70's!!! You Win!");
						userWin = userWin + 1;
					}
				} else if (userValue.equals(Roshambo.SCISSORS)) {
					if (comValue.equals(Roshambo.ROCK)) {
						System.out.println("Awww Nooo!! Rock breaks Scissors!! Sorry! You Lost!");
						userLoss = userLoss + 1;
					} else if (comValue.equals(Roshambo.PAPER)) {
						System.out.println("Sweet!!! Scissors cuts paper to shreds!! You Win!!!");
						userWin = userWin + 1;
					}
				}
			} else if (userChoice.equalsIgnoreCase("b")) {
				com1 = new Smarter();
				userValue = user.generateRoshambo();
				comValue = com1.generateRoshambo();
				System.out.println();
				System.out.println("You chose: " + userValue);
				System.out.println();
				System.out.println("Your opponent chose " + comValue);
				System.out.println();
				if (userValue.equals(comValue)) {
					System.out.println("It's a tie!");
					userTie = userTie + 1;
				} else if (userValue.equals(Roshambo.ROCK)) {
					if (comValue.equals(Roshambo.PAPER)) {
						System.out.println("Oooh, Paper wraps rock! Sorry! You Lost!");
						userLoss = userLoss + 1;
					} else if (comValue.equals(Roshambo.SCISSORS)) {
						System.out.println("Rock totally wrecks Scissors! You Win!");
						userWin = userWin + 1;
					}

				} else if (userValue.equals(Roshambo.PAPER)) {
					if (comValue.equals(Roshambo.SCISSORS)) {
						System.out.println("Rats! Scissors cuts paper! Sorry! You lost!");
						userLoss = userLoss + 1;
					} else if (comValue.equals(Roshambo.ROCK)) {
						System.out.println(
								"Awesome! Paper wraps Rock like a lousy present marketed to hoplessly ignorant consumers in the 70's!!! You Win!");
						userWin = userWin + 1;
					}
				} else if (userValue.equals(Roshambo.SCISSORS)) {
					if (comValue.equals(Roshambo.ROCK)) {
						System.out.println("Awww Nooo!! Rock breaks Scissors!! Sorry! You Lost!");
						userLoss = userLoss + 1;
					} else if (comValue.equals(Roshambo.PAPER)) {
						System.out.println("Sweet!!! Scissors cuts paper to shreds!! You Win!!!");
						userWin = userWin + 1;
					}
				}
			}

			System.out.println();
			System.out.println("Wins: " + userWin);
			System.out.println("Ties: " + userTie);
			System.out.println("Losses: " + userLoss);
			System.out.println();
			System.out.println("Would you like to try again? (y/n)");
			userCont = scnr.next();

		} while (userCont.equalsIgnoreCase("y"));

		System.out.println("Well if that's all you wanna play, then your score is: ");
		System.out.println();
		System.out.println("Wins: " + userWin);
		System.out.println("Ties: " + userTie);
		System.out.println("Losses: " + userLoss);
		System.out.println();
		System.out.println("Thanks for playing!!! Come on back any time....seriously.............please?.....");

	}

}
