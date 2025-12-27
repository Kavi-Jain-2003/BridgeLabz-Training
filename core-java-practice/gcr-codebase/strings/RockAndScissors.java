//Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer.

//importing scanner class
import java.util.Scanner;

public class RockAndScissors {
	// creating Scanner object
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// user input
		System.out.println("enter no. of games:");
		int games = input.nextInt();
		input.nextLine();
		String[][] gameResults = new String[games][3];
		int userWins = 0;
		int compWins = 0;
		for (int i = 0; i < games; i++) {
			System.out.println("\nGame " + (i + 1) + " enter your choice (rock/paper/scissors):");

			String userChoice = input.nextLine().toLowerCase();

			String computerChoice = getComputerChoice();
			String winner = findWinner(userChoice, computerChoice);
			//to increase points of winner
			if (winner.equals("user")) {
				userWins++;
			} else if (winner.equals("computer")) {
				compWins++;
			}
			gameResults[i][0] = userChoice;
			gameResults[i][1] = computerChoice;
			gameResults[i][2] = winner;
		}
		String[][] stats = calculateStats(userWins, compWins, games);
		displayResults(gameResults, stats);
		// closing input
		input.close();
	}
	// to get computerChoice

	public static String getComputerChoice() {
		int choice = (int) (Math.random() * 3);
		if (choice == 0)
			return "rock";
		else if (choice == 1)
			return "paper";
		else
			return "scissors";
	}

	// to find winner
	public static String findWinner(String user, String computer) {
		if (user.equals(computer))
			return "draw";

		if ((user.equals("rock") && computer.equals("scissors")) ||
				(user.equals("paper") && computer.equals("rock")) ||
				(user.equals("scissors") && computer.equals("paper"))) {
			return "user";
		} else {
			return "computer";
		}
	}

// Method to calculate stats (wins & percentages)
public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
	String[][] stats = new String[3][3];

	double userPercent = Math.round((userWins * 100.0 / totalGames) * 100) / 100.0;
	double compPercent = Math.round((compWins * 100.0 / totalGames) * 100) / 100.0;

	stats[0] = new String[] { "Player", "Wins", "Win %" };
	stats[1] = new String[] { "User", String.valueOf(userWins), userPercent + "%" };
	stats[2] = new String[] { "Computer", String.valueOf(compWins), compPercent + "%" };

	return stats;
}

// Method to display results
public static void displayResults(String[][] gameResults, String[][] stats) {
	System.out.println("\nGame Results:");
	System.out.println("Game\tUser\tComputer\tWinner");

	for (int i = 0; i < gameResults.length; i++) {
		System.out.println((i + 1) + "\t" +
				gameResults[i][0] + "\t" +
				gameResults[i][1] + "\t\t" +
				gameResults[i][2]);
	}

	System.out.println("\nStatistics:");
	for (String[] row : stats) {
		System.out.printf("%-10s %-10s %-10s%n", row[0], row[1], row[2]);
	}
}
}