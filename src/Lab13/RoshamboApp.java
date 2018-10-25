package Lab13;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Player user = new Human();
		Player com1;
		Roshambo userValue;
		Roshambo comValue;
		String userName;
		String userCont = null;

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

				Result.getResult(userValue, comValue);
			} else if (userChoice.equalsIgnoreCase("b")) {
				com1 = new Smarter();
				userValue = user.generateRoshambo();
				comValue = com1.generateRoshambo();
				System.out.println();
				System.out.println("You chose: " + userValue);
				System.out.println();
				System.out.println("Your opponent chose " + comValue);
				System.out.println();

				Result.getResult(userValue, comValue);
			}
			System.out.println("Would you like to try again? (y/n)");
			userCont = scnr.next();

		} while (userCont.equalsIgnoreCase("y"));

		System.out.println("Thanks for playing!!! Come on back any time....seriously.............please?.....");

	}

}
